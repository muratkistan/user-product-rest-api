
import './App.css';
import ListAllOwnProducts from './components/ListAllOwnProducts';
import {BrowserRouter as Router,Redirect,Route,Switch} from 'react-router-dom';
import Navbar from './components/Navbar';
import ListAllProducts from './components/ListAllProducts';
import EditProduct from './components/EditProduct';

function App() {
  return (
    <div >
  
    <Router>
    <Navbar/>
        <Switch>
            <Route exact path="/" component={ListAllProducts} ></Route>
            <Route path="/getOwn" component={ListAllOwnProducts}></Route>
            <Route path="/edit/product/:id" component={EditProduct}></Route>
        
            
            
            <Redirect to="/"/>

        </Switch>
    </Router>
    

  </div>
 
  );
}

export default App;
