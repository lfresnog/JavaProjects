# Java Project 

The principal idea, is create a platform were different users can buy and sell different products.

## Versions

### V1

I started this idea trought the implementation of arrays, but when i tried to link it with my users, started to give me a lot problems, also, the use of arrays make the code too big and complicated. So, following the tips and help of my schoolmates, I decided to make it, with the new variable that we have seen with Alfonso, arrayList. I think that works well, but in some exceptional cases, the code has leaks.

### V2

I fix all the problems, that the program had. And added new cast. Also I implement the code in different way instead of having only one list for the basket's users and the products's category, I created one list for each user or category, this makes the program bigger but faster, and in my opinion better.

### V3

I have used the design patron singleton and also all the things that I left from V2.

## Code
### Classes
User:
     Name
    /Email
    /Password
    /Exist (To test if it is the last user)
    /Basket (List with the products that the user bought)

Category:
     Name
    /Products (List of products that contains)

Product:
     Categoty (To test where to put it)
    /Name
    /Price
    /Quantity
    
### Main
The program is form by two principal menus:

-- User's menu --




![alt text](https://github.com/lfresnog/JavaProjects/blob/master/Images/corte1.PNG)

1. Log in with your user.
2. Creatiion of user.
3. Close project.


-- Product's Menu --




![alt text](https://github.com/lfresnog/JavaProjects/blob/master/Images/corte%202.PNG)

1. You can choose a product and add it to your basket.
2. Add a product to a precreated category.
3. Print basket list.
4. With the use of boolean you can change the currency's price.
5. Close project.
