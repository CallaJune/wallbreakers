SELECT
  DISTINCT Employee.employee_id,
  Team.team_size
FROM
  Employee
  LEFT JOIN (
    SELECT
      team_id,
      count(employee_id) AS team_size
    FROM
      Employee
    GROUP BY
      team_id
  ) AS Team ON Team.team_id = Employee.team_id;
