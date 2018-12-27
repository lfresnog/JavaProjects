# Java Project 

The principal idea, is create a platform were different users can buy and sell different products.

## V5

I have implemented a class using intern classes, creating a class client that buys a product and a class chasier, thats validates that the transantion happens.
I implemented in the class client a boolean call test, to use it in my thread's tests,after a lot of searching i didn't find anything of help and I have not got it.

I find this practice pretty interesting and a oportunity to fix the things about my program, but I have a problem and I lost the new GUI,the proxy menu and the tests to upgrade my mark(I have sent you a message to see if you can help me), in this week I will redo it, because I think that is a good way to review for the exam. 

PD:During my research i found this interesting website https://codurance.com/2015/12/13/testing-multithreaded-code-in-java/ where they conclude that the multithreading test is quite hard and is better use a framework.

## Code
### Classes
User:
     Name
    /Email
    /Password
    /Exist (To test if it is the last user)
    /Basket (List with the products that the user bought)
    /The different tests

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
