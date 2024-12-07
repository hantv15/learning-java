//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Arrays
        String[] cars = { "Volvo", "BMW", "Ford", "Tesla", "Honda" };
        int[] myNum = { 1, 2, 3, 4, 5};

        // Access
        System.out.println(cars[0]);

        // Change an Array Element
        cars[0] = "Ono";
        System.out.println(cars[0]);

        // Array length
        System.out.println(cars.length);

        // Arrays loop
        for (String car : cars) {
            System.out.println(car);
        }

        // Finds the lowest age
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        int lowestAge = ages[0];

        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }

        System.out.println("The lowest age in the array is: " + lowestAge);

        // Multi-Dimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        // Access
        System.out.println(myNumbers[1][2]);

        // Change element
//        myNumbers[0][2] = 12;
//        System.out.println(myNumbers[0][2]);

        // Loop
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
        System.out.println("======");
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}