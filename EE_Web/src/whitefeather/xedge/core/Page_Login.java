package whitefeather.xedge.core;


import org.openqa.selenium.WebElement;
import whitefeather.xedge.appconfig.ConfigMethods;
import whitefeather.xedge.appconfig.Constants;
import whitefeather.xedge.appconfig.ObjectMapping;
import whitefeather.xedge.facilitator.HelperHand;


public class Page_Login extends HelperHand
{
	public static WebElement element;
	public static boolean _condition;
	public static ObjectMapping properties = new ObjectMapping(Constants.LOCATORS);	
	
	public static boolean displayBackgroundImageLoginPage() throws Exception
	{
		ConfigMethods.waitForPageToLoad();
		_condition = driver.findElement(properties.selectLocator("Loginpage_backgroundImage")).isDisplayed();
//		_condition=false;//temporary declaration for demo purpose
		return _condition;
	}
	
	public static boolean displayClientAccountLogo() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_Accountlogo")).isDisplayed();
		return _condition;
	}
	public static boolean displayUsernameLabel() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_UsernameLabel")).isDisplayed();
		return _condition;
	}
	public static boolean displayUsernameInputBox() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_Username_inputfield")).isDisplayed();
		return _condition;
	}
	public static boolean displayUsernamePlaceholder() throws Exception
	{
		driver.findElement(properties.selectLocator("LoginWindow_UsernamePlaceholder")).clear();;
		_condition = driver.findElement(properties.selectLocator("LoginWindow_UsernamePlaceholder")).isDisplayed();
		return _condition;
	}
	public static WebElement enterValidUsername() throws Exception
	{
		element = driver.findElement(properties.selectLocator("LoginWindow_Username_inputfield"));
		return element;
	}
	public static boolean displayPasswordLabel() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_PasswordLabel")).isDisplayed();
		return _condition;
	}
	public static boolean displayPasswordInputBox() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_Password_inputfield")).isDisplayed();
		return _condition;
	}
	public static boolean displayPasswordPlaceholder() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_PasswordPlaceholder")).isDisplayed();;
		return _condition;
	}
	public static boolean displayPasswordWrapper() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_Password_wrapper")).isDisplayed();
		return _condition;
	}
	public static WebElement clickPasswordWrapper() throws Exception
	{
		element = driver.findElement(properties.selectLocator("LoginWindow_Password_wrapper"));
		return element;
	}
	public static WebElement enterValidPassword() throws Exception
	{
		element = driver.findElement(properties.selectLocator("LoginWindow_Password_inputfield"));
		return element;
	}
	
	public static boolean displayRememberMeLabel() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_RememberMeCheckBox")).isDisplayed();
		return _condition;
	}
	public static WebElement clickRememberMeCheckBox() throws Exception
	{
		element = driver.findElement(properties.selectLocator("LoginWindow_RememberMeCheckBox"));
		return element;
	}
	public static WebElement displayForgotPasswordLink() throws Exception
	{
		element = driver.findElement(properties.selectLocator("LoginWindow_ForgotPasswordLink"));
		return element;
	}
	public static boolean displayLoginButton() throws Exception
	{
		_condition = driver.findElement(properties.selectLocator("LoginWindow_LoginButton")).isDisplayed();
		return _condition;
	}
	public static WebElement clickOnLoginButton() throws Exception
	{
		element = driver.findElement(properties.selectLocator("LoginWindow_LoginButton"));
		return element;
	}
	public static  String getLoginPageURL()
	{
		return driver.getCurrentUrl();
	}
	
}
