import java.io.Serializable;
import java.util.Objects;

public class Bicicleta extends Bicileteria implements Methods, Serializable{

    private String tipo;
    private String marca;
    private String cuadro;
    private float rodado;
    private int cambios;
    private int id;

    //Constructors
    public Bicicleta(){}
    public Bicicleta(String tipo, String marca, String cuadro, float rodado, int cambios, int id){
        this.tipo = tipo;
        this.marca = marca;
        this.cuadro = cuadro;
        this.rodado = rodado;
        this.cambios = cambios;
        this.id = id;
    }

    //Setters & Getters
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        if (tipo == 1) this.tipo = "MTB";
        else if (tipo == 2) this.tipo = "RUTA";
        else if (tipo == 3) this.tipo = "CITY";
        else if (tipo == 4) this.tipo = "UTILITARY";
        else System.out.println("Opcion Incorrecta");

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(int choice) {
        if (choice == 1) this.marca = "SLP";
        else if (choice == 2) this.marca = "VENZO";
        else if (choice == 3) this.marca = "TOP MEGA";
        else if (choice == 4) this.marca = "OLMO";
        else if (choice == 5) this.marca = "VAIRO";
        else System.out.println("Opcion incorrecta");
    }

    public float getRodado() {
        return this.rodado;
    }

    public void setRodado(float rodado) {
        if (rodado == 1) this.rodado = 21;
        else if (rodado == 2) this.rodado = 27.5F;
        else if (rodado == 3) this.rodado = 29;
        else System.out.println("La opcion es incorrecta");
    }

    public String getCuadro() {
        return this.cuadro;
    }

    public void setCuadro(int choice) {
        if (choice == 1) this.cuadro = "XS";
        else if (choice == 2) this.cuadro = "S";
        else if (choice == 3) this.cuadro = "M";
        else if (choice == 4) this.cuadro = "L";
        else if (choice == 5) this.cuadro = "XL";
        else System.out.println("Opcion incorrecta");
    }

    public int getCambios() {
        return this.cambios;
    }

    public void setCambios(int cambios) {
        if (cambios == 1) this.cambios = 21;
        else if (cambios == 2) this.cambios = 27;
        else if (cambios == 3) this.cambios = 33;
        else System.out.println("Opcion incorrecta");
    }

    //METHODS OVERRIDING
    public void using(){
        System.out.println("La Bicicleta marca: "+this.marca+" está siendo usada");
    }
    public void washing(){
        System.out.println("La Bicicleta marca: "+this.marca+" se está lavando");
    }
    public void maintenance(){
        System.out.println("La Bicicleta marca: "+this.marca+" está en mantenimiento");
    }



    @Override
    public String toString() {
        return "Bicicleta Marca: "+this.marca+" Tipo: "+this.tipo+" de Rodado: "+this.rodado+" y Cuadro: "+this.cuadro+
                " con "+this.cambios+" Cambios";
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(! (o instanceof Bicicleta bicicleta)) return false;
        return Objects.equals(getMarca(), bicicleta.getMarca());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }
}