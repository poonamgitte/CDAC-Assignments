
function MovieTableRow(props){
    return (
        <tr>
            
            <td>{props.item?.name}</td>
            <td>{props.item?.actor}</td>
            <td>{props.item?.releaseDate}</td>
            <td>{props.item?.movieType}</td>
            <td>{props.item?.state}</td>

        </tr>
    )
}

export default MovieTableRow