import { useContext, useState } from "react";
import UsersTable from "./UsersTable";
import UserContext from "./UserContext";

export default function Users(props) {
  const context = useContext(UserContext) ; // context.users, context.setUsers
  //const {users, saveHandler} = useContext(UserContext)
  const [username, setUsername] = useState("sid ");
  const [email, setEmail] = useState("s@gmail.com");
  const [gender, setGender] = useState("male");
  const [lang, setLang] = useState(["hindi", "marathi"]);

  const saveData = function () {
   context.saveHandler(  { username: username, email: email, gender: gender, lang: lang })
    // props.setUsers([
    //   ...props.users,
    //   { username: username, email: email, gender: gender, lang: lang },
    // ]);
  };

  const langHandler = function (event) {
    if (event.target.checked) {
      setLang([...lang, event.target.value]);
    } else {
      setLang(lang.filter((item) => item != event.target.value));
    }
  };

  return (
    <div>
      Enter name :
      <input
        type="text"
        name="username"
        value={username}
        onChange={function (event) {
          setUsername(event.target.value);
        }}
      />
      <br />
      Enter email :
      <input
        type="email"
        name="email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <br />
      Gender :{" "}
      <input
        type="radio"
        value="male"
        name="gender"
        checked={"male" == gender}
        onChange={(e) => {
          if (e.target.checked) {
            setGender(e.target.value);
          }
        }}
      />{" "}
      Male
      <input
        type="radio"
        value="female"
        name="gender"
        checked={"female" == gender}
        onChange={(e) => {
          if (e.target.checked) {
            setGender(e.target.value);
          }
        }}
      />{" "}
      Female
      <input
        type="radio"
        value="others"
        name="gender"
        checked={"others" == gender}
        onChange={(e) => e.target.checked && setGender(e.target.value)}
      />
      Others
      <br />
      Language:
      <input
        type="checkbox"
        value="hindi"
        name="lang"
        checked={lang.find((ele) => ele == "hindi")}
        onChange={langHandler}
      />
      Hindi
      <input
        type="checkbox"
        value="marathi"
        name="lang"
        checked={lang.find((ele) => ele == "marathi")}
        onChange={langHandler}
      />
      Marathi
      <input
        type="checkbox"
        value="english"
        name="lang"
        checked={lang.find((ele) => ele == "english")}
        onChange={langHandler}
      />
      English
      <br />
      <button onClick={saveData}>Save</button>
    </div>
  );
}
