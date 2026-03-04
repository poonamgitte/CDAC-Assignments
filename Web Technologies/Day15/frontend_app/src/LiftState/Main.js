import Users from "./Users";
import UsersTable from "./UsersTable";
import {useState} from "react"

function Main() {
  const [users, setUsers] = useState([]);
  const saveHandler = function(data){
    setUsers([...users, data])
  }
  return (
    <div>
      <div>
        <Users users={users} saveHandler={saveHandler}/>
      </div>
      <div>
        <UsersTable users={users} setUsers={setUsers}/>
      </div>
    </div>
  );
}

export default Main;
