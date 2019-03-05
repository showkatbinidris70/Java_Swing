
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMCreateXMLDemo {

    public static void main(String[] args) throws TransformerConfigurationException {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);

            Element staff = doc.createElement("Staff");
            rootElement.appendChild(staff);

            Attr attr = doc.createAttribute("id");
            attr.setValue("1000");
            staff.setAttributeNode(attr);

            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Showkat"));
            staff.appendChild(firstname);

            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("Ali"));
            staff.appendChild(lastname);

            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("Showkat"));
            staff.appendChild(nickname);

            Element country = doc.createElement("country");
            country.appendChild(doc.createTextNode("Bangladesh"));
            staff.appendChild(country);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ex2.xml"));
            transformer.transform(source, result);
            System.out.println("saved...");
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException ex) {
            Logger.getLogger(DOMCreateXMLDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
