import React from 'react';
import styles from './UserInfo.module.scss';

export const UserInfo = ({ first_name, additionalText }) => {
  return (
    <div className={styles.root}>
      <img className={styles.avatar} src={'/noavatar.png'} alt={first_name} />
      <div className={styles.userDetails}>
        <span className={styles.userName}>{first_name}</span>
        <span className={styles.additional}>{additionalText}</span>
      </div>
    </div>
  );
};