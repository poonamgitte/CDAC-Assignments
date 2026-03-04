import React from 'react'
import {useState} from "react"
import {useContext} from "react"
import StudentContext from './StudentContext'
import StudentList from './StudentList'


function Student() {

    const context = useContext(StudentContext)

    const [name, setName] = useState("")
    const [marks, setMarks] = useState("")

    function saveData(event){
        event.preventDefault()

        if(name.trim().length === 0) return

        if(isNaN(marks)){
            alert("Invalid marks...")
            return
        }

        if(marks < 0){
            alert("Invalid marks")
            return
        }

        let obj = {name, marks}

        context.saveStudentHandler(obj)

        setName("")
        setMarks("")
    }


  return (
    <div>
        <h2>Student details</h2>
        <form>
            Enter name: <input type='text' value={name} onChange={(e) => setName(e.target.value) }/>
            <br></br><br></br>

            Enter marks: <input type='number' value={marks} onChange={(e) => setMarks(e.target.value)}/>
            <br></br><br></br>
            <button onClick={saveData}>Save</button>
        </form>

        <StudentList/>
    </div>
  )
}

export default Student