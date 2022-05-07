package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//1. Launch the URL https://www.ajio.com/
//2. In the search box, type as "bags" and press enter
//3. To the left  of the screen under " Gender" click the "Men"
//4. Under "Category" click "Fashion Bags"
//5. Print the count of the items Found. 
//6. Get the list of brand of the products displayed in the page and print the list.
//7. Get the list of names of the bags and print it

public class Ajio 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("Bags");
	
		driver.findElement(By.xpath("//button[contains(@class,'rilrtl-button')]")).click();
		
	    driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-genderfilter facet-linkname-Men')]")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags')]")).click();
	    
	    Thread.sleep(3000);
		
		String text= driver.findElement(By.className("length")).getText();
		
		
		System.out.println("The number of products  "+ text);
	
		
		
	
	}

}
