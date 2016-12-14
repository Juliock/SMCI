/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smci.misc;

import br.com.smci.telas.TelaAlerta;

/**
 *
 * @author julio
 */
public class ListaForms {

    private Nodo inicio;
    private Nodo ultimo;

    public void Lista() {
        inicio = null;
        ultimo = null;
    }

    public void Insert(TelaAlerta form, boolean f) {
        Nodo n = new Nodo();
        n.flag = f;
        n.obj = form;
        n.prox = null;
        n.ant = ultimo;

        if (isEmpty()) {
            inicio = n;
            ultimo = n;
        } else {
            ultimo.prox = n;
            ultimo = n;
        }
    }

    public boolean isEmpty() {
        return inicio == null && ultimo == null;
    }

    public Nodo getNode(int position) {
        Nodo n = inicio;

        for (int i = 0; i < position; i++) {
            n = n.prox;
        }
        
        return n;
    }

    public int Size() {
        Nodo n = inicio;
        int cont = 0;
        
        while (n != null) {
            cont++;
            n = n.prox;
        }
        
        return cont;
    }
    
    public void removeNode(int position) {
        Nodo n = inicio;

        for (int i = 0; i < position; i++) {
            n = n.prox;
        }
        
        if (n.prox != null) {
            n.prox.ant = n.ant;
        }
        
        if (n.ant != null) {
            n.ant.prox = n.prox;
        }
        
        if (n.ant == null && n.prox == null) {
            inicio = null;
            ultimo = null;
        }
    }
}
