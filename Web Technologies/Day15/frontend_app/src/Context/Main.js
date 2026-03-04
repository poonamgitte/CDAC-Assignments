import Users from "./Users";
import UsersTable from "./UsersTable";
import { useState } from "react";
import UserContext from "./UserContext";
import Block from "./Block";

function Main() {
  const [users, setUsers] = useState([]);
  const saveHandler = function (data) {
    setUsers([...users, data]);
  };
  return (
    <UserContext.Provider
      value={{ users: users, setUsers: setUsers, saveHandler: saveHandler }}
    >
      <div>
        <Block>
          <Users />
        </Block>
        <Block>
          <UsersTable users={users} setUsers={setUsers} />
        </Block>
      </div>
    </UserContext.Provider>
  );
}

export default Main;
