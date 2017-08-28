import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.JDOMException;
import java.io.IOException;
import java.io.File;

/**
 * AppConfig class is to extract database credentials from config file
 *
 * @author Chandni
 */
public class AppConfig {

    Element config;
    /**
     * constructor AppConfig
     * Extracts the details from config file
     **/
    AppConfig() {
        SAXBuilder builder = new SAXBuilder();
        //traverse the xml doc
        File xmlFile = new File("config.xml");
        try {

            Document document = builder.build(xmlFile);
            config = document.getRootElement();
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
    }

    /**
     * This method is used to fetch the name of the Database from config file
     *
     * @param
     * @return String This returns the database name
     */
    public String getDatabaseName(){
        return config.getChildText("db-name");
    }

    /**
     * This method is used to fetch the user name from config file
     *
     * @param
     * @return: String This returns the user name
     */
    public String getUserName(){
        return config.getChildText("db-username");
    }

    /**
     * This method is used to fetch the password of the user
     *
     * @param
     * @return: String This returns the password
     */
    public String getPassword(){
        return config.getChildText("db-password");
    }

}
