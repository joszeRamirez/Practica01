package ec.edu.ups.clases;

/**
 * Mesero
 * 
 * Clase que define los objetos y los métodos que se utilizan para su
 * funcionamiento
 * 
 * @version 1.0
 * @since 2019
 * @author Jose Ramirez
 */
public class Mesero {
    /**String privado del objeto nombre*/
    private String nombre;
    /**String privado del objeto identificacion*/
    private String identificacion;
    /**double privado del objeto salario*/
    private double salario;
    /**
     * Método getNombre
     * Devuelve la información introducida en el objeto nombre
     * @return (String) nombre del mesero
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método setNombre
     * Introduce la información al objeto nombre
     * @param nombre el nombre del mesero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método getIdentificacion
     * Devuelve la informacion introducida en el objeto identificacion
     * @return (String) número de identificacion del mesero
     */
    public String getIdentificacion() {
        return identificacion;
    }
    /**
     * Método setIdentificacion
     * Introduce la informacion al objeto identificacion
     * @param identificacion número de identificacion del mesero
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * Método getSalario
     * Devuelve la informacion introducida en el objeto salario
     * @return (double) salario del mesero
     */
    public double getSalario() {
        return salario;
    }
    /**
     * Método setSalario
     * Introduce la informacion al objeto salario
     * @param salario salario del mesero
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * Método recibirOrden
     * Toma lista del pedido del cliente
     * @param orden orden por parte del cliente
     * @return (String) lista de las ordenes del cliente
     */
    public String recibirOrden (String orden){
        String listaOrden;
        listaOrden = orden;
        return listaOrden;
    }
    /**
     * Método cumplirHorario
     * Comprueba si el mesero ha cumplido con su horario laboral
     * @param horarioLaboral horario determinado por el restaurante
     * @return (boolean) verificación del cumplimiento del horario laboral
     */
    public boolean cumplirHorario(String horarioLaboral){
        boolean horarioCumplido;
        horarioCumplido = true;
        return horarioCumplido;
    }
    /**
     * Método recibirSalario
     * Comprueba que el mesero reciba su salario
     * @param salario monto dado al mesero por sus servicios prestados
     * @return (boolean) verificación de la entrega del salario
     */
    public boolean recibirSalario(double salario){
        boolean salarioRecibido;
        salarioRecibido = true;
        return salarioRecibido;
    }
    /**
     * Método toString
     * Devuelve una impresion en cadena de todo el conjunto de objetos
     * que contiene la clase
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "Mesero{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", salario=" + salario + '}';
    }
    
}
