//import './Main.css';
import React from 'react'
import Slider from './Slider';
import NavigationBar from './NavigationBar';
import {Route,Switch} from 'react-router-dom';
import HomePage from './HomePage';
import Footer from './Footer';
import ProductPage from './ProductPage';
import LoginRegister from './LoginRegister';
import CategoryBar from './CategoryBar';

function App() {
  return(<>
    <NavigationBar/>
    <CategoryBar/>
    <Switch>
      <Route exact path='/'><HomePage/></Route>
      <Route exact path='/Slider'><Slider/></Route>
      <Route exact path='/LoginRegister'><LoginRegister/></Route>
      <Route exact path='/Product'><ProductPage/></Route>
    </Switch>
    <Footer/>
  </>);
}

export default App;
