public class Main {

    public static void main(String[] args) {
       Product product = new Product(1,"Laptop","Monster Tulpar",15000,10,"Black");
  /*      Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Monster Tulpar");
        product.setPrice(15000);
        product.setStockAmount(10);*/


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCod());




    }
}