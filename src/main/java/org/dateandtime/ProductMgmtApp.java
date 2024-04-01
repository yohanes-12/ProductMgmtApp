package org.dateandtime;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductMgmtApp {
    public static void main(String[] args) {

        Product[] arryaProduct  = {
          new Product(312887119 , "Banana", "2023-01-24 ",124, 0.55),
          new Product(292748265, "Apple", "2022-12-09", 18, 1.09),
          new Product(918927460, "Carrot", "2023-03-31", 89, 2.99) };

        printProducts(arryaProduct);

    }

    public static void printProducts(Product[] products){
        System.out.println("Printed in JSON Format : ");
        System.out.println("[");
        Arrays.stream(products)
                .map(product -> "{ \"productId\": " + product.getProductId() +
                        ", \"productName\": \"" + product.getName() +
                        ", \"Date Supplied\": \"" + product.getDateSupplied()+
                        ", \"Quantity In Stock\": \"" + product.getQualityInStock() +
                        "\", \"Unit price\": " + product.getUnitPrice() + " }")
                .forEach(System.out::println);
        System.out.println("]");

        System.out.println("--------------------------------");
        System.out.println();
        System.out.println();

        System.out.println("Printed in XML Format : ");
        System.out.println("<products>");
        Arrays.stream(products)
                .map(product -> "\t<Product>\n" +
                        "\t\t<productId>" + product.getProductId() + "</productId>\n" +
                        "\t\t<productName>" + product.getName() + "</productName>\n" +
                        "\t\t<DateSupplied>" + product.getDateSupplied() + "</DateSupplied>\n" +
                        "\t\t<QuantityInStock>" + product.getQualityInStock() + "</QuantityInStock>\n" +
                        "\t\t<unitPrice>" + product.getUnitPrice() + "</unitPrice>\n" +
                        "\t</Product>")
                .forEach(System.out::println);
        System.out.println("</products>");
        System.out.println();
        System.out.println();

        System.out.println("--------------------------------");

        System.out.println("Printed in comma separated value (CSV) Format : ");
        System.out.println("[");
        Arrays.stream(products)
                .map(product -> product.getProductId() + "," + product.getName() + "," + product.getDateSupplied() + ", " + product.getQualityInStock() + ", " + product.getUnitPrice())
                .forEach(System.out::println);

        System.out.println("]");



    }
}
