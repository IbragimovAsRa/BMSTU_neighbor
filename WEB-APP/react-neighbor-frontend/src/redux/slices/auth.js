import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import axios from "../../axios";

export const fetchAuth = createAsyncThunk('auth/fetchAuth', async (params) => {
  const { data } = await axios.post('/auth/login', params);
  return data;
});

// export const fetchRegister = createAsyncThunk('auth/fetchRegister', async (params) => {
//   const { data } = await axios.post('/auth/register', params);
//   return data;
// });

export const fetchAuthMe = createAsyncThunk('auth/fetchAuthMe', async (user_id) => {
  const { data } = await axios.get(`/api/users/${user_id}`);
  return data;
});

const initialState = {
  data: null,
  status: 'loading',
};

const authSlice = createSlice({
  name: 'auth',
  initialState,
  reducers: {
    logout: (state) => {
      state.data = null;
    }
  },
  extraReducers: {
    // Получение залогирования
    [fetchAuth.pending]: (state) => {
      state.status = 'loading';
      state.data = null;
    },
    [fetchAuth.fulfilled]: (state, action) => {
      state.status = 'loaded';
      state.data = action.payload;
    },
    [fetchAuth.rejected]: (state) => {
      state.status = 'error';
      state.data = null;
    },

    // Получение состояния авторизованности
    [fetchAuthMe.pending]: (state) => {
      state.status = 'loading';
      state.data = null;
    },
    [fetchAuthMe.fulfilled]: (state, action) => {
      state.status = 'loaded';
      state.data = action.payload;
    },
    [fetchAuthMe.rejected]: (state) => {
      state.status = 'error';
      state.data = null;
    },

    // Получение регистрации
    // [fetchRegister.pending]: (state) => {
    //   state.status = 'loading';
    //   state.data = null;
    // },
    // [fetchRegister.fulfilled]: (state, action) => {
    //   state.status = 'loaded';
    //   state.data = action.payload;
    // },
    // [fetchRegister.rejected]: (state) => {
    //   state.status = 'error';
    //   state.data = null;
    // },
  },
});

export const selectIsAuth = (state) => Boolean(state.auth.data);

export const authReducer = authSlice.reducer;

export const { logout } = authSlice.actions;