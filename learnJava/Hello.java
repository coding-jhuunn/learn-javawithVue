public class Hello{
    // to creat a method or function

    static int myMethod(){
        System.out.println("Executed methiod");
        // you need indicate the type of return value to avoid error
        return 5;
    }
    public static void main(String[] args){
        System.out.println("hello wolrd");
        // java is a case-sensetive
        // name of the java file must match the class name
        // final keyword like const in js

        System.out.println(myMethod());

        
        // you cant use the x value before the initializing method scope error
        int x = 1000;
    
        System.out.println(x);
    }
}
