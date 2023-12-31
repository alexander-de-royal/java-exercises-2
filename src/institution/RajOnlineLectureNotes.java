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
//        src.exercises.Student (PPP and QQQ)
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


//        LECTURE 6

        /* Reserved keyword is a reserve keyword such as
        * class, public, static, void, if, else, switch, while, do, for, break, continue, try, catch,
        * private, default etc.
        *
        * Variable
        * A variable is an identifier which allocates some memory space
        * Rules for Identifiers (variable name/method name/ class name)
        * - can contain A - Z, a - z, 0 -9, _, $
        * - cannot start with a digit (0 - 9)
        * - cannot be a keyword\
        *
        * Valid Identifiers
        * rollNum
        * emp_Name
        * itemNum123
        * $empSalary
        *
        * Invalid Identifiers
        * student name (space is not allowed)
        * 123rollNum (cannot start with a digit)
        * custNo# (# is not allowed)
        * while (cannot be a keyword)
        *
        * Data Type
        * Type of data the variable holds is called as data type
        *
        * Types
        *   - primitive data types
        *   - reference data types
        *
        * byte - 1 byte
        * short - 2 bytes
        * char - 2 bytes
        * int - 4 bytes
        * long - 8 bytes
        * float - 4 bytes
        * double - 8 bytes
        * boolean - 1 bit
        *
        * declaration of variable - in order to allocate memory space for variable we need to declare the variable
        *
        * syntax - datatype var1, var2, varn;
        *
        *
        **/

//      Lecture 7

        /*
        *Points on Data Types
        *   Default values are applicable only to the data members (declared within a class)
        *   of the class not for local variables
        *   Ex:
        *   class Sample {
        *       int m; // data member
        *       void xxx()
        *       {
        *           int n=10; //local variable
        *           SOP(n); //error - local variable n should be initialized
        *       }
        *       main()
        *       {
        *       Sample s = new Sample();
        *       SOP(s.m);//
        *   }
        *   SOP() => to display messages or the value of variables or both
        *
        * - local variables need to be initialized
        * - Memory allocation for reference data type is done during runtime using new operator
        * - Default value for reference data type if null
        *   Ex:
        *       String s; // data memeber
        *       SOP(s);null
        *
        * Type Casting
        *   Converting from one primitive data type into another primitive data type or converting from one
        *   reference data type into another reference data type is called as type casting
        *
        *   Types of casting
        *   -implicit casting
        *   -explicit casting
        *
        * Implicit Casting
        * -Converting fom lower data type into higher data type
        *   Ex:
        *       int n = 100;
        *       long x = n;
        *           SOP(x); //100
        *
        *   Ex:
        *       byte b = 35;
        *       double d = b;
        *       SOP(d); //35.0
        *
        *   Ex:
        *       char c = 'A';
        *       int n = c;
        *       SOP(n); //65 - UNICODE OF CHAR 'A'
        *
        *   NOTE
        *   - C/C++ supports ASCII Codes (256 symbols)
        *   - Java/.Net/PHP/Python supports UNICODES (65536 symbols)
        *   - ASCII codes are subset of UNICODES
        *
        * Explicit Casting
        * - Converting higher data type into lower data type
        *   Ex:
        *       long x = 100;
        *       int n = x;
        *       int n = (int)x;
        *       SOP(n);//100
        *
        *   Ex:
        *       double d = 45.5;
        *       short s = d; //error
        *       short s = short(d);
        *       SOP(c); //A
        *
        *   Ex:
        *       float f = 3.14; error - since in Java a value with decimal point is double data type
        *       float f = (float) 3.14;
        *       or
        *       float f = 3.14f;
        *       or
        *       float f = 3.14F;
        *
        * JShell tool
        *   - JShell tool is added in Java 9 version
        *   - JShell is an interactive tool to execute the Java statements
        *
        * To open JShell
        * Open command prompt
        * /exit = exit
        *
        * Operators
        *   - Arithmetic Operators => + - * / %
        *   - Relational Operators => >, =, !=
        *   - Logical Operators => &&, ||, !
        *   - Assignment Operators => =, +=, -=, /=, %=
        *   - Conditional Operators => ? (ternary operator)
        *   - Increment and Decrement Operators => ++, --
        *       Ex:
        *           int x = 5;
        *           y = ++x;
        *           SOP("y="+y); //6
        *
        *       Ex:
        *           int x = 5;
        *           y = x++;
        *           SOP("y="+y) //5
        * */


