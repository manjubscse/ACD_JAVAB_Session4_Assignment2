// Declare the class Demo
public class Demo {

	// main method of class demo
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initializing the class Maruthi 
			Maruthi myMaruthi= new Maruthi();
			//Diplaying Car Brand
			System.out.println("Car Brand:" + myMaruthi.carBrand);
			// Maruthi Car has color of silver
			myMaruthi.setColor("Silver");
			// Maruthi car has maxSpeed of 160
			myMaruthi.setMaxSpeed(160);
			// Displaying the Maruthi Car info
			myMaruthi.carInfo();
			// Testing the Maruthi car demo
			myMaruthi.MaruthiStartDemo();
	}

}
