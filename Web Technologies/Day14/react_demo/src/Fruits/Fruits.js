import { useEffect, useState } from "react";

export default function Fruits() {
  let [fruitNames, setFruitNames] = useState([]);

  //do not call fetch api in component
  const fetchData = function () {
    fetch("/fruits", {
      method: "GET",
    })
      .then((res) => res.json())
      .then((data) => {
        console.log(data);
        setFruitNames(data);
      })
      .catch((err) => console.log(err));
  };

  useEffect(function () {
    fetchData();
  }, []);

  const addFruits = function (event) {
    event.preventDefault();
    var fruitName = event.target.fruitName.value;
    var obj = { fruitName: fruitName };
    fetch("/fruit/new", {
      method: "POST",
      body: JSON.stringify(obj),
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((res) => res.json())
      .then((data) => {
        console.log(data);
        //fetchData() // no need for show data button with this
      })
      .catch((err) => console.log(err));
  };

  return (
    <div>
      <form onSubmit={addFruits}>
        Enter fruit name : <input type="text" name="fruitName" />
        <button>Add to list</button>
      </form>
      <button onClick={fetchData}>Show Data</button>
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
