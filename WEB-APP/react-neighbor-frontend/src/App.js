import { Routes, Route } from "react-router-dom";
import { useDispatch, useSelector } from 'react-redux';
import Container from "@mui/material/Container";

import { Header } from "./components";
import { Home, Registration, AddPost, Login, FullPost } from "./pages";
import React from "react";
import { selectIsAuth, fetchAuthMe } from "./redux/slices/auth";

const App = () => {
  // const dispatch = useDispatch();
  // const isAuth = useSelector(selectIsAuth);
  //
  // React.useEffect(() => {
  //   dispatch(fetchAuthMe(1));
  // }, []);

  return (
    <>
      <Header />
      <Container maxWidth="lg">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/api/posts/:id" element={<FullPost />} />
          <Route path="/add-post" element={<AddPost />} />
          <Route path="/login" element={<Login />} />
          <Route path="/register" element={<Registration />} />
        </Routes>
      </Container>
    </>
  );
};

export default App;
