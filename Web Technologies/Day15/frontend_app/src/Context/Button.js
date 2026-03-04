import "./Styles.css"
// childress property of props is used to access jsx or data between the tag
function Button(props){
    return <button className="btn" {...props}>
        {props?.children}
    </button>
}

export default Button