public class Main {
    public static void main(String[] args) {
        //Add Function Test
        int a = 10;
        int b = 5;
        int c = add(a, b);
        println(c);

        //Float Add Test (Overloading)
        float x = 2.5f; //Floats require f
        float y = 4.5f;
        float z = add(x, y);
        println(z);



        //Greater Value Test
        int greaterValue = greaterValue(a, b);
        println("a > b: ");
        println(greaterValue);

        //Testing Object arrays, passing an array as an argument
        println("Print both c and z: ");
        printAll(c, z);

        //An actual array
        String[] strings = {"One", "Two", "Three"};
        println("Print each string in the array");
        printAll(strings);
    }

    static int add(int x, int y){
        return x + y;
        //Returns the sum of two integer props
    }

    static float add(float x, float y){
        return x + y;
    }

    static int greaterValue(int x, int y){
        if(x > y){
            return x;
        }
        else{
            return y;
        }
    }

    static void println(Object o ){
        System.out.println(String.valueOf(o));
    }

    //Can take both an actual array, and a list of variables refactored into an array
    static void printAll(Object... out){
        //Uses enhanced for loop
        for(Object o: out){
            println(o);
        }
    }
}