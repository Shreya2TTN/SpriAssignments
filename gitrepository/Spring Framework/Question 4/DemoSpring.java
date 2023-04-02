package SpringQuestions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpring {
    public static void main(String[] args) {

        ApplicationContext applicationContext= SpringApplication.run(DemoSpring.class,args);
        Question3 q= applicationContext.getBean(Question3.class);
        System.out.println(q);
        int [] array=q.getA();
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
        int a=q.binarySearch(6);
        System.out.println("\nSorted Index "+a);
    }
}
