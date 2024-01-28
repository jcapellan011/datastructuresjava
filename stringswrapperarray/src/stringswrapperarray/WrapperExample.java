package stringswrapperarray;
public class WrapperExample {
    public static void main(String[] args) {
        // Using primitive data types
        int num = 42;
        char letter = 'A';
        boolean flag = true;

        // Using wrapper classes
        Integer numObj = Integer.valueOf(42);
        Character letterObj = Character.valueOf('A');
        Boolean flagObj = Boolean.valueOf(true);

        // Accessing values and performing operations
        int doubledNum = numObj.intValue() * 2;
        char nextLetter = (char) (letterObj.charValue() + 1);   // By + 1 we can have access to the next Letter.
        boolean negatedFlag = !flagObj.booleanValue();

        // Printing values
        System.out.println("Using primitive data types:");
        System.out.println("num: " + num);
        System.out.println("letter: " + letter);
        System.out.println("flag: " + flag);

        System.out.println("\nUsing wrapper classes:");
        System.out.println("numObj: " + numObj);
        System.out.println("letterObj: " + letterObj);
        System.out.println("flagObj: " + flagObj);

        System.out.println("\nAfter performing operations:");
        System.out.println("doubledNum: " + doubledNum);
        System.out.println("nextLetter: " + nextLetter);
        System.out.println("negatedFlag: " + negatedFlag);
    }
}
