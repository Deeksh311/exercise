CREATE TABLE loan_details (
loan_account_number integer,
loan_taken_date date,
customer_number integer,
PRIMARY KEY (loan_account_number),
FOREIGN KEY (customer_number) REFERENCES customer_master(customer_number)
);

insert into loan_details values (12345,'2019-11-25',22378);
insert into loan_details values (27854,'2019-08-17',24589);


select * from loan_details;

		     	loan_account_number	loan_taken_date	customer_number
		     	12345			2019-11-25	22378
		     	27854			2019-08-17	24589
			

SELECT count(ld.customer_number) as Count
FROM customer_master cm INNER JOIN loan_details ld
ON  cm.customer_number=ld.customer_number
WHERE cm.customer_number NOT IN ( SELECT customer_number FROM account_master); 

		  	 Count
		  	 2