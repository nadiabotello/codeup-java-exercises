public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Your updated name is: " + name);
    }

    public void sayHello() {
        System.out.printf("Hi from: " + name + "\n");
    }

    public static void main(String[] args) {

        Person nadia = new Person("Nadia");

        nadia.sayHello();
        System.out.println(nadia.getName());
        nadia.setName("Nadia B.");

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }


}
