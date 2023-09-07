public class leetV1581 {
  -- LeetCode: 1581
select v.customer_id, count(1) as count_no_trans
from visits v -- step 1
where not exists (
  select 1
  from transactions t
  where t.visit_id = v.visit_id
)
group by v.customer_id
;

}
