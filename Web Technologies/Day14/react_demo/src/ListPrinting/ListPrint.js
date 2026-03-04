function ListPrint() {
  var fruitNames = ["Apple", "Mango", "Banana"];

  return (
    <div>
      <ol>
        {fruitNames.map(function (fruit) {
          return <li>{fruit}</li>;
        })}
        {/* [<li>Apple</li>,<li>Mango</li>] */}
      </ol>
    </div>
  );
}

export default ListPrint
