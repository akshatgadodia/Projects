import './Main.css';
import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import SearchIcon from '@mui/icons-material/Search';
//import {Button} from 'react-bootstrap';

function MainNavBar() {
  const run = () =>{
    alert("Hello");
  }
  return (
    <>
        <nav className='main-nav'>
          <div id='logo'>KRYSTAL</div>
          <div id='search-field'>
            <button id='search-icon' onClick={run}><SearchIcon/></button>
            <input id='search-area' type="text" placeholder='Search'/>
          </div>
          <div id='btn-grp'>
            <span className='nav-span'><button className='nav-btn' onClick={run}>Login</button></span>
            <span className='nav-span'><button className='nav-btn' onClick={run}>Login</button></span>
            <span className='nav-span'><button className='nav-btn' onClick={run}>Login</button></span>
          </div>
        </nav>
    </>
  );
}

export default MainNavBar;
