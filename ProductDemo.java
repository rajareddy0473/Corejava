
class Product
{
	private String productName;
	private double price;
	private String brand;
	private String type;

public void setProductName(String productName)
{
		this.productName=productName;

}
public void setPrice(double price){
		this.price=price;

}
public void setBrand(String brand){
		this.brand=brand;

}
public void setType(String type){
		this.type=type;

}
  public String getProductName()
	{
	return this.productName;
	}
public double getPrice()
	{
	return this.price;
	}
public String getBrand()
	{
	return this.brand;
	}
	
public String getType()
	{
	return this.type;
	}

}







class ProductDemo 
{
	public static void main(String[] args) 
	{

		Product p1=new Product();
		p1.setProductName("Shoes");
		p1.setPrice(1765.99);
		p1.setBrand("Adidas");
		p1.setType("Apparels");

		System.out.println("=======================================");
		System.out.println("P1 Information");
		System.out.println("=======================================");
		System.out.println("Product Name="+p1.getProductName());
		System.out.println("Product Price="+p1.getPrice());
		System.out.println("Product Brand="+p1.getBrand());
		System.out.println("Product Type="+p1.getType());

		Product p2=new Product();
		p2.setProductName("Samsung");
		p2.setPrice(1765.99);
		p2.setBrand("samsung");
		p2.setType("mobile");

		System.out.println("=======================================");
		System.out.println("p2 Information");
		System.out.println("=======================================");
		System.out.println("Product Name="+p2.getProductName());
		System.out.println("Product Price="+p2.getPrice());
		System.out.println("Product Brand="+p2.getBrand());
		System.out.println("Product Type="+p2.getType());
Product p3=new Product();
		p3.setProductName("tamata");
		p3.setPrice(17.99);
		p3.setBrand("andhra");
		p3.setType("Groceries");

		System.out.println("=======================================");
		System.out.println("P3 Information");
		System.out.println("=======================================");
		System.out.println("Product Name="+p3.getProductName());
		System.out.println("Product Price="+p3.getPrice());
		System.out.println("Product Brand="+p3.getBrand());
		System.out.println("Product Type="+p3.getType());
Product p4=new Product();
		p4.setProductName("arachute");
		p4.setPrice(65.99);
		p4.setBrand("coconut");
		p4.setType("oil");

		System.out.println("=======================================");
		System.out.println("P4 Information");
		System.out.println("=======================================");
		System.out.println("Product Name="+p4.getProductName());
		System.out.println("Product Price="+p4.getPrice());
		System.out.println("Product Brand="+p4.getBrand());
		System.out.println("Product Type="+p4.getType());


		

	}
}
