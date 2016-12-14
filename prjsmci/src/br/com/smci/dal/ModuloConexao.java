/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smci.dal;

import java.sql.*;

/**
 *
 * @author julio
 */
public class ModuloConexao {
    
    //Método responsável por estabelecer a conexão com o banco
    
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //A linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbsdai?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "LedMS.hexFF";
        //Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
    
}
