import { useEffect, useState } from 'react'
import StudentList from './StudentList';
import axios from 'axios';

function RegistrationForm() {

    const [name, setName] = useState("");
    const [email, setEmail] = useState("");

    const [contact, setContact] = useState("")
    const [course, setCourse] = useState("");

    const [registrationDetails, setRegistrationDetails] = useState([])

    // Getting data from server
    async function fetchData() {

        // getting data using fetch
        // fetch("http://localhost:5000/students", {
        //     method:"get"
        // })
        // .then(res => res.json())
        // .then( (data) => {
        //     console.log("Fetched data from server: ",data)
        //     setRegistrationDetails(data)
        // })
        // .catch((error) =>{
        //     console.log(error.message)
        // })

        // or

        // getting data using axios
        // axios.get("http://localhost:5000/students")
        // .then((res) =>{
        //     console.log("Fetched data:",res.data);
        //     setRegistrationDetails(res.data)
        // })
        // .catch((error) =>{
        //     console.log(error.message);
        // })

        // using await - async 
        try {

            let res = await axios.get("http://localhost:5000/students");
            console.log("Fetched data:", res.data);
            setRegistrationDetails(res.data);

        } catch (error) {
            console.log(error.message)
        }


    }

    // do not call fetchData inside the component
    useEffect(() => {
        // without async can call directly
        // fetchData();

        // with async need async function
        async function getData() {
            await fetchData()
        }

        getData()
    }, []);


    async function saveData(event) {

        event.preventDefault()

        // validations
        // Name must be at least 3 characters
        // Email format must be valid
        // Contact should be 10 digits

        if (name.length < 3) {
            alert("Name must be at least 3 letters");
            return;
        }

        if (!email.includes('@') || !email.includes('.') || email.indexOf('@') > email.lastIndexOf('.')) {
            alert("Please Enter valid email ")
            return;
        }

        if (contact.length !== 10 || isNaN(contact)) {
            alert("Contact should be of length 10");
            return;
        }

        let obj = { name, email, contact, course };

        // save data to server using fetch 
        // fetch("http://localhost:5000/register", {
        //     method:"post",
        //     headers:{
        //         "Content-Type": "application/json"
        //     },
        //     body: JSON.stringify(obj)
        // })
        // .then(res => res.json())
        // .then(res => {
        //     alert("Register successfully")
        //     console.log(res)
        //     fetchData()   // on adding new data this will show in table
        // })
        // .catch(error =>{
        //     console.log("Error:",error.message)
        // })

        // or 

        // saving data to server using axios
        // axios.post("http://localhost:5000/register", obj )
        // .then(res => {
        //     alert("Registered Successfully")
        //     console.log(res.data);
        //     fetchData();
        // })
        // .catch(error =>{
        //     console.log("Error: ",error)
        // })

        // setName("")
        // setEmail("")
        // setContact("")
        // setCourse("")

        // with async- await

        try {

            let res = await axios.post("http://localhost:5000/register", obj);
            console.log("Data Saved :", res.data)

            await fetchData()

            setName("")
            setEmail("")
            setContact("")
            setCourse("")
        }
        catch (error) {
            console.log(error.message)
        }

    }


    return (
        <div>

            <form onSubmit={saveData}>
                Enter name: <input type='text' name='name' value={name} onChange={(e) => setName(e.target.value)} /><br />
                Enter email: <input type='text' name='email' value={email} onChange={(e) => setEmail(e.target.value)} /><br />
                Enter Contact: <input type='text' name='contact' value={contact} onChange={(e) => setContact(e.target.value)} /><br />

                Enter Course:
                <select name='course' value={course} onChange={(e) => setCourse(e.target.value)}>
                    <option value="">Select</option>
                    <option value="DAC">DAC</option>
                    <option value="DBDA">DBDA</option>
                    <option value="DAI">DAI</option>
                </select>

                <button type='submit'>Save</button>

                <br />

                <button onClick={() => fetchData}>Show Data</button>
                <br />

                <StudentList registrationDetails={registrationDetails} />

            </form>



        </div>
    )
}

export default RegistrationForm