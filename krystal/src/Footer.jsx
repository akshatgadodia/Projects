import React from 'react'
import './Main.css';
import Lock from "./Resources/icons8-lock-100.png";
import Trust from "./Resources/icons8-trust-100.png";
import Help from "./Resources/icons8-web-help-100.png";
import Mobile from "./Resources/icons8-iphone-x-80.png";
import FacebookIcon from '@mui/icons-material/Facebook';
import InstagramIcon from '@mui/icons-material/Instagram';
import LinkedInIcon from '@mui/icons-material/LinkedIn';


function Footer() {
  const date = new Date();
  return(<>
    <div class='main-div'>
        <div class='inside-div'><img src={Lock} alt="Lock" /><br /><h4>100% SECURE PAYMENT</h4>
        <p>Moving your card details to a much more secured places</p> </div>
        <div class='inside-div'><img src={Trust} alt="Trust" /><br /><h4>TRUST PAY</h4>
        <p>Moving your card details to a much more secured places</p> </div>
        <div class='inside-div'><img src={Help} alt="Help" /><br /><h4>HELP CENTER</h4>
        <p>Moving your card details to a much more secured places</p> </div>
        <div class='inside-div'><img src={Mobile} alt="Mobile" /><br /><h4>SHOP ON THE GO</h4>
        <p >Moving your card details to a much more secured places</p> </div>
    </div>
    <div class='main-footer-div'>
        <div class=''><h2>Shop Non-Stop on Krystal</h2>
        <p>Trusted by many <br /> Cash on Delivery | Free Delivery</p></div>
        <div class=''><h4>Contatct Us</h4><p>akshatgadodia@gmail.com</p></div>
        <div class=''><h4>Reach Out to us</h4>
        <div class='social-media-div'>
            <a href='https://www.facebook.com/'><FacebookIcon/></a>
            <a href='https://www.instagram.com/?hl=en'><InstagramIcon/></a>
            <a href='https://www.linkedin.com/signup'><LinkedInIcon/></a>
        </div>
        </div>
    </div>
    <div className="copyright-section">
          <p> © {date.getFullYear()} Krystal. All Rights Reserved | Terms and Conditions</p>
      </div>
  </>);
}

export default Footer;
