import DeleteUser from "./DeleteUser";

function UsersTable(props) {
  
  return (
    <div>     
      <table border="1">
        <thead>
          <tr>
            <td>Name</td>
            <td>Email</td>
          </tr>
        </thead>
        <tbody>
          {props.users.map((item, index) => {
            return (
              <tr key={index}>
                <td>{item.username}</td>
                <td>{item.email}</td>
                <td>
                 <DeleteUser users={props.users} setUsers={props.setUsers} item={item}/>
                </td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}
export default UsersTable;
