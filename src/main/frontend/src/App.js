import React from "react";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Home from "./app/Home";
import Lobby from "./app/Lobby";
import "./App.css";

export default function App() {
  return (
    <Router>
      <div className="App">
        <Switch>
          <Route path="/lobby">
            <Lobby />
          </Route>
          <Route path="/">
            <Home />
          </Route>
        </Switch>
      </div>
    </Router>
  );
}
