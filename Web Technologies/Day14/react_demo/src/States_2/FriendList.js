import { useState } from "react";
import FriendListTable from "./FriendListTable";
import "./Styles.css"
function FriendList() {
  const [friendNames, setFriendNames] = useState([]);

  const saveFriend = function (event) {
    event.preventDefault();
    var name = event.target.friendName.value;
    var email = event.target.email.value;
    var obj = { name, email };
    setFriendNames([...friendNames, obj]);
  };

  return (
    <div>
      <form onSubmit={saveFriend}>
        Enter name : <input type="text" name="friendName" />
        <br />
        Enter email : <input type="email" name="email" />
        <br />
        <button>Save</button>
      </form>
      <div style={{border: "1px solid black", padding:"2rem"}}>
        {friendNames.length == 0 ? (
          <p className="para">No Data</p>
        ) : (
          <FriendListTable friendNames={friendNames} />
        )}
      </div>
    </div>
  );
}

export default FriendList;
