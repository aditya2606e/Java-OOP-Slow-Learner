# Non-Programming Questions (Easy Level) – Java OOP

**Q1. What is Object Oriented Programming (OOP)?**
A programming style where software is built from *objects* that combine data (variables) and behaviour (methods). Java is based on OOP.

**Q2. What is a class?**
A blueprint or template that defines the variables and methods of an object. Example: `class Student { }`.

**Q3. What is an object?**
A real instance of a class created with `new`. Example: `Student s = new Student();`.

**Q4. List the four pillars of OOP.**
Encapsulation, Inheritance, Polymorphism, Abstraction.

**Q5. What is encapsulation?**
Wrapping data and methods into one unit (class) and hiding data using `private`, accessed through getters/setters. It protects data from misuse.

**Q6. What is inheritance? Name its types in Java.**
A child class acquiring properties and methods of a parent class using `extends`. Types: single, multilevel, hierarchical. (Multiple inheritance through classes is not allowed; it is achieved using interfaces.)

**Q7. What is polymorphism?**
"Many forms": one name, different behaviour. *Compile-time* = method overloading; *runtime* = method overriding.

**Q8. Difference between method overloading and overriding.**
| Overloading | Overriding |
|---|---|
| Same class | Parent and child class |
| Same name, different parameters | Same name and same parameters |
| Compile-time polymorphism | Runtime polymorphism |

**Q9. What is a constructor? How is it different from a method?**
A special block with the same name as the class, called automatically when an object is created, used to initialise it. It has no return type, whereas a method has one and is called explicitly.

**Q10. What is abstraction? How do abstract class and interface differ?**
Showing only essential details and hiding the implementation. An abstract class can have both abstract and normal methods and instance variables (uses `extends`); an interface mainly declares methods that a class must implement (uses `implements`).
