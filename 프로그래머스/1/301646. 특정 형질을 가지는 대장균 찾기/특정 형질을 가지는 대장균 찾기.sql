-- 코드를 작성해주세요
SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA 
WHERE BIN(GENOTYPE) NOT LIKE '%1_'
AND (BIN(GENOTYPE) LIKE '%1__' OR BIN(GENOTYPE) LIKE '%1')
      

       
