import React from 'react';
import { Link } from "react-router-dom";
import { useDispatch } from 'react-redux';
import IconButton from '@mui/material/IconButton';
import DeleteIcon from '@mui/icons-material/Clear';
import EditIcon from '@mui/icons-material/Edit';

import styles from './Post.module.scss';
import { UserInfo } from '../UserInfo';
import { fetchRemovePost } from '../../redux/slices/posts';

export const Post = ({
  id,
  users_id,
  location,
  description,
  price,
  createdAt,
  children,
  isFullPost,
  isEditable,
}) => {
  const dispatch = useDispatch();


  const onClickRemove = () => {
    if (window.confirm('Вы действительно хотите удалить статью?')) {
      dispatch(fetchRemovePost(id));
    }
  };

  return (
    <div className={styles.root}>
      {isEditable && (
        <div className={styles.editButtons}>
          <Link to={`/api/posts/${id}/edit`}>
            <IconButton color="primary">
              <EditIcon />
            </IconButton>
          </Link>
          <IconButton onClick={onClickRemove} color="secondary">
            <DeleteIcon />
          </IconButton>
        </div>
      )}
      <div className={styles.wrapper}>
        <UserInfo {...users_id} additionalText={createdAt} />
        <div className={styles.indention}>
          <h2 className={styles.title}>
            {isFullPost ? description : <Link to={`/api/posts/${id}`}>{description}</Link>}
          </h2>
          <p>{price}</p>
          <p>{location}</p>
          {children && <div className={styles.content}>{children}</div>}
        </div>
      </div>  
    </div>
  );
};