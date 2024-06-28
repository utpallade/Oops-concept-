package oops;

public class mehodsandver {
	
	int camera;
	String brand;
	
	public void get_camera() {
		System.out.println("---- Camera----");
	}
	public void get_brand() {
		System.out.println("---- brand----");
	}
	private void get_private()
	{
		System.out.println("---- private brand----");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mehodsandver obj= new mehodsandver();
		obj.brand="Redmi";
		obj.camera=4;
		System.out.println(obj.brand);
		obj.get_brand();
		obj.get_camera();
		obj.get_private();
	}

}
