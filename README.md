# Menu Management System

## Introduction

This project is a simple menu management system implemented in Java. It allows you to add items to a menu, calculate the total cost of purchased items, and print a receipt. The system is designed with a focus on Object-Oriented Programming (OOP) principles.

## Classes

- `product`: This is an abstract class that represents a product in the menu. Each product has an ID, a name, a price, and a description. The ID is automatically generated when a product is created.

- `tea` and `cake`: These are subclasses of `product` that represent specific types of products. They add a `flavor` attribute to the product.

- `MenuManagerImp`: This class implements the `MenuManager1` interface and provides methods for adding items to the menu, calculating the total cost of purchased items, and printing a receipt.

## OOP Concepts

### Abstraction

The `product` class is an abstract class that represents a generic product in the menu. It provides a blueprint for creating more specific product types like `tea` and `cake`.

### Inheritance

The `tea` and `cake` classes are subclasses of `product`. They inherit all the properties and methods of the `product` class and add a `flavor` attribute, which is specific to these types of products.

### Polymorphism

The `Product` class has an abstract method `getDetails()`, which is overridden in the `Tea` class. This is an example of polymorphism, as the method behaves differently depending on whether it's called on a `Product` or `Tea` object.

### Encapsulation

The `Product` and `Tea` classes encapsulate the data (attributes like `id`, `name`, `price`, `description`, and `flavor`) and the operations that can be performed on this data (methods like `toString()` and `getDetails()`). The attributes are declared as private, which means they can only be accessed within the class they are declared. This is a key aspect of encapsulation.

In the `Tea` class, the `getDetails()` method is overridden to include the `flavor` of the tea in addition to the details provided by the `getDetails()` method in the `Product` class. This allows for more specific information to be returned for tea products. 

## Features

- Add items to the menu: You can add tea and cake items to the menu. Each item has a name, a price, a flavor, and a description.

- Calculate total cost: You can calculate the total cost of purchased items by providing their IDs.

- Print receipt: You can print a receipt that includes the date, the details of the purchased items, and the total cost.

## File I/O

The program uses file I/O to persist the menu across different runs of the program. The menu is stored in a text file, and each line in the file represents an item in the menu.

## Exception Handling

The program uses exception handling to deal with potential I/O errors. If an I/O operation fails (for example, if the file doesn't exist or can't be opened), the program will print an error message and the stack trace of the exception.

## How to Run

To run the program, simply execute the `main` method in the `MenuManagerImp` class. The program will display a menu that allows you to add items, view the menu, purchase items, and exit the program.



