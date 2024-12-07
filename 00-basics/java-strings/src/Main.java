//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Strings
        String greeting = "Hello World!";
        System.out.println(greeting);

        // String length
        String txt = "ABBREVS";
        System.out.println("The length of the txt string is " + txt.length());

        // Upper case and Lower case
        String txtUpperCase = txt.toUpperCase();
        System.out.println(txtUpperCase);

        String txtLowerCase = txt.toLowerCase();
        System.out.println(txtLowerCase);

        // Finding a Character in a String
        int txtFindCharacter = txt.indexOf("E");
        System.out.println(txtFindCharacter);

        // !Java String has many methods of string

        // String Concatenation
        String firstName = "John ";
        String lastName = "Smith";

        System.out.println(firstName + lastName);

        // Concat
        System.out.println(firstName.concat(lastName));

        // Numbers and Strings
        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);

        // Special Characters
        String specialTxt = "We are the co-called \"Vikings\" from the north.";
        System.out.println(specialTxt);

        // Single quote
        System.out.println("\'");

        // Double quote
        System.out.println("\"");

        // Backslash
        System.out.println("\\");

        // New line
        System.out.println("\n");

        // Carriage Return
        System.out.println("\r");

        // Tab
        System.out.println("\b");

        // Form feed
        System.out.println("\f");
    }
}