import java.text.DecimalFormat;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        // Arithmetic Operators
        int myAddition = x + y;
        System.out.println(myAddition);

        int mySubtraction = y - x;
        System.out.println(mySubtraction);

        int myMultiplication = x * y;
        System.out.println(myMultiplication);

        float myDivision = (float) x / y;
        System.out.println(df.format(myDivision));

        double myModulus = (double) x % y;
        System.out.println(myModulus);

        int myIncrement = x++;
        System.out.println(myIncrement);

        int myDecrement = x--;
        System.out.println(myDecrement);

        // Assignment Operators
        int myAddAssignment = 10;
        myAddAssignment += 5;
        System.out.println(myAddAssignment);

        int mySubAssignment = 5;
        mySubAssignment -= 2;
        System.out.println(mySubAssignment);

        int myMulAssignment = 2;
        myMulAssignment *= 2;
        System.out.println(myMulAssignment);

        float myDivAssignment = 7;
        myDivAssignment /= 2;
        System.out.println(myDivAssignment);

        double myModAssignment = 3;
        myModAssignment %= 2;
        System.out.println(myModAssignment);

        int myBitwiseAndAssignment = 5;
        myBitwiseAndAssignment &= 7;
        System.out.println(myBitwiseAndAssignment);

        int myBitwiseOrAssignment = 7;
        myBitwiseOrAssignment |= 5;
        System.out.println(myBitwiseOrAssignment);

        int myBitwiseXorAssignment = 5;
        myBitwiseXorAssignment ^= 7;
        System.out.println(myBitwiseXorAssignment);

        int myRightShiftAssignment = 5;
        myRightShiftAssignment >>= 2;
        System.out.println(myRightShiftAssignment);

        int myLeftShiftAssignment = 5;
        myLeftShiftAssignment <<= 2;
        System.out.println(myLeftShiftAssignment);

        // Comparison Operators
        boolean myEqualTo = 1 == 1;
        System.out.println(myEqualTo);

        boolean myNotEqual = 1 != 2;
        System.out.println(myNotEqual);

        boolean myGreaterThan = 1 > 2;
        System.out.println(myGreaterThan);

        boolean myLessThan = 1 < 2;
        System.out.println(myLessThan);

        boolean myGreaterOrEqual = 1 >= 2;
        System.out.println(myGreaterOrEqual);

        boolean myLessOrEqual = 1 <= 2;
        System.out.println(myLessOrEqual);

        // Logical Operators
        int j = 2;

        boolean myLogicalAnd = j < 5 && j > 10;
        System.out.println(myLogicalAnd);

        boolean myLogicalOr = j < 5 || j > 10;
        System.out.println(myLogicalOr);

        boolean myLogicalXor = !(j < 5 && j > 10);
        System.out.println(myLogicalXor);
    }
}