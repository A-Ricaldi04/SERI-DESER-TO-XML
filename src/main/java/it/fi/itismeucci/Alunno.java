package it.fi.itismeucci;

import java.sql.Date;

public class Alunno {
     String Nome;
     String Cognome;
     Date data=new Date(2022,10,25);
    public Alunno(String n,String x)
    {
        Nome=n;
        Cognome=x;
    }
    public Alunno() {
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getCognome() {
        return Cognome;
    }
    public void setCognome(String cognome) {
        Cognome = cognome;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    
}
