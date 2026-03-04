import { useSelector } from "react-redux"

function FruitList(){
    const fruits = useSelector((state)=> state.fruits)
    
    return <ol>
        {fruits && fruits.map((item) => (
          <li>{item}</li>
        ))}
      </ol>
}

export default FruitList