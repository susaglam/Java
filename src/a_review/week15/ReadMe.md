#Polymorphism: 
####Taking many forms, in java the objects that are able to take different forms through references
\
Object  obj  =  new  Object()

Reference        Object
\
*The possible references of an object:
1) Itself
2) Super classes
3) Interface

####Note: 
The reference of an object must able able to access a field (ex: method), but the implementation of the field is executed on the object
Reference casting: Casting the reference to another reference of any given object

    down casting: Going from the super class reference to the sub class reference (Explicitly)
    up casting: Going from sub class reference to super class reference (Implicitly)
####Static polymorphism: (Compile time) Ex: Method overloading
####Dynamic polymorphism (Runtime) Ex: Method overriding 

## TASK

Phone Task
1. create an abstract class named Phone
- instance variables: brand, model, price, size
- abstract methods: texting(), calling() [ All have long phoneNumber argument ]
- create a constructor to initialize the fields
if the price is negative or 0 don't set the price and print: Invalid Price, cannot be negative or 0
2. create an interface named Downloadable:
- abstract method: download();
3. create an interface named AndroidApp that inherits Downloadable
- variable: AppName
4. create an interface named AppleApp that can inherit from Downloadable
- variable: AppName
5. create a class named iPhone that inherits Phone and AppleApp
- actions: texting(), calling(), faceTiming() [ All have long phoneNumber argument ]
- create a constructor to initialize the fields (brand, model, size, price)
if the price is more than 2000 don't set the price and print: Invalid Price, Iphone's price cannot more than 2000
6. create a class named Samsung that inherits Phone and AndroidApp
- actions: texting(), calling(), SamsungPay() [ All have long phoneNumber argument ]
- create a constructor to initialize the fields (brand, model, size, price)
if the price is more than 1500 don't set the price and print: Invalid Price, Samsung's price cannot more than 1500
