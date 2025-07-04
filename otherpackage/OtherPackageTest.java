// In file: OtherPackageTest.java (put this in a different package)
package otherpackage;

import accessmodifiers.AccessExample;

public class OtherPackageTest extends AccessExample {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        System.out.println("--- Access from another package ---");

        System.out.println(obj.publicVar); // ✅
        obj.publicMethod();                // ✅

        // ❌ Below are NOT accessible without inheritance:
        // System.out.println(obj.protectedVar);
        // obj.protectedMethod();
        // System.out.println(obj.defaultVar); // default (package-private)
        // obj.defaultMethod();
        // System.out.println(obj.privateVar); // private
        // obj.privateMethod();

        System.out.println("\nAccessing protected via subclass:");
        OtherPackageTest child = new OtherPackageTest();
        System.out.println(child.protectedVar);  // ✅ inherited
        child.protectedMethod();                 // ✅ inherited
    }
}
