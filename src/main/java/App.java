import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hw1 = (HelloWorld) ctx.getBean("helloWorld");
        HelloWorld hw2 = (HelloWorld) ctx.getBean("helloWorld");

        Cat cat1 = (Cat) ctx.getBean("cat");
        Cat cat2 = (Cat) ctx.getBean("cat");

        System.out.println(hw1 == hw2);   // true
        System.out.println(cat1 == cat2); // false
    }
}