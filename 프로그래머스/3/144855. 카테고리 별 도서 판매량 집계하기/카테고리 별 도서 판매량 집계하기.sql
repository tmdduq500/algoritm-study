-- 코드를 입력하세요

SELECT b.CATEGORY, SUM(bs.SALES)
FROM BOOK_SALES bs INNER JOIN BOOK b
ON bs.BOOK_ID = b.BOOK_ID
WHERE bs.SALES_DATE LIKE '%2022-01%'
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY

