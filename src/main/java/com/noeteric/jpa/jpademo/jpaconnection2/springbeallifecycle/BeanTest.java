package com.noeteric.jpa.jpademo.jpaconnection2.springbeallifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyBean myBean =  context.getBean(MyBean.class);
        myBean.setAdditionalProperty(" Additional Property ");
        myBean.performTask();
        myBean.customDestroy();
        myBean.customInit();
        myBean.preDestroy();
        myBean.postConstruct();

        context.close();

    }
}
