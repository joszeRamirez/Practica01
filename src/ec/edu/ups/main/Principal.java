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
        System.out.println("Elija el valor dentro de los parámetros:");
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
