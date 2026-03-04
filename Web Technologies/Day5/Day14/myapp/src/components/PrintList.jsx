import { useContext } from "react";
import FruitContext from "./FruitContext";

function PrintList(){

    const { fruit ,deleteHandler} = useContext(FruitContext);

    console.log(fruit);

    return(
        <div>
            <ol>
               {fruit.map(function (f,index) {
                return <li key={index}>{f}
                    <button onClick={()=>deleteHandler(index)}>Delete</button></li>
               })}
            </ol>
        </div>
    )
}

export default PrintList