public class Rombo implements Shape{

    public int diagMag;
    public int diagMin;

    public Rombo(int diagMag, int diagMin){
        this.diagMag = diagMag;
        this.diagMin = diagMin;
    }
    @Override
    public double getArea() {
        return (this.diagMag * this.diagMin) / 2;
    }
    
}
