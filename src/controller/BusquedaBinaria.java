package controller;

import view.ShowConsole;

public class BusquedaBinaria {
    ShowConsole show = new ShowConsole();
    public Integer busquedaBinaria(int[] numeros, int valor){
        int izquierda = 0;
        int derecha = numeros.length-1;
        
        while (izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda)/2;
            if (numeros[medio] == valor) {
                return numeros[medio];
            }

            if (numeros[medio] < valor) {
                izquierda = medio + 1;
            } else{
                derecha = medio - 1;
            }
        }

        return -1;
    }
}
