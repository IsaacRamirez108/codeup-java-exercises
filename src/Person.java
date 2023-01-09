public class Person {
    private String name;

    public String getName(){
        //TODO: return the person's name
        return name;
    }

    public void setName(String name){
        //TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.printf("Hello, from %s.%n", name);
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        Person Isaac = new Person("Isaac Ramirez");
//        Isaac.sayHello();
//        Isaac.setName("Israel Ramirez");
//        System.out.println(Isaac.getName());
        /////////////////////////////////////////

//        Person person1 = new Person("Isaac");
//        Person person2 = new Person("Isaac");
//        System.out.println(person1.getName().equals(person2.getName())); //True
//        System.out.println(person1 == person2); //False
//        System.out.println(person1);
//        System.out.println(person2);

        ////////////////////////////////////////
        Person person1 = new Person("Isaac");
        Person person2 = person1;
        System.out.println(person1.getName()); // Isaac
        System.out.println(person2.getName()); // Isaac
        person2.setName("John");
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John
    }
}
