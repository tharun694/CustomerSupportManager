import {useState} from 'react';
import Login from './Login';
import {useNavigate} from 'react-router-dom';
function Register(){
const[username,setUsername]=useState('');
const[password,setPassword]=useState('');
const[user,setUser]=useState(null);

const navigate=useNavigate();
//console.log(username);

  function adduser(){
    if(username==""||password=="")return alert("invalid data");
 const  user={
    username,
    password
  }
  console.log(user);
  fetch(`http://localhost:8080/register`,{
  'method':'POST',
  'headers':{
    'Content-Type':'application/json'
  },
  'body':JSON.stringify(user)
 })

 setUsername('')
 setPassword('')
 alert("register sucessfully");
 navigate('/login')
}
function handlesubmit( ){
  navigate('/login');
}
return(
  <div className="login" >    
        <input  
        type="text"
        placeholder="username"
        value={username}
      onChange={(e)=>setUsername(e.target.value)
      }
        />
        <input type="password"
        placeholder="password"
        value={password}
        onChange={(e)=>setPassword(e.target.value)}/>
        <button onClick= {adduser} >click</button>
        <button onClick={handlesubmit}> </button>
  </div>
)
}
export default  Register 
