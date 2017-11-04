/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugueltraje;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Classe que realiza a conexão com o banco de dados e faz as operações
 * básicas de cadastro.
 * 
 * @author Yuri
 */
public final class MySQL {
    
    public Connection c;
    public Statement st;
    public ResultSet rs;
    
    private String __ip = "localhost";
    private int __port = 3306;
    private String __database = "alugueltraje";
    private String __user = "root";
    private String __password = "root";
    
    private String __query;
    
    public MySQL() {
        try {
            String url = "jdbc:mysql://" + __ip + ":" + __port + "/" + __database + "?user=" + __user + "&password=" + __password + "";
            c = (Connection) DriverManager.getConnection(url);
            rs = null;
        } catch (Exception e) {}
    }
    
    public boolean add(Principal principal) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean view(Principal principal) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean edit(Principal principal) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(Principal principal) {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ResultSet search(String search) {
        ResultSet rs = null;
        
        try {
            Statement st = (Statement) c.createStatement();
            rs = st.executeQuery(search);
        } catch (Exception e) {}
        
        return rs;
    }
}
