/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugueltraje;

import alugueltraje.MySQL;
/**
 * Classe principal da rotina de Clientes.
 * @author Yuri
 */
public class Client {
    private String __name;
    private String __email;
    private String __phone;

    public Client(String __name, String __email, String __phone) {
        this.__name = __name;
        this.__email = __email;
        this.__phone = __phone;
    }
    
    public Client() {}

    public String getName() {
        return __name;
    }

    public void setName(String __name) {
        this.__name = __name;
    }

    public String getEmail() {
        return __email;
    }

    public void setEmail(String __email) {
        this.__email = __email;
    }

    public String getPhone() {
        return __phone;
    }

    public void setPhone(String __phone) {
        this.__phone = __phone;
    }
}
