import { configureStore } from "@reduxjs/toolkit";
import fruitReducer from "./FruitStateLice"

export default configureStore({
    reducer:{
        fruits: fruitReducer
    }
})