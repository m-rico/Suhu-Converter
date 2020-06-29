package sample;

public class Kelvin extends Temp {
    private double nilai;

    Kelvin(double nilai)
    {
        this.nilai = nilai;
    }

    public void setNilai(double nilai)
    {
        this.nilai = nilai;
    }

    public double keCelcius(){
        final float c = (float) (this.nilai  - 273);
        return c;
    }

    public double keKelvin(){
        return this.nilai;
    }

    public double keFahrenheit(){
        final float f = (float) (((this.nilai - 273) * 9/5) + 32);
        return f;
    }

    public double keReamur(){
        final float r = (float) ((this.nilai - 273) * 4/5);
        return r;
    }

}
