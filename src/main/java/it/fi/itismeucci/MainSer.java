package it.fi.itismeucci;

import java.sql.Date;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class MainSer
{
    public static void main( String[] args ) throws IOException
    {
        Alunno uno=new Alunno("Andrea", "Ricaldi");
        Alunno due=new Alunno("Kia","Picanto");
        Alunno tre=new Alunno("Nissan","Qashqai");
        Alunno quattro=new Alunno("Renault","5");
        Classe ciao=new Classe(5,"BIA","04-TC");
        ciao.Aggiungi(uno);
        ciao.Aggiungi(due);
        ciao.Aggiungi(tre);
        ciao.Aggiungi(quattro);
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(new File("Classe.xml"),ciao);
    }
}
