import { useState,useEffect } from "react";


function Response() {
    const [response,setResponse]=useState('');
 useEffect(()=>{
getresponse();
},[]);

    async function getresponse(){
const response=await fetch('http://localhost:8080/issue')
const responseData=await response.json();
console.log("hwlo")
console.log(responseData)
 setResponse(responseData);
    }
   
return (
    <div>
       
        <div>
            <h1>response is ready</h1>
<p>{response}</p>
        </div>
    </div>
)
}
export default Response;