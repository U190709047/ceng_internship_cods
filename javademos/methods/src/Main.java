public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber(){
        int[] nums = new int[]{1,2,5,7,9,0};
        int find = 6;
        boolean available = false;

        for (int num:nums){
            if (num==find){
                available = true;
                break;
            }
        }
        String message = " ";
        if (available){
            message = "Number Available:"+ find;
            giveMessage(message);
        }else {
            giveMessage("Number Not Available:"+ find);
        }
    }

    public static void giveMessage(String message){
        System.out.println(message);
    }

}