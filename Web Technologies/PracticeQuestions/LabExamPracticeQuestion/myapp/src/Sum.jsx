import React from 'react'
import {useState} from 'react'

function Sum() {

    const [num1, setNum1] = useState("");
    const [num2, setNum2] = useState("");

    const [sum, setSum] = useState(null);

    function handleSum(event){

        event.preventDefault()

        if(isNaN(num1) || isNaN(num2)){
            alert("Invalid input")
            return 
        }
        setSum(num1+num2);
    }


  return (
    <div style={{border:"1px solid blue", padding:"20px", margin:"20px", width:"300px"}}>
        <form onSubmit={handleSum}>
            Enter number1 : <input type='number' value={num1} onChange={(e) => setNum1(Number(e.target.value))}/><br></br><br/>
            Enter number2 : <input type='number' value={num2} onChange={(e) => setNum2(Number(e.target.value))}/><br></br>

            <button type='submit'>Add</button><br></br>
        </form>

        <div>
            <strong>Sum is: {sum}</strong></div>

    </div>
  )
}

export default Sum