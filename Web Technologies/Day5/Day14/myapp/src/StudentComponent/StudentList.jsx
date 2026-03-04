import React, { useState } from 'react'
import StudentContext from './StudentContext'
import { useContext } from 'react'

function StudentList() {

    const {student, deleteStudentHandler,  updateStudentHandler}= useContext(StudentContext)

    // const [newMarks, setNewMarks] = useState("")

    console.log("context",student)
  return (
    <div>
            <ol>
                {
                    student.map((s, index) =>{
                          return <li key={index}>{s.name }- {s.marks} 

                            <input type='number' placeholder='new marks' onChange={(e) => s.newMarks = e.target.value}/>

                            <button onClick={() => updateStudentHandler(index, s.newMarks)}>Update</button>

                            <button onClick={() => deleteStudentHandler(index)}>Delete</button>
                            </li>     
                    })

                }
            </ol>

    </div>
  )
}

export default StudentList