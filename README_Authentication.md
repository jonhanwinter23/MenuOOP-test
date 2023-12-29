# Introduction to Authentication in Employee Management System
Authentication is a crucial aspect of the Employee Management System, ensuring that only authorized individuals have access to sensitive employee information and system functionalities. In this system, authentication is implemented to verify the identity of users, allowing them to log in securely and perform actions based on their role.# Employee Management System

## Table of Contents

1. [SuperClass: Employee Management System](#superclass-employee-management-system)
   - [Overview](#overview)
   - [Installation](#installation)
   - [Usage](#usage)
   - [Contributing](#contributing)
   - [License](#license)

2. [Barista Class in Employee Management System](#barista-class-in-employee-management-system)
   - [Barista Class](#barista-class)
     - [Fields](#fields)
     - [Constructors](#constructors)
     - [Methods](#methods)
   - [Example Usage](#example-usage)
   - [Note](#note)

3. [Employee Management System Test Application](#employee-management-system-test-application)
   - [Usage](#usage-1)
   - [Options](#options)
   - [File Structure](#file-structure)
   - [Exception Handling](#exception-handling)
   - [Note](#note-1)

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



# Barista Class in Employee Management System

The `Barista` class extends the functionality of the `Employee` class and represents a specific type of employee in the Employee Management System, namely a Barista. Baristas have a position, and they receive a bonus in addition to their base salary.

## Barista Class

### Fields

- `position`: The position of the employee, set to "Barista."
- `BaristaBonus`: A constant bonus amount specific to Baristas.

### Constructors

- `Barista(String name, String password, float salary)`: Initializes a Barista with the provided name, password, and salary, using the constructor of the parent `Employee` class.

### Methods

- `getSalary()`: Overrides the method in the parent class to include the Barista bonus in the total salary.
- `toString()`: Overrides the method in the parent class to provide a string representation of the Barista, including the position.
- `equals(Object obj)`: Overrides the method in the parent class to compare Baristas based on their position.

## Example Usage

```java
// Create a Barista instance
Barista barista1 = new Barista("Jane Doe", "barista123", 48000.0f);

// Set the base salary applicable to all employees
Employee.setBaseSalary(50000.0f);

// Update the salary of the Barista based on the new base salary and bonus
barista1.updateSalary();

// Access Barista information
System.out.println(barista1.toString());
```

Output:

```
Employee [name=Jane Doe, password=barista123, salary=50125.0] position = Barista
```

## Note

- The `Barista` class inherits the methods and fields from the `Employee` class and extends its functionality to accommodate the specific characteristics of a Barista.
- The `getSalary()` method in the `Barista` class calculates the total salary by adding the base salary and the Barista bonus.
- The `toString()` method includes the position of the Barista in the string representation.
- The `equals(Object obj)` method compares Baristas based on their position in addition to the comparison done in the parent class.


# Employee Management System Test Application

The `Test` class serves as a simple interactive test application for the Employee Management System. Users can register new Baristas, new Employees, or login with existing credentials. The application stores user credentials in a file named `credentials.txt` and provides basic authentication functionality.

## Usage

1. Compile and run the `Test` class.
2. Follow the on-screen prompts to register a new Barista, register a new Employee, or login with existing credentials.

## Options

1. **Register a new Barista (Option 1):**
   - Enter Barista username.
   - Enter Barista password.
   - User credentials are stored in the `credentials.txt` file.

2. **Register a new Employee (Option 2):**
   - Enter Employee username.
   - Enter Employee password.
   - User credentials are stored in the `credentials.txt` file.

3. **Login with an existing account (Option 3):**
   - Enter username.
   - Enter password.
   - The application checks the credentials against the stored data in `credentials.txt`.
   - Displays "Authentication successful!" or "Authentication failed!"

## File Structure

- **credentials.txt:**
  - Stores user credentials in the format `userType:username/password`.
  - Example:
    ```
    Barista:baristaUser/baristaPassword
    Employee:employeeUser/employeePassword
    ```

## Exception Handling

- The application includes basic exception handling for file I/O operations.
- If an error occurs during the registration process or credential authentication, an error message is displayed along with the stack trace.

## Note

- This is a simplified demonstration, and in a real-world scenario, you might want to enhance security measures, such as encrypting passwords and validating input.
- For a more robust application, consider using a database to store user credentials rather than a text file.

