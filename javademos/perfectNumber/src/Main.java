public class Main {
    public static void main(String[] args) {
        int num = 6;
        int total = 0;

        for (int i=1;i<num;i++){
            if(num % i == 0){
                total += i;
            }
        }
        if (total == num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Isn't Prefect Number");
        }
    }
}