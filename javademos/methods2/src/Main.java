public class Main {
    public static void main(String[] args) {
        String message = "Today weather is good.";
        String newMessage = city();
        System.out.println(newMessage);
        int num = total1(15,7);
        System.out.println(num);
        int total = total2(10,1243);
        System.out.println(total);

    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void upgrade() {
        System.out.println("Upgraded");
    }

    public static int total1(int num1,int num2) {
        return num1+num2;
    }

    public static int total2(int...nums) {
        int total =0;
        for (int num :nums){
            total +=num;

        }
        return total;
    }

    public static String city(){
        return "Ankara";
    }
}