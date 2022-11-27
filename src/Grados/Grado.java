package Grados;
//Clase padre
public class Grado {
    //Crear propiedades
    private int id;
    private String nombre;
    //Clase constructora para el objeto
    public Grado(int id,String nombre){
        this.id=id;
        this.nombre=nombre;
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
}
