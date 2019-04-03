# Practica01
Práctica sobre Abstracción de objetos a clases
ACTIVIDADES POR DESARROLLAR 
1. Describir 10 objetos relacionados a tema de Restaurantes.

Mesero: Un mesero es una persona encargada de dar servicio al cliente. Tiene una identificación, así como un salario y un horario laboral.

Cocinero: Es la persona encargada de cocinar los pedidos solicitados por los clientes a través de la orden del mesero. Tiene una identificación, así como un salario y un horario laboral.

Cocina: Es el objeto usado para cocinar los alimentos, es usada por el cocinero. Tiene marca, número de hornillas, y puede ser a gas o de inducción.

Terreno: es el lugar donde se posiciona el restaurante. Tiene dimensiones, tipo de suelo y permiso municipal.

Cliente: es la persona interesada en comer en el restaurante. Tiene una identificación, así como interés en algún plato y forma de pago.

Gerente: es la persona encargada de organizar a los empleados del restaurante, también vigila que se brinde un buen servicio. Tiene una identificación, así como un salario y un horario laboral.

Mesa: es el objeto donde se posicionan las cartillas, condimentos, servilletas y los platos a servir. Tiene dimensiones, material de composición y un número asignado.

Silla: es el objeto donde se posicionan las posaderas de los clientes. Tiene dimensiones, material de composición y marca.

Vaso: es el objeto donde se vierte el líquido a servir. Tiene dimensiones, material de composición y marca.

Restaurante: es el lugar donde van las personas a alimentarse, el cual esta compuesto por varios empleados y su respectivo jefe. Tiene una dirección, capacidad de clientes y un horario de servicio.
2. De los 10 objetos descritos en el paso 1, abstraer 5 de ellos en clases y diagramarlas con tres atributos y tres métodos mínimo para cada clase (los métodos getter y setter no cuentan).

     

3. Crear un proyecto Java en Netbeans llamado Practica01-SuApellidoNombre y sobre el mismo codificar las 5 clases seleccionadas en java utilizando: atributos, métodos y encapsulamiento con los métodos getters and setters.  En relación a los métodos (comportamientos) estos solo deben ser declarados es decir no se requiere del procedimiento.

Todas las clases y métodos deben contar con la documentación del código fuente. Además, se debe nombrar correctamente las clases, métodos, atributos y/o paquetes según las buenas prácticas de programación de las convenciones de los códigos de java.

Clase Restaurante:
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
}

Clase Cliente:
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
}

Clase Mesero:
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
}

Clase Cocinero:
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
}

Clase Cocina:
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
}
4. Implementar el método toString() en cada clase.

Clase Restaurante:
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

Clase Cliente:
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

Clase Mesero:
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

Clase Cocinero:
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

Clase Cocina:
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

5. Programar una clase principal (tipo main) que permita crear un objeto (instanciar) de cada clase referida en el punto anterior, estableciendo/seteando los datos/valores ingresados por el usuario (usando la clase Scanner) y posterior muestre dicha información del objeto en la consola de Netbeans.

Utilizar las clases System.in y System.out para entrada y salida de datos.

Opcional: Considere crear un menú para poder indicar el objeto a manipular y según la opción setear y mostrar los datos. 

package ec.edu.ups.main;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Cocina;
import ec.edu.ups.clases.Cocinero;
import ec.edu.ups.clases.Mesero;
import ec.edu.ups.clases.Restaurante;
import java.util.Scanner;

/**
 *
 * @author Josze
 */
public class Principal {

