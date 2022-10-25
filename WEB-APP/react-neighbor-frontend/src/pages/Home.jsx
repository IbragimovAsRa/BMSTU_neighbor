import React from 'react';
import { useDispatch, useSelector } from 'react-redux';
import Grid from '@mui/material/Grid';

import { Post } from '../components/Post';
import { fetchPosts } from '../redux/slices/posts';

export const Home = () => {
  const dispatch = useDispatch();
  // const userData = useSelector((state) => state.auth.data);
  const { posts } = useSelector((state) => state.posts);

  const isPostsLoading = posts.status === 'loading';

  React.useEffect(() => {
    dispatch(fetchPosts());
  }, []);

  return (
    <>
      <Grid container spacing={4}>
        <Grid xs={8} item>
          {(isPostsLoading ? [...Array(5)] : posts.items).map((obj, index) => isPostsLoading
            ? (
              <Post key={index} isLoading={true} />
            )
            : (
              <Post
                key={index}
                id={obj.id}
                user_id={obj.user_id}
                createdAt={obj.createdAt}
                location={obj.location}
                description={obj.description}
                price={obj.price}
                // isEditable={userData?.id === obj.user_id}
                isEditable={true}
              />
            )
          )}
        </Grid>
      </Grid>
    </>
  );
};