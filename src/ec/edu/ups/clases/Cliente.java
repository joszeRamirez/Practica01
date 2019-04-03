package ec.edu.ups.clases;

/**
 * Cliente
 * 
 * Clase que define los objetos y los métodos que se utilizan para su
 * funcionamiento
 * 
 * @version 1.0
 * @since 2019
 * @author Jose Ramirez
 */
public class Cliente {
    /**String privado del objeto nombre*/
    private String nombre;
    /**String privado del objeto identificacion*/
    private String identificacion;
    /**String privado del objeto formaPago*/
    private String formaPago;
    /**
     * Método getNombre
     * Devuelve la información introducida en el objeto nombre
     * @return (String) nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método setNombre
     * Introduce la información al objeto nombre
     * @param nombre el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método getIdentificacion
     * Devuelve la informacion introducida en el objeto identificacion
     * @return (String) número de identificacion del cliente
     */
    public String getIdentificacion() {
        return identificacion;
    }
    /**
     * Método setIdentificacion
     * Introduce la informacion al objeto identificacion
     * @param identificacion número de identificacion del cliente
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * Método getFormaPago
     * Devuelve la información introducida en el objeto formaPago
     * @return (String) forma de pagar del cliente
     */
    public String getFormaPago() {
        return formaPago;
    }
    /**
     * Método setFormaPago
     * Introduce la información al objeto formaPago
     * @param formaPago forma de pagar del cliente
     */
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    /**
     * Método encontrarMesa
     * Comprueba si hay mesas disponibles para el cliente
     * @param cantidadMesas la cantidad de mesas disponibles en el restaurante
     * @return (boolean) verificación de disponibilidad de mesas
     */
    public boolean encontrarMesa(int cantidadMesas){
        boolean mesaDisponible;
        if(cantidadMesas>0){
            mesaDisponible=true;
        }else{
            mesaDisponible=false;
        }
        return mesaDisponible;
    }
    /**
     * Método hacerPedido
     * Agrega el platillo que desea el cliente al pedido
     * @param plato platillo del cliente
     * @return (String) pedido hacia el mesero
     */
    public String hacerPedido(String plato){
        String pedido;
        pedido = plato;
        return pedido;
    }
    /**
     * Método pagarServicio
     * Agrega el pago por parte del cliente a la cuenta del restaurante
     * @param cuenta monto a pagar al restaurante
     * @return (double) cantidad pagada por el cliente
     */
    public double pagarServicio(double cuenta){
        double servicio;
        servicio = cuenta;
        return servicio;
    }
    /**
     * Método toString
     * Devuelve una impresion en cadena de todo el conjunto de objetos
     * que contiene la clase
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", formaPago=" + formaPago + '}';
    }
    
}
