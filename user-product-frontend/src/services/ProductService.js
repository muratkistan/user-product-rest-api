import axios from "axios";


const PRODUCT_API_URL = "/user-product/products";

class ProductService{
    
    getAllProducts(){
        return axios.get(PRODUCT_API_URL+ "/getAll");
    }

    getAllOwnProducts(userId){
        return axios.get(PRODUCT_API_URL+ "/users/"+userId);
    }

    deleteProduct(productId){
        return axios.delete(PRODUCT_API_URL+"/delete/"+productId);
    }

    updateProduct(productId,product){
        return axios.put(PRODUCT_API_URL+"/update/"+productId,product);
    }

    getProductById(productId){
        return axios.get(PRODUCT_API_URL+"/"+productId);
    }




}

export default new ProductService();