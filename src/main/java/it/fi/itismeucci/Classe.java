package it.fi.itismeucci;

import java.util.ArrayList;
import java.util.List;

public class Classe {
    int Numero;
    String Sezione;
    String Aula;
    List<Alunno> Alunni = new ArrayList();
    
    public Classe(int numero, String sezione, String aula) {
        Numero = numero;
        Sezione = sezione;
        Aula = aula;
    }
    

    public Classe() {
    }


    public void Aggiungi(Alunno d)
    {
        Alunni.add(d);
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getSezione() {
        return Sezione;
    }

    public void setSezione(String sezione) {
        Sezione = sezione;
    }

    public String getAula() {
        return Aula;
    }

    public void setAula(String aula) {
        Aula = aula;
    }

    public List<Alunno> getAlunni() {
        return Alunni;
    }

    public void setAlunni(List<Alunno> alunni) {
        Alunni = alunni;
    }
    
    
}
