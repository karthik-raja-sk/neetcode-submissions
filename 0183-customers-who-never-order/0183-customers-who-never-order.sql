# Write your MySQL query statement below
select c.name as Customers
from Customers C
left join  Orders O on C.id=O.customerId
where O.customerId  is null;