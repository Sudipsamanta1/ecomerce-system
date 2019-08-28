import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
 class product_details
	{
        	String product_name;
		int product_price;
		int product_count;

	    product_details(String name,int price,int count)
		{
		  product_name=name;
		  product_price=price;
		  product_count=count;
		}	
	  }
public class Ecomerce_Implement
	{
  public static void main(String[]args)
           {
            ArrayList<product_details>catalog=new ArrayList<>();
           ArrayList<product_details>cart=new ArrayList<>();
	   catalog_prepare(catalog);
	   catalog_display(catalog,cart);
	   }
   public static void catalog_prepare(ArrayList<product_details> catalog)
	{  
	//add product by indexing to the catalog::::
	   catalog.add(0, new product_details("Shirt",500,0));
     	   catalog.add(1, new product_details("jeans",1200,0));
           catalog.add(2, new product_details("pants",700,0));
           catalog.add(3, new product_details("T-Shirt",400,0));
        }
    public static void catalog_display(ArrayList<product_details> catalog,ArrayList<product_details> cart)
	{
	  Scanner inp=new Scanner(System.in);
	  int choice=0;
	  do
	   {
	   System.out.println("New Garment shop");
	   for(int i=0;i<=3;i++)
		{
		System.out.println("press "+i+":::"+catalog.get(i).product_name+ "(Rs per1::"+catalog.get(i).product_price+")");
		}
		System.out.println("press 5 to view cart");
		System.out.println("press 10 to cheakout");
		System.out.println("Enter your choice");
		
		choice=inp.nextInt();
		switch(choice)
			{
			  case 0:
			  case 1:
			  case 2:
			  case 3:System.out.println("Enter quantity");
				 int n=inp.nextInt();
cart.add(new product_details(catalog.get(choice).product_name,catalog.get(choice).product_price,n));
				break;
			 case 5: view_cart(cart);
			  case 10: bill_ammount(cart);
					break;
			  default:System.out.println("Enter right choice"); 
			}	
             	
	    }while(choice!=10);
	}
public static void bill_ammount(ArrayList<product_details>cart)
	{
	 int total_price=0;
	 for(int i=0;i<cart.size();i++)
	  {
		total_price=total_price+cart.get(i).product_price*cart.get(i).product_count;
	  }
		System.out.println("Total Billing is Rs :::"+total_price);
	}
  public static void view_cart(ArrayList<product_details>cart)
	{
	 //String name;
        // int count;
         System.out.println("Your Cart is");
          System.out.println("--------------");
      for(int i=0;i<cart.size();i++)
	{
	System.out.println(" "+cart.get(i).product_name+ "   quantity     "+cart.get(i).product_count);
	}
       }
}
