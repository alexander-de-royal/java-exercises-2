package src.inheritance;

public class Programmer extends Employee {

    String progLang;
    String project;
    int bonus;

    void print(){
        System.out.println(progLang);
        System.out.println(project);
        System.out.println(bonus);
    }
}
