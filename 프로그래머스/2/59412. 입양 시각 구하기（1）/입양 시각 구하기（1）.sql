-- 코드를 입력하세요
SELECT to_number(to_char(DATETIME,'HH24')) AS HOUR , COUNT(*)  AS COUNT 
FROM ANIMAL_OUTS 
WHERE to_char(DATETIME,'HH24') BETWEEN '09' AND '19'
GROUP BY to_char(DATETIME,'HH24')
ORDER BY HOUR

