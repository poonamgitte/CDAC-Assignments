import React from 'react'

function StudentList({ registrationDetails }) {
    console.log(registrationDetails)
    return (
        <div>

            <table border={1}>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>course</th>

                    </tr>
                </thead>

                <tbody>

                    {registrationDetails.map((data,index) => {
                        return <tr key={index}>
                            <td>{data?.name}</td>
                            <td>{data?.email}</td>
                            <td>{data?.contact}</td>
                            <td>{data?.course}</td>
                        </tr>
                    })}
                </tbody>
            </table>

        </div>
    )
}

export default StudentList