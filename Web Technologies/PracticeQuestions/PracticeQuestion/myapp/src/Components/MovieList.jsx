// 2.Create a web page and take 3 Movies details and store on express server using Fetch  and respond with message and show message on page.
// Movies property : Movie Name,Price,Seat


import React, { useEffect } from 'react'
import {useState} from "react"
import MovieTable from "./MovieTable"

function MovieList() {

    const [name, setName] = useState("")
    const [price, setPrice] = useState("")
    const [seats, setSeats] = useState("")

    const [movieData, setMovieData] = useState([])

    function fetchData(){


        // fetching data from server
        fetch("http://localhost:5000/get", {
            method:"get"
        })
        .then((res ) => res.json())
        .then(data =>{
            console.log("Fetched data:",data)
            setMovieData(data)
        })
        .catch(err => {
            console.log(err.message)
        })
    }

    useEffect(()=>{
        fetchData()
    }, [])

    function saveData(event){

        event.preventDefault()

        const obj = {name, price, seats}


        fetch("http://localhost:5000/save", {
            method:"post",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify(obj)
        })
        .then(res => res.json())
        .then((data) => {
            alert("Data saved successfully")
            console.log(data)
            fetchData()

            console.log("Movies data",movieData)
        })
        .catch(err => {
            console.log(err.message)
        })

        setName("")
        setPrice("")
        setSeats("")
    }


  return (
    <div className='container-fluid bg-primary vh-100 d-flex flex-column justify-content-center align-items-center gap-2'>

        <div className='text-white'>
           <h2>Movie Ticket registration</h2>
        </div>
        <form onSubmit={saveData} className='border mt-3 p-5 bg-white ' >
            <div className='mb-3'>
                Enter movie name: <input type='text' value={name} onChange={(e) => setName(e.target.value)} />
            </div>

            <div className='mb-3'>
                Enter Price <input type='number' value={price} onChange={(e) => setPrice(e.target.value)}/>
            </div>

            <div className='mb-3'>
                No. of Seats: <input type='number' value={seats} onChange={(e) => setSeats(e.target.value)}/>
            </div>

            <button className='btn btn-primary' type='submit'>Save</button>
        </form>

        <MovieTable movieData={movieData}/>

    </div>
  )
}

export default MovieList