//      Lecture 8

        /*
        * Scanner class
        *  - it is predefined class added in Java 5 version
        *  - it is used to read the values into the variables from keyboard during program execution (runtime)
        *  - it is present in java.util package
        *       - import java.util.scanner
        *
        * Scanner class methods
        *   - nextInt() => used to read an int value
        *   - nextLong() => used to read a long value
        *   - nextFloat() => used to read a float value
        *   - next() => used to read a String value without spaces
        *   - nextLine() => used to read a String value with spaces
        *
        *   Ex:
        *       int n = s.nextInt();
        *       double d = s.nexDouble();
        *       String name = s.next();
        * class person
        * {
        *   int age;
        *   void eat(){..}
        * }
        *
        * Person p = new Person();
        * p.age = 20;
        * p.eat();
        *
        * Write a program (WAP) to find area of a rectangle
        * Refer program src.exercises.Rectangle.java
        *
        * Control Statements
        *  - These statements are used to control the flow of execution of program
        *  - Types
        *
        *  - if statement / if .. else statement
        *    - it is used to execute the set of statements when the condition is true
        *    - if the condition is false it will execute the set of statements present in else part
        *
        *  - switch statement
        *  - while loop
        *  - do .. while loop
        *  - for loop
        *  - break and continue
        *
        * Syntax
        *
        * Points on if statement
        *    - For if, else is optional
        *    - For else, if is mandatory
        *    - If {} are not used then it considers only on statement means for one statement using {} is optional
        *
        *   Ex:
        *       int n1 = 10;
        *       int n2 = 5;
        *       if (n1 > n2)
        *           SOP ("Big")
        *       else
        *           SOP ("Small")
        *
        * */

//      Lecture 9

        /*
        * Switch Statement
        *   - It is used to choose an option among the given set of options
        *   - It is mainly used for menu driven applications
        *
        * Syntax
        * switch (expression)
        * {
        *   case opt1: statements; break;
        *   case opt2: statements; break;
        *   case optn: statements; break;
        *   default: statements;
        * }
        *
        * Points on switch statement
        *   - If expression is not matching with anyone of the options then it will execute the statements present in default
        *   - default is optional
        *   - default can be anywhere in between the options
        *   - break is used to come out of switch
        *   - if break is not used then it will execute the statements present in other options until break
        *   - expression should be of type int(byte/short/char)
        *   - from Java 7 version, expression can be type String
        *   - Ex:
        *       String fruit = "apple";
        *       switch (fruit)
        *       {
        *          case "apple": SOP("Apple"); break;
        *          case "mango": SOP("Mango"); break;
        *       }
        *
        * WAP to accept two numbers and display the following options/menu
        *   - add
        *   - subtract
        *   - multiply
        *   - divide
        * Display the result based on the user choice
        * Ex:
        *   n1=10, n2=5, ch=1 => Result = 15
        *   n1=10, n2=5, ch=3 => Result = 50
        *   n1=10,
        *
        *  Loops
        *   - loops are used to execute the set of statements repeatedly when the condition is true
        *  Type
        *   - while loop
        *       - Syntax
        *       while (condition)
        *       {
        *           st-1;
        *           st-2;
        *           ..
        *           st-n;
        *       }
        *       ex:
        *          1,2,3,4,5,6,7,8
        *          int i = 1;
        *           while (i <= 10)
        *           {
        *           SOP(i);
        *           i++;
        *           }
        *
        *  WAP to display even numbers form 1 to 100
        *
        *   - do while loop
        *   - for loop
        *
        *  What is Java?
        *
        *   1. WAP to check whether the given char is vowel or consonant (switch)
        *   2. WAP to find sum of even numbers and sum of odd numbers from 1 to 100
        *       - int sumEven = 0; sumOdd = 0;
        *   3. WAP to find smallest of given 10 numbers
        *   4. WAP to find sum of digits of a given number
        *       n = 1234 (1+2+3+4 = 10)
        *
        * */

//      Lecture 10

        /*
        *   Do.. while loop
        *   Syntax
        *   do {
        *       st-1;
        *       st-2;
        *       ....
        *       st-n;
        *   }
        *   while (condition)
        *
        *   - In case of while loop the condition is checked before the statements where as
        *   - In case of do-- while loop the condition is checked after the statement
        *
        *   WAP to accept the current balance and display the following options/menu
        *   1) deposit
        *   2) Withdraw
        *   3) Display balance
        *   4) Exit
        *   5) The menu should display repeatedly until the user chooses Exit
        *
        *   For loop
        *   Syntax
        *   for (initialization; condition; expression)
        *   {
        *       st-1;
        *       st-2;
        *       ...;
        *       st-n;
        *   }
        *
        *   WAP to find the factorial of a given number
        *   refer to factorial.java
        *
        *   A static method can access only static members directly.
        *
        *   Break is used to come out of loop
        *   Continue is used to continue the loop
        *
        *   WAP to accept the numbers from user until the user enters zero and find the sum of these numbers
        *
        *   WAP to display the following output
        *   1 2 3 4 6 7 8 9 10
        *   => Refer to code ContinueDemo
        *
        * */

