import { Provider } from "react-redux";
import Store from "./Store.js"
import Fruits from "./Fruits";
import FruitList from "./FruitList";

function Main() {
  return (
    <Provider store={Store}>
      <div>
        <Fruits/>
        <FruitList/>
      </div>
    </Provider>
  );
}

export default Main;
