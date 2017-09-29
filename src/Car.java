//Declare Class Car
public class Car {
	
	// Defined the Car properties like Color and Speed
	private String color; 
    private int maxSpeed;
    //Declared Method to display the car properties
    public void carInfo()
    {
        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
    }
    // Setter for color
    public void setColor(String color)
    {
        this.color = color;
    }
    // setter for maxspeed
    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

}
