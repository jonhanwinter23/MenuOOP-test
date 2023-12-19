# MenuOOP-test
OOC Project:
Coffee Shop Management System 

Introduction: 

By implementing object oriented programming concepts, our team decided to work on a Coffee Shop management system, aiming to develop a web application interface in which users as coffee shop owners can interact. With menu display categories available to make an order in the coffee shop user as cashier role can click on the food or drink consumer make order, the system will calculate total price and print out the predefined receipt. Owners might be able to add more drinks and food types in the menu available in the shop's own database. 

Implementation:
Use-Case diagram 
<img width="592" alt="image" src="https://github.com/jonhanwinter23/MenuOOP-test/assets/101129422/4f4820fe-7e13-4172-9838-665b7994ee22">

Class Diagram 
<img width="593" alt="image" src="https://github.com/jonhanwinter23/MenuOOP-test/assets/101129422/fe4938de-4153-462e-998a-6aaccfad575d">



Implementation 
1. Class : Beverage 
1. Class: Product
Field:
- ProductID (int): an integer representing the unique identifier for a product.
- ProductName (string): a string representing the name of the product.
- ProductCategory (string): a string representing the category to which the product belongs.
- ProductPrice (double): a decimal number representing the price of the product.
Method:
- addPro(): Adds a new product to the system.
- deletePro(): Removes a product from the system.
- editPro(): Modifies the details of a product.
- getId(): Returns the ID of the product.
- getName(): Returns the name of the product.
- getCategory(): Returns the category of the product.
- getPrice(): Returns the price of the product.


		2. Class: Sell
		Field:
- invoiceID (int): an integer representing the unique identifier for a sell transaction.
- sellerID (int): an integer representing the ID of the seller associated with the sell transaction.
- transactionDate (date): a date object representing the date of the sell transaction.
- productList: an array or list containing the products sold and their quantities.

Methods:
- getProductInfo(): retrieves and returns information about the products sold in the transaction.
- addToBill(): adds a product and its quantity to the bill system.
- calculateTotal(): counts the added products and calculates the total price of the bill.
- printBill(): retrieves the bill information, including product data, quantities, prices, and the total amount.


3. Class: Billrecord
Field:
- invoiceID (int): an integer representing the unique identifier for a bill record.
- date (date): a date object representing the date of the bill record.

Methods:
- getInvoiceId(): returns the ID of the bill record.
- setInvoiceId(): sets the ID of the bill record.
- getInvoiceDate(): returns the date of the bill record.
- setInvoiceDate(): sets the date of the bill record.
- getTransactionInfo(): retrieves and returns the information related to the transaction record in the bill.
- setTransactionInfo(): sets the transaction information in the bill record.

Main Method
The main method is the entry point of the program. It creates a Scanner object for reading user input and a MenuManagerImp object for managing the menu. It then enters a loop where it displays a menu of choices to the user and performs actions based on the user’s choice.

Here’s a brief description of each choice:

Add cake: Prompts the user to enter details about a cake (name, price, description, flavor), and adds the cake to the menu.
Add tea: Prompts the user to enter details about a tea (name, price, description, flavor), and adds the tea to the menu.
View menu: Displays the current menu to the user.
Purchase items: Prompts the user to enter the IDs of the items they want to purchase, calculates the total price, and prints a receipt.
Exit: Exits the program.
If the user enters an invalid choice, the program displays an error message and prompts the user to try again.

MenuManagerImp Class
The MenuManagerImp class is responsible for managing the menu. It provides methods for adding items to the menu, viewing the menu, and purchasing items from the menu.

Here’s a brief description of each method:

addCake: Adds a cake to the menu. It takes the cake’s name, price, flavor, and description as parameters.
addTea: Adds a tea to the menu. It takes the tea’s name, price, description, and flavor as parameters.
viewMenu: Reads the menu from a file and displays it to the user.
purchaseItems: Takes a list of item IDs as a parameter, calculates the total price of the items, and prints a receipt.
Note
This program reads and writes to a file named “menu.txt” to store the menu. Make sure this file exists in the same directory as your program, and that your program has permission to read and write to this file. If the file does not exist, the program will not be able to display or update the menu. If you encounter any issues, feel free to ask for further assistance. Remember to handle the file with care and ensure it’s saved in a secure location, especially if it contains sensitive information.








