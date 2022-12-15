package pbo;

public class segitiga extends BangunDatar_2D {
    public segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    @Override
    public double getArea() {
        return x*y*1/2;
    }
}
