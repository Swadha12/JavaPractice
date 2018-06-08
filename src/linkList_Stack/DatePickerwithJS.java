package linkList_Stack;

public class DatePickerwithJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//WebDriver driver = new ChromeDriver();
	String driver=null;
	String dateVal="25/12/2018";
	String element=null;
	datePickByJS(driver,element,dateVal);
	}
	
	public static void datePickByJS(Webdriver driver,WebElement element,String dateVal){
		 JavascriptExeccutor js = (JavascriptExecutor(driver));
		    
		    js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');",element);
	}

}
