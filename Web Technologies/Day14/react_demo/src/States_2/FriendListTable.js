import TableRow from "./TableRow";

function FriendListTable(props){
    return <table border="1">
          <thead>
            <tr>
              <th>Name</th>
              <th>Email</th>
            </tr>
          </thead>
          <tbody>
            {props.friendNames.map(function (stdItem) {
              return <TableRow item={stdItem}/>;
            })}
          </tbody>
        </table>
}
export default FriendListTable

