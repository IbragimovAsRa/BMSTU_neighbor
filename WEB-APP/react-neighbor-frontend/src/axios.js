import axios from "axios";

const instance = axios.create({
  baseURL: 'http://localhost:8075', // Заменить на process.env.REACT_APP_API_URL при хостинге
});

instance.interceptors.request.use((config) => {
  config.headers.Authorization = window.localStorage.getItem('token') === null ? 'no' : 'Bearer_' + window.localStorage.getItem('token');
  return config;
});

export default instance;