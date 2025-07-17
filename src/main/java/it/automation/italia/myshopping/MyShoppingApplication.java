package it.automation.italia.myshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;

/**
 * Main application class for MyShopping application.
 * Configures Spring Boot and Vaadin theme.
 */
@SpringBootApplication

public class MyShoppingApplication implements AppShellConfigurator {

    /**
     * Main method to start the Spring Boot application
     *
     * @param args Command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(MyShoppingApplication.class, args);
    }
}

