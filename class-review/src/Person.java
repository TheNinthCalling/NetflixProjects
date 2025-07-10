public class Person {
    //
    private String name;
    //Public scope variable allowing modification outside of this file

    //Define a constructor, no modifiers, same name as the class
    //Defining a constructor overrides the base empty constructor
    Person(String name){
        this.name = name;
    }

    //Public function allowing usage outside of this file's scope
    //Non-static method, i.e instance dependent, allowing "this" keyword
    public void sayHello(){
        System.out.println("Hello, I am " + this.name);
    }
}
