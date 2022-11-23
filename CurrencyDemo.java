import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyDemo{
	public static void main(String[] args){
		int item;  
		double itemCost,total;

		Scanner input =new Scanner(System.in);
		
		System.out.print("enter the total item:");
		item=input.nextInt();		
		
		System.out.print("enter the cost per item:");
		itemCost=input.nextDouble();
		
		total = item * itemCost;

		System.out.println();
		System.out.println("Unformated total:"+total);

		NumberFormat currencyFmt=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("formatted total:"+currencyFmt.format(total));	

	}

}