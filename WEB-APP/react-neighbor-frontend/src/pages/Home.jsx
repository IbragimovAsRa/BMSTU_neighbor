import React from 'react';
import Grid from '@mui/material/Grid';

import { Post } from '../components/Post';

export const Home = () => {

  return (
    <>
      <Grid container spacing={4}>
        <Grid xs={8} item>
          <Post
            // id={obj._id}
            // user_id={obj.user_id}
            // createdAt={obj.createdAt}
            // location={obj.location}
            // description={obj.description}
            // price={obj.price}
            id={1}
            user_id={1}
            createdAt={"2022-10-17 21:46:52"}
            location={"Метро Бауманская"}
            description={"ищу соседа"}
            price={10000}
          />
        </Grid>
      </Grid>
    </>
  );
};