import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(ctx.getBean("database"));
    }
}
