# Factory Method Design Pattern

The Factory Method design pattern is a creational pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern is useful when a class cannot anticipate the type of objects it needs to create, or when a class wants its subclasses to decide which objects to create.

<p align="center">
    <img src="./image/factory-image.png" height=300 weight=300 alt="Factory Method Design Pattern"></img>
</p>

## ☹️ Problem

One common real-life problem is the creation of different types of vehicles in a transportation system. Each vehicle has its own unique characteristics and behaviors. For example, a transportation system may need to create instances of cars, buses, and trucks, each with their own specific features. However, the exact type of vehicle needed may vary depending on the requirements of the system.

## 😀 Solution

The Factory Method design pattern provides a solution to this problem by defining an interface for creating objects, but allowing subclasses to decide which class to instantiate. In the case of the transportation system, we can define a `Vehicle` interface and create concrete vehicle classes that implement this interface. Each concrete vehicle class can have its own factory method that creates instances of the respective vehicle type. This way, the transportation system can create vehicles without specifying their exact classes, allowing for flexibility and extensibility.

## 📚 [Example](./code/src/)

Consider a simple example of a `Shape` interface that defines a `draw` method, and concrete classes `Square` and `Rectangle` that implement this interface. We can create a `ShapeFactory` class with a factory method that creates instances of `Square` or `Rectangle` based on the input provided. This way, the client can create shapes without knowing their exact classes.

<p align="center">
    <img src="./image/uml_diagram.jpg" height=300 weight=300 alt="uml diagram"></img>
</p>

## 💡 Applicability

The Factory Method design pattern is applicable in the following scenarios:

- When a class cannot anticipate the type of objects it needs to create.
- When a class wants its subclasses to decide which objects to create.
- When a class wants to delegate the responsibility of object creation to its subclasses.

## 📝 How to Implement

To implement the Factory Method design pattern, follow these steps:

1. Define an interface or abstract class that declares the factory method for creating objects.
2. Create concrete classes that implement the interface or extend the abstract class.
3. Define factory methods in the concrete classes to create instances of specific types of objects.
4. Use the factory methods to create objects without specifying their exact classes.
5. Clients can use the factory methods to create objects based on their requirements.

## ⚖️ Pros and Cons

### Pros

- Provides a flexible way to create objects without specifying their exact classes.
- Allows for easy extensibility by adding new product classes and corresponding creator classes.
- Promotes loose coupling between the creator and product classes.

### Cons

- Can result in a large number of creator classes if there are many different product types.
- May introduce complexity if the factory method logic becomes too complex.
- Requires careful design to ensure that the creator and product classes are properly structured and cohesive.
