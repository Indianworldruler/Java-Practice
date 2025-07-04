package accessmodifiers;

public class AccessExample {
    public String publicVar = "Public Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default (Package-Private) Variable";
    private String privateVar = "Private Variable";

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default (Package-Private) Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    // A method inside same class can access everything
    public void showAll() {
        System.out.println("--- Inside AccessExample class ---");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
