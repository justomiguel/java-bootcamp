create database `high-school`;

create table student(first_name varchar(30) not null,last_name varchar(30) not null,reg_num int primary key,date_birth date);
create table teacher(id int primary key,first_name varchar(30) not null,last_name varchar(30) not null,date_birth date);
create table course(id int primary key, name_course varchar(30),assigned_teacher_id int, hours_week int);
create table schedules(id int primary key,week_day numeric(1),start_time time, end_time time);


create table course_schedule(id_course int ,id_schedule int);

alter table course_schedule 
add constraint fk_course_schedule_course
foreign key (id_course) references course(id);

alter table course_schedule 
add constraint fk_course_schedule_schedule
foreign key (id_schedule) references schedules(id);

alter table course
add constraint fk_course_teacher
foreign key (assigned_teacher_id) references teacher(id);

create table student_course(id_student int,id_course int,note_1 double,note_2 double,note_3 double, final_note double);

alter table student_course
add constraint fk_student_course_course
foreign key (id_course) references course(id);

alter table student_course
add constraint fk_student_course_student
foreign key (id_student) references student(reg_num);

alter table 
student_course
add column year int;

SET FOREIGN_KEY_CHECKS = 0;

alter table
student_course
add constraint pk_student_course
primary key (id_student,id_course,year);

SET FOREIGN_KEY_CHECKS = 1;

 INSERT INTO student (first_name,last_name,reg_num,date_birth) VALUES ("Todd","Hobbs",1,"1985-11-03"),("Grant","Mcfarland",2,"2004-10-13"),("Amity","Palmer",3,"1984-06-03"),("Bertha","Cline",4,"2010-01-16"),("Harlan","Merritt",5,"2014-02-13"),("Rana","Calhoun",6,"1993-01-23"),("Addison","Garcia",7,"2012-10-22"),("Fritz","Ashley",8,"1989-03-05"),("Damian","Anderson",9,"2008-07-08"),("Brett","Harrington",10,"2008-10-18"),("Vanna","Heath",11,"2009-03-23"),("Norman","Holman",12,"1993-03-17"),("Aline","Farmer",13,"2006-06-16"),("Noble","Holden",14,"2014-04-30"),("Genevieve","Carson",15,"2007-01-30"),("Octavia","Sykes",16,"1987-11-05"),("Justine","Huber",17,"2014-07-18"),("Pearl","Shaw",18,"2006-09-12"),("Idona","Burt",19,"1986-05-23"),("Germaine","Alvarez",20,"1997-10-02");

INSERT INTO teacher(id,first_name,last_name,date_birth) VALUES(1,"Prescott","Bernard","1992-12-02"),(2,"Claire","Chase","2008-02-28"),(3,"Noah","Watkins","1985-09-13");

INSERT INTO course(id, name_course,assigned_teacher_id, hours_week) VALUES(1,"Geography",1,10),(2,"Math",2,12),(3,"Biology",2,8),(4,"History",3,12),(5,"Language",1,12);

INSERT INTO schedules (id,week_day,start_time, end_time)
VALUES (1,1, '08:00:00', '10:20:00'),
(2,1, '10:30:00', '12:00:00'),
 (3,1, '16:00:00', '18:20:00'),
 (4,1, '18:30:00', '20:00:00'),
 (5,2, '08:00:00', '10:20:00'),
 (6,2, '10:30:00', '12:00:00'),
 (7,2, '16:00:00', '18:20:00'),
 (8,2, '18:30:00', '20:00:00'),
 (9,3, '08:00:00', '10:20:00'),
 (10,3, '10:30:00', '12:00:00'),
 (11,3, '16:00:00', '18:20:00'),
 (12,3, '18:30:00', '20:00:00'),
 (13,4, '08:00:00', '10:20:00'),
 (14,4, '10:30:00', '12:00:00'),
 (15,4, '16:00:00', '18:20:00'),
 (16,4, '18:30:00', '20:00:00'),
 (17,5, '08:00:00', '10:20:00'),
 (18,5, '10:30:00', '12:00:00'),
 (19,5, '16:00:00', '18:20:00'),
 (20,5, '18:30:00', '20:00:00');

 INSERT INTO student_course (id_student,id_course,note_1,note_2,note_3,final_note) VALUES (1,1,1,1,9,4),(2,1,6,8,9,1),(3,1,5,10,8,1),(4,1,10,2,2,1),(5,1,9,9,7,5),(6,1,7,8,1,2),(7,1,10,10,3,10),(8,1,8,5,4,10),(9,1,5,3,1,8),(10,1,4,2,1,6),(11,1,5,6,4,3),(12,1,6,4,9,6),(13,1,4,6,2,5),(14,1,9,9,6,7),(15,1,2,1,9,8),(16,1,9,7,6,1),(17,1,8,9,5,10),(18,1,4,9,10,9),(19,1,4,9,7,2),(20,1,1,8,6,1),(1,2,6,10,8,2),(2,2,6,8,10,4),(3,2,4,6,9,2),(4,2,8,5,3,3),(5,2,9,1,5,7),(6,2,1,4,6,9),(7,2,4,5,7,6),(8,2,3,4,4,6),(9,2,9,2,1,9),(10,2,8,2,10,10),(11,2,8,10,5,1),(12,2,10,1,6,5),(13,2,10,7,9,10),(14,2,10,7,2,10),(15,2,10,10,5,9),(16,2,3,2,10,3),(17,2,3,6,9,9),(18,2,1,4,1,10),(19,2,4,5,8,9),(20,2,3,1,8,6),(1,3,6,4,9,9),(2,3,9,6,2,10),(3,3,10,6,9,8),(4,3,6,2,8,5),(5,3,6,7,7,3),(6,3,7,7,7,2),(7,3,1,10,2,8),(8,3,9,9,1,7),(9,3,2,6,4,9),(10,3,10,5,9,9),(11,3,9,9,5,1),(12,3,1,3,1,1),(13,3,3,9,6,10),(14,3,9,8,2,2),(15,3,5,7,4,3),(16,3,2,3,2,5),(17,3,4,10,5,4),(18,3,9,9,9,9),(19,3,3,2,6,7),(20,3,1,7,6,6),(1,4,5,5,6,3),(2,4,8,2,7,3),(3,4,5,5,7,10),(4,4,8,1,1,4),(5,4,6,1,10,2),(6,4,5,10,10,2),(7,4,3,3,10,10),(8,4,1,2,5,8),(9,4,8,3,5,2),(10,4,4,7,2,7),(11,4,1,4,5,7),(12,4,8,2,6,4),(13,4,3,3,5,10),(14,4,6,7,7,4),(15,4,9,5,4,4),(16,4,7,1,9,9),(17,4,1,7,1,9),(18,4,2,3,2,5),(19,4,6,8,2,7),(20,4,10,5,10,8),(1,5,5,6,9,3),(2,5,7,8,4,5),(3,5,8,2,3,7),(4,5,7,3,3,2),(5,5,8,7,10,7),(6,5,4,10,2,8),(7,5,4,5,9,2),(8,5,9,9,6,1),(9,5,1,4,7,1),(10,5,7,1,3,1),(11,5,9,10,9,7),(12,5,7,4,6,9),(13,5,7,3,10,8),(14,5,2,1,9,6),(15,5,7,2,4,1),(16,5,9,10,10,6),(17,5,10,3,6,5),(18,5,1,6,4,4),(19,5,4,10,8,9),(20,5,4,2,4,8);

SELECT s.last_name, s.first_name FROM student s JOIN student_course sc on s.reg_num = sc.id_student
WHERE sc.id_course = ?
ORDER BY s.last_name;



