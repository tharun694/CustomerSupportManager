import './App.css';
import { Route, Routes } from "react-router-dom";
import Form from './Form';
import Response from './Response';
function App() {

  return (
    <Routes>
      <Route path='/' element={<Form />} />
            <Route path='/response' element={<Response />} />

    </Routes>
  );
}

export default App
