package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imdbpage1 {
	
		@FindBy(xpath = "//a[text()='January 7, 2022 (United States)']") private WebElement ReleaseDate;
	    
		@FindBy(xpath = "//a[text()='India']") private WebElement Country;
		
		public imdbpage1(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);	
		}
		
		public String getIMDBReleaseDate()
		{
			String ActReleaseDate = ReleaseDate.getText();
			return ActReleaseDate;
		}
		
		public String getIMDBCountryDetails()
		{
			String ActCountry = Country.getText();
			return ActCountry;
		}

}
