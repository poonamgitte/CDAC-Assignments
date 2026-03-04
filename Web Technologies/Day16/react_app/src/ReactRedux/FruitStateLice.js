import { createSlice } from "@reduxjs/toolkit";

export const fruitSlice = createSlice({
  name: "fruits",
  initialState: [],
  reducers: {
    addFruit: (state, action) => {
      state = [...state, action.payload];
      console.log(state)
      return state
    },
    deleteFruit: (state, action) => {
      //action.payload will give us fruitName
      state = state.filter((item) => item !== action.payload);
      return state
    },
  },
});

export const { addFruit, deleteFruit } = fruitSlice.actions;
export default fruitSlice.reducer;
