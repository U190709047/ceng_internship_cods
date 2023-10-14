public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,7,9,0};
        int find = 6;
        boolean available = false;

        for (int num:nums){
            if (num==find){
                available = true;
                break;
            }
        }
        if (available){
            System.out.println("Number Available");
        }else {
            System.out.println("Number Not Available");
        }


    }
}