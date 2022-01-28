import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    float savings_yrs;
	    Scanner i = new Scanner(System.in);
	    System.out.print("Enter the local fuel price per gallon: ");
		float fuel_price_gallon =i.nextFloat();
	    System.out.print("Enter the Estimated MPG of gas vehicle: ");
		float estimated_mpg =i.nextFloat();
	    System.out.print("Enter the Estimated KWH per mile for EV: ");
		float estimated_kwh =i.nextFloat();
	    System.out.print("Enter the utility KWH rate: ");
		float utility_kwh =i.nextFloat();
	    System.out.print("Enter the total miles are driven per year: ");
		float total_miles =i.nextFloat();
		savings_yrs=((total_miles/estimated_mpg)*fuel_price_gallon)-((total_miles*estimated_kwh)*utility_kwh);
		System.out.println("The potential savings per year on switching from gasoline to electric vehicle is: "+
		savings_yrs+"$");
	}
}


