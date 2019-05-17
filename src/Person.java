public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println(name);
    }


    public void main(String[] args) {

        Person nadia = new Person("nadia");

        sayHello("nadia");

    }


}
