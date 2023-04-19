1) SELECT AVG(to_number(cost, '999999.99'))
FROM bookings;

2)SELECT  origin, COUNT(*) AS "origin_count"
 FROM flights
 GROUP BY origin;

3) SELECT  destination, COUNT(*) AS "destination_count"
FROM flights
GROUP BY destination;

4) SELECT origin, COUNT(*) AS "count"
FROM flights
GROUP BY origin;

5) SELECT b.origin, AVG(to_number(a.cost,'999999.99')) FROM
Bookings a,
Flights b
WHERE a.flight_number = b.flight_number
GROUP BY b.origin;

6)SELECT COUNT(*), b.origin, AVG(to_number(a.cost,'999999.99')) FROM
Bookings a,
Flights b,
Passengers c
WHERE a.flight_number = b.flight_number AND c.passenger_id = a.passenger_id
GROUP BY b.origin
HAVING AVG(to_number(a.cost,'999999.99')) < 200;

7) SELECT SUM(to_number(cost,'9999999.99')) AS "Total Revenue",
to_char(booking_date, 'YYYY-MM') AS "Month"
FROM bookings
GROUP BY to_char(booking_date, 'YYYY-MM');

8)

9)SELECT
  	a.destination,
  	to_number(b.cost,'9999999.99999')
  FROM Flights a, Bookings b
  WHERE a.flight_number = b.booking_id
  GROUP BY a.destination, b.cost
  ORDER BY to_number(b.cost,'9999999.99999') DESC LIMIT 10;


 10)SELECT to_number(b.cost,'99999.99999') AS "COST", a.origin, a.destination
    FROM
    Flights a , Bookings b
    GROUP BY a.origin, a.destination, to_number(b.cost,'99999.99999')
    HAVING COUNT(origin) > 5
    ORDER BY to_number(b.cost,'99999.99999') DESC;