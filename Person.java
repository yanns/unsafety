import java.util.*;

class Person {
    Stack<String> surnames = new Stack<>();

    public String sayHello(String s) {
        surnames.pop();
        return "Hello " + s;
    }


    public static void main(String[] args) {
        Person p = new Person();
        p.surnames.push("ze big");
        p.surnames.push("biggo");
        System.out.println(p.surnames);

        System.out.println(p.sayHello("you"));
        System.out.println(p.surnames);
    }
}

