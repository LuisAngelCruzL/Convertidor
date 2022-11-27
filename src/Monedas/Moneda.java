package Monedas;
//Clase padre
public class Moneda {
    //Crear propiedades
    private int id;
    private String nombre;
    private double valor;
    //Clase constructora para el objeto
    public Moneda(int id,String nombre,double valor){
        this.id=id;
        this.nombre=nombre;
        this.valor=valor;
    }
    //metodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
