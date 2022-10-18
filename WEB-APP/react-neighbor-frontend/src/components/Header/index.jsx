import React from 'react';
import { Link } from "react-router-dom";
import Button from '@mui/material/Button';

import styles from './Header.module.scss';
import Container from '@mui/material/Container';

export const Header = () => {
  let isAuth =false;

  const onClickLogout = () => {
    // if (window.confirm('Вы действительно хотите выйти?')) {
    //   dispatch(logout());
    //   window.localStorage.removeItem('token');
    // }
    isAuth = false;
  };

  return (
    <div className={styles.root}>
      <Container maxWidth="lg">
        <div className={styles.inner}>
          <Link className={styles.logo} to="/">
            <div>NEIGHBOR UNION</div>
          </Link>
          <div className={styles.buttons}>
            {isAuth ? (
              <>
                <Link to="/add-post">
                  <Button variant="contained">Создать объявление</Button>
                </Link>
                <Button variant="contained" onClick={onClickLogout} color="error">
                  Выйти
                </Button>
              </>
            ) : (
              <>
                <Link to="/login">
                  <Button variant="outlined">Войти</Button>
                </Link>
                <Link to="/register">
                  <Button variant="contained">Создать аккаунт</Button>
                </Link>
              </>
            )
            }
          </div>
        </div>
      </Container>
    </div>
  );
};