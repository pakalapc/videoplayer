/**
 * This is the primary class to start the application
 *
 * @author Chandni
 */
public class App {
    /**
     * The main method
     * @param args Command-line arguments (unused)
     */
    public static void main(String args[]){

        //Get the database credentials from config file
        AppConfig appconfig = new AppConfig();
        String database_name = appconfig.getDatabaseName();
        String database_username = appconfig.getUserName();
        String database_password = appconfig.getPassword();

        //call controller to perform queries.
        Controller c = new Controller();
        c.applogic(database_name, database_username,database_password);
    }
}
