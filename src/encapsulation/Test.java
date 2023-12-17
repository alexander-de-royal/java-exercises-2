package src.encapsulation;

public class Test {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.setId(343);
        c.setName("Sujan");
        c.setAge(30);
        c.setPhone("890432809");
        c.setCity("KTM");

//        System.out.println(c.id);
//        System.out.println(c.name);
//        System.out.println(c.age);
//        System.out.println(c.phone);
//        System.out.println(c.city);

        //or

        System.out.println(c);
    }
}
