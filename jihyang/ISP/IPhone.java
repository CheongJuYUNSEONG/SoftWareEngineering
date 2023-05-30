package jihyang.ISP;

public interface IPhone {
    void call(String number); 
    void message(String number, String text); 
}

interface WirelessChargable {
    void wirelessCharge(); 
}

interface ARable {
    void AR(); 
}

interface Biometricsable {
    void biometrics(); 
}