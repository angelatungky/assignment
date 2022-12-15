package pbo;

public class persegi_panjang extends BangunDatar_2D{
    public persegi_panjang(double panjang, double lebar) {
        super(panjang, lebar);
    }
    @Override
    public double getArea() {
        return x*y;
    }
}
