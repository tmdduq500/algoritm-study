-- 코드를 입력하세요
SELECT INGREDiENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF fh
INNER JOIN ICECREAM_INFO ii
ON fh.FLAVOR = ii.FLAVOR
GROUP BY INGREDiENT_TYPE
ORDER BY TOTAL_ORDER ASC