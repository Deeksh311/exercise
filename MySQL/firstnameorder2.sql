SELECT firstname FROM customer_master INNER JOIN account_master
ON customer_master.customer_number = account_master.customer_number GROUP BY firstname
having count(firstname)>=2 order by firstname; 


	           	firstname
	           	Deeksha
	           	Vandu

