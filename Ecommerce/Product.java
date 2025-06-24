package Ecommerce;

public class Product {
private int productid;
private String productname;
private String category;
public Product(int productid,String productname,String category) {
	this.productid=productid;
	this.productname=productname;
	this.category=category;
}
public int getproductid() {
	return productid;
}
public String productname() {
	return productname;
}
public String category() {
	return category;
}
public String toString() {
	return productid+"-"+productname+"-"+category;
}
public static Product linearsearch(Product[] products,int targetid) {
	for(Product product:products) {
		if(product.getproductid()==targetid) {
			return product;
		}
	}
	return null;
}
public static Product binarysearch(Product[] products,int targetid) {
	int low=0;
	int high=products.length-1;
	while(low<=high) {
		int mid=(low+high)/2;
		if(products[mid].getproductid()==targetid) {
			return products[mid];
		}
		else if(products[mid].getproductid()<targetid) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
	}
	return null;
}
}
