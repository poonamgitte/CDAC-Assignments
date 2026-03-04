import { useState } from "react"

function Multiplication() {


    const [num1, setNum1] = useState("")
    const [num2, setNum2] = useState("")

    const [prod, setProd] = useState(null);

    function calculateProd(event) {

        event.preventDefault()
        setProd(num1 * num2);
    }
    return <div>
        <form>
            Multiplicaltion of 2 numbers <br/>
            Enter number1: <input type="number" value={num1} onChange={(e) => setNum1(e.target.value)} />
            Enter number2: <input type="number" value={num2} onChange={(e) => setNum2(e.target.value)} />

            <button onClick={calculateProd}>Calculate</button>
        </form>

        <br></br>

        <div>Multiplication : {prod}</div>
    </div>
}

export default Multiplication