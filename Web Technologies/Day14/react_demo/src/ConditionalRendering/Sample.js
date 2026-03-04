function Sample() {
  var a = 10;

  return <div>{a < 10 ? <p>{a} is smaller</p> : <p>{a} is greater</p>}</div>;
}
export default Sample;
