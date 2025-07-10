import java.util.Date;

public class Person {
    //Change scope to private, allowing modification only within class or public setters
    private String name;
    //Public scope variable allowing modification outside of this file

    //Include a new Date type variable, requires importing the date type from java common utilities
    private Date createdDate;

    //Define a constructor, no modifiers, same name as the class
    //Defining a constructor overrides the base empty constructor
    Person(String name){
        this.name = name;
        this.createdDate = new Date();
        //Returns a date based on the time the function was called
    }

    //Public function allowing usage outside of this file's scope
    //Non-static method, i.e instance dependent, allowing "this" keyword
    public void sayHello(){
        System.out.println("Hello, I am " + this.name);
    }

    //Define getters and setters

    public void setName(String name){
        //This key word refers to the specific instantiation of the class calling this method
        this.name = name;
    }

    public String getName(){
        return this.name;
        //Much like the setter, refers to the specific instance of the class, takes no input, returns a string
    }

    //Create a getter for the new variable
    public Date getCreatedDate(){
        return this.createdDate;
    }
}
