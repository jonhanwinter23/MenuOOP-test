# Employee Management System

This repository contains a simple Java implementation of an Employee Management System. The system is designed to manage employee information such as name, password, and salary. It also includes functionality for updating the base salary for all employees.

## Table of Contents

- [Overview](#overview)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

The `Employee` class is the core component of this system. It encapsulates employee details, including name, password, and salary. The system allows you to set and retrieve a base salary that will be applied to all employees.

### Employee Class

#### Fields

- `name`: The name of the employee.
- `password`: The password for employee authentication.
- `salary`: The current salary of the employee.
- `baseSalary` (static): The base salary applicable to all employees.

#### Constructors

- `Employee(String name, String password, float salary)`: Initializes an employee with the provided name, password, and salary.

#### Methods

- `getName()`: Returns the name of the employee.
- `getPassword()`: Returns the password of the employee.
- `getSalary()`: Returns the current salary of the employee.
- `getBaseSalary() (static)`: Returns the base salary applicable to all employees.
- `setBaseSalary(float baseSalary) (static)`: Sets the base salary applicable to all employees.
- `updateSalary()`: Updates the salary of the employee to the current base salary.
- `toString()`: Provides a string representation of the employee.
- `equals(Object obj)`: Checks if two employees are equal based on their name and password.
- `authenticate(String password)`: Authenticates the employee based on the provided password.

## Installation

To use this Employee Management System in your Java project, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   ```

2. Include the `Employee.java` file in your project.

## Usage

1. Create an instance of the `Employee` class for each employee:

   ```java
   Employee employee1 = new Employee("John Doe", "password123", 50000.0f);
   ```

2. Set the base salary applicable to all employees:

   ```java
   Employee.setBaseSalary(55000.0f);
   ```

3. Update the salary of each employee based on the new base salary:

   ```java
   employee1.updateSalary();
   ```

4. Access employee information:

   ```java
   System.out.println(employee1.toString());
   ```

   Output:

   ```
   Employee [name=John Doe, password=password123, salary=55000.0]
   ```

## Contributing

If you want to contribute to this project, feel free to fork the repository and submit a pull request. Your contributions are highly appreciated.

## License

This Employee Management System is open-source and available under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code for your purposes.
