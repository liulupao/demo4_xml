import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class DOMDemo01{

    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        }
        catch (ParserConfigurationException e){
            e.printStackTrace();
        }
        Document doc = null;
        try {
            doc = builder.parse("D:"+ File.separator + "TempSpace"+ File.separator + "Z_java_demo"+ File.separator + "demo4_xml"+ File.separator + "src"+ File.separator + "demo.xml");
        }
        catch (SAXException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        NodeList nl = doc.getElementsByTagName("name");
        System.out.println("姓名： "+ nl.item(0).getFirstChild().getNodeValue());
    }
}


