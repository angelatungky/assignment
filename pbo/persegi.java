package pbo;

public class persegi extends BangunDatar_2D {
    public persegi(double sisi) {
        super(sisi, sisi);
    }
    @Override
    public double getArea() {
        return x*y;
    }
}
