-- 코드를 입력하세요
SELECT date_format(DATETIME, "%H") as "HOUR", count("HOUR")
from ANIMAL_OUTS 
group by HOUR 
having HOUR between 9 and 20
order by HOUR;

-- 넘흐 어려워용
-- date_format으로 datatime을 시간별로 포맷합니다.
-- 포맷한 것의 이름을 "HOUR"라고 한 뒤 숫자도 검색합니다.
-- 이후 시간별로 그룹을 지어주고 9와 20사이의 시간만 포함한다는 조건을 덧붙입니다.