    public static void main(String[] args) {
        int opcion;

        Scanner op = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("1. Crear un objeto de tipo Restaurante");
        System.out.println("2. Crear un objeto de tipo Cliente");
        System.out.println("3. Crear un objeto de tipo Mesero");
        System.out.println("4. Crear un objeto de tipo Cocinero");
        System.out.println("5. Crear un objeto de tipo Cocina");
        System.out.println("6. Salir");
        opcion = op.nextInt();
        switch (opcion) {
            case 1:
                Restaurante rest = new Restaurante();

                System.out.println("Ingrese el nombre del restaurante:");
                rest.setNombre(input.nextLine());
                System.out.println("Ingrese la dirección del restaurante:");
                rest.setDireccion(input.nextLine());
                System.out.println("Ingrese el RUC del restaurante:");
                rest.setRuc(input.nextLine());
                System.out.println("Ingrese el horario de atención del restaurante:");
                rest.setHorarioAtencion(input.nextLine());

                System.out.println("Clase: Restaurante");
                System.out.println("Objeto:");
                System.out.println("\tNombre: " + rest.getNombre());
                System.out.println("\tDireccion: " + rest.getDireccion());
                System.out.println("\tRUC: " + rest.getRuc());
                System.out.println("\tHorario de Atención: " + rest.getHorarioAtencion());

                System.out.println("\ntoString():\n" + rest.toString());
                break;
            case 2:
                Cliente cli = new Cliente();

                System.out.println("Ingrese el nombre del cliente:");
                cli.setNombre(input.nextLine());
                System.out.println("Ingrese el número de identificación del cliente:");
                cli.setIdentificacion(input.nextLine());
                System.out.println("Ingrese la forma de pago del cliente:");
                cli.setFormaPago(input.nextLine());

                System.out.println("Clase: Cliente");
                System.out.println("Objeto:");
                System.out.println("\tNombre: " + cli.getNombre());
                System.out.println("\tIdentificación: " + cli.getIdentificacion());
                System.out.println("\tForma de pago: " + cli.getFormaPago());

                System.out.println("\ntoString():\n" + cli.toString());
                break;
            case 3:
                Mesero mese = new Mesero();

                System.out.println("Ingrese el nombre del mesero:");
                mese.setNombre(input.nextLine());
                System.out.println("Ingrese el número de identificación del mesero:");
                mese.setIdentificacion(input.nextLine());
                System.out.println("Ingrese el salario del mesero:");
                mese.setSalario(num.nextDouble());

                System.out.println("Clase: Mesero");
                System.out.println("Objeto:");
                System.out.println("\tNombre: " + mese.getNombre());
                System.out.println("\tIdentificación: " + mese.getIdentificacion());
                System.out.println("\tSalario: " + mese.getSalario());

                System.out.println("\ntoString():\n" + mese.toString());
                break;
            case 4:
                Cocinero coci = new Cocinero();

                System.out.println("Ingrese el nombre del cocinero:");
                coci.setNombre(input.nextLine());
                System.out.println("Ingrese el número de identificación del cocinero:");
                coci.setIdentificacion(input.nextLine());
                System.out.println("Ingrese el salario del cocinero:");
                coci.setSalario(num.nextDouble());

                System.out.println("Clase: Cocinero");
                System.out.println("Objeto:");
                System.out.println("\tNombre: " + coci.getNombre());
                System.out.println("\tIdentificación: " + coci.getIdentificacion());
                System.out.println("\tSalario: " + coci.getSalario());

                System.out.println("\ntoString():\n" + coci.toString());
                break;
            case 5:
                Cocina oven = new Cocina();

                System.out.println("Ingrese la marca de la cocina:");
                oven.setMarca(input.nextLine());
                System.out.println("Ingrese el tipo de cocina:");
                oven.setTipo(input.nextLine());
                System.out.println("Ingrese la cantidad de hornillas de la cocina:");
                oven.setNumHornilla(num.nextInt());

                System.out.println("Clase: Cocina");
                System.out.println("Objeto:");
                System.out.println("\tMarca: " + oven.getMarca());
                System.out.println("\tTipo: " + oven.getTipo());
                System.out.println("\tCantidad de hornillas: " + oven.getNumHornilla());

                System.out.println("\ntoString():\n" + oven.toString());
                break;
            case 6:
                System.out.println("Salió");
                break;
            default:
                System.out.println("Valor fuera de los parámetros");
                break;
        }
    }
}

Prueba en la consola:
 
6. Crear un repositorio en GitHub y subir el código del proyecto de NetBeans. En el archivo README del repositorio debe constar la misma información del informe de resultados de la práctica que se indica en el siguiente punto.

7. Generar informe de los resultados en el formato de prácticas. Debe incluir el desarrollo de cada uno de los puntos antes descritos. Así como también, la evidencia de la correcta ejecución del programa para lo cuál se puede generar fotografías instantáneas del código (pantallazos) y debe incluir conclusiones apropiadas. Finalmente, en el informe se debe incluir la información de GitHub y debe constar la firma digital del estudiante

RESULTADO(S) OBTENIDO(S):
 
CONCLUSIONES: 
•	Domino los modelamientos de aplicaciones de software.
•	Reconozco las clases, sus atributos y métodos, así como las relaciones entre ellas.
RECOMENDACIONES: 
•	Aplicar buenas prácticas de programación
•	Programar según las convenciones de los códigos de Java.

Estudiante:  José André Ramírez Cajamarca


Firma:         ___________________


