package org.springkurs.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springkurs.beans.Vehicle;
import org.springkurs.config.ProjectConfig;

public class Main {

    public static void main(String[] args) {
        Vehicle pojoVehicle = new Vehicle();
        pojoVehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is " + pojoVehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle sprintBeanVehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is " + sprintBeanVehicle.getName());

        System.out.println("String  value from spring context is " + context.getBean(String.class));
        System.out.println("Integer value from spring context is " + context.getBean(Integer.class));

    }
}