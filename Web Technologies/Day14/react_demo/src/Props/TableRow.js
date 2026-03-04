function TableRow(props){
    return <tr>
        <td>{props.std.name}</td>
        <td>{props.std.email}</td>
    </tr>
}
export default TableRow