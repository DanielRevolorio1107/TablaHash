/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablaHash;

import java.util.ArrayList;
import java.util.List;

class TablaHash {
    private static final int cantidadMaxima = 10;
    private List<Nodo> bucket;

    public TablaHash() {
        bucket = new ArrayList<>(cantidadMaxima);
        for (int i = 0; i < cantidadMaxima; i++) {
            bucket.add(null);
        }
    }

    private int obtenerIndice(int clave) {
        return clave % cantidadMaxima;
    }

    public void poner(int clave, int valor) {
        int indice = obtenerIndice(clave);
        Nodo cabeza = bucket.get(indice);
        while (cabeza != null) {
            if (cabeza.clave == clave) {
                cabeza.valor = valor;
                return;
            }
            cabeza = cabeza.siguiente;
        }
        Nodo nuevoNodo = new Nodo(clave, valor);
        nuevoNodo.siguiente = bucket.get(indice);
        bucket.set(indice, nuevoNodo);
    }

    public void mostrarHashMap() {
        for (int i = 0; i < cantidadMaxima; i++) {
            System.out.print("buckets" + i + ": ");
            Nodo cabeza = bucket.get(i);
            while (cabeza != null) {
                System.out.print("(" + cabeza.clave + "," + cabeza.valor + ") ");
                cabeza = cabeza.siguiente;
            }
            System.out.println();
        }
    }
}

