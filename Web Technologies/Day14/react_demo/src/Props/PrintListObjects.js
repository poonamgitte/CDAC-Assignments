import Sample from "./Sample";
import TableRow from "./TableRow";
function PrintListObject() {
  var stds = [
    { name: "Sid", email: "s@gmail.com" },
    { name: "Rajat", email: "s@gmail.com" },
    { name: "Neha", email: "s@gmail.com" },
  ];
  var name = "Siddhant"

  return (
    <div>
      {/* <ComponentName propvariable=data propvariable=data /> */}
      <Sample xyz={name}/>
      <table border="1">
        <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
          {stds.map(function (stdItem) {
            return <TableRow std={stdItem}/>
          })}
          {/* [<TableRow std=stds[0]/>, <TableRow std=std[1]] */}
        </tbody>
      </table>
    </div>
  );
}

export default PrintListObject;
