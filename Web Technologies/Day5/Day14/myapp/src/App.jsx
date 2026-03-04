import { useEffect, useState } from 'react'
import FruitList from "./components/FruitList"
import FruitContext from './components/FruitContext';
import StudentContext from './StudentComponent/StudentContext';
import Student from './StudentComponent/Student';

function App() {

  //const [fruit, setFruit] = useState([]);

  // const saveHandler = function (data) {
  //   setFruit([...fruit, data]);
  // };

  // const deleteHandler = function (index) {
  //   setFruit(fruit.filter((item, i) => i !== index))
  // }

  // student handlers
  const [student, setStudent] = useState([])

  // Counting students
  const [countStudent, setStudentCount] = useState("")

  useEffect(()=>{
    setStudentCount(student.length)
  },[student])

  const saveStudentHandler = function (data){
      setStudent([...student,data])
  }

  const deleteStudentHandler = function (index) {
    setStudent(student.filter((item, i) => i !== index))
  }

  const updateStudentHandler = function (index, newMarks) {
    setStudent(
      student.map( (item, i) => 
        i === index ? {...item, marks:newMarks} : item
    )
    )
  }

  return (
    <>
      {/* <FruitContext.Provider value={{ fruit, setFruit, saveHandler,deleteHandler }}>
        <>
          <FruitList />
        </>
      </FruitContext.Provider> */}

      {/* Student example */}

      <StudentContext.Provider value={{student, setStudent, saveStudentHandler, deleteStudentHandler, updateStudentHandler}}>
        <>
          <Student/>

          <p><b>Total students:</b> {countStudent}</p>
        </>
      </StudentContext.Provider>
    </>
  )
}

export default App
