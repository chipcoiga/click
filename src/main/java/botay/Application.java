/**
 * Application class
 * 
 * Version 1.0
 */
package botay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

/**
 * Application provide the entry of application
 * 
 * @author tamvn.ax
 *
 */
@SpringBootApplication()
public class Application {
    public static void main(String args[]) {
        System.out.print("master");
        SpringApplication.run(Application.class, args);
    }
}
