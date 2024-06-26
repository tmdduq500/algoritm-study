-- 코드를 작성해주세요

SELECT COUNT(*) AS FISH_COUNT, FISH_NAME
FROM (
    SELECT fi.FISH_TYPE, fni.FISH_NAME
    FROM FISH_INFO AS fi
    INNER JOIN FISH_NAME_INFO AS fni
    ON fi.FISH_TYPE = fni.FISH_TYPE
) AS t
GROUP BY FISH_NAME
ORDER BY FISH_COUNT DESC
