package adpat;

public class mpAdapter implements EmoDet{
	private final mpModel mpmodel;
	public mpAdapter() {
		mpmodel = new mpModel();
	}
	
	private Npy convImgtoNpy(Img img)
	{
		System.out.println("Converting from .jpg to .npy");
		System.out.println("-------------------------------------------");
		System.out.println();
		return new Npy();
	}
	
	@Override
	public void predEmot(Img img)
	{
		Npy npy = convImgtoNpy(img);
		mpmodel.predEmotNew(npy);
	}
}
