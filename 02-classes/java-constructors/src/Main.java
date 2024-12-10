public class Main {
    int x;
    String fname;

    public Main(int y, String name) {
        x = y;
        fname = name;
    }

    public static void main(String[] args) {
        // Constructors
//        Main myObj = new Main();
//        System.out.println(myObj.x);

        // Constructor Parameters
//        Main myObjSecond  = new Main(10);
//        System.out.println(myObjSecond.x);

        // Many Parameters
        Main myObjThird = new Main(10, "Third");
        System.out.println(myObjThird.fname + " " + myObjThird.x);
    }
}