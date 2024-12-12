//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

    private class PrivateInnerClass {
        int x = 20;
    }

    static class StaticInnerClass {
        int x = 12;
    }

    class AccessOuterClass {
        public int myInnerMethod() {
            return x;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Inner Classes
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass myInner = outerClass.new InnerClass();

        System.out.println(myInner.y + outerClass.x);

        // Private inner class
        // OuterClas.PrivateInnerClass myPrivateInnerClass = outerClass.new PrivateInnerClass(); // error

        // Static Inner Class
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println(staticInnerClass.x + outerClass.x);

        // Access Outer Class From Inner Class
        OuterClass.AccessOuterClass myAccessOuterClass = outerClass.new AccessOuterClass();
        System.out.println(myAccessOuterClass.myInnerMethod());
    }
}