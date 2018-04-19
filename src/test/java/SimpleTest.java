import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SimpleTest {
    @Test
    public void simpleValidation(){
        Assert.assertEquals(7, 4+3);
    }
    @Test
    public void checkThatFierfox(){
        String valueFromProfile;
        Properties properties = new Properties();
        InputStream stream = Main.class.getResourceAsStream("/config.properties");
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        valueFromProfile = properties.getProperty("driverType");
        Assert.assertEquals("fierfox", valueFromProfile);
    }
}
