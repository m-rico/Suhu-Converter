package sample;

public class Reamur extends Temp{
    private double nilai;

    Reamur(double nilai)
    {
        this.nilai = nilai;
    }

    public void setNilai(double nilai)
    {
        this.nilai = nilai;
    }

    public double keCelcius(){
        final float c = (float) (this.nilai * 5/4);
        return c;
    }

    public double keKelvin(){
        final float k = (float) ((this.nilai * 5/4) + 273);
        return k;
    }

    public double keFahrenheit(){
        final float f = (float) ((this.nilai * 9/4) + 32);
        return f;
    }

    public double keReamur(){
        return this.nilai;
    }
}
