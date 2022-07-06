
import { Route } from 'react-router-dom';
import { Switch } from 'react-router-dom';
import { BrowserRouter } from 'react-router-dom';
import './App.css';
import CheckList from './components/CheckList';
import Footer from './components/Footer';
import Header from './components/Header';
import Login from './components/Login';

function App() {
  return (
    <BrowserRouter>
    <div >
      <Header/>
      <Switch>
        <Route path="/login" component={Login}/>
       </Switch>
      <Footer/>
    
    </div>
    </BrowserRouter>
  );
}

export default App;
