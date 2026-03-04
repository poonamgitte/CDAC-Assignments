import { useContext } from "react";
import UserContext from "./UserContext";
import Button from "./Button";

export default function DeleteUser(props) {
  const { users, setUsers } = useContext(UserContext);

  const delUser = function () {
    setUsers(users.filter((ele) => ele.email != props.item.email));
  };
  return <Button onClick={()=>{delUser()}}>
    Delete
  </Button>
  // return (
  //   <button
  //     onClick={() => {
  //       delUser();
  //     }}
  //   >
  //     Delete
  //   </button>
  // );
}
