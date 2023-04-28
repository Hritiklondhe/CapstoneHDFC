CREATE DATABASE employeemanagementdb;
USE employeemanagementdb;

CREATE TABLE employee (
  employee_id INT PRIMARY KEY,
  employee_name VARCHAR(50) NOT NULL,
  date_of_birth DATE NOT NULL
);

INSERT INTO employee (employee_id, employee_name, date_of_birth)
VALUES (3210, 'Aarav Sharma', '1991-05-12'),
       (3211, 'Aditi Singh', '1994-07-18'),
       (3212, 'Advait Patel', '1996-11-03'),
       (3213, 'Alok Gupta', '1993-09-22'),
       (3214, 'Aman Verma', '1999-02-28'),
       (3215, 'Anaya Kapoor', '1995-04-20'),
       (3216, 'Anil Kumar', '1990-12-08'),
       (3217, 'Anisha Desai', '1997-08-11'),
       (3218, 'Arnav Choudhary', '1991-03-15'),
       (3219, 'Aryan Patel', '1998-06-27'),
       (3220, 'Ayesha Khan', '1992-10-05'),
       (3221, 'Bhavya Singh', '1994-09-16'),
       (3222, 'Chetan Sharma', '1990-08-02'),
       (3223, 'Dhruv Gupta', '1997-11-24'),
       (3224, 'Divya Patel', '1996-06-11'),
       (3225, 'Garima Choudhary', '1995-03-09'),
       (3226, 'Gaurav Verma', '1999-01-02'),
       (3227, 'Isha Kapoor', '1993-12-30'),
       (3228, 'Jaya Singh', '1998-07-14'),
       (3229, 'Kabir Desai', '1991-04-08'),
       (3230, 'Kriti Sharma', '1996-02-23'),
       (3231, 'Manish Kumar', '1994-05-17'),
       (3232, 'Mira Patel', '1995-08-07'),
       (3233, 'Mohit Choudhary', '1992-09-29'),
       (3234, 'Neha Gupta', '1998-04-19'),
       (3235, 'Nidhi Verma', '1991-07-22'),
       (3236, 'Pooja Singh', '1997-03-03'),
       (3237, 'Pratik Shah', '1993-01-28');
      

