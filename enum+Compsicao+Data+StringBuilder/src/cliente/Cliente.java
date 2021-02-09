/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Henrique
 */
public class Cliente {
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
    
    private String nome;
    private String email;
    private Date dataNascimento;
    
    public Cliente() {        
    }

    public Cliente(String nome, String email, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return nome + " (" + sdf.format(dataNascimento) + ") - " + email; 
    }
    
        
    
    
}
