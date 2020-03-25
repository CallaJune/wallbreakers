SELECT
  a.firstname,
  a.lastname,
  b.city,
  b.state
FROM
  Person a
  LEFT JOIN Address b ON a.personid = b.personid;
