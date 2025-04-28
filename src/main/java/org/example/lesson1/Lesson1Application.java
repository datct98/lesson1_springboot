package org.example.lesson1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.lesson1.entities.Book;
import org.example.lesson1.entities.Recipe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lesson1Application implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World!");
        /*while (true){
            Menu menu = new Menu();
            menu.displayMenu();
        }*/
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("recipe_pho_bo.json");
            /*Type typeBook = new TypeToken<ArrayList<Book>>() {}.getType();
            List<Book> books = gson.fromJson(reader, typeBook);*/
            Recipe recipe = gson.fromJson(reader, Recipe.class);
            System.out.println(recipe);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    public static void main(String[] args) {
        SpringApplication.run(Lesson1Application.class, args);
    }

}
