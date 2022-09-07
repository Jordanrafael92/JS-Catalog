import Navbar from 'components/Navbar';
import Home from 'pages/Home';
import Admin from 'pages/Home/Admin';
import Catalog from 'pages/Home/Catalog';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

const Routes = () => (
  <BrowserRouter>
    <Navbar />
    <Switch>
      <Route path="/" exact>
        <Home />
      </Route>
      <Route path="/products">
        <Catalog />
      </Route>
      <Route path="/admin">
        <Admin />
      </Route>
    </Switch>
  </BrowserRouter>
);

export default Routes;
