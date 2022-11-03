import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
Product[] products = new Product[]{
        new Product(123,"pie"),
        new Product(12,"juice"),
        new Product(5,"bread")
};
        System.out.println(Arrays.toString(products));

        //пузырь
     /*   for (int i = 0; i < products.length-1; i++) {
            for (int j = i+1; j < products.length; j++) {
                int buf=0;
                if (products[i]>products[j]){
                }
            }
        }*/

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
    }
}
