import './Main.css';
import React from 'react'
import 'bootstrap/dist/css/bootstrap.min.css';
import {Link} from 'react-router-dom';
import {Navbar,Container,Nav,NavDropdown,Row,Col} from "react-bootstrap";

function CategoryBar() {
  return(<>
        <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
         <Container fluid>
           <Row className="d-flex justify-content-between mx-auto">
             <Col>
             <Nav> <NavDropdown title="Categories" id="collasible-nav-dropdown">
                    <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
                    <NavDropdown.Divider />
                    <NavDropdown.Item href="#action/3.4">Separated link</NavDropdown.Item>
                  </NavDropdown>
                </Nav>
                </Col>
              <Col>
              <Navbar.Toggle aria-controls="responsive-navbar-nav" />
        <Navbar.Collapse id="responsive-navbar-nav">
          <Nav className="mx-auto">
            <Nav.Link className="bar-btn"><Link to='/Slider' className='bar-lin'>Best Seller</Link></Nav.Link>
            <Nav.Link className="bar-btn"><Link to='/Slider' className='bar-lin'>Today's Deals</Link></Nav.Link>
            <Nav.Link className="bar-btn"><Link to='/Slider' className='bar-lin'>Krystal Pay</Link></Nav.Link>
            <Nav.Link className="bar-btn"><Link to='/Slider' className='bar-lin'>Contact Us</Link></Nav.Link>
          </Nav>
        </Navbar.Collapse>
        </Col>
    </Row>
  </Container>
</Navbar>
  </>);
}

export default CategoryBar;