//      Session - 11

        /*
        *  -------------- Arrays -----------------
        *
        *  An array is a collection of elements of similar data type and stored in
        *  continuous memory locations
        *
        *  Declaration
        *  Syntax
        *   datatype[] arrayname;
        *   or
        *   datatype arrayname[];
        *   or
        *   datatype []arrayname;
        *
        *   []datatype arrayname; //error
        *
        *   Ex;
        *   int[] n;
        *   String names[];
        *   double []salaries;
        *
        *   int n[5]; //error - Since in java arrays are reference data type
        *
        *   Note:
        *   Memory allocation for reference data type is done during runtime using new operator
        *
        *   Memory Allocation
        *   ------------------
        *   int[] n = new int[5];
        *
        *   - Array elements are accessed using indexes and starts from 0
        *
        *   Array initialization
        *   --------------------
        *   int[] n = {10,20,30,40,50}
        *
        *   Length member
        *   -------------------
        *   It is used to give the size of the array
        *
        *   ex:
        *       SOP("Size =" + n.length) // Size = 5
        *
        *   WAP to create an int array size and display the elements of the array
        *   Refer to ArrayCreate
        *
        *   WAP to find sum of given array elements
        *   Refer program ArraySum
        *
        *   WAP to search an element in the given array
        *   Refer program ArraySearch
        * */

//      Lecture 12

        /*
        *  Java OOP
        *   - OOP stands for Object-Oriented Programming
        *
        *  Class
        *   - A class is a collection of data members and methods
        *
        *   Ex:
        *       class Employee
        *       {
        *           //Data members
        *               int empNum;
        *               String empNum;
        *               double empSalary;
        *           //Methods
        *               void setEmpDetails()
        *           {
        *               ....
        *           }
        *           void dispEmpDetails()
        *           {
        *               ....
        *           }
        *       }
        *       empNum = 111; //error
        *
        *   Object
        *   ------
        *   An instance of a class is called as object
        *
        *   creating objects
        *   ----------------
        *   Syntax
        *   ClassName  objName = new ClassName();
        *
        *   Ex:
        *   Employee e = new Employee(); //e is an object of class Employee
        *
        *   The members (data members/methods) of the class are accessed using objects
        *   with dot(.) operators
        *
        *   Ex:
        *       e.empNum = 111;
        *       e.empName = "Raj";
        *       e.setEmpDetails();
        *
        *   - When a new object is created for a class then it allocates new memory for all data members
        *       of the class and the values in data members are default values
        *
        *   - Default Values
        *       ------------
        *       byte, short, int, long => 0;
        *       float, double => 0.0
        *       char => ''
        *       boolean => false
        *       Reference Type (String) => null
        *
        *   - this reference
        *   ------------------
        *   1) this refers to the current object
        *   2) this reference is generally used to differentiate data members of a class and arguments
        *       of a method when the names are same
        *
        *   - Constructors
        *   ----------------
        *   - A constructor is a special method whose name is same as the classname
        *       used to initialize the object and does not return anything not even void
        *   Ex:
        *   class Sample {
        *       int i;
        *       int j;
        *       Sample() //constructor
        *       {
        *           i = 10;
        *           j = 20;
        *       }
        *       void Sample(){} //not a constructor
        *   }
        *   Sample s = new Sample();
        *   SOP(s.i + " " + s.j);
        *
        *   -Points on Constructors
        *   ------------------------
        *   - If a class does not contain a constructor, Java creates a default constructor
        *       (no argument's constructor)
        *
        *   - if a class contains parameterized constructor, then it is the responsibility of the
        *       programmer to create default constructor in the class
        *
        *   Ex:
        *       class Sample {
        *
        *       }
        * */

//      Session 12

        /*
        *   Static Keyword
        *   ---------------
        *   - it can be used for data members, methods and inner classes (a class within a class)
        *   - it cannot be used for top level classes (outer classes)
        *   - it cannot be used for local variables (declared within a method)
        *   Ex:
        *       class MyClass
        *       {
        *           void xx()
        *           {
        *               // static int n; //error - local variable n cannot be static
        *           }
        *       }
        *
        *   - static members are accessible directly with the class without creating objects
        *   - objects can also access static members
        *   - a static method can access only other static members directly
        *   - a static variable acts as a global variable within class means all objects of the class can access
        *       static variable memory
        * */