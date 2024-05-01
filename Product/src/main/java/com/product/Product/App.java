package com.product.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //class methods//
    	//ProductClassMethods pcm=new ProductClassMethods();
      // pcm.insert(101, "lipstic", 10,5000);
       //pcm.print();
    	
    	//constructor//
    	//ProductConstructor pc=new ProductConstructor(102,"moisturizer",10,2500);
    	//pc.print();
    	
    	ProductSetter ps=new ProductSetter();
    	ps.setId(101);
    	System.out.println(ps.getId());
    	ps.setName("foundation");
    	System.out.println(ps.getName());
    	ps.setQuantity(5);
    	System.out.println(ps.getQuantity());
    	ps.setPrice(7400);
    	System.out.println(ps.getPrice());
    	
    }
}
