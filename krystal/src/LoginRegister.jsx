import React from 'react'
import {Tabs, Tab, Form, Button,Row,Col} from "react-bootstrap";
import './Main.css';

const LoginRegister = () => {
  return (
    <div className="lr_main-div">
      <Tabs defaultActiveKey="login" id="uncontrolled-tab-example" className="mb-3 lr_main-tab">
      <Tab eventKey="register" title="Register">
        <div className="lr_register_div">
        <Form className="lr-register-form">
            <Row className="mb-3">
              <Form.Group as={Col} controlId="formGridEmail">
                <Form.Label>First Name</Form.Label>
                <Form.Control type="text" placeholder="First name" className="lr-register-control" />
              </Form.Group>
              <Form.Group as={Col} controlId="formGridPassword">
                <Form.Label>Last Name</Form.Label>
                <Form.Control type="text" placeholder="Last name" className="lr-register-control"/>
              </Form.Group>
            </Row>
            <Form.Group className="mb-3" controlId="formGridAddress1">
              <Form.Label>Email</Form.Label>
              <Form.Control type="email" placeholder="Email" className="lr-register-control"/>
            </Form.Group>

            <Form.Group className="mb-3" controlId="formGridAddress2">
              <Form.Label>Mobile Number</Form.Label>
              <Form.Control placeholder="Mobile number" className="lr-register-control"/>
            </Form.Group>

              <Form.Group className="mb-3" controlId="formGridCity">
                <Form.Label>Password</Form.Label>
                <Form.Control type="password" placeholder="Password" className="lr-register-control"/>
                  <Form.Text className="text-muted">
                  Password must be at least 6 character.
                  </Form.Text>
              </Form.Group>

              <Form.Group className="mb-3" controlId="formGridZip">
                <Form.Label>Confirm Password</Form.Label>
                <Form.Control type="text" placeholder="Confirm Password" className="lr-register-control"/>
              </Form.Group>

            <br/><br/>
            <Button variant="primary" type="submit">
              Register
            </Button>
          </Form>
        </div>
      </Tab>


      <Tab eventKey="login" title="Login">
      <div className="lr_login_div">
           <Form className="lr-form">
            <Form.Group className="mb-3" controlId="formBasicEmail">
              <Form.Label>Email address</Form.Label>
              <Form.Control type="email" placeholder="Enter email" className="lr-form-control"/>         
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicPassword">
              <Form.Label>Password</Form.Label>
              <Form.Control type="password" placeholder="Password" className="lr-form-control"/>
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicCheckbox">
              <Form.Check type="checkbox" label="Remember Me" />
            </Form.Group>
            <br/>
            <Button variant="primary" type="submit">
              Login
            </Button>
          </Form>
        </div>
      </Tab>
    </Tabs>
  </div>
  )
}

export default LoginRegister