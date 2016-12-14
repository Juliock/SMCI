/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smci.threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.smci.telas.TelaPrincipal;

/**
 *
 * @author julio
 */
public class GetTime implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                SetaData();
                SetaHora();
                Thread.sleep(1 * 1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void SetaData() {
        // As linhas abaixo substituem a label lblData pela data atual do sistema
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        TelaPrincipal.lblData.setText(formatador.format(data));
    }

    public void SetaHora() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String hora;
        hora = dateFormat.format(date);
        TelaPrincipal.lblHora.setText(hora);
    }
}
