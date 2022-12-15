package pbo;

public abstract class BangunDatar_2D {
        protected double x;
        protected double y;
    
        public BangunDatar_2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
        public double getArea(){
            return x*y;
        };
    
}
