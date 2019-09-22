package com.msym.catalog;

import com.msym.catalog.clothing.Hat;
import com.msym.catalog.repositories.ClothingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CatalogApplication implements CommandLineRunner {

    private ClothingRepository clothingRepository;

    @Autowired
    CatalogApplication(ClothingRepository clothingRepository) {
        this.clothingRepository = clothingRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CatalogApplication.class, args);
    }

    public static Integer menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *                 MENU                 *");
        System.out.println("     ****************************************");
        System.out.println("     1. Add new hat");
        System.out.println("     2. Print all hats");
        System.out.println("     0. Exit");

        Scanner in = new Scanner(System.in);
        Integer w = in.nextInt();
        return w;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer choice = menu();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    Hat hat = new Hat();
                    System.out.println("Type in brand of the hat");
                    String str = scanner.next();
                    hat.setBrand(str);
                    System.out.println("Type in collection of the hat");
                    str = scanner.next();
                    hat.setCollection(str);
                    System.out.println("Type in Catalog Index of the hat");
                    str = scanner.next();
                    hat.setCatalog_indx(str);
                    System.out.println("Type in purchase price(netto) of the hat");
                    Float flt = scanner.nextFloat();
                    hat.setPurch_price_netto(flt);
                    System.out.println("Type in selling price(netto) of the hat");
                    flt = scanner.nextFloat();
                    hat.setSell_price_netto(flt);
                    System.out.println("Type in amount");
                    str = scanner.next();
                    hat.setAmount_left(Integer.parseInt(str));
                    clothingRepository.save(hat);
                    break;
                case 2:
                    List<Hat> list= clothingRepository.findAll();
                    for (Hat x:list){
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
