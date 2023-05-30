package jihyang.SRP;

public class Srpcode {
	public static void main(String[] args) {
	FrontWheelCar a = new FrontWheelCar("Soft");
	RearWheelCar b = new RearWheelCar("Ware");
	AllWheelCar c = new AllWheelCar("공학");
	a.run(3);
	b.run(3);
	c.run(3);
	}
}
class FrontWheelCar extends Car
{
    public FrontWheelCar(String wd)
    {
        super(wd);
    }
    
    @Override
    public void run(int power)
    {
        WHEEL[0] = power;
        WHEEL[1] = power;
        
        System.out.println("휠 동력 상태: " + WHEEL[0] + ", " + WHEEL[1] + ", " + WHEEL[2] + ", " + WHEEL[3]);
    }
}

class RearWheelCar extends Car
{
   
    public RearWheelCar(String wd)
    {
        super(wd);
    }
  
    @Override
    public void run(int power)
    {
        WHEEL[2] = power;
        WHEEL[3] = power;
        
        System.out.println("휠 동력 상태: " + WHEEL[0] + ", " + WHEEL[1] + ", " + WHEEL[2] + ", " + WHEEL[3]);
    }
}
