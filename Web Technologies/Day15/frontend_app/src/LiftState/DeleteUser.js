export default function DeleteUser(props) {
  const delUser = function () {
    props.setUsers(props.users.filter((ele) => ele.email != props.item.email));
  };
  return (
    <button
      onClick={() => {
        delUser();
      }}
    >
      Delete
    </button>
  );
}
