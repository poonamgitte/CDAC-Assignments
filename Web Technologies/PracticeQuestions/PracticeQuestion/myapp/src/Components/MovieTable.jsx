import React from 'react'

function MovieTable({movieData}) {

    console.log("table data:")
  return (
    <div className='d-flex flex-column justify-content-center align-items-center w-50 mt-2'>

        <div className='m-2 text-white'>
            <h2>Movie List</h2>
        </div>
        <table className='table table-striped table-bordered table-hovered shadow'>
            <thead className='table-light'>
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Seats</th>
                </tr>
            </thead>

            <tbody>
                {
                    movieData.map((movie, index) =>{
                        return <tr key={index}>
                            <td >{movie?.name}</td>
                            <td>{movie?.price}</td>
                            <td>{movie?.seats}</td>
                        </tr>
                    })
                }
            </tbody>
        </table>
    </div>
  )
}

export default MovieTable