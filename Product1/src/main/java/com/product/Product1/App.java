package com.product.Product1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* Product p=new Product(111,"lipstic",500,10);
        System.out.println("PoductId:"+p.getId());
        System.out.println("PoductName:"+p.getName());
        System.out.println("PoductPrice:"+p.getPrice());
        System.out.println("PoductQuantity:"+p.getQuantity());
        p.setId(101);
        p.setName("foundation");
        p.setPrice(1000);
        p.setQuantity(5);
        System.out.println("PoductId:"+p.getId());
        System.out.println("PoductName:"+p.getName());
        System.out.println("PoductPrice:"+p.getPrice());
        System.out.println("PoductQuantity:"+p.getQuantity());*/
    	
    	Product p1=new Product(101,"chair",1000,50);
    	System.out.println("PoductId:"+p1.getId());
        System.out.println("PoductName:"+p1.getName());
        System.out.println("PoductPrice:"+p1.getPrice());
        System.out.println("PoductQuantity:"+p1.getQuantity());
        p1.setId(123);
        p1.setName("bottle");
        p1.setPrice(100);
        p1.setQuantity(15);
        System.out.println("PoductId:"+p1.getId());
        System.out.println("PoductName:"+p1.getName());
        System.out.println("PoductPrice:"+p1.getPrice());
        System.out.println("PoductQuantity:"+p1.getQuantity());
    	
    }
}
