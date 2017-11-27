package java8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

public class LambaTest01 {

    public static void main(String[] args) {
        test03("test");
    }

    public static void test01(String para) {
        //test01
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do" + para);
            }
        }).start();
        //---
        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!" + para)).start();
    }

    public static void test02(String para){
        JButton show = new JButton(para);
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" event handling without lambda expression is boring");
            }
        });

        show.addActionListener((e)->{
            System.out.println("light, camera, action!! lambda expressions rocks");
        });
    }

    public static void test03(String para){
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n-> {
            System.out.println(n);
        });
        features.forEach(System.out::println);
    }
}
