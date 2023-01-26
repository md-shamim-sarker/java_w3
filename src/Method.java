public class Method {
    public static String yourName = "Snighda";

    public static void myMethod(String myName) {
        System.out.println("Hello World!!! " + myName);
        System.out.println(yourName);
    }

    public static void myMethod2() {
        System.out.println(yourName);
    }

    public static void main(String[] args) {
        myMethod("Shamim");
        myMethod2();
    }
}
