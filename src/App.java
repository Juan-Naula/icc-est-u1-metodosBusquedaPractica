import java.util.Scanner;

import controller.BusquedaBinaria;
import controller.MetodoOrdenamiento;
import controller.PersonaController;
import model.Persona;
import view.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidad;
        String nombre;
        int edad;
        Scanner scanner = new Scanner(System.in);
        ShowConsole show = new ShowConsole();
        BusquedaBinaria busqueda = new BusquedaBinaria();
        MetodoOrdenamiento metodoOrden = new MetodoOrdenamiento();
        PersonaController personaController = new PersonaController();

        System.out.print("Ingrese la cantidad de personas: ");
        cantidad = scanner.nextInt();

        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.next();
            System.out.print("Ingrese la edad: ");
            edad = scanner.nextInt();
            personas[i] = new Persona(nombre, edad);
            
        }

       
        System.out.print("Ingrese el nombre que quiere buscar: ");
        String nombreBuscar = scanner.next();

        System.out.println("Busqueda por nombre");
        metodoOrden.sortPersonasByName(personas);
        Persona personaEncontrada = personaController.findByName(personas, nombreBuscar);
        show.showPersonResult(personaEncontrada, nombreBuscar);

        System.out.print("Ingrese la edad que quiere buscar: ");
        int edadBuscar = scanner.nextInt();

        System.out.println("Busqueda por edad");
        metodoOrden.sortPersonasByAge(personas);
        Persona personaEncontradaByAge = personaController.findByAge(personas, edadBuscar);
        show.showPersonResultAge(personaEncontradaByAge, edadBuscar);


    }
}
