 Description
--
  Веб-приложение, для поиска соседей для совместного сьема жилья,
студентами МГТУ им. Н.Э. Баумана.

Стек технологий:

 Frontend (Владислав Петров)
--
- JavaScript
- HTML/CSS
- REST API

 Backend (Ибрагимов Аслан)
--
- Spring Boot
- Spring Data JPA (Hibernate)
- Spring Securety
- Spring Web (Tomcat)
- MySQL
- REST API

### API

| Method name | Path | Description |
| ----------- | ---- | ----------- |
| POST | /users/login | Войти |
| POST | /users/logout | Выйти |
| GET | /posts | Получить все посты |
| GET | /users/{user_id:[0-9]+} | Получить информацию о пользователе |
| GET | /posts/{post_id:[0-9]+} | Получить информацию о посте |
| POST | /posts/create/ | Разместить обьявление |
| DELETE | /posts/delete/{post_id:[0-9]+} | Удалить обьявление |
| POST | /users/favourites/
 


