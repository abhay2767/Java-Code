
interface camera
{
	void takeSnap();
	void recordVideo();
	private void start()
//we can not use this private method outside but when out default method going big
	//then we can use this method like this given below we use private method in default method 
	// and call form outside.
	{
		System.out.println("Start Camera");
	}
	default void screenshot()
	{
		start();
		System.out.println("Take the Screenshot");
	}
}
interface wifi
{
	String[] getNetworks();
	void connectToNetwork(String network);
}
interface gps
{
	void location();
}

class cellPhone
{
	void callNumber(double phoneNum)
	{
		System.out.println("Calling "+phoneNum);
	}
	void pickCall(double pickPhone)
	{
		System.out.println("Pick the Call "+pickPhone);
	}
}
class SmartPhone1 extends cellPhone implements camera, wifi, gps
{
	public void takeSnap()
	{
		System.out.println("Taking Snap");
	}
	public void recordVideo()
	{
		System.out.println("Rocording the video");
	}
	
	
	public String[] getNetworks()
	{
		System.out.println("Getting list of available networks");
		String[] networkList = {"Abhay_Wifi", "Rohit_Wifi", "Sachin_Wifi"};
		return networkList;
	}
	public void connectToNetwork(String network)
	{
		System.out.println("Connecting to "+network);
	}


	public void location()
	{
		System.out.println("Get the location");
	}

	/*public void screenshot()
	{
		System.out.println("Take the Screenshot and Override");
	}
	*/
	//when we call screenshot() then this will call.
}
public class ultiple_Interface_with_Inheritance {
	public static void main(String[]args)
	{
		
		SmartPhone1 smp = new SmartPhone1();
		smp.takeSnap();
		smp.recordVideo();
		smp.screenshot();
		
		String[] arr = smp.getNetworks();
		for(String item: arr)
		{
			System.out.println(item);
		}
		smp.connectToNetwork("Abhay");
		
		smp.location();
		
		smp.callNumber(885902282);
		smp.pickCall(885902282);
		
		/*                           Polymorphism in Interface                                   */
		camera cam = new SmartPhone1();
		//cam.location();//---> not allowed
		//here you are restricted that here we create a reference of 'camera' cam and object of 'Smartphone'
		//now you can use only the method and properties 'camera' not the SmartPhone.
		//This is a SmartPhone but use it as camera.
		//like as:
				cam.takeSnap();
				cam.recordVideo();
				cam.screenshot();
					//cam.start();//-->> thought error because 'start()' is define as private
		//we can not use individual private method outside of the interface.
		// this is "Dynamic method dispatching.
	}

}
