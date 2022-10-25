package it.fi.itismeucci;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class MainDes 
{
    public static void main( String[] args ) throws IOException
    {
    File file = new File("Classe.xml");
    XmlMapper xmlMapper = new XmlMapper();
    Classe value = xmlMapper.readValue(file, Classe.class);
    System.out.println(value.getSezione());
    }
}
