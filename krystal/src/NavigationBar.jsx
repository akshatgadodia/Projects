import './Main.css';
import React,{useState}from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import {
  Navbar,
  Container,
  Form,
  FormControl,
  Button,
  Row,Col
} from "react-bootstrap";
import {Link} from 'react-router-dom';
import SearchIcon from '@mui/icons-material/Search';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';

function NavigationBar() {
  const[loginStatus,setLoginStatus]=useState(true)
  const loginComponents = e => {
    if(loginStatus){;
      return (
        <Link to='/LoginRegister'><Button  variant="outline-success">Login/Register</Button></Link>
      );
    }
    else{
      setLoginStatus(true);
    return(
      <Link to='/Slider'><Button  variant="outline-success">Profile</Button></Link>
    );
    }
}
  return (
    <>
      <Navbar bg="light" expand="lg">
        <Container>
            <Row className="d-flex justify-content-between m-auto search ">
              <Col xs={4} md="auto" lg="auto" className="pt-1">
              <Link className='nav-link' exact to='/'><Navbar.Brand>Krystal</Navbar.Brand></Link>
                
              </Col>
              <Col md={8}  xs={{ order: 'last' }} sm={{order:0}} className="p-1">
                <Form className="d-flex">
                  <FormControl
                  type="search"
                  placeholder="Search"
                  className="me-2"
                  aria-label="Search"
                  />
                  <Button variant="outline-success"><SearchIcon/></Button>
                </Form>
              </Col>
              <Col xs={5} md="auto" lg="auto" className="pt-1 mx-1">
                {loginComponents()}
              </Col>
              <Col xs={2} md="auto" lg="auto" className="pt-1 mx-1">
              <Link to='/Slider'><Button  variant="outline-success"><ShoppingCartIcon/></Button></Link>
              </Col>
          </Row>
        </Container>
      </Navbar>
    </>
  );
}

export default NavigationBar;
