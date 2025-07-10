public class Main {
    public static void main(String[] args) {
        //Refactor the code to use the new constructor and getters/setters

        //Create an instance of the person class named jim
        Person jim = new Person("Jim");

        //Create and instance of the person class named callie
        Person callie = new Person("Callie");

        //Call their respective hello methods
        jim.sayHello();
        callie.sayHello();

        //Print out the created dates
        System.out.println("Jim was created at: " + jim.getCreatedDate());
        System.out.println("Callie was created at: " + callie.getCreatedDate());
    }
}