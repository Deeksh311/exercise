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
10 rows in set (1.97 sec)

mysql> use account;
Database changed
mysql> use details;
Database changed

mysql> select *from customer_master;
+-----------------+--------------------+-------------------+---------------+
| customer_number | customer_firstname | customer_lastname | customer_city |
+-----------------+--------------------+-------------------+---------------+
|               2 | Vandu              | Killari           | Bangalore     |
|               3 | Harsha             | Majji             | Hyderabad     |
|               1 | Deeksha            | Killari           | Chennai       |
+-----------------+--------------------+-------------------+---------------+
3 rows in set (0.04 sec)

mysql> select *from account_master;
+------------------+----------------+----------------------+
| customer_number1 | account_number | account_opening_date |
+------------------+----------------+----------------------+
|                1 |            123 | 2009-12-20           |
|                2 |            768 | 1998-11-23           |
|                3 |            456 | 2007-04-21           |
+------------------+----------------+----------------------+
3 rows in set (0.03 sec)


mysql> insert into customer_master(customer_number,customer_firstname,customer_lastname,customer_city)values(7,'Deeksha','Killari','Chennai');
Query OK, 1 row affected (0.22 sec)

mysql> insert into account_master(customer_number1,account_number,account_opening_date)values(7,1234,'2008/11/23');
Query OK, 1 row affected (0.12 sec)

mysql> select customer_firstname from customer_master inner join account_master on customer_number=customer_number1 group by customer_firstname having count(account_number)>1 order by customer_firstname;
+--------------------+
| customer_firstname |
+--------------------+
| Deeksha            |
+--------------------+
1 row in set (0.08 sec)
