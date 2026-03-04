import { useState } from "react";

export default function Fruits() {
  //  var fruitNames = ["Apple", "Mango"];
  // var [variableName, setFunctionName] = useState(defaultValue)
  //[statevariable,setstatefuncuseState(["Apple", "Mango"]) tion]
  let [fruitNames, setFruitNames] = useState(["Apple", "Mango"]);
  //first setting/assigning data statevariable
  //re-render the component (means execute the component function)

  const addFruits = function (event) {
    //console.log("addFruits function called");
    //fruitNames.push("Banana")
    event.preventDefault()
    var fruitName = event.target.fruitName.value
    let arr = [...fruitNames, fruitName];
    setFruitNames(arr);
    // console.log(fruitNames);
  };

  return (
    <div>
      <form onSubmit={addFruits}>
        Enter fruit name : <input type="text" name="fruitName" />
        <button>Add to list</button>
      </form>
      <div>
        <ol>
          {fruitNames.map(function (fruit) {
            return <li>{fruit}</li>;
          })}
        </ol>
      </div>
    </div>
  );
}
