import {createSlice} from "@reduxjs/toolkit"
const fruitSlice = createSlice({
    name:"fruits",
    reducers:{
        addFruit:(state, action) =>{
            state = [...state,action.payload];
            console.log(state)
            return state
        },
        deleteFruit:(state,action) =>{
            state = state.filter((item) => item !== action.payload)
            return state
        },
    }
})

export const {addFruit, deleteFruit} = fruitSlice