package com.msym.catalog;

import com.msym.catalog.clothing.Hat;
import com.msym.catalog.clothing.Shirt;
import com.msym.catalog.repositories.HatsRepository;
import com.msym.catalog.services.HatService;
import com.msym.catalog.services.ShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CatalogApplication implements CommandLineRunner {

    private HatService hatService;
    private ShirtService shirtService;
    @Autowired
    CatalogApplication(HatService hatService, ShirtService shirtService) {
        this.hatService = hatService;
        this.shirtService = shirtService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CatalogApplication.class, args);
    }

    public static Integer menu() {
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Add new hat");
        System.out.println("     2. Add new shirt");
        System.out.println("     3. Show all hats");
        System.out.println("     4. Show all shirts");
        System.out.println("     0. Exit");

        Scanner in = new Scanner(System.in);
        Integer w = in.nextInt();
        return w;
    }

    @Override
    public void run(String... args) throws Exception {

        //simple testing menu
        Scanner scanner = new Scanner(System.in);
        Integer choice = menu();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    Hat hat = new Hat();
                    System.out.println("Type in brand of the hat");
                    hat.setBrand(scanner.next());
                    System.out.println("Type in collection of the hat");
                    hat.setCollection(scanner.next());
                    System.out.println("Type in Catalog Index of the hat");
                    hat.setCatalog_indx(scanner.next());
                    System.out.println("Type in purchase price(netto) of the hat");
                    hat.setPurch_price_netto(scanner.nextFloat());
                    System.out.println("Type in selling price(netto) of the hat");
                    hat.setSell_price_netto(scanner.nextFloat());
                    System.out.println("Type in amount");
                    hat.setAmount_left(Integer.parseInt(scanner.next()));
                    hatService.saveHat(hat);
                    break;
                case 2:
                    Shirt shirt= new Shirt();
                    System.out.println("Type in brand of the shirt");
                    shirt.setBrand(scanner.next());
                    System.out.println("Type in collection of the shirt");
                    shirt.setCollection(scanner.next());
                    System.out.println("Type in Catalog Index of the shirt");
                    shirt.setCatalog_indx(scanner.next());
                    System.out.println("Type in purchase price(netto) of the shirt");
                    shirt.setPurch_price_netto(scanner.nextFloat());
                    System.out.println("Type in selling price(netto) of the shirt");
                    shirt.setSell_price_netto(scanner.nextFloat());
                    System.out.println("Type in amount");
                    shirt.setAmount_left(Integer.parseInt(scanner.next()));
                    System.out.println("Is shirt longsleeve? true/false");
                    shirt.setLongSleeve(scanner.nextBoolean());
                    shirtService.saveShirt(shirt);
                    break;
                case 3:
                    for (Hat x : hatService.findAll()) {
                        System.out.println(x);
                    }
                    break;
                case 4:
                    for (Shirt x : shirtService.findAll()) {
                        System.out.println(x);
                    }
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
            choice = menu();

        }
    }
}
