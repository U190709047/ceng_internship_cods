public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well Done");
                break;
            case 'C':
                System.out.println("Nice");
                break;
            case 'D':
                System.out.println("It's Oky");
                break;
            case 'F':
                System.out.println("U Failed!!!");
                break;
            default:
                System.out.println("Invalid Grade Entered");

        }
    }
}