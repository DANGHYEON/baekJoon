WITH RENTAL_TR AS (
    SELECT CH.HISTORY_ID, T.CAR_TYPE, T.DAILY_FEE, CH.END_DATE-CH.START_DATE+1 AS DIFFER,
    CASE
    WHEN CH.END_DATE-CH.START_DATE+1 >= 7 AND CH.END_DATE-CH.START_DATE+1 < 30 THEN '7일 이상'
    WHEN CH.END_DATE-CH.START_DATE+1 >= 30 AND CH.END_DATE-CH.START_DATE+1 < 90 THEN '30일 이상'
    WHEN CH.END_DATE-CH.START_DATE+1 >= 90 THEN '90일 이상'
    END AS DURATION_TYPE
    FROM (SELECT CAR_ID, DAILY_FEE, CAR_TYPE
        FROM CAR_RENTAL_COMPANY_CAR
        WHERE 1=1
          AND
          CAR_TYPE = '트럭') T
        INNER JOIN 
        CAR_RENTAL_COMPANY_RENTAL_HISTORY CH
    ON T.CAR_ID = CH.CAR_ID
    )

SELECT RT.HISTORY_ID, RT.DAILY_FEE * NVL(1-(RP.DISCOUNT_RATE/100),1) * RT.DIFFER AS FEE 

FROM RENTAL_TR RT 
    LEFT JOIN
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN RP
ON RT.DURATION_TYPE = RP.DURATION_TYPE
WHERE 1=1
    AND
    RP.CAR_TYPE='트럭'
    OR
    RP.CAR_TYPE IS NULL
ORDER BY FEE DESC, RT.HISTORY_ID DESC
;