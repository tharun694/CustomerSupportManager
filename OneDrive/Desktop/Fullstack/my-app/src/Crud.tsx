
import './Crud.css'
import {useState}from 'react';

interface Student{
    id?:number,
    name:string,
    age:number,
    marks:number
}
function Crud (){
    const[students,setStudent]= useState <Student[]|[]>([])
const [name,setName]=useState('');
const [age,setAge]=useState(0);
const [marks,setMarks]=useState(0);

const [id,setId]=useState<number|undefined>(undefined);

 async function adduser(){
    const student={
        name,
        age,
        marks
    }    
       const response= await fetch('http://localhost:8080/detail',{
            'method':'POST',
            'headers':{
'Content-Type':'application/json'
            },
            credentials:'include',
            'body':JSON.stringify(student)
        })
   if(response.ok){
    alert("sucessfully added");
   }
}

async function getuser(){
      
    try{
        const response=await fetch(`http://localhost:8080/details`,{
            'method':'GET',
            'headers':{
                'Content-Type':'application/json'
            },
            credentials:'include'
        })
    const data= await response.json();
    console.log(data)
    setStudent(data)
       console.log(data);
    }catch(e){
        console.log(e)
    }
    
}
function editStudent(student:Student){
      
setId(student.id)
setAge(student.age)
setMarks(student.marks)
setName(student.name)
    }
 async   function update(id:number|undefined){
    if(id==null){
        alert("nothing to update");
    }
        const student={
            name,
            age,
            marks
        }
        await fetch(`http://localhost:8080/detail/${id}`,{
            'method':'PUT',
            'headers':{
'Content-Type':'application/json'
            },
            credentials:'include',
            'body':JSON.stringify(student)
        })
    }
   async function deleteStudent(id:number|undefined){
await fetch(`http://localhost:8080/${id}`,{
            'method':'DELETE',
            'headers':{
'Content-Type':'application/json'
            },
            credentials:'include',
        })
        getuser;
   }
return(
    <div className='head'>
        <h1>hello !we will do crud</h1>
        <div>
         <label>Name</label>   <input type="text"
placeholder="username"
value={name}
onChange={(e)=>setName(e.target.value)}
></input>
 <label>Age</label>   <input type="number"
placeholder="age"
value={age}
onChange={(e)=>setAge(parseInt(e.target.value))}

></input>

<label>Marks</label>   <input type="number"
placeholder="marks"
value={marks}
onChange={(e)=>setMarks(parseInt(e.target.value))}

></input>
<button onClick={()=>adduser()}>Click</button>
<button onClick={()=>getuser()}>Students</button>
<button onClick={()=>update(id)}>Update</button>
        
        <div>
            <table>
                <thead>
                <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Age</th>
                <th>Marks</th>
</tr>
</thead>
<tbody>
   {students.map((student)=>(
    <tr key={student.id}>
        <td>{student.id}</td>
    <td>{student.name}</td>
    <td>{student.age}</td>
    <td>{student.marks}</td>
    <td> <button onClick={()=>editStudent(student)}>edit</button></td>
    <td><button onClick={()=>deleteStudent(student.id)}>delete</button></td>
    </tr>
   ))} 
</tbody>
            </table>
        </div>
        </div>
    </div>
    
)
}
export default Crud;