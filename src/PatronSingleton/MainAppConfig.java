package PatronSingleton;

public class MainAppConfig {

    public static void main(String[] args) {

        AppConfig config = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();


        config.setServerUrl("http://miapi.com");
        config.setPuerto(8080);
        config.setDatabaseName("miBaseDeDatos");

        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("El puerto del servidor es: " + config.getPuerto());
        System.out.println("Nombre de la Base de Datos: " + config.getDatabaseName());

        System.out.println("config1 y config2 son la misma instancia: " + (config == config2));

    }

}
