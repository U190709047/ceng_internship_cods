public class Main {

    public static void main(String[] args) {
        //references type
        customerManager customerManager = new customerManager();
        customerManager customerManager2 = new customerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        //value type
        int num1 =10;
        int num2 =20;
        num2 = num1;
        num1 =30;
        System.out.println(num2);

        //references type
        int[] nums1 = new int[]{1,2,3};//int[] nums1 = {1,2,3};
        int[] nums2 = new int[]{4,5,6};
        nums2 = nums1;
        nums1[0] = 10;
        System.out.println(nums2[0]);


    }
}

