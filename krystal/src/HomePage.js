import React from 'react'
import Slider from './Slider';
import CategorySlider from './CategorySlider';

function HomePage() {
  
  const category = ["Electronics", "Fashion", "Home", "Auto Accessories"];
  return(<>
    
    <Slider/>
    {category.map((val)=>{
       return( <CategorySlider category={val}/>);
    })}
  </>);
}

export default HomePage;
