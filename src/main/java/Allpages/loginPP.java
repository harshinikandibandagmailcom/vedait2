package Allpages;

import org.openqa.selenium.By;

import BasePP.BaseCC;


public class loginPP extends BaseCC
{
	public static By emailInputBox = By.id("email");
	public static By passwordInputBox=By.id("pass");
	public static By login=By.xpath("//button[@name='login']");
	


public static void Enter_Emaild(String  email)
{
	
	driver.findElement(emailInputBox).sendKeys(email);
}

public static void Enter_password(String  password)
{
	
	driver.findElement(passwordInputBox).sendKeys(password);
}
public static void login()
{
	driver.findElement(login).click();
}



}
