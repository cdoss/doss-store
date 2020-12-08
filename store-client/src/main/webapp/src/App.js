import { Component } from "react";
import "./App.css";
import HomePageList from "./components/homepage/HomePageList";
import { logo } from "../../doss-store-media/src/main/media/logo";

function Header({ name }) {
  return (
    <header>
      <img src={logo} alt="" />
      <h1>{name}'s Kitchen</h1>
    </header>
  );
}

const dishes = ["Cheeseburger", "Hamburger", "Chow Foon", "Spagetti"];
const dishObjects = dishes.map((dish, i) => ({
  id: i,
  title: dish,
}));
console.log(dishObjects);
function Main({ adjective, dishes }) {
  return (
    <section>
      <p>We Serve the Most {adjective} food around.</p>
      <ul style={{ textAlign: "left" }}>
        {dishes.map((dish) => (
          <li key={dish.id}>{dish.title}</li>
        ))}
      </ul>
    </section>
  );
}

function Footer({ year }) {
  return (
    <footer>
      <p>Copyright {year}</p>
    </footer>
  );
}

function App() {
  return (
    <div className="App">
      <Header name="Don" />
      <Main adjective="Amazing" dishes={dishObjects} />
      <Footer year={new Date().getFullYear()} />
    </div>
  );
}

export default App;
