// 1.Create a react project and create three components A, B,C and try below component tree structure:
// a) A <- B <-C
// b) Use B and C in A, Use A in App
// c) Use A and B and C in App
// d) Use A in B and C, Use B and C in App

import B from "./B"

function A() {
    return <div>
        Inside Component A.
        <B/>
    </div>
}


export default A