import React, { useEffect, useState } from 'react';
import ProductService from '../services/ProductService';

const ListAllProducts = () => {

    const [products,setProducts] = useState([]);

    useEffect(() =>{
        ProductService.getAllProducts().then(response => {
            setProducts(response.data);
            console.log(response.data);
        }).catch(error =>{
            console.log(error);
        })

    },[])

    return (
        <div className="tepe">
      <div className="container mt-8">
        <h2 className="text-center"> ALL PRODUCTS </h2>
        <table className="table table-bordered table-striped  ">
          <thead className="text-center">
            <th> Product Id </th>
            <th> Product Code </th>
            <th> Product Name </th>
            <th> Product Category</th>
            <th> Price</th>
            <th> User Id</th>
           
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
               
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
    );
};

export default ListAllProducts;