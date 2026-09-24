
import {Routes,Route,Link} from 'react-router-dom';
import './App.css'
import Login from './Login.tsx'
import Dashboard from './Dashboard.tsx'
import ProtectedRouter from './ProtectedRouter';
import {useNavigate} from 'react-router-dom';
import Register from './Register.tsx';
import Logout from './Logout';
import Crud from './Crud';
import Contact from './Contact';
function App() {
  
 return(
  <div>
  
 
<Routes>
 <Route path="/" element={<Register />}/>
  <Route path='/login' element={<Login />}></Route>
  <Route element={<ProtectedRouter />}>
  <Route path="/dashboard" element={<Dashboard />}></Route>
        <Route path="/crud" element={<Crud />} ></Route>
      <Route path='/contact' element={<Contact />}></Route>
      <Route path='/logout' element={<Logout />}></Route>
     </Route>
</Routes>

  </div>
 )   
}

export default App;
