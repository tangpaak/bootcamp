public class leetV185 {
  -- LeetCode: 185
WITH TOP_UNQIUE_SALARY as (
  select  ROW_NUMBER() over (partition by t.departmentId order by t.salary desc) as row_num
  , t.*
  from (select distinct e.departmentId, e.salary
  from employee e) t
)
select D.NAME AS Department, E.NAME AS Employee, E.SALARY AS Salary
from TOP_UNQIUE_SALARY U, DEPARTMENT D, EMPLOYEE E
where row_num <= 3
AND E.DEPARTMENTID = D.ID
AND D.ID = U.DEPARTMENTID
AND U.SALARY = E.SALARY
;
}
