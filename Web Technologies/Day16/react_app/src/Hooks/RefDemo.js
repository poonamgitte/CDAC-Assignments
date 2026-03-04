function UserInput(){
    let errRef = useRef(null)
    //access the dom errRef.current

    const handleSubmit = function(event){
        event.preventDefault()
        var name = event.target.username.value
        if(name.length <3){
            errRef.current.innerHTML = "Invalid username"
        }
    }

    return <div>
        <form onSubmit={handleSubmit}>
            Enter name:  <input type="text" name="username"/>
            <button>Save</button>
        </form>
        <span ref={errRef}></span>
    </div>
}