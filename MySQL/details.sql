
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| account            |
| corona             |
| details            |
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| transaction        |
| world              |
+--------------------+
10 rows in set (0.11 sec)

mysql> use details;
Database changed

mysql> create table customer_master(customer_number int(50),customer_firstname varchar(100),customer_lastname varchar(100));
Query OK, 0 rows affected, 1 warning (0.35 sec)

mysql> insert into customer_master(customer_number,customer_firstname,customer_lastname)values(1,'Deeksha','Killari');
Query OK, 1 row affected (0.10 sec)

mysql> insert into customer_master(customer_number,customer_firstname,customer_lastname)values(2,'Vandu','Killari');
Query OK, 1 row affected (0.11 sec)

mysql> insert into customer_master(customer_number,customer_firstname,customer_lastname)values(3,'Harsha','Majji');
Query OK, 1 row affected (0.13 sec)

mysql> create table account_master(customer_number int(50),account_number int(100),account_opening_date date);
Query OK, 0 rows affected, 2 warnings (0.47 sec)

mysql> insert into account_master(customer_number,account_number,account_opening_date)values(1,123,'2009/12/20');
Query OK, 1 row affected (0.14 sec)

mysql> insert into account_master(customer_number,account_number,account_opening_date)values(2,768,'1998/11/23');
Query OK, 1 row affected (0.24 sec)

mysql> insert into account_master(customer_number,account_number,account_opening_date)values(3,456,'2007/04/21');
Query OK, 1 row affected (0.10 sec)



mysql> select*from customer_master;
+-----------------+--------------------+-------------------+
| customer_number | customer_firstname | customer_lastname |
+-----------------+--------------------+-------------------+
|               1 | Deeksha            | Killari           |
|               2 | Vandu              | Killari           |
|               3 | Harsha             | Majji             |
+-----------------+--------------------+-------------------+
3 rows in set (0.00 sec)

mysql> select*from account_master;
+-----------------+----------------+----------------------+
| customer_number | account_number | account_opening_date |
+-----------------+----------------+----------------------+
|               1 |            123 | 2009-12-20           |
|               2 |            768 | 1998-11-23           |
|               3 |            456 | 2007-04-21           |
+-----------------+----------------+----------------------+
3 rows in set (0.00 sec)
mysql> alter table account_master rename column customer_number to customer_number1;
Query OK, 0 rows affected (0.21 sec)
Records: 0  Duplicates: 0  Warnings: 0
mysql> select account_number,customer_number1,customer_firstname,customer_lastname,account_opening_date from customer_master inner join account_master on customer_number=customer_number1 order by account_number;
+----------------+------------------+--------------------+-------------------+----------------------+
| account_number | customer_number1 | customer_firstname | customer_lastname | account_opening_date |
+----------------+------------------+--------------------+-------------------+----------------------+
|            123 |                1 | Deeksha            | Killari           | 2009-12-20           |
|            456 |                3 | Harsha             | Majji             | 2007-04-21           |
|            768 |                2 | Vandu              | Killari           | 1998-11-23           |
+----------------+------------------+--------------------+-------------------+----------------------+
3 rows in set (0.00 sec)