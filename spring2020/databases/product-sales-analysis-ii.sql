SELECT Product.product_id,
       sum(Sales.quantity) AS total_quantity
FROM Sales
LEFT JOIN Product ON Sales.product_id = Product.product_id
GROUP BY Product.product_id;