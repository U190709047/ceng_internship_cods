public class Main {
    public static void main(String[] args) {
        //double[] mylist = new double[4];
        double[] mylist = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = mylist[0];

        for (double num : mylist) {
            if (max < num) {
                max = num;
            }
            total = total + num;
            System.out.println(num);

        }
        System.out.println("Total :  " + total);
        System.out.println("The Biggest Number:  " + max);
    }
}