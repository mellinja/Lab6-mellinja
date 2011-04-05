import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Locale;

import org.junit.Test;


public class testPrintBalance {
	
	@Test
	public void testENHello(){
		assertEquals("Hello World", PrintBalance.testHelper(new Locale("en","EN"), "hworld"));
	}
	@Test
	public void testFRHello(){
		assertEquals("Bonjour tout le monde", PrintBalance.testHelper(new Locale("fr","FR"), "hworld"));
	}
	@Test
	public void testDEHello(){
		assertEquals("Hallo Welt", PrintBalance.testHelper(new Locale("de","DE"), "hworld"));
	}
	
	@Test
	public void testENName(){
		assertEquals("Please enter your name", PrintBalance.testHelper(new Locale("en","EN"), "nameInq"));
	}
	@Test
	public void testFRName(){
		assertEquals("S'il vous plaît Inscrivez votre nom", PrintBalance.testHelper(new Locale("fr","FR"), "nameInq"));
	}
	@Test
	public void testDEName(){
		assertEquals("Bitte geben Sie Ihren Namen", PrintBalance.testHelper(new Locale("de","DE"), "nameInq"));
	}
	@Test
	public void testENMeet(){
		assertEquals("I am pleased to meet you", PrintBalance.testHelper(new Locale("en","EN"), "pleaseMeet"));
	}
	@Test
	public void testFRMeet(){
		assertEquals("Je suis heureux de vous rencontrer", PrintBalance.testHelper(new Locale("fr","FR"), "pleaseMeet"));
	}
	@Test
	public void testDEMeet(){
		assertEquals("Ich freue mich, Sie kennen zu lernen", PrintBalance.testHelper(new Locale("de","DE"), "pleaseMeet"));
	}
	@Test
	public void testENAs(){
		assertEquals("As of :", PrintBalance.testHelper(new Locale("en","EN"), "AsOf"));
	}
	@Test
	public void testFRAs(){
		assertEquals("En date du:", PrintBalance.testHelper(new Locale("fr","FR"), "AsOf"));
	}
	@Test
	public void testDEAs(){
		assertEquals("Stand:", PrintBalance.testHelper(new Locale("de","DE"), "AsOf"));
	}
	@Test
	public void testDESchoolOwe(){
		assertEquals("Du schuldest der Schule", PrintBalance.testHelper(new Locale("de","DE"), "SchoolOwe"));
	}
	@Test
	public void testDEOweMoney(){
		assertEquals("6947972,71", PrintBalance.testHelper(new Locale("de","DE"), "OweMoney"));
	}
	@Test
	public void testDEGoodBye(){
		assertEquals("Good Bye", PrintBalance.testHelper(new Locale("de","DE"), "GoodBye"));
	}
	
	
	
	
}
 