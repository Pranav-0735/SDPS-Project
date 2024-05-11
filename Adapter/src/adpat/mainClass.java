package adpat;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Img myData = new Img();
		
		EmoDet oldModel = new cnnModel();
		oldModel.predEmot(myData);
		
		System.out.println("-------------------------------------------");
		
		EmoDet adapter = new mpAdapter();
		adapter.predEmot(myData);
		
	}

}
