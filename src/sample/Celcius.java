package sample;

public class Celcius extends Temp{
    private double nilai;

    Celcius(double nilai)
    {
        this.nilai = nilai;
    }

    public void setNilai(double nilai)
    {
        this.nilai = nilai;
    }

    public double keCelcius(){
        return this.nilai;
    }

    public double keKelvin(){
        float k = (float) (this.nilai + 273);
        return k;
    }

    public double keFahrenheit(){
        float f = (float) ((this.nilai * 9/5) + 32);
        return f;
    }

    public double keReamur(){
        float r = (float) (this.nilai * 4/5);
        return r;
    }
}
