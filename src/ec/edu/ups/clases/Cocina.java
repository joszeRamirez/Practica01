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
public class Cocina {
    /**String privado del objeto marca*/
    private String marca;
    /**String privado del objeto tipo*/
    private String tipo;
    /**int privado del objeto numHornilla*/
    private int numHornilla;
    /**
     * Método getMarca
     * Devuelve la informacion introducida en el objeto marca
     * @return (String) marca de la cocina
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Método setMarca
     * Introduce la informacion al objeto marca
     * @param marca marca de la cocina
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Método getTipo
     * Devuelve la informacion introducida en el objeto tipo
     * @return (String) tipo de cocina
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Método setTipo
     * Introduce la informacion al objeto tipo
     * @param tipo tipo de cocina
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Método getNumHornilla
     * Devuelve la información al objeto numHornilla
     * @return (int) número de hornillas que tiene la cocina
     */
    public int getNumHornilla() {
        return numHornilla;
    }
    /**
     * Método setNumHornilla
     * Introduce la informacion al objeto numHornilla
     * @param numHornilla número de hornillas que tiene la cocina
     */
    public void setNumHornilla(int numHornilla) {
        this.numHornilla = numHornilla;
    }
    /**
     * Método revisionCombustible
     * Verifica si hay combustible disponible para la cocina
     * @param combustible combustible de la cocina
     * @return (boolean) verificacion del combustible de la cocina
     */
    public boolean revisionCombustible(boolean combustible){
        combustible = true;
        return combustible;
    }
    /**
     * Método hornillasDisponibles
     * Comprueba si hay hornillas disponibles en la cocina
     * @param numHornillas la cantidad de hornillas de la cocina
     * @return (boolean) verificación del número de hornillas de la cocina
     */
    public boolean hornillasDisponibles(int numHornillas){
        boolean hornilla;
        if(numHornillas==0){
            hornilla = false;
        }else{
            hornilla = true;
        }
        return hornilla;
    }
    /**
     * Método tiempoCoccion
     * Comprueba si el tiempo de coccion de cierto ingrediente en la cocina
     * ha llegado a su fin
     * @param duracion la duracion del tiempo de coccion
     * @return (boolean) verificacion del tiempo de coccion
     */
    public boolean tiempoCoccion(String duracion){
        boolean listo;
        if (duracion.equalsIgnoreCase("0")){
            listo = true;
        }else{
            listo = false;
        }
        return listo;
    }
    /**
     * Método toString
     * Devuelve una impresion en cadena de todo el conjunto de objetos
     * que contiene la clase
     * @return (String) impresión en cadena de los objetos
     */
    @Override
    public String toString() {
        return "Cocina{" + "marca=" + marca + ", tipo=" + tipo + ", numHornilla=" + numHornilla + '}';
    }
    
}

