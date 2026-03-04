
// import './App.css';
import A from './A';
import MovieList from './MovieList';

//  4.Write react code to read movie data from user and show in table(Use different Component for table).
// Movie Fields : movieName, actor, release(date),Movie type(2d,3d,IMAX)(use checkbox), state(use select tag)

function App() {
  return (
    <div className="App">
      {/* <h1>Hello</h1> */}

      <MovieList/>

      <A/>
    </div>
  );
}

export default App;
