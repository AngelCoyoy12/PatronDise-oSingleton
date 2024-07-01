package PatronSingleton;

public class AppConfig {
    // Variable estática privada para la única instancia de AppConfig
    private static AppConfig instance;

    // Propiedades de configuración
    private String serverUrl;
    private int puerto;
    private String databaseName;

    private AppConfig() {

    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

}