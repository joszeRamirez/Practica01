package ec.edu.ups.clases;

/**
 * Restaurante
 * 
 * Clase que define los objetos y los métodos que se utilizan para su
 * funcionamiento
 * 
 * @version 1.0
 * @since 2019
 * @author Jose Ramirez
 */
public class Restaurante {
    /**String privado del objeto nombre*/
    private String nombre;
    /**String privado del objeto direccion*/
    private String direccion;
    /**String privado del objeto ruc*/
    private String ruc;
    /**String privado del objeto horarioAtencion*/
    private String horarioAtencion;
    /**
     * Método getNombre
     * Devuelve la información introducida en el objeto nombre
     * @return (String) nombre del restaurante
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método setNombre
     * Introduce la información al objeto nombre
     * @param nombre el nombre del restaurante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método getDireccion
     * Devuelve la información introducida en el objeto direccion
     * @return (String) la direccion del restaurante
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Método setDireccion
     * Introduce la informacion al objeto direccion
     * @param direccion la direccion del restaurante
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Método getRuc
     * Devuelve la informacion introducida en el objeto ruc
     * @return (String) el ruc del restaurante
     */
    public String getRuc() {
        return ruc;
    }
    /**
     * Método setRuc
     * Introduce la informacion al objeto ruc
     * @param ruc el ruc del restaurante
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    /**
     * Método getHorarioAtencion
     * Devuelve la informacion introducida en el objeto horarioAtencion
     * @return (String) el horario en el que atiende el restaurante
     */
    public String getHorarioAtencion() {
        return horarioAtencion;
    }
    /**
     * Método setHorarioAtencion
     * Introduce la informacion al objeto horarioAtencion
     * @param horarioAtencion el horario en el que atiende el restaurante
     */
    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
    /**
     * Método agregarEmpleado
     * Agrega un empleado al restaurante, si este ya se encuentra dentro se
     * rechaza la introducción
     * @param empleado empleado del restaurante
     * @return (boolean) verificacion para agregar al empleado
     */
    private boolean agregarEmpleado(String empleado){
        boolean verificacion;
        if (empleado.equalsIgnoreCase("existente")){
            verificacion = false;
        }else{
            verificacion = true;
        }
        return verificacion;
    }
    /**
     * Método agregarCliente
     * Agrega un cliente al restaurante, si este ya se encuentra dentro se
     * rechaza la introducción
     * @param cliente cliente del restaurante
     * @return (boolean) verificacion para agregar al cliente
     */
    private boolean agregarCliente(String cliente){
        boolean verificacion;
        if (cliente.equalsIgnoreCase("existente")){
            verificacion = false;
        }else{
            verificacion = true;
        }
        return verificacion;
    }
    /**
     * Método abrirRestaurante
     * Comprueba que la hora de apertura coincida con la actual para
     * abrir el restaurante
     * @param horarioAtencion horario en el que el restaurante abre
     * @return (boolean) verificación para abrir el restaurante
     */
    private boolean abrirRestaurante(String horarioAtencion){
        boolean verificacion;
        if(horarioAtencion.equalsIgnoreCase("8:00")){
            verificacion=true;
        }else{
            verificacion=false;
        }
        return verificacion;
    }
    /**
     * Método toString
     * Devuelve una impresion en cadena de todo el conjunto de objetos
     * que contiene la clase
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "Restaurante{" + "nombre=" + nombre + ", direccion=" 
                + direccion + ", ruc=" + ruc + ", horarioAtencion=" 
                + horarioAtencion + '}';
    }
    
}
