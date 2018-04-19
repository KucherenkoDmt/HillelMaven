import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream stream = Main.class.getResourceAsStream("/config.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(
        properties.getProperty("driverType")
        );
    }
}
