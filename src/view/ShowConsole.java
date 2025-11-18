package view;

import java.util.Scanner;

import model.Persona;

public class ShowConsole {
    public static void showResult(int resultado, int valorBuscado){
        if (resultado == -1){
            System.out.println("El valor " + valorBuscado + " no fue encontrado en el arreglo.");
        } else{
            System.out.println("El valor " + valorBuscado + " fue encontrado en el arreglo.");
        }
    }

    public static void showPersonResult(Persona persona, String name){
        if (persona == null){
            System.out.println("La persona con nombre " + name + " no fue encontrada en el arreglo.");
        } else{
            System.out.println("La persona con nombre " + name + " fue encontrada en el arreglo.");
        }
    }

    public static void showPersonResultAge(Persona persona, int age){
        if (persona == null){
            System.out.println("La persona con edad " + age + " no fue encontrada en el arreglo.");
        } else{
            System.out.println("La persona con edad " + age + " fue encontrada en el arreglo y se llama: " + persona.getName());
        }
    }

    public static void printArray(Persona[] personas, int izquierda){
        System.out.print("[");
        for (int i = izquierda++; i < personas.length; i++) {
            if (i<personas.length-1) {
                System.out.print(personas[i].getAge() + ", ");
            }
            else{
                System.out.print(personas[i].getAge());
            }
        }
        System.out.println("]");
    }
}
