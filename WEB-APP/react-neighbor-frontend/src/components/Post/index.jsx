import React from 'react';
import { Link } from "react-router-dom";
import IconButton from '@mui/material/IconButton';
import DeleteIcon from '@mui/icons-material/Clear';
import EditIcon from '@mui/icons-material/Edit';

import styles from './Post.module.scss';
import { UserInfo } from '../UserInfo';

export const Post = ({
  id,
  users_id,
  location,
  description,
  price,
  createdAt,
  children,
  isFullPost,
}) => {

  const onClickRemove = () => {};
  
  const title = "Это тестовая статья";
  const isEditable = true;

  return (
    <div className={styles.root}>
      {isEditable && (
        <div className={styles.editButtons}>
          <Link to={`/posts/${id}/edit`}>
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
            {isFullPost ? title : <Link to={`/posts/${id}`}>{title}</Link>}
          </h2>
          {children && <div className={styles.content}>{children}</div>}
        </div>
      </div>  
    </div>
  );
};