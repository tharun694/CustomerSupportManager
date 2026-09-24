
import { useNavigate } from 'react-router-dom';

export default function Logout() {
  const navigate = useNavigate();

  const handleLogout = async () => {
    try {
      // 1. Tell Spring Boot to clear JSESSIONID session
      await fetch('http://localhost:8080/logout', {
        method: 'POST',
        credentials: 'include',
      });
    } catch (error) {
      console.error('Logout error:', error);
    } finally {
      // 2. Clear browser auth state
      localStorage.removeItem('isAuthenticated');

      // 3. Redirect back to login page
      navigate('/login', { replace: true });
    }
  };

  return <button onClick={handleLogout}>Logout</button>;
}