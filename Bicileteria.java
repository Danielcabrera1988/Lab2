import java.io.Serializable;

public abstract class Bicileteria implements Serializable{

    private String color;
    private String tipoFrenos;

    //CONSTRUCTORS
    public Bicileteria(){}

    //Getters & Setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFrenos() {
        return tipoFrenos;
    }
    public void setFrenos(String frenos) {
        this.tipoFrenos = frenos;
    }

}