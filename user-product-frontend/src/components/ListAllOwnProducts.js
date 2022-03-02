import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import ProductService from '../services/ProductService';

const ListAllOwnProducts = () => {

    const [products,setProducts] = useState([]);

    const userID=1;   //custom userId for testing app

    useEffect(() =>{
        getAllOwnProducts();

    },[]);

    const getAllOwnProducts = (response) => {
        ProductService.getAllOwnProducts(userID).then(response => {
            setProducts(response.data);
            console.log(response.data);
        }).catch(error =>{
            console.log(error);
        })
      };
    

    const deleteProduct = (productId) => {
        ProductService.deleteProduct(productId)
          .then((response) => {
            getAllOwnProducts();
          })
          .catch((error) => {
            console.log(error);
          });
      };



    return (
        <div className="tepe">
      <div className="container mt-8">
        <h2 className="text-center"> All Products for userID :  {userID}  </h2>
        <table className="table table-bordered table-striped  ">
          <thead className="text-center">
            <th> Product Id </th>
            <th> Product Code </th>
            <th> Product Name </th>
            <th> Product Category</th>
            <th> Price</th>
            <th> User Id</th>
            <th className="text-center">Actions</th>
           
          </thead>
          <tbody>
            {products.map((product) => (
              <tr className="text-center" key={product.productId}>
                <td><b> {product.productId} </b></td>
                <td> {product.productCode} </td>
                <td> {product.productName} </td>
                <td> {product.category} </td>
                <td>{product.price}</td>
                <td style={{color: 'red'}}><b>{product.user && product.user.userId}</b></td>
                <td> 
                <Link to={`/edit/product/${product.productId}`}><img
                      src="https://icons.iconarchive.com/icons/custom-icon-design/flatastic-1/512/edit-icon.png"
                      alt="edit"
                      style={{ width: "25px", marginLeft: "30px" }}
                    ></img>   </Link>
                    
                    <img
                    onClick={() => deleteProduct(product.productId)}
                    src="https://img.icons8.com/plasticine/100/000000/filled-trash.png"
                    style={{
                      width: "30px",
                      marginLeft: "30px",
                      cursor: "pointer",
                    }}
                    alt="delete"
                  /></td>
               
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
    );
};

export default ListAllOwnProducts;