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

mysql> alter table customer_master add customer_city varchar(100);
Query OK, 0 rows affected (0.33 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> update customer_master set customer_city='Chennai' where customer_number=1;
Query OK, 1 row affected (0.13 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update customer_master set customer_city='Bangalore' where customer_number=2;
Query OK, 1 row affected (0.19 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update customer_master set customer_city='Hyderabad' where customer_number=3;
Query OK, 1 row affected (0.10 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select count(customer_number) Cust_Count from customer_master where customer_city='Chennai';
+------------+
| Cust_Count |
+------------+
|          1 |
+------------+
1 row in set (0.07 sec)