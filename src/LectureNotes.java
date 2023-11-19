//public class LectureNotes {
//}
//    Full Stack Java
//
//        LECTURE - 1
//
//        Core Java / Java SE
//        Java SE stands for Java Standard Edition
//        Use to develop standalone/desktop applications
//        Java Introduction
//        Java Features
//        Download and Install Java 18 version
//        Developing a Java Appliation at command prompt
//        Download and Install Eclipse IDE
//        Developing a Java Application in Eclipse IDE
//        Java Basics
//        Keywords, variables, data types, operators, if, switch, while loop, do.. While loop, for loop etc
//        Arrays
//        Collect elements
//        Java OOP (object oriented programming)
//        Classes, objects, constructors, static keyword, packages, inheritance, polymorphism, final keyword, inner classes, access modifiers, encapsulation, abstract classes, interfaces, etc
//        Lang package
//        Object class, string class, StringBuffer Class, StringBuilder class, Math class, Wrapper classes
//        Exception handling
//        Multithreading
//        Collections
//        Lambda Expressions, Functional Interfaces, Stream API
//        IO Package
//        SQL concepts/Database concepts using MySQL database
//        JBDC
//
//        Web Technologies / UI Design / Front End Design
//        HTML
//        CSS
//        Javascript
//        TypeScript
//        XML
//        JSON
//        Angular
//
//        Advance Java / Java EE
//        Java EE stands for Java Enterprise Edition
//        Used to develop web applications
//        Servlets
//        JSP (Java Server Pages)
//        Frameworks
//        Hibernate Framework
//        Web Services
//        Spring Framework
//        Spring Core/Bean Module
//        Spring DAO Module
//        Spring JBDC Module
//        Spring ORm Module (hibernate)
//        Spring Data Module
//        Spring MVC Module => used to develop web applications
//        Spring Boot Module
//        Spring Rest Module
//        Microservices using spring boot
//        Real time tools
//        Maven
//        GitHub
//        Log4j
//        Lombok
//        Postman
//

//        LECTURE - 2
//
//        Core Java / Java SE (Standard Edition)
//        Used to develop standalone/desktpo applications
//        Web Technologies / UI Design
//        HTML
//        CSS
//        JavaScript
//        XML
//        JSON
//        TypeScript
//        Advance Java/Java EE (Enterprise Edition)
//        Used to develop web applications
//        Servlets
//        JSP (Java Server Pages)
//        Frameworks
//        Hibernate Framework
//        Web Services
//        Spring Framework
//        Spring Core/ Bean Module
//        Spring DAO Module
//        Spring JDBC
//        Spring ORM
//        Spring Data
//        Spring MVC Module => to develop web applications
//        Spring REST Module using Spring Boot
//        Microservices using Spring Boot
//        Real time tools
//        Maven
//        GitHub
//        LomBok
//        Postman
//        Program
//        A program is a collection of statements used to do a specifc task
//        Comments
//        Comments are used to document a program and ignored by the programming language
//        Single line comments //
//        Multi line comments { /* … */ }
//        Keywords
//        A keyword is a reserved word/predefined word whose meaning is know the language directly. Example int, float, if, else, char, while, do, for, class, public
//Variable
//        Is an identifier which allocates some memory space
//        Example = empNum, studentName, grossSalary, itemPrice
//        Datatypes
//        Type of data the variable holds is called as data type
//        Example int, char, float, string => collection of characters
//        Declaration of variable
//        In order to allocated memory space for variable we need to declare the variable
//        Syntax (Rules of the programming language)
//        Datatype var1, var2, ……. Varn;
//        Method/Function
//        A method is a subprogram which is used to do a specific task
//// Defining the method
//        areaOfARectangle (int length, int breadth) // length and breadth are arugments/paramters
//        {
//        Int area;
//        Area = length * breadth;
//        Return area;
//        }
//// Calling the method
//        areaRect(10, 5)
//        Void areaRect (int length, int breadth) // length and breadth are arguments/parameters
//        {
//        Int area;
//        Area = length * breadth;
//        print(area);
//        }
//        Void means no return type

