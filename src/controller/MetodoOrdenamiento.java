package controller;

import model.Persona;

public class MetodoOrdenamiento {
    public void sort(int[] numeros){
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j]>numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void sortPersonasByName(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0 ) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    } 

    public static void sortPersonasByAge(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i - 1;
            Persona aux = personas[i];
            while (j >= 0 && aux.getAge() < personas[j].getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux;
        }
    } 
}
