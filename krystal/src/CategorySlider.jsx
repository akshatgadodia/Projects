import React,{useEffect,useState} from 'react';
import './Main.css';
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import Cards from './Cards';
import './Main.css';
import axios from 'axios';

const CategorySlider = (props) => {

    const [products, setProducts] =useState([])

    useEffect(() => {
            axios.get(`http://localhost:8080/api/v1/products`)
                .then(res => {
                    setProducts(res.data)
                })
                .catch(err => {
                  console.log(err)
                })
        }, [])
  
    var settings = {
        dots: false,
        infinite: false,
        speed: 500,
        slidesToShow: 7,
        slidesToScroll: 1,
        initialSlide: 0,
        responsive: [
          {
            breakpoint: 1024,
            settings: {
              slidesToShow: 4,
              slidesToScroll: 1,
              infinite: true,
            }
          },
          {
            breakpoint: 600,
            settings: {
              slidesToShow: 2,
              slidesToScroll: 1,
              initialSlide: 2
            }
          },
          {
            breakpoint: 480,
            settings: {
              slidesToShow: 2,
              slidesToScroll: 1
            }
          }
        ]
      };

      return (
        <div className="category-slider">
          <div>
            <h3>{props.category}</h3>
          </div>
          <div>
            <Slider {...settings} className='cat-slider'>
                {products.map(function(d, idx){
                  console.log(idx);
                  console.log(d);
                  console.log(d.name[idx]);
                  console.log(d.price[idx]);
                  console.log(d.subCategory[idx]);
                  console.log("HELLO");
                    return(<Cards key={idx} name={d.name} price={d.price} subcategory={d.subCategory}/>)
                })}
            </Slider>
          </div>
        </div>
                 
      );
};

export default CategorySlider;
