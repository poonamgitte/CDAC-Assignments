import UserContext from "../Context/UserContext";
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
          <UserContext.Consumer>
            {(value) => {
              return value.users.map((item, index) => {
                return (
                  <tr key={index}>
                    <td>{item.username}</td>
                    <td>{item.email}</td>
                    <td>
                      <DeleteUser item={item} />
                    </td>
                  </tr>
                );
              });
            }}
          </UserContext.Consumer>
        </tbody>
      </table>
    </div>
  );
}
export default UsersTable;
