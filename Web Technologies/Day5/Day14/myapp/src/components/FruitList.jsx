
// 3.Write a code to take fruit name from user and print in list(Show list in different Component)

import React from "react";
import { useState } from "react";
import PrintList from "./PrintList";
import { useContext } from "react";
import FruitContext from "./FruitContext";


function FruitList(){

    const context = useContext(FruitContext);

    const [fruit,setFruit] = useState("");
 
    console.log(fruit);

    const saveData=function(event){
        
        event.preventDefault()

        if(fruit.trim().length === 0) return;

        context.saveHandler(fruit)

        setFruit("")
    }

    return(
        <div>
            <form >
             Enter Fruit Name : <input type="text" name="fruitName" value={fruit} onChange={
                function (event) {
                    setFruit(event.target.value);
                }
             }/>
             <button onClick={saveData}>Save Fruit </button>
            </form>
            <br/>
            <PrintList/>
        </div>
    )
}
  
export default FruitList