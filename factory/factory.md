 ## factory
 The Factory Method is a creational design pattern in Java used to create objects without specifying the exact class of object that will be created. Instead, the object creation logic is handled by a method (often in a separate class), promoting loose coupling and extensibility.
 
 - You avoid tight coupling between the creator and the concrete products.
-  Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
- Open/Closed Principle. You can introduce new types of products into the program without      breaking existing client code.
 - The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.