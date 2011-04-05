import java.lang.Character.UnicodeBlock;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import sun.text.normalizer.UnicodeMatcher;
import sun.util.resources.CalendarData;
import sun.util.resources.LocaleData;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
	
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		Locale currentLocale;
		ResourceBundle messages;
		currentLocale = new Locale("de", "DE");
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		//Greeting
		System.out.println(messages.getString("hworld"));
		
		//Get User's Name
		System.out.println(messages.getString("nameInq"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("pleaseMeet")+" " + name);
		char c;
		if (currentLocale.equals(new Locale("en", "EN"))){
			c = '$';}
		else {
		c = '\u20ac';}
		Locale.setDefault(currentLocale);
		//NumberFormat moneySymbol = NumberFormat.getCurrencyInstance(currentLocale);
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("AsOf")+ " "+ DateFormat.getDateInstance().format(today));
		System.out.println(messages.getString("SchoolOwe")+ c+ messages.getString("oweMoney"));
		System.out.println(messages.getString("GoodBye"));
	}
	
	

}
