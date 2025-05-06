public class staticNonstatic {
    static {
        System.out.println("Radha Krishna");
    }
    void newMethod2(){
        System.out.println("Inside non static method");
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        staticNonstatic.newMethod();
        staticNonstatic obj = new staticNonstatic(); // creating object to invoke non static method
        obj.newMethod2(); // calling non static method
        
    }

    static void newMethod(){
        System.out.println("Inside static method");
    }
    
}
