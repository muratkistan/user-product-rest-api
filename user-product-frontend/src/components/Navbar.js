import React from 'react';
import { Link } from 'react-router-dom';

const Navbar = () => {
    return (
        <div >
            <nav class="navbar navbar-dark bg-dark justify-content-between">
                <div clas>
            <Link to="/" class=" navbar-brand container">ALL PRODUCTS</Link>
            <Link to="/getOwn" class=" navbar-brand container">OWN PRODUCTS</Link>

                </div>
       
           
            </nav>
        </div>
    );
};

export default Navbar;