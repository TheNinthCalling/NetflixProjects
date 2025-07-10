public class Main {
    public static void main(String[] args) {
        //Create an instance of the person class
        Person jim = new Person();
        //Set the name, as the variable has public scope
        jim.name = "Jim";

        //Create another instance of the person class called callie and repeat
        Person callie = new Person();
        callie.name = "Callie";

        //Call their public functions
        jim.sayHello();
        callie.sayHello();
    }
}