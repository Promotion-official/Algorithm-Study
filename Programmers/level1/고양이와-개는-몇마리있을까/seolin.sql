-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(ANIMAL_TYPE) from ANIMAL_INS group by ANIMAL_TYPE order by ANIMAL_TYPE;
-- group by는 고양이별, 개별 분리를 하기 위함,
-- order by는 고양이부터 조회하기 위함