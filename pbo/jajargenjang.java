package pbo;

public class jajargenjang extends BangunDatar_2D{
    public jajargenjang(double alas, double tinggi) {
        super(alas, tinggi);
    } 
    @Override
    public double getArea() {
        return x*y;
    }
}
