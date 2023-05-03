package Lab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * Spring Boot is an additional project of Spring that enables automatic configuration of the project. It introduces
 * the @SpringBootApplication annotation, which combines the functionality of @ComponentScan, @Configuration,
 * and @EnableAutoConfiguration.
 * Now we can automatically create beans by scanning the package for components. Manually defining beans using
 * the @Bean annotation is not necessary in this class. Spring boot will also introduce an embedded Tomcat server,
 * which will by default run Controllers written in the project, which
 * you can see in the Controller package.
 *
 * Check out the NotebookService class and TimeService class for the code needed to solve the lab.
 *
 * (the 'exclude' portion seen here to prevent Spring Boot from trying to autoconfigure a database connection.)
 *
 * There is no need to change anything in this class.
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Application {
    /**
     * Set up a logfile for convenient logging of our API. When another class uses ArtApplication.log.info, it's
     * actually just referencing this static Object in this class.
     */
    public static Logger log = LogManager.getLogger();

    /**
     * Because Spring Boot has autoconfigured our application for us, the main method only requires a single
     * line: SpringApplication.run. In the future, details regarding the configuration of our project can be placed in
     * the in src/main/java/resources/application.properties.
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
