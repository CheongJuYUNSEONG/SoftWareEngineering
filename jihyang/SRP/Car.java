package jihyang.SRP;

abstract public class Car
{
    protected final String WD;
    
    protected final int[] WHEEL = { 0, 0, 0, 0 };
    
    public Car(String wd)
    {
        WD = wd;
    }
    abstract public void run(int power);
}