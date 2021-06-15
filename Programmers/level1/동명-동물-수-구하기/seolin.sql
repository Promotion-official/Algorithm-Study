-- 코드를 입력하세요
SELECT NAME, count(name) as COUNT from ANIMAL_INS group by NAME having count(name)>1 order by name;

-- having 은 group by 에서의 조건문같은 존재.