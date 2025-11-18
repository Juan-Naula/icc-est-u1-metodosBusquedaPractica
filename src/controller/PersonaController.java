package controller;

import model.Persona;

public class PersonaController {
    public Persona findByName(Persona[] personas, String name){
        int left = 0;
        int right = personas.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int comparison = personas[mid].getName().compareTo(name);
            if(comparison == 0){
                return personas[mid];
            } else if(comparison < 0){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return null;
    }

    public Persona findByAge(Persona[] personas, int age){
        int izquierda = 0;
        int derecha = personas.length-1;
        
        while (izquierda <= derecha){
            System.out.println("bajo: " + izquierda);
            System.out.println("alto: " + derecha);
            int medio = izquierda + (derecha - izquierda)/2;
            System.out.println("centro: " + medio);
            System.out.println("valorCentro: " + personas[medio].getAge());
            if (personas[medio].getAge() == age) {
                System.out.println("-> Encontrado");
                return personas[medio];
            }

            if (personas[medio].getAge() < age) {
                izquierda = medio + 1;
                System.out.println("-> Derecha");
            } else{
                derecha = medio - 1;
                System.out.println("-> Izquierda");
            }
        }

        return null;
    }
}
