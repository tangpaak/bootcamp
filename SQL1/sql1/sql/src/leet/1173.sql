# Write your MySQL query statement below

SELECT ROUND(
  COUNT(CASE WHEN order_date = customer_pref_delivery_date THEN 1 END) / COUNT(*)
  * 100, 2) AS immediate_percentage

FROM Delivery
;

# | delivery_id | customer_id | order_date | customer_pref_delivery_date |
# | ----------- | ----------- | ---------- | --------------------------- |
# | 1           | 1           | 2019-08-01 | 2019-08-02                  | s
# | 2           | 5           | 2019-08-02 | 2019-08-02                  | i
# | 3           | 1           | 2019-08-11 | 2019-08-11                  | i
# | 4           | 3           | 2019-08-24 | 2019-08-26                  | s
# | 5           | 4           | 2019-08-21 | 2019-08-22                  | s
# | 6           | 2           | 2019-08-11 | 2019-08-13                  | s