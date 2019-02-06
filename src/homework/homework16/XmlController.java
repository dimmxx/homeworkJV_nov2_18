package homework.homework16;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class XmlController {

      public static void writeXML(String filename, Creds creds) throws FileNotFoundException {
        XStream xs = new XStream(new StaxDriver());
        xs.toXML(creds, new FileOutputStream(filename));
    }

    public static Creds readXML(String filename) throws FileNotFoundException {
        XStream xs = new XStream(new DomDriver());
        Creds creds  = new Creds();
        xs.fromXML(new FileInputStream(filename), creds);
        return creds;
    }








}
