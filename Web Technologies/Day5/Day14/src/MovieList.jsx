
import { useEffect, useState } from "react";
import MovieListTable from "./MovieListTable";
import { useContext } from "react";
import MovieContext from "./MovieContext";



// 4.Write react code to read movie data from user and show in table(Use different Component for table).
// Movie Fields : movieName, actor, release(date),Movie type(2d,3d,IMAX)(use checkbox), state(use select tag)


function MovieList(){

    const context = useContext(MovieContext)

    const [name,setName] = useState("")
    const [actor,setActor] = useState("")
    const [ date,setDate] = useState("")
    const [movieType, setMovieType] = useState([])
    const [ state, setState] = useState("")
 
    // Do not call Fetch Api in component
    // const fetchData = function(){
    //     fetch("http://localhost:5000/movies", {
    //         method:"GET",
    //     })
    //     .then((res) =>res.json())
    //     .then((data) =>{
    //         console.log(data);
    //         setMovies(data);
    //     })
    //     .catch((err) => console.log(err))
    // }

    // useEffect(function() {
    //     fetchData();
    // }, [])

    const saveMovie = function (event){
       
        context.saveHandler({name:name, actor:actor, date:date, movieType:movieType, state:state});

        event.preventDefault();


        // var name = event.target.movieName.value;
        // var actor = event.target.actor.value;
        // var releaseDate = event.target.date.value;
        
        // var movieTypeArr = event.target.movieType;

        // var movieType = []
        
        // movieTypeArr.forEach(element => {
            
        //     if(element.checked){
        //         movieType.push(element.value);
        //     }
        // });


        // var state = event.target.state.value;

        // console.log(movieTypeArr);
        // var obj = {name, actor, releaseDate, movieType, state};

        // setMovies([...movies, obj]);

        // fetch("http://localhost:5000/movie/save", {
        //     method: "POST",
        //     body: JSON.stringify(obj),
        //     headers:{
        //         "Content-Type":"application/json"
        //     },
        // })
        // .then((res) => res.json())
        // .then((data) => {
        //     console.log(data)
        // })
        // .catch((err) => {
        //     console.log(err)
        // })
    }

    return (
        <div>
            <form onSubmit={saveMovie}>
                Enter name: <input type="text" name="movieName" />
                <br/>
                Enter Actor:<input type="text" name="actor"/>
                <br/> 
                Release date: <input type="date" name="date"/> 
                <br/>
                Movie Type:
                <br/>

                 <input type="checkbox" name="movieType" id="2d" value="2d"/>2D
                {/* <label for="2d" >2d</label> */}

                 <input type="checkbox" name="movieType" id="3d" value="3d"/>3D
                 {/* <label for="3d">3d</label> */}

                <input type="checkbox" name="movieType" id="IMAX" value="IMAX"/>IMAX
                 {/* <label for="IMAX">IMAX</label> */}

                 <br/>
                
                Enter State :
                <select id="state" name="state">
                    <option value="Maharashtra">Maharashtra</option>
                     <option value="Kerala">Kerala</option>
                      <option value="Goa">Goa</option>
                </select>

              <button>Add To list</button>

            </form> 

            <br/>
            {/* <button onClick={fetchData}>Show data</button> */}

            <div>
                <MovieListTable movies={movies}/>
            </div>
        </div>
    )
}


export default MovieList