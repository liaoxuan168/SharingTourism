package tourism.base.loadconfig;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.io.IOException;
import java.util.Properties;

/**
 * @author liaoxuan
 * @date 2018-4-2-0002.
 */
public class MyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    public Properties getProperties() throws IOException {
        return mergeProperties();
    }
}
