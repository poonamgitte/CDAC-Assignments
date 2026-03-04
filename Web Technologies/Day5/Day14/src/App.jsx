import { useState } from 'react'
//import FruitList  from './FruitList'
//import FruitContext from './FruitContext'
import MovieList from './MovieList'
import MovieContext from './MovieContext'
//import './App.css'

function App () {
 
 
  return (
    // <FruitContext.Provider value={{fruit, setFruit,saveHandler}}>
    // <>

    //   <FruitList/>
    // </>
    // </FruitContext.Provider>

    <MovieContext.Provider>
      <>
        <MovieList />
      </>
    </MovieContext.Provider>
  )
}

export default App
