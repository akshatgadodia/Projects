import {Carousel} from 'react-bootstrap';
//import './CategoryBar.css';
import React, {useState} from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';

function Slider() {
    const [index, setIndex] = useState(0);
  
    const handleSelect = (selectedIndex, e) => {
      setIndex(selectedIndex);
    };
    return(<>
        <Carousel activeIndex={index} onSelect={handleSelect}>
        <Carousel.Item style={{'height':"300px"}}>
          <img
            style={{'height':"300px",'width':"100%"}}
            className="d-block w-100"
            src="https://picsum.photos/1000"
            alt="First slide"
          />
          <Carousel.Caption>
            <h3>First slide label</h3>
            <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item style={{'height':"300px"}}>
          <img
            style={{'height':"300px",'width':"100%"}}
            className="d-block w-100"
            src="https://picsum.photos/1000"
            alt="Second slide"
          />
  
          <Carousel.Caption>
            <h3>Second slide label</h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item style={{'height':"300px"}}>
          <img
            style={{'height':"300px",'width':"100%"}}
            className="d-block w-100"
            src="https://picsum.photos/1000"
            alt="Third slide"
          />
  
          <Carousel.Caption>
            <h3>Third slide label</h3>
            <p>
              Praesent commodo cursus magna, vel scelerisque nisl consectetur.
            </p>
          </Carousel.Caption>
        </Carousel.Item>
      </Carousel>
    </>);
}

export default Slider;
