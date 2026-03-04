import MovieTableRow from "./MovieTableRow"

function MovieListTable(props){

    return <table>
        <thead border="1">
            <tr>
                <th>Name</th>
                <th>Actor</th>
                <th>Release Date</th>
                <th>Movie Type</th>
                <th>State</th>
            </tr>
        </thead>

        <tbody>
            {props.movies.map(function(movieItem, indx){
                return <MovieTableRow key={indx}  item = {movieItem} />
            })}
        </tbody>
    </table>

}

export default MovieListTable