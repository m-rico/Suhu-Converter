package sample;

public enum Satuan {
    C("Celcius"),
    R("Reamur"),
    F("Fahrenheit"),
    K("Kelvin");

    private String label;

    Satuan(String label){
        this.label = label;
    }

    public String toString() {
        return label;
    }
}
