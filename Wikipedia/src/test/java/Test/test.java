package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import path.BaseClaass;
import path.UtilityClass;
import pomclasses.imdbpage1;
import pomclasses.wikipediapage1;

public class test extends BaseClaass
{
 
	  wikipediapage1 Wikipedia;
	  imdbpage1 IMDB;
	  String WikipediaCountry;
	  String IMDBCountry;
	  String WikipediaReleaseDate;
	  String IMDBReleaseDate ;
	
	  
	@BeforeClass
	public void GetWikipediaDetails() throws IOException 
	{
		InitializeBrowser();
        Wikipedia = new wikipediapage1(driver);
		WikipediaCountry = Wikipedia.getWikipediaCountryDetails();
		WikipediaReleaseDate = Wikipedia.getWikipediaReleaseDate();
				
	}
	
    @BeforeMethod
	public void GetIMDBDetails() throws IOException 
	{
		InitializeBrowser2();
   		IMDB = new imdbpage1(driver);
   		IMDBReleaseDate = IMDB.getIMDBReleaseDate();
		IMDBCountry = IMDB.getIMDBCountryDetails();
		
	}
	
	
	@Test
	public void TestCase1VerifyCountry() throws EncryptedDocumentException, IOException 
	{
		
		Assert.assertEquals(WikipediaCountry, IMDBCountry);
	    
	}
	
	@Test
	public void TestCase2VerifyReleaseDate() throws EncryptedDocumentException, IOException 
	{
		
		Assert.assertEquals(WikipediaReleaseDate, IMDBReleaseDate);
	    
	}
	
	
	
	
	
	
}
