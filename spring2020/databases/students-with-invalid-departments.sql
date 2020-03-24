SELECT a.id,
       a.name
FROM Students a
LEFT JOIN Departments b ON a.department_id = b.id
WHERE b.id IS NULL;