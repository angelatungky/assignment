package pbo;
import java.lang.FunctionalInterface;
@FunctionalInterface
interface MyInterface{
    // abstract method
    double getPiValue();
}
public class lingkaran extends BangunDatar_2D {
    
    public lingkaran(double radius) {
        super(radius, radius);
    }
    @Override
    public double getArea() {
        MyInterface ref; // declare a reference to MyInterface
        ref = () -> 3.1415; // lambda expression
        return y*x*ref.getPiValue();
    }
}
