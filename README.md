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
| GET | /user/{user_id:[0-9]+} | Получить информацию о пользователе |


