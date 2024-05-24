-- 코드를 작성해주세요

SELECT fi.ID, fni.FISH_NAME, fi.LENGTH
FROM FISH_INFO fi
INNER JOIN FISH_NAME_INFO fni
ON fi.FISH_TYPE = fni.FISH_TYPE
WHERE (fi.FISH_TYPE, fi.LENGTH) IN
    (SELECT FISH_TYPE, MAX(LENGTH) AS LENGTH
    FROM FISH_INFO
    GROUP BY FISH_TYPE)