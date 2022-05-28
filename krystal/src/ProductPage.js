import React from 'react'
import './Product.css'

const ProductPage = () => {
  const pimglink = "https://picsum.photos/400/500";
  const ptitle = "Apple iPhone 12 (128GB) - Blue";
  const prating = "4 out of 5" 
  const pprice = "60,990"
  return (
    <div className="pro-page-div">
      <div className="img-div">
        <img src={pimglink} alt="Product"/>
      </div>
      <div> 
        <br />
        <h2>{ptitle}</h2>
        {prating} <br />
        <h4>{pprice}</h4>
      </div>
    </div>
  )
}

export default ProductPage