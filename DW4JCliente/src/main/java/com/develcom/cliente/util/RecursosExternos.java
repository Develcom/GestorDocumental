/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.cliente.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 *
 * @author familia
 */
@Component
public class RecursosExternos implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;
    private Properties properties;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void showResourceData() throws IOException {
        //This line will be changed for all versions of other examples
        String appPath = System.getProperties().getProperty("user.dir");
        String archivo = "/recursos/resources.properties";
        Resource banner = resourceLoader.getResource("file:"+appPath+archivo);
        InputStream in = banner.getInputStream();
        
        properties = new Properties();

        properties.load(in);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//        while (true) {
//            String line = reader.readLine();
//            if (line == null) {
//                break;
//            }
//            System.out.println(line);
//        }
//        reader.close();
    }

    public Properties getProperties() {
        return properties;
    }

}
