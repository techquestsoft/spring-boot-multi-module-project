package sample.multimodule;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.orm.jpa.EntityScan;
@SpringBootApplication
public class SampleWebJspApplication 
{
public static void main(String[] args) throws Exception 
{
SpringApplication.run(sample.multimodule.SampleWebJspApplication.class, args);
}
}
