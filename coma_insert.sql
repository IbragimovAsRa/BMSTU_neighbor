insert into users(username, email, first_name, last_name, password)
values ('gertiepi', 'aslan2000asker@mail.ru', 'Aslan', 'Ibragimov', '$2a$12$joH6qgSzhEL1R54fOnatc.2QyGovdHLfHHV32FG/ezthGOgoPZkwK');



insert into roles(name)
values ('ROLE_USER'),('ROLE_ADMIN');

insert into user_roles
values (1,1),(1,2);


insert into posts
values (1, 1, 'Метро Бауманская', 10000, 'ищу соседа'),
       (2, 1, 'Метро Красносельская', 20000, 'тоже ищу соседа');