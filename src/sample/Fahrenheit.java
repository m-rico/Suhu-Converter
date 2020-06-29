package sample;

public class Fahrenheit extends Temp{
    private double nilai;

    Fahrenheit(double nilai)
    {
        this.nilai = nilai;
    }

    public void setNilai(double nilai)
    {
        this.nilai = nilai;
    }

    public double keCelcius(){
        final float c = (float) ((this.nilai  - 32) * 5/9);
        return c;
    }

    public double keKelvin(){
        final float k = (float) (((this.nilai  - 32) * 5/9) + 273.15);
        return k;
    }

    public double keFahrenheit(){
        return this.nilai;
    }

    public double keReamur(){
        final float r = (float) ((this.nilai * 4/9) * (41-32));
        return r;
    }
}
