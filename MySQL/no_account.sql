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

mysql> select count(customer_number) Count_Customer from customer_master where customer_number not in (select customer_number1 from account_master);
+----------------+
| Count_Customer |
+----------------+
|              0 |
+----------------+
1 row in set (0.09 sec)