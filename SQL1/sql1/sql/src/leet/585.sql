-- LeetCode: 585
-- Exists, Not Exists
select round(sum(tiv_2016), 2) as tiv_2016
from insurance i1
where exists (select 1
              from insurance i2
              where i1.pid <> i2.pid
              and i1.tiv_2015 = i2.tiv_2015
              and (i1.lat <> i2.lat or i1.lon <> i2.lon)
              )
and not exists (select 1
                from insurance i3
                where i1.pid <> i3.pid
                and i1.lat = i3.lat
                and i1.lon = i3.lon
                )
;




# | pid | tiv_2015 | tiv_2016 | lat | lon |
# | --- | -------- | -------- | --- | --- |
# | 1   | 10       | 5        | 10  | 10  |
# | 2   | 20       | 20       | 20  | 20  |
# | 3   | 10       | 30       | 20  | 20  |
# | 4   | 10       | 40       | 40  | 40  |