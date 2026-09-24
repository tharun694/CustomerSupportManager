import {Navigate,Outlet} from 'react-router-dom';
function ProtectedRouter(){
    
return localStorage.getItem('isAuthenticated')==='true'?<Outlet />:<Navigate to="/login" replace /> ;
}
export default ProtectedRouter;