function TableRow(props) {
  return (
    <tr>
      <td>{props.item?.name}</td>
      <td>{props.item?.email}</td>
    </tr>
  );
}

export default TableRow
