import { useEffect, useState } from "react";

function Fruits() {
  const [fruits, setFruits] = useState([]);

  const [fruitName, setFruitName] = useState("");
  const fetchData = function (xyz) {
    fetch("/data", {})
      .then()
      .then((data) => setFruits(data));
  };

  //useEffect(handler,dependency_array)
  //useEffect(handler,[]) //execute onlyonce access all re-renders
  //useEffect(handler,[fruitName]) // execute whenever fruitName changes
  //useEffect(handler,[fruits])
  //useEffect(handler,[var1,var2,var3])
  useEffect(()=>{
    fetchData()
  },[])

  return (
    <div>
      Enter fruit name :{" "}
      <input
        type="text"
        value={fruitName}
        onChange={(e) => setFruitName(e.target.value)}
      />
      <button>Save</button>
      <ol>
        {/* {fruits.map((item) => (
          <li>{item}</li>
        ))} */}
      </ol>
    </div>
  );
}

export default Fruits;
