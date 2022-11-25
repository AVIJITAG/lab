use class_c2268;
CREATE TABLE customer (Cust_iD varchar (6), Fname varchar (25),
Lname varchar (10),Area varchar(6),Phone varchar(11));
insert into class_c2268.customer values 
( 'A01', 'Ivan','Ross','SA',6125467),
('A02','Vandana','Ray','MU',5560379),
('A03','Pramada','Jauguste','DA',4560389),
('A04','Basu','Navindi','BA', 64649),
('A05','Ravi','Shridhar','NA',6125401),
('A06','Rukmini','Aiyer','GH',5125274);

CREATE TABLE Movie (Mv_no varchar (6),Cust_id varchar(25),
Title varchar (40),Star varchar(6),Price integer (250));

insert into class_c2268.Movie values 
(1, 'a02','Bloody','JC',181),
(2,'A04','The Firm','TC',200),
(3,'A04','Pretty','RG',151),
(4,'A06','Home Alone','MC',150),
(5,'A05','Fugitive','MF',200),
(6,'A03','Coma','MD',100),
(7,'A02','Dracula','GO',150),
(8,'A06','Change','BM',100),
(9,'A03','GoneWind','CB',200),
(10,'A05','Doctor','LP',100);

#5. Display the movie titles, whose price is greater than 100 but less than 200
select *from class_c2268.Movie where Price>100 and price<200;
 
#6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select *from class_c2268.Movie  where Star in('JC', 'TC','MC');

#7. Display the details of those customers who have an A in their area name.
select * from class_c2268.customer where Area  like '%A';
 
# 8. Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 characters.
SELECT Title  FROM class_c2268.Movie WHERE Price <=180 AND length (Title) = 6;

# 9. Display the movie name, their original prices and the prices after 10% increment. 
# Give alias name to the incremented price column.
SELECT Title,Price, Price + (Price*10)/100 AS 'Increment - price from movie' FROM  movie;

 





 
