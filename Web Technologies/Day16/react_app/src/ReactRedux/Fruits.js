import { useState } from "react"
import { useDispatch } from "react-redux"
import { addFruit } from "./FruitStateLice"

function Fruits(){
    const [fruitName, setFruitName] = useState("")
    const dispatch = useDispatch()
    
    //useMemo(function(){},[])

    const saveHandler = function(){
       let data = fruitName
       console.log(data)
       dispatch(addFruit(data))  // recieve this data in reducer by action.payload
    }

    return <div>
      Enter fruit name :
      <input
        type="text"
        value={fruitName}
        onChange={(e) => setFruitName(e.target.value)}
      />
      <button onClick={saveHandler}>Save</button>
      
    </div>
}

export default Fruits