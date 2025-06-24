package Ecommerce;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
	Product[] products= {
			new Product(101,"laptop","electronics"),
			new Product(102,"smart watch","electronics"),
			new Product(103,"shirt","clothing"),
	};
	Arrays.sort(products,(a,b)->a.getproductid()-b.getproductid());
	int searchid=102;
	Product foundlinear=Product.linearsearch(products, searchid);
	System.out.println("Linear Search: " + (foundlinear != null ? foundlinear : "Product not found"));
    Product foundBinary = Product.binarysearch(products, searchid);
    System.out.println("Binary Search: " + (foundBinary != null ? foundBinary : "Product not found"));
}
}
