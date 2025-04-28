package org.example.lesson1;

import org.example.lesson1.view.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson1Application implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        while (true){
            Menu menu = new Menu();
            menu.displayMenu();
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(Lesson1Application.class, args);
    }

}
