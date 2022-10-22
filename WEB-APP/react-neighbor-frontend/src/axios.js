import axios from "axios";

const instance = axios.create({
  baseURL: 'https://2a2f-188-35-161-139.eu.ngrok.io', // Заменить на process.env.REACT_APP_API_URL при хостинге
});

instance.interceptors.request.use((config) => {
  config.headers.Authorization = window.localStorage.getItem('token') === null ? 'no' : 'Bearer_' + window.localStorage.getItem('token');
  return config;
});

export default instance;