public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 25;
        int num3 = 2;
        int x = num1;

        if(x < num2){
            x = num2;
        }
        if(x < num3){
            x = num3;
        }
        System.out.println("The biggest number is: "+ x);
    }
}