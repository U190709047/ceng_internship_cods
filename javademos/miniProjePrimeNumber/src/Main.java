public class Main {
    public static void main(String[] args) {
        int num = -2;
        //int remainder = num % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        if (num<1){
            System.out.println("Incorrect Number");
            return;
        } else if (num==1) {
            System.out.println(num+" "+"Isn't Prime Number");
            return;
        }

        for (int i=2;i<num;i++){
            if (num % i==0){
                isPrime = false;
            }
        }
        //if(isPrime == true) --> if(isPrime)
        if (isPrime){
            System.out.println(num+" "+"Is Prime Number");
        }else{
            System.out.println(num+" "+"Isn't Prime Number");
        }
    }
}