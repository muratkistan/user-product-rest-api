

# ABOUT PROJECT
### user-product-service

-   A client can create new product in the service
-   A client can modify their own products
-   A client can delete their own products
-   A client can view all products in the service


# PROJECT ARCHITECTURE


![ayrotek son hali](https://user-images.githubusercontent.com/67208557/156436134-6ced2088-15ea-4624-90d0-647bd9a29672.PNG)




## SERVICE-REGISTRY

```
  path : localhost:8761
```

![eureka](https://user-images.githubusercontent.com/67208557/156435980-ee96fd2c-c4f6-4951-b722-13fae6e9a9b3.PNG)


## API-GATEWAY

```
  path : localhost:9191
```



## USER-PRODUCT-SERVICE

```
 path : localhost:9191/user-product/**  or   USER-PRODUCT-SERVICE/user-product/**
```
#### Products
| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/products/getAll` | Fetch All Products from Database |
| GET      | `/products/:id` | Fetch one products by product Id from Database |
| GET      | `/products/users/:userId` | Fetch all the one user's products |
| POST      | `/products/add` | Add a product to database |
| PUT     | `/products/update/:id` | Update product |
| DELETE      | `/products/delete/:id` | Delete product by id |


#### Users
| Http Method | Erişim Noktası     | Açıklama                       |
| :-------- | :------- | :-------------------------------- |
| GET      | `/users/getAll` | Fetch all users from Database |
| GET      | `/users/:id` | Fetch one user by user Id from Database |
| POST      | `/users/add` | Add a user to database |
| PUT     | `/users/update/:id` | Update user |
| DELETE      | `/users/delete/:id` | Delete user by id |


## FRONTEND SCREENSHOT

![all](https://user-images.githubusercontent.com/67208557/156439094-1dcb25f4-418c-4cba-9131-ab4f2f0455c8.PNG)
![own](https://user-images.githubusercontent.com/67208557/156439119-28f3b1c4-4894-4005-9cb4-b9dd4693ef06.PNG)
![update](https://user-images.githubusercontent.com/67208557/156439137-864e9720-a222-43b6-9596-bd601f4fa5b8.PNG)




