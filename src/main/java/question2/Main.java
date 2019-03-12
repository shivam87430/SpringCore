package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-config.xml");
        Restaurant restaurant=(Restaurant) ctx.getBean("teaRestaurant");
        System.out.println(restaurant);
        Restaurant restaurant1=(Restaurant) ctx.getBean("teaExpressRestaurant");
        System.out.println(restaurant1);
        Restaurant restaurant2=(Restaurant) ctx.getBean("prepareHotDrink");
        System.out.println("This is through ByName "+ restaurant2);

        Restaurant restaurant3=(Restaurant) ctx.getBean("prepareHotDrink1");
        System.out.println("This is through  ByType "+ restaurant3);

        Restaurant restaurant4=(Restaurant) ctx.getBean("prepareHotDrink2");
        System.out.println("This is through  ByConstructor "+ restaurant4);

        System.out.println(ctx.getBean("complexBean"));
        Restaurant restaurant5=(Restaurant)ctx.getBean("ExpressTeaRestaurant");
        System.out.println(restaurant5.hotDrink);

        Restaurant restaurant6=(Restaurant)ctx.getBean("ExpressTeaRestaurant1");
        System.out.println(restaurant6.hotDrink);
    }
}
