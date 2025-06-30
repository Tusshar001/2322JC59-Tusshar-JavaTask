mysql> create database FSD_Task;
Query OK, 1 row affected (0.01 sec)
mysql> use FSD_Task;
Database changed
mysql> create table student(
-> student_id int primary key auto_increament,
-> name varchar(20) not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near 'auto_increament,
name varchar(20) not null' at line 2
mysql> create table course(
-> course_id int primary key,
-> course_name varchar(25)not null,
-> department varchsr(25);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near 'varchsr(25)' at line 4
mysql> create table course(
-> course_id int primary key,
-> course_name varchar(25)not null,
-> department varchar(25);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near '' at line 4
mysql> create table course(
-> course_id int primary key,
-> course_name varchar(25)not null,
-> department varchar(25));
Query OK, 0 rows affected (0.15 sec)
mysql> create table students(
-> student_id int primary key auto_inreament,
-> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near 'auto_inreament,' at
line 2
mysql> create table students(
-> student_id int primary key auto_increment,
-> name varchar(25) not null,
-> date_of_birth date not null,
-> gender enum('Male','Female','others')not null,
-> email varchar(50),
-> phone_no bigint(10));
Query OK, 0 rows affected, 1 warning (0.18 sec)

mysql> insert into course values(01,'Computer Applications','BCA'),(02,'Computer
Technology','CT'),(03,'Inforamtion technology','IT');
Query OK, 3 rows affected (0.05 sec)
Records: 3 Duplicates: 0 Warnings: 0
mysql> select * from course;
+-----------+------------------------+------------+
| course_id | course_name | department |
+-----------+------------------------+------------+
| 1 | Computer Applications | BCA |
| 2 | Computer Technology | CT |
| 3 | Inforamtion technology | IT |
+-----------+------------------------+------------+
3 rows in set (0.00 sec)
mysql> insert into students values(
-> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> insert into students
values(01,'janani','2005-07-21','Female','jananisiva@gmail.com',2864849826);
Query OK, 1 row affected (0.06 sec)
mysql> select * from students;
+------------+--------+---------------+--------+--------------------+------------+
| student_id | name | date_of_birth | gender | email | phone_no |
+------------+--------+---------------+--------+--------------------+------------+
| 1 | Ram | 2006-07-11 | male | Ram@#$@gmail.com | 2864849826 |
+------------+--------+---------------+--------+--------------------+------------+
1 row in set (0.00 sec)
mysql> insert into students
values(02,'Sandy','2006-03-02','male','sandy88@gmail.com',9876543210),(03,'Anvar','2006-07-
06','male','anvar456@gmail.com',6543210987);
Query OK, 2 rows affected (0.04 sec)
Records: 2 Duplicates: 0 Warnings: 0
mysql> select * from students;
+------------+--------+---------------+--------+--------------------+------------+
| student_id | name | date_of_birth | gender | email | phone_no |
+------------+--------+---------------+--------+--------------------+------------+
| 1 | Ram | 2006-07-11 | male | ram@#$@gmail.com | 2864849826 |

| 2 | Sandy | 2006-03-02 | male | sandy88@gmail.com | 9876543210 |
| 3 | Anvar | 2006-07-06 | male | anvar456@gmail.com | 6543210987 |
+------------+--------+---------------+--------+--------------------+------------+
3 rows in set (0.00 sec)
mysql> Terminal close -- exit!
mysql> use FSD_Task;
Database changed
mysql> alter table course add coursefees decimal(8,2) not null;
Query OK, 0 rows affected (0.08 sec)
Records: 0 Duplicates: 0 Warnings: 0
mysql> update course set coursefees = 10000 where course_id = 1;
Query OK, 1 row affected (0.05 sec)
Rows matched: 1 Changed: 1 Warnings: 0
mysql> select * from course;
+-----------+------------------------+------------+------------+
| course_id | course_name | department | coursefees |
+-----------+------------------------+------------+------------+
| 1 | Computer Applications | BCA | 10000.00 |
| 2 | Computer Technology | CT | 0.00 |
| 3 | Inforamtion technology | IT | 0.00 |
+-----------+------------------------+------------+------------+
3 rows in set (0.00 sec)
mysql> update course set coursefees = 15000 where course_id = 2;
Query OK, 1 row affected (0.05 sec)
Rows matched: 1 Changed: 1 Warnings: 0
mysql> update course set coursefees = 20000 where course_id = 3;
Query OK, 1 row affected (0.05 sec)
Rows matched: 1 Changed: 1 Warnings: 0
mysql> select * from course;
+-----------+------------------------+------------+------------+
| course_id | course_name | department | coursefees |
+-----------+------------------------+------------+------------+
| 1 | Computer Applications | BCA | 10000.00 |
| 2 | Computer Technology | CT | 15000.00 |
| 3 | Inforamtion technology | IT | 20000.00 |
+-----------+------------------------+------------+------------+
3 rows in set (0.00 sec)

mysql> update course set coursefees = coursefees*1.12;
Query OK, 3 rows affected (0.05 sec)
Rows matched: 3 Changed: 3 Warnings: 0
mysql> select * from course;
+-----------+------------------------+------------+------------+
| course_id | course_name | department | coursefees |
+-----------+------------------------+------------+------------+
| 1 | Computer Applications | BCA | 11200.00 |
| 2 | Computer Technology | CT | 16800.00 |
| 3 | Inforamtion technology | IT | 22400.00 |
+-----------+------------------------+------------+------------+
3 rows in set (0.00 sec)

mysql> create database library_task;
ERROR 1007 (HY000): Can't create database 'library_task'; database exists
mysql> show databases;
+--------------------+
| Database |
+--------------------+
| employee |
| fsd_task |
| information_schema |
| library |
| library_task |
| mysql |
| performance_schema |
| resort |
| sakila |
| sys |
| task |
| world |
+--------------------+
12 rows in set (0.05 sec)
mysql> create database lib_task;
Query OK, 1 row affected (0.06 sec)
mysql> use lib_task;
Database changed
mysql> create table books(

-> bookid int primary key,
-> nameofbook varchar(20) not null,
-> author varchar(15),
-> price decimal(6,2)
-> );
Query OK, 0 rows affected (0.08 sec)
mysql> create table members(
-> memberid int primary key,
-> name varchar(20) not null,
-> email varchar(20) unique
-> );
Query OK, 0 rows affected (0.10 sec)
mysql> create table borrow(
-> bookid int,
-> memberid int,
-> borrow_date date,
-> return_date date,
-> foreign key(bookid)references books(bookid
-> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near '' at line 6
mysql> create table borrow(
-> bookid int,
-> memberid int,
-> borrow_date date,
-> return_date date,
-> foreign key(bookid)references books(bookid),
-> foreign key(memberid)references members(memberid)
-> );
Query OK, 0 rows affected (0.11 sec)
mysql> create table employee(
-> empid int primary key,
-> name varchar(15),
-> deptid int,
-> salary decimal(6,2)
-> );
Query OK, 0 rows affected (0.07 sec)
mysql> create table department(
-> deptid int primary key,

-> deptname varchar(20),
-> location varchar(30)
-> );
Query OK, 0 rows affected (0.08 sec)
mysql> insert into books values(
-> (01,'Wings of Fire','Abdul Kalam',350),
-> (02,'The Alchemist','Paulo Coelho',750),
-> (03,'Python Basics','John Doe',250)
-> );
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into books values(
-> (01,'Wings of Fire','Abdul Kalam',350)
-> );
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into books values(01,'Wings of Fire','Abdul Kalam',350);
Query OK, 1 row affected (0.05 sec)
mysql> insert into books values(02,'The Alchemist','',350);
Query OK, 1 row affected (0.05 sec)
mysql>
mysql>
mysql> select * from books;
+--------+---------------+-------------+--------+
| bookid | nameofbook | author | price |
+--------+---------------+-------------+--------+
| 1 | Wings of Fire | Abdul Kalam | 350.00 |
| 2 | The Alchemist | | 350.00 |
+--------+---------------+-------------+--------+
2 rows in set (0.00 sec)
mysql> update books set author = 'Paulo coelho' where bookid=1;
Query OK, 1 row affected (0.05 sec)
Rows matched: 1 Changed: 1 Warnings: 0
mysql> select * from books;
+--------+---------------+--------------+--------+
| bookid | nameofbook | author | price |
+--------+---------------+--------------+--------+
| 1 | Wings of Fire | Paulo coelho | 350.00 |
| 2 | The Alchemist | | 350.00 |
+--------+---------------+--------------+--------+

2 rows in set (0.00 sec)
mysql> update books set author = 'Paulo coelho' where bookid=2;
Query OK, 1 row affected (0.05 sec)
Rows matched: 1 Changed: 1 Warnings: 0
mysql> select * from books;
+--------+---------------+--------------+--------+
| bookid | nameofbook | author | price |
+--------+---------------+--------------+--------+
| 1 | Wings of Fire | Paulo coelho | 350.00 |
| 2 | The Alchemist | Paulo coelho | 350.00 |
+--------+---------------+--------------+--------+
2 rows in set (0.00 sec)
mysql> update books set author = 'A.P.J.Abdul Kalam' where bookid=;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> update books set author = 'A.P.J.Abdul Kalam' where bookid=1;
ERROR 1406 (22001): Data too long for column 'author' at row 1
mysql> update books set author = 'Abdul Kalam' where bookid=1;
Query OK, 1 row affected (0.05 sec)
Rows matched: 1 Changed: 1 Warnings: 0
mysql> select * from books;
+--------+---------------+--------------+--------+
| bookid | nameofbook | author | price |
+--------+---------------+--------------+--------+
| 1 | Wings of Fire | Abdul Kalam | 350.00 |
| 2 | The Alchemist | Paulo coelho | 350.00 |
+--------+---------------+--------------+--------+
2 rows in set (0.00 sec)
mysql> insert into books values(03,'Phython Basis','John Doe',400);
Query OK, 1 row affected (0.05 sec)
mysql> select * from books;
+--------+---------------+--------------+--------+
| bookid | nameofbook | author | price |
+--------+---------------+--------------+--------+
| 1 | Wings of Fire | Abdul Kalam | 350.00 |
| 2 | The Alchemist | Paulo coelho | 350.00 |
| 3 | Phython Basis | John Doe | 400.00 |

+--------+---------------+--------------+--------+
3 rows in set (0.00 sec)
mysql> insert into members values(01,Ram,ram@#$@gamil.com);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near '@gamil.com)' at line
1
mysql> insert into members values(01,'Ram','ram@#$@gamil.com');
Query OK, 1 row affected (0.05 sec)
mysql> insert into members values(02,'Sam','sam00@gmail.com');
Query OK, 1 row affected (0.05 sec)
mysql> insert into members values(03,'Harsh','harsh00@gamil.com');
Query OK, 1 row affected (0.05 sec)
mysql> select * from members;
+----------+--------+--------------------+
| memberid | name | email |
+----------+--------+--------------------+
| 1 | Ram | ram@#$@gamil.com |
| 2 | Sam | sam00@gmail.com |
| 3 | Harsh | harsh00@gamil.com |
+----------+--------+--------------------+
3 rows in set (0.00 sec)
mysql> insert into borrow(1,1,'2024-10-11','2024-10-18');
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near
'1,1,'2024-10-11','2024-10-18')' at line 1
mysql> insert into borrow values(1,1,'2024-10-11','2024-10-18');
Query OK, 1 row affected (0.05 sec)
mysql> insert into borrow values(2,2,'2024-10-22','2024-10-29');
Query OK, 1 row affected (0.05 sec)
mysql> insert into borrow values(3,3,'2024-11-09','2024-10-15');
Query OK, 1 row affected (0.05 sec)
mysql> insert into borrow values(4,4,'2024-10-22','NULL');
ERROR 1292 (22007): Incorrect date value: 'NULL' for column 'return_date' at row 1
mysql> insert into borrow values(4,4,'2024-10-22',NULL);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails

(`lib_task`.`borrow`, CONSTRAINT `borrow_ibfk_1` FOREIGN KEY (`bookid`) REFERENCES
`books` (`bookid`))
mysql> insert into employee values(1,'Ram',101,20000);
ERROR 1264 (22003): Out of range value for column 'salary' at row 1
mysql> insert into employee values(1,'Ram',101,2000);
Query OK, 1 row affected (0.00 sec)
mysql> insert into employee values(2,'Sam',102,3500);
Query OK, 1 row affected (0.05 sec)
mysql> insert into employee values(3,'Harsh',103,5500);
Query OK, 1 row affected (0.05 sec)
mysql> insert into employee values(4,'Deepak',104,8000);
Query OK, 1 row affected (0.05 sec)
mysql> select * from employee;
+-------+-----------+--------+---------+
| empid | name | deptid | salary |
+-------+-----------+--------+---------+
| 1 | Ram | 101 | 2000.00 |
| 2 | Sam | 102 | 3500.00 |
| 3 | Harsh | 103 | 5500.00 |
| 4 | Deepak | 104 | 8000.00 |
+-------+-----------+--------+---------+
4 rows in set (0.00 sec)
mysql> insert into department values(101,'IT','1 Floor');
Query OK, 1 row affected (0.08 sec)
mysql> insert into department values(102,'HR','2 Floor');
Query OK, 1 row affected (0.05 sec)
mysql> insert into department values(103,'Library','3 Floor');
Query OK, 1 row affected (0.05 sec)
mysql> select * from department;
+--------+----------+----------+
| deptid | deptname | location |
+--------+----------+----------+
| 101 | IT | 1 Floor |
| 102 | HR | 2 Floor |
| 103 | Library | 3 Floor |

+--------+----------+----------+
3 rows in set (0.00 sec)
mysql> exit