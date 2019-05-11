import org.openqa.selenium.firefox.FirefoxDriver;

// created a class - Ishnira. This class will automate Google website launch and checking its title text.
public class Ishnira {

	//create a constructor
	public Ishnira() {
		System.out.println("Inside constructor - Ishnira");
	}
	/*use external library - Calculator_v1.0.0.jar files and use its classes like add, sub, div, mult
	*/
	//create an object to Class - Calculator
	Calculator calc = new Calculator();
	//create a method - addcal(), using external class - Calculator
	public void addCal() {
		calc.add();
	}
	
	public static void main(String[] args) {
		// Creating an object to Class - Ishnira
		Ishnira ish = new Ishnira();
		//call method - addCal()
		ish.addCal();
		
		/*Use external library - selenium-server-standalone
		below - create an object to Firefoxdriver to launch firefox browser
		*/
		FirefoxDriver driver = new FirefoxDriver(); 
		// in FF - enter url: https://www.google.com/
		//driver.get("https://www.google.com/");
		//driver.findElementById("q").click();
		//System.out.println("driver.getTitle()")
		String baseUrl = "https://www.google.com/";
		String expectedTitle = "Google";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test case passed: Title match.");
		}
		else {
			System.out.println("Test case failed: Title mismatch.");
		}
		//close browser
		driver.close();
		//close program
		System.exit(0);
	}

}
