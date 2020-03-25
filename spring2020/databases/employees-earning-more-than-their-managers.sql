SELECT
  e.name AS employee
FROM
  Employee e
  LEFT JOIN (
    SELECT
      id,
      salary AS msalary,
      managerid
    FROM
      Employee
  ) m ON e.managerid = m.id
WHERE
  e.salary > m.msalary;
