package jihyang.SRP;

public class AllWheelCar extends Car
{
 
    public AllWheelCar(String wd)
    {
        super(wd);
    }
    
 
    @Override
    public void run(int power)
    {
        WHEEL[0] = power;
        WHEEL[1] = power;
        WHEEL[2] = power;
        WHEEL[3] = power;
        
        System.out.println("휠 동력 상태: " + WHEEL[0] + ", " + WHEEL[1] + ", " + WHEEL[2] + ", " + WHEEL[3]);
    }
}