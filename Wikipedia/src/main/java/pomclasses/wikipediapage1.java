package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wikipediapage1 
{

	
	@FindBy(xpath = "(//div[@class='plainlist'])[4] ") private WebElement ReleaseDate;
    
	@FindBy(xpath = "(//td)[13]") private WebElement Country;
	
	public wikipediapage1(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	
	public String getWikipediaReleaseDate()
	{
		String ActReleaseDate = ReleaseDate.getText();
		return ActReleaseDate;
	}
	
	public String getWikipediaCountryDetails()
	{
		String ActCountry = Country.getText();
		return ActCountry;
	}
	////ul/li)[12]

}
