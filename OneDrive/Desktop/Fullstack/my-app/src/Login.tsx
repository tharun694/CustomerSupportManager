import './Login.css'
import {useState} from 'react';
import { useNavigate } from 'react-router-dom';


function Login(){

const[username,setUsername]=useState('');
const[password,setPassword]=useState('');
const[user,setUser]=useState(null);
const navigate=useNavigate();
//console.log(username);

  async function  adduser(){
    if(username==""||password=="")return alert("invalid data");
 const  user={
    username,
    password
  }
  
   const response= await fetch(`http://localhost:8080/login`,{
  'method':'POST',
  'headers':{
    'Content-Type':'application/json'
  },
  credentials:'include',
  'body':JSON.stringify(user)
  
 })

 setUsername('')
 setPassword('')
 
 if(response.ok){
  console.log(response.ok);
  
localStorage.setItem('isAuthenticated','true');
navigate('/dashboard')


 }else{
  console.log(user)
  alert(' Wrong User and Password');
 }
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
  </div>
)
}
export default Login;