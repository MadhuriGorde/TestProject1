import org.testng.annotations.DataProvider;

public class DataForTests {

	@DataProvider(name= "PostData")
	public Object[][] dataForPost() {
		/*Object[][] data= new Object[2][3];
		data[0][0]="Albert";
		data[0][1]="Thomas";
		data[0][2]=2;
		
		data[1][0]="Greg";
		data[1][1]="Sergio";
		data[1][2]=1;
		
		return data;*/
		
		return new Object[][]{
			{"Graham","Bell", 3},
			{"Henry","Ford",1}
		};
	}
	
	
	
	@DataProvider(name="DeleteData")
	public Object[] dataForDelete(){
		return new Object[]{
				4,5,7
		};
	}
}
