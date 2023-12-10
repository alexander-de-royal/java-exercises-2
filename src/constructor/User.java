package src.constructor;

public class User {
    String userName;
    String password;

    //--------------------- Default Constructor -------------------
    User(){
        userName = "root";
        password = "2222";
    }

    //-------------------- Parameterized Constructor -------------------
    User(String userName, String password){

        //this(); // calling default constructor
        //this("sad");//calling parameterized constructor

        this.userName = userName;
        this.password = password;

        /*
        *  -> 'this' keyword represents current object
        *  -> we can call
        *       * instance variables
        *       * instance methods
        *       * constructor
        *     using 'this' keyword
        * */
    }

    void printUser(){
        System.out.println("UserName = " + userName);
        System.out.println("Password = " + password);
    }

    public static void main(String[] args) {

        User u = new User("hari", "7887");
        //u.password = "sffdf";

        u.printUser();

        /*
        *  Class {@code object} is the root of the class hierarchy.
        *  Every class has {@code Object} as a superclass.
        *  All objects, including arrays, implement the methods of this class.
        * */

    }
}