//
//        LECTURE - 3
//
//        Java Introduction
//        Structure programming
//        C
//        Pascal
//        COBOL
//        Older programming language
//        Object Oriented Programming
//        Java
//        C++
//        Python
//        Object Oriented Concepts/features
//        Objects
//        Classes
//        Abstraction
//        Encapsulation
//        Inheritance
//        Polymorphism
//        Object
//        An object is a real time entity which has identity, state and behaviour.
//        A car has a identity such as registration number.
//        A car has a state such as make, model, color, price and capacity.
//        Data members, variables, properties, fields, attributes, etc
//        A car’s behaviour is drive(), applyBreak(), changeGear(), reverse(), stop()
//        Methods, functions, operations
//        Class
//        A class is a collection of data members and methods
//        Class person
//{
//    // Data Members
//    Int age
//    String name
//    Float height
//    // Methods
//    eat(){...}
//    walk(){...}
//}
//    The members (data members/methods) of the class are accessed using objects with dot(.) operator
//        Creating objects
//        Syntax
//        ClassName objName = new ClassName();
//        Ex: Person p = new Person();  //p is an object of class person
//        p.age = 20;
//        p.name = “Raj”;
//        p.height = 5.9;
//        p.walk();
//        p.eat();
//
//        Identifying Objects and Classes
//        Mr. XXX teaches Java at RRR technologies. PPP attends Java Sessions.
//        Mrs. XXX teaches Testing at the same company. QQQ attends Testing Sessions.
//        Objects (Nouns)
//        Mr. XXX
//        Java
//        RRR
//        PPP
//        Mrs. XXX
//        Testing
//        QQQ
//        Categorize Objects
//        Classes (A class is a collection of related objects)
//        Faculty (Mr.XXX and Mrs.XXX)
//        Course (Java and Testing)
//        Company (RRR)
//        Student (PPP and QQQ)
//
//
//        LECTURE 4………………………………………………………………………………………..
//
//        Java features
//
//        Simple
//        Java is simple as it contains lots of APIs / libraries
//        Ex:
//        Arrays.sort(n);
//        Objected Oriented
//        Java is object oriented (OO) as it supports all the OO feature like objects, classes, abstraction, encapsulation, inheritance and polymorphism
//        Robust
//        Robust means strong
//        In Java we can develop robust applications using Exception Handling which avoids abnormal termination of application
//        Platform Independent
//        A java program can run on any platform (OS)
//        A java program is Write Once Run Anywhere (WORA)
//        A java program is a collection of classes
//        Ex:
//        X.javaa (source code)
//class A { }
//    Class B { }
//        Class C { }
//        To compile
//        javac.X.java
//        Creates A.class, B.class and C.class
//These .class files are called as Byte Codes
//        These Byte Codes are platform independent
//        To run a Java program atleast one class should contain main() method
//        main() is the entry point to run a Java program
//        We can only run .class files which contains main()
//        To Run
//        Java A => runs the program from A class main()
//Java B => runs the program form B class main()
//Java C => Error - No main() found
//        Java X => Error - No class definition found
//        Interpreted
//        Java command is an interpreter
//        Java interpreter executes the byte code line by line
//        Javac command is a compiler
//        Java compiler converts java source code into byte code
//        Portable
//        Java is portable since the size of respective data types is same on all platforms
//        C/C++
//        Size of int data type => 2 bytes of on 32-bit/4 bytes on 64-bit OS
//        Java
//        Size of int data type => 4 bytes on 32-bit / 64-bit OS
//        Secure
//        Java is secure as Java does not support pointers as pointers violate security
//        C/C++
//        A pointer is a variable which contains address of another variable
//        Ex:
//        Int n = 10;
//        Int *p = &n; //addr of n variable
//        Multithreaded
//        A thread is a light weight process under execution within a process
//        Multithreading is used to increase the performance of application
//        Dynamic
//        Memory allocation for arrays, objects done during runtime (dynamic)
//        Java is automatic garbage collection
//        Distributed
//        Distributed applications are used for the purpose of exchanging data from one application to another application


