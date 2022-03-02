import React, { useEffect, useState } from 'react';
import { useHistory, useParams } from 'react-router-dom/cjs/react-router-dom.min';
import ProductService from '../services/ProductService';

const EditProduct = () => {

  const [productName, setProductName] = useState("");
  const [productCode, setProductCode] = useState();
  const [category, setCategory] = useState("");
  const [price, setPrice] = useState();
  const [user,setUser] = useState({});


  const history = useHistory();
  const { id } = useParams();




  const onClickSendButton = (event) => {
    event.preventDefault();

    const product = {
        productName,
        category,
        price,
        user,
        productCode
     
    };

    ProductService.updateProduct(id, product)
      .then((response) => {
 
        history.push("/getOwn");
      })
      .catch((error) => {
        console.log(error);
      });
  };

  useEffect(() => {
    ProductService.getProductById(id)
      .then((response) => {
        setProductName(response.data.productName);
        setCategory(response.data.category);
        setPrice(response.data.price);
        setUser(response.data.user)
        setProductCode(response.data.productCode)
    

        console.log(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);



    return (
        <div className="container" style={{width:"600px"}}>
            <h1 className="text-center">UPDATE PRODUCT</h1>
            <form>

            
        <div className="form-group mt-3">
            <label >Product Code</label>
            <input value={productCode} onChange={(e) =>setProductCode(e.target.value)} type="text" class="form-control" id="productCode"  placeholder="Product Code"/>
            
        </div>
        <div className="form-group mt-3">
            <label >Product Name</label>
            <input value={productName} onChange={(e) =>setProductName(e.target.value)} type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Product Name"/>
            
        </div>
        <div className="form-group mt-3">
            <label >Category</label>
            <input value={category} onChange={(e) =>setCategory(e.target.value)} type="text" class="form-control" id="exampleInputPassword1" placeholder="Category"/>
        </div>
        <div className="form-group mt-3">
            <label >Price</label>
            <input value={price} onChange={(e) =>setPrice(e.target.value)} type="number" class="form-control" id="exampleInputPassword1" placeholder="Price"/>
        </div>
        <div className="text-center mt-4">
            <button onClick={onClickSendButton}  type="submit" className="btn btn-primary ">UPDATE</button>
        </div>
      
</form>
        </div>
    );
};

export default EditProduct;