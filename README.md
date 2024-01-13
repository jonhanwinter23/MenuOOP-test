# Introduction of Menu Management System

This project is a simple menu management system implemented in Java. It allows you to add items to a menu, calculate the total cost of purchased items, and print a receipt. The system is designed with a focus on Object-Oriented Programming (OOP) principles.

## Table of Contents
1. [Authentication in Coffee Shop Management System](#authentication-in-coffee-shop-management-system)
   
   1.1. [Barista Class in Employee Management System](#barista-class-in-employee-management-system)
      - [Barista Class](#barista-class)
        - [Fields](#fields)
        - [Constructors](#constructors)
        - [Methods](#methods)
      - [Example Usage](#example-usage)
      - [Note](#note)
   
   1.2. [Employee Management System Test Application](#employee-management-system-test-application)
      - [Usage](#usage-1)
      - [Options](#options)
      - [File Structure](#file-structure)
      - [Exception Handling](#exception-handling)
      - [Note](#note-1)

2. [Menu Management System](#menu-management-system)
   - [Introduction](#introduction)
   - [Classes](#classes)
   - [OOP Concepts](#oop-concepts)
   - [Features](#features)
   - [File I/O](#file-io)
   - [Exception Handling](#exception-handling-1)
   - [How to Run](#how-to-run)

# Authentication in Coffee Shop Management System
Authentication is a crucial aspect of the Employee Management System, ensuring that only authorized individuals have access to sensitive employee information and system functionalities. In this system, authentication is implemented to verify the identity of users, allowing them to log in securely and perform actions based on their role.

## Employee Management System

This repository contains a simple Java implementation of an Employee Management System. The system is designed to manage employee information such as name, password, and salary. It also includes functionality for updating the base salary for all employees.

### Overview

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

# Menu Management System

## Classes

- `product`: This is an abstract class that represents a product in the menu. Each product has an ID, a name, a price, and a description. The ID is automatically generated when a product is created.

- `tea` and `cake`: These are subclasses of `product` that represent specific types of products. They add a `flavor` attribute to the product.

- `MenuManagerImp`: This class implements the `MenuManager1` interface and provides methods for adding items to the menu, calculating the total cost of purchased items, and printing a receipt.

<img width="728" alt="Screenshot 2023-12-25 at 2 38 37 PM" src="https://github.com/jonhanwinter23/MenuOOP-test/assets/108454013/40c1502d-381e-4c15-8474-fa49b9ca8d50">

## OOP Concepts

### Abstraction

The `product` class is an abstract class that represents a generic product in the menu. It provides a blueprint for creating more specific product types like `tea` and `cake`.

### Inheritance

The `tea` and `cake` classes are subclasses of `product`. They inherit all the properties and methods of the `product` class and add a `flavor` attribute, which is specific to these types of products.

### Polymorphism

The `Product` class has an abstract method `getDetails()`, which is overridden in the `Tea` class. This is an example of polymorphism, as the method behaves differently depending on whether it's called on a `Product` or `Tea` object. In the `Product`, `Tea`, and `Cake` classes, overloading is demonstrated in the constructors. Each class has two constructors: one that takes three parameters and another that takes two parameters. The constructor with two parameters sets a default value for the `description` in the `Product` class and for the `flavor` in the `Tea` and `Cake` classes. This is a classic example of overloading.

### Encapsulation

The `product`, `Tea`, and `Cake` classes encapsulate the data (attributes like `id`, `name`, `price`, `description`, `flavor`, and `size`) and the operations that can be performed on this data (methods like `toString()` and `getDetails()`). The attributes are declared as `private` or `protected`, which means they can only be accessed within the class they are declared or its subclasses. This is a key aspect of encapsulation.

In the `Tea` class, the `getDetails()` method is overridden to include the flavor of the tea in addition to the details provided by the `getDetails()` method in the `Product` class. This allows for more specific information to be returned for `tea` products.

In the `Cake` class, the `getDetails()` method is overridden to include the flavor and size of the `cake` in addition to the details provided by the `getDetails()` method in the `Product` class. This allows for more specific information to be returned for `cake` products.

### Lamda Expression 
In the `MenuManagerImp` class, the `searchItem` method uses a lambda expression in the context of a Java Stream to filter and collect items that contain the `itemName`.


## Features

- Add items to the menu: You can add tea and cake items to the menu. Each item has a name, a price, a flavor, and a description.

- Calculate total cost: You can calculate the total cost of purchased items by providing their IDs.

- Print receipt: You can print a receipt that includes the date, the details of the purchased items, and the total cost.

below is simple user cases diagram:

<img width="458" alt="Screenshot 2023-12-25 at 2 51 11 PM" src="https://github.com/jonhanwinter23/MenuOOP-test/assets/108454013/83208e48-ae66-4e64-a83a-553035ea9f06">

## File I/O

The program uses file I/O to persist the menu across different runs of the program. The menu is stored in a text file, and each line in the file represents an item in the menu.

## Exception Handling

The program uses exception handling to deal with potential I/O errors. If an I/O operation fails (for example, if the file doesn't exist or can't be opened), the program will print an error message and the stack trace of the exception.

## Static Method
GitHub Copilot: Static methods in this program are used to perform specific tasks that are not dependent on the state of an object. They can be called directly on the class itself without creating an instance of the class. In this program, the static methods `registerUser` and `authenticateCredentials` are used to register a user and authenticate user credentials, respectively. They are called within the `main` method to perform these tasks.
