# ProductsSwing

A program that simulates an inventory management system for a grocery company. The system will allow the seller to register the goods that the company sells. The seller can also register a sale for the buyer, which allows the buyer to buy the items that the company is selling. Finally, the system will track the number of available products and allow the seller to complete the sale for the customer. Keep in mind that the company using this system acts as a wholesaler, so there is a minimum order quantity for all items listed.

Stack: Java, Swing

The program is designed using the following class diagram specification:

![image](https://user-images.githubusercontent.com/79397536/121012380-533af680-c7a0-11eb-9dcc-6eda0fb45bf5.png)

# Main Menu

![1](https://user-images.githubusercontent.com/79397536/121011437-47026980-c79f-11eb-8469-6059b0e52068.PNG)

# Registered Product

Allows the user to register a new product for sale. Allows the user to load a list of products from a file (.txt, .csv). Each new registered product must meet the following criteria:
The product's name:
1) Must be between 3 and 25 characters.
2) Cannot be repeated for two or more products.
3) Must be case insensitive, i.e. lowercase and uppercase letters must be treated the same.

Product description:
1) Must contain from 1 to 50 characters.
Product price:
1) Must be a double value> 0.

Quantity in stock:
1) Must be an integer from 0 to 10.
2) Should be generated randomly by the system when creating a product.

Minimum:
1) Must be an integer from 1 to 5.
2) Should be generated randomly by the system when creating a product.
 

The system allows you to register a maximum of FIVE products.

![2](https://user-images.githubusercontent.com/79397536/121011426-4538a600-c79f-11eb-97c4-9aa36fcb7fd0.PNG)


# Add a Product to the Cart

Allows the user to purchase a new registered product. Each item purchased must meet the following criteria:
1) When an item is selected, the quantity of items in stock must be greater than the minimum order quantity. Otherwise, the user should be shown an error.

2) The user can purchase a maximum of THREE items.

3) When purchasing a product, the total value of the sale transaction should be updated. However, the quantity on stock should NOT be changed until you select option "Check Out". Each purchase order must meet a minimum order quantity.

![3](https://user-images.githubusercontent.com/79397536/121011428-45d13c80-c79f-11eb-99c7-674e784da738.PNG)


# Remove a Product to the Cart

Allows the user to uninstall the product.
If you uninstall a product, you must update the total order value. However, the quantity on stock should NOT be changed until you select option 5. Each deleted order must update the total order value based on the minimum quantity available for sale.

![4](https://user-images.githubusercontent.com/79397536/121011430-4669d300-c79f-11eb-9079-4d1a1a7481e5.PNG)

# View all Available Product

Allows the user to view all currently registered products.
Allows the user to save a list of registered products.

![5](https://user-images.githubusercontent.com/79397536/121011431-4669d300-c79f-11eb-92ed-a6df68d05da7.PNG)

# Check Out

Allows the user to complete the sale of an item and place an order from the system.
If no products have been purchased, an error message should be shown to the user.
For each item purchased, the system will:
1) Check the products that are stored in the SaleTransaction class using objects of the Product class. If a match is found, the quantity on stock will be reduced by the minimum order quantity for the purchase.
2) If the same item is ordered multiple times and if the quantity in stock falls below the minimum order quantity, the sale of that particular item is canceled and does not end, and an error message is displayed to the user. The rest of the sales will be completed.

![6](https://user-images.githubusercontent.com/79397536/121011433-4669d300-c79f-11eb-8a07-bcd6e696a6e3.PNG)


# Get Help

Shows the user the basic functions of the application.

![7](https://user-images.githubusercontent.com/79397536/121011434-47026980-c79f-11eb-93c9-ff96c64b10c8.PNG)



