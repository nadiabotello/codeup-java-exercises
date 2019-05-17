public class Person {

    private String name;

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

        Person nadia = new Person();
        nadia.name = "Nadia";

        nadia.sayHello();
        System.out.println(nadia.getName());
        nadia.setName("Nadia B.");
    }


}
