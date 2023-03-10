package test.java.com.testclasses;

public class HomePageRediffTest extends Base {

	public WebDriver driver;


	//private static Logger log=LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void invokbrowser() throws IOException {

		driver=initializeDriver();
		//log.info("driver is initialized");

		driver.manage().window().maximize();

		//log.info("window is maximized");


	}


	// inheritance
	//by creating object

	@Test(dataProvider="getData")

	public void logIn(String username,String password,String text) throws IOException, InterruptedException {


		driver.get(prop.getProperty("url"));

		//log.info("navigated to Landing page/Home page or Url is launched");
		LandingPageRediff l =new LandingPageRediff(driver);

		//click on sign in on home page 
		l.getLogin().click();

		//log.info("click on sign in tab");


		LogInPageRediff l1=new LogInPageRediff(driver);

		l1.Emailid().sendKeys(username);


		l1.pass().sendKeys(password);

		//log.info(text);

		l1.submitt().click();

		log.info("click on login button");

	}

	@AfterTest
	void tearDown() {

		driver.close();
	}

	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][3];
		//0th row
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="123456";
		data[0][2]="nonRestrcited User";
		//1st row
		//	 data[1][0]="restricteduser@qw.com";
		//     data[1][1]="456788";
		//	 data[1][2]= "restricted user";

		return data;






	}





}
