// import ComponentName from "path/file"
import A from "./A.js"
import B from "./B.js"
// App<-A<-B
//       <-C
//       <-C
//     <-B
function App() {
  var name = "Siddhant";
  //comment
  return (
    <div>
      {/* Use the component 
      <ComponentName/> 
      or 
      <ComponentName></ComponentName> */}
      <A/>
      <B/>
    </div>
  );
}

export default App;
