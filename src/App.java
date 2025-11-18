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

        Persona [] personas = new Persona[] {
            
        };

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.next();
            System.out.print("Ingrese la edad: ");
            edad = scanner.nextInt();
            new Persona(nombre, edad);
            
        }

       
        System.out.print("Ingrese el nombre que quiere buscar: ");
        nombre = scanner.next();

        System.out.println("Busqueda por nombre");
        metodoOrden.sortPersonasByName(personas);
        Persona personaEncontrada = personaController.findByName(personas, nombre);
        show.showPersonResult(personaEncontrada, nombre);

        System.out.print("Ingrese la edad que quiere buscar: ");
        edad = scanner.nextInt();

        System.out.println("Busqueda por edad");
        metodoOrden.sortPersonasByAge(personas);
        Persona personaEncontradaByAge = personaController.findByAge(personas, edad);
        show.showPersonResultAge(personaEncontradaByAge, edad);


    }
}
