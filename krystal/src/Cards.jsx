import React,{useEffect,useState} from 'react';
import {Card} from "react-bootstrap";
import './Main.css';
import axios from 'axios';

const Cards = (props) => {

  function randomIntFromInterval(min, max) { 
    return Math.floor(Math.random() * (max - min + 1) + min)
  }
  const rndInt = randomIntFromInterval(0, 9)
  return (
  <>
    <Card style={{ width: '12.5rem', height:'14rem'}} className="card">
        <Card.Img variant="top" src= {`https://picsum.photos/18${rndInt}/10${rndInt}`} />
        <Card.Body>
            <Card.Title className="card-title">{props.name}</Card.Title>
            
            <Card.Text>
                 <p>{props.price}</p>
                 <p>{props.subcategory}</p>
            </Card.Text>
        </Card.Body>
    </Card>
  </>);
};

export default Cards;
