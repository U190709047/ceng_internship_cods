public class ProductValidator {
    static {
        System.out.println("Static Maker Block Worked");
    }
    public ProductValidator(){
        System.out.println("Maker Block Worked");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void nothing(){

    }


}

