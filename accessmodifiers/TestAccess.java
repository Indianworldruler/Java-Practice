package accessmodifiers;

public class TestAccess {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        System.out.println("--- Accessing from same package ---");

        // ✅ Accessible
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();

        // ❌ Not Accessible (private)
        // System.out.println(obj.privateVar);         // ERROR
        // obj.privateMethod();                        // ERROR

        System.out.println("Note: private members are not accessible outside the class.");
    }
}
