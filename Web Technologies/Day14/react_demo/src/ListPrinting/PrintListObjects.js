function PrintListObject() {
  var stds = [
    { name: "Sid", email: "s@gmail.com" },
    { name: "Rajat", email: "s@gmail.com" },
    { name: "Neha", email: "s@gmail.com" },
  ];
  return (
    <div>
      <table border="1">
        <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
          {stds.map(function (stdItem) {
            return <tr>
                <td>{stdItem?.name}</td>
                <td>{stdItem?.email}</td>
            </tr>
          })}
        </tbody>
      </table>
    </div>
  );
}

export default PrintListObject;
