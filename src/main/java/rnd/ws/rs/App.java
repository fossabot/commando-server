package rnd.ws.rs;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		AnnotationConfigEmbeddedWebApplicationContext appCtx = (AnnotationConfigEmbeddedWebApplicationContext)SpringApplication.run(new Object[] { AppConfig.class, App.class }, args);
		System.out.println("App Context Class : " + appCtx.getClass());
		
		ServletContext servCxt = appCtx.getServletContext();;
		System.out.println("VirtualServerName : " + servCxt.getVirtualServerName());
		System.out.println("ServletContextName : " + servCxt.getServletContextName());
		System.out.println("ServerInfo : " + servCxt.getServerInfo());
        System.out.println("ContextPath : " + servCxt.getContextPath());
        
        EmbeddedServletContainer embServCont = appCtx.getEmbeddedServletContainer();
        System.out.println("Port : " + embServCont.getPort());
        
//        ConfigurableEnvironment env = appCtx.getEnvironment();

//        Map<String, Object> sysEnv = env.getSystemEnvironment();
//        Set<Entry<String, Object>> entrySet = sysEnv.entrySet();
//        for(Entry entry : entrySet) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
        
        
//        Map<String, Object> sysPrp = env.getSystemProperties();
//        Set<Entry<String, Object>> entrySet = sysPrp.entrySet();
//        for(Entry entry : entrySet) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }



		
	}

}