-- Create Department table
CREATE TABLE department (
    dept_id INT PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(100) NOT NULL,
    location VARCHAR(100)
);

-- Create Employee table
CREATE TABLE employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(100) NOT NULL,
    job_title VARCHAR(50),
    salary DECIMAL(10,2),
    hire_date DATE,
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);
INSERT INTO department (dept_name, location) VALUES
('HR', 'New York'),
('Finance', 'Chicago'),
('IT', 'San Francisco'),
('Marketing', 'Boston'),
('Sales', 'Houston');
INSERT INTO employee (emp_name, job_title, salary, hire_date, dept_id) VALUES
('JAANU', 'HR Manager', 60000.00, '2020-03-01', 1),
('THARA', 'Accountant', 55000.00, '2019-07-15', 2),
('CHARU', 'Software Engineer', 75000.00, '2021-01-10', 3),
('VIMAL', 'Marketing Lead', 68000.00, '2018-11-05', 4),
('THARANI', 'Sales Executive', 50000.00, '2022-05-20', 5);