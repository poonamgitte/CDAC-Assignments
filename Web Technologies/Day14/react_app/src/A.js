import B from "./B.js"
import C from "./C.js"

function A(){
    return <div>
        This is A component
        <B/>
        <C/>
        <C/>
    </div>
}

export default A;