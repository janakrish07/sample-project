package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Login extends Baseclass {

	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnclose;
	
	public WebElement btnclose() {
		return btnclose;
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement txtbox;
	
	public WebElement getTxtbox() {
		return txtbox;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnsearch; 
	
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement mobile1;
	public WebElement getMobile1() {
		return mobile1;
		
	}
	@FindBy(xpath="(//div[@class='_4rR01T'])[2]")
	private WebElement mobile2;
	public WebElement getMobile2() {
		return mobile2;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[3]")
	private WebElement mobile3;
	public WebElement getMobile3() {
		return mobile3;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[4]")
	private WebElement mobile4;
	public WebElement getMobile4() {
		return mobile4;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[5]")
	private WebElement mobile5;
	public WebElement getMobile5() {
		return mobile5;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[6]")
	private WebElement mobile6;
	public WebElement getMobile6() {
		return mobile6;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[7]")
	private WebElement mobile7;
	public WebElement getMobile7() {
		return mobile7;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[8]")
	private WebElement mobile8;
	public WebElement getMobile8() {
		return mobile8;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[9]")
	private WebElement mobile9;
	public WebElement getMobile9() {
		return mobile9;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[10]")
	private WebElement mobile10;
	public WebElement getMobile10() {
		return mobile10;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[11]")
	private WebElement mobile11;
	public WebElement getMobile11() {
		return mobile11;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[12]")
	private WebElement mobile12;
	public WebElement getMobile12() {
		return mobile12;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[13]")
	private WebElement mobile13;
	public WebElement getMobile13() {
		return mobile13;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[14]")
	private WebElement mobile14;
	public WebElement getMobile14() {
		return mobile14;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[15]")
	private WebElement mobile15;
	public WebElement getMobile15() {
		return mobile15;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[16]")
	private WebElement mobile16;
	public WebElement getMobile16() {
		return mobile16;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[17]")
	private WebElement mobile17;
	public WebElement getMobile17() {
		return mobile17;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[18]")
	private WebElement mobile18;
	public WebElement getMobile18() {
		return mobile18;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[19]")
	private WebElement mobile19;
	public WebElement getMobile19() {
		return mobile;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[20]")
	private WebElement mobile20;
	public WebElement getMobile20() {
		return mobile20;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[21]")
	private WebElement mobile21;
	public WebElement getMobile21() {
		return mobile21;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[22]")
	private WebElement mobile22;
	public WebElement getMobile22() {
		return mobile22;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[23]")
	private WebElement mobile23;
	public WebElement getMobile23() {
		return mobile23;
		
	}@FindBy(xpath="(//div[@class='_4rR01T'])[24]")
	private WebElement mobile24;
	public WebElement getMobile24() {
		return mobile24;
		
	}
	
	
	
	@FindBy(xpath="(//div[@class='col col-7-12'])[1]")
	private WebElement firstMobile;
	
	public WebElement getFirstMobile() {
		return firstMobile;
	}
	@FindBy(xpath="(//li[@class='col col-6-12'])[2]")
	private WebElement btnBuy;
	public WebElement getBtnBuy() {
		return btnBuy ;
	}
    @FindBy(xpath="//input[@type='text']")
    private WebElement mobile;
    public WebElement getmobile() {
    	return mobile;
    }
    	
    }


