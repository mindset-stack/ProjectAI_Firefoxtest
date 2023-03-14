package com.blazeclan.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutMePage {

	@FindBy(xpath="//span[contains(text(),'My Projects')]")
	public WebElement projectselectionicon;
	@FindBy(xpath="//li[@class='pro-menu-item']/div/span[@class='pro-item-content']")
	public WebElement projectname;
	@FindBy(xpath="//span[@class='MuiIconButton-label']")
	public WebElement closeicon;
	
	
	@FindBy(xpath="//span[contains(text(),'About Me')]")
	public WebElement aboutmelink;
	
	
	
	//@FindBy(xpath="//*[@class='_2kiHKNbvQmG4zgHt7oz96W EIwcdJQ929umkl9iYDdm9']")
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
	public WebElement sentimentfirstanswer;
	
	 @FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]")
	 public WebElement sentimentsecondanswer;
	 
	 
	 
	 @FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[3]")
	 public WebElement sentimentthirdanswer;
	 
	 @FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[3]")
	 public WebElement sentimentfourthanswer;
	 
	 @FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[3]")
	 public WebElement sentimentfifthanswer;
	 
	 @FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/div[1]/div[3]")
	 public WebElement sentimentsixthanswer;
	 
	 @FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[10]/div[1]/div[1]/div[1]/div[1]/textarea[1]")
	 public WebElement sentimentseventhanswer;
	 
//	@FindBy(xpath="//a[@class='_1hylHuyaZ6-giDZ1GsftK3']")
//	public WebElement comment;
	
	public AboutMePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
}
