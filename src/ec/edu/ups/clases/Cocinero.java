package ec.edu.ups.clases;

/**
 * Cocina
 * 
 * Clase que define los objetos y los métodos que se utilizan para su
 * funcionamiento
 * 
 * @version 1.0
 * @since 2019
 * @author Jose Ramirez
 */
public class Cocinero {
    /**String privado del objeto nombre*/
    private String nombre;
    /**String privado del objeto identificacion*/
    private String identificacion;
    /**double privado del objeto salario*/
    private double salario;
    /**
     * Método getNombre
     * Devuelve la información introducida en el objeto nombre
     * @return (String) nombre del cocinero
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método setNombre
     * Introduce la información al objeto nombre
     * @param nombre el nombre del cocinero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método getIdentificacion
     * Devuelve la informacion introducida en el objeto identificacion
     * @return (String) número de identificacion del cocinero
     */
    public String getIdentificacion() {
        return identificacion;
    }
    /**
     * Método setIdentificacion
     * Introduce la informacion al objeto identificacion
     * @param identificacion número de identificacion del cocinero
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * Método getSalario
     * Devuelve la informacion introducida en el objeto salario
     * @return (double) salario del cocinero
     */
    public double getSalario() {
        return salario;
    }
    /**
     * Método setSalario
     * Introduce la informacion al objeto salario
     * @param salario salario del cocinero
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * Método prepararOrden
     * Comprueba si la orden esta lista para servir
     * @param orden orden dada por el mesero
     * @return (boolean) verifica si la orden esta lista
     */
    public boolean prepararOrden(String orden){
        boolean ordenLista;
        ordenLista = true;
        return ordenLista;
    }
    /**
     * Método alistarIngredientes
     * Comprueba si los ingredientes para el platillo se encuentran disponibles
     * @param ingrediente ingredientes utilizados para el platillo
     * @return (boolean) verificacion de la disponibilidad de ingredientes
     */
    public boolean alistarIngredientes(String ingrediente){
        boolean ingredienteCompleto;
        ingredienteCompleto = true;
        return ingredienteCompleto;
    }
    /**
     * Método utilizarCocina
     * Comprueba si hay cocinas disponibles para su uso
     * @param cocinasDisponibles número de cocinas desocupadas
     * @return (boolean) verificacion de cocinas disponibles
     */
    public boolean utilizarCocina(int cocinasDisponibles){
        boolean cocinaDisponible;
        if (cocinasDisponibles > 0){
            cocinaDisponible = true;
        }else{
            cocinaDisponible=false;
        }
        return cocinaDisponible;
    }
    /**
     * Método toString
     * Devuelve una impresion en cadena de todo el conjunto de objetos
     * que contiene la clase
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "Cocinero{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", salario=" + salario + '}';
    }
    
}
