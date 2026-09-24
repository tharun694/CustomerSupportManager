import {Routes,Route,Link,Outlet} from 'react-router-dom';
import Crud from './Crud';
import './Dashboard.css';
function Dashboard(){
    

//     function logout(){
// localStorage.removeItem;
// Navigate()
//     }
return (
    <div>
        <h1>Welcome to the  Page</h1>
        <div className='link'>
       <Link to="/crud">Crud</Link> ||  <Link to='/contact'>Contact</Link>  ||
       <Link to="/logout">Logout</Link>
      </div>
       <Outlet /> 
       <div>
        <button >Logout</button>
        </div>   
    </div>
)
}

export  default Dashboard;