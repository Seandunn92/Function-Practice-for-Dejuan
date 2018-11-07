public class Main {

    //base function that prints HelloWorld (Creating)
    public static void print(){
        System.out.println("Hello World");
    }

    //function 2  edits the base function to take in an int! Then it uses it!
    public static void print(int n){
        System.out.println("Hello " + n);
    }

    //function 3 edits the base function to take a String! Then it uses it
    public static void print(String s){
        System.out.println("Hello " + s);
    }

    public static void main(String[] args) {

        //CALLING OUR baseFunction, prints "HelloWorld"
        print();

        //Calling function 2!  int n  is being defined as 3 here.  prints "Hello 3"
        print(3);

        //Calling function 2!  int n  is being defined as 102 here. prints "Hello 102"
        print(102);

        //Calling function 3! String s is being defined as Dejuan here. prints "Hello Dejuan"
        print("Dejuan");
        //Calling function 3! String s is being defined as Sean here. prints "Hello Sean"
        print("Sean");
        //



    }
}
