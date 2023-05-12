package org.example;

import org.example.tires.Bridgestone;
import org.example.tires.Michelin;
import org.example.wheel.CrossStreet;
import org.example.wheel.ReplicaFR;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Michelin michelin1 = new Michelin(205, 40, 17, 15000, "summer", "Michelin", "PILOT SPORT 5", false, false);
        Michelin michelin2 = new Michelin(225, 40, 18, 19000, "summer", "Michelin", "PILOT SPORT 5", false, false);
        Michelin michelin3 = new Michelin(245, 45, 18, 20000, "summer", "Michelin", "PILOT SPORT 5", false, false);
        Michelin michelin4 = new Michelin(195, 70, 15, 14000, "winter", "Michelin", "Agilis Alpin", false, false);
        Michelin michelin5 = new Michelin(175, 65, 14, 12800, "winter", "Michelin", "X-Ice North 3", true, false);
        Michelin michelin6 = new Michelin(295, 30, 20, 28700, "winter", "Michelin", "X-Ice North 3", true, false);
        Michelin michelin7 = new Michelin(245, 35, 20, 24000, "winter", "Michelin", "X-Ice North 3", true, false);
        Michelin michelin8 = new Michelin(255, 45, 19, 58000, "all season", "Michelin", "PILOT SPORT EV", false, true);

        Bridgestone bridgestone7 = new Bridgestone(215, 75, 15, 11430, "all season", "Bridgestone", "DuelerMT674", false, true);
        Bridgestone bridgestone1 = new Bridgestone(235, 75, 17, 17580, "all season", "Bridgestone", "DuelerMT674", false, true);
        Bridgestone bridgestone2 = new Bridgestone(205, 60, 16, 14290, "summer", "Bridgestone", "Turanza ER300", false, false);
        Bridgestone bridgestone3 = new Bridgestone(215, 75, 15, 11430, "summer", "Bridgestone", "Turanza ER300", false, false);
        Bridgestone bridgestone4 = new Bridgestone(245, 35, 20, 21000, "summer", "Bridgestone", "Turanza ER300", false, false);
        Bridgestone bridgestone5 = new Bridgestone(215, 55, 16, 22430, "winter", "Bridgestone", "Blizzak Spike 02 SUV", true, false);
        Bridgestone bridgestone6 = new Bridgestone(215, 60, 17, 23430, "winter", "Bridgestone", "Blizzak Spike 02 SUV", true, false);

        CrossStreet crossStreet1 = new CrossStreet("Cross Street", "Стальные", "CR-19", "5x114.3", 17, 37, 7750, 66);
        CrossStreet crossStreet2 = new CrossStreet("Cross Street", "Стальные", "CR-19", "5x114.3", 16, 37, 7010, 66);
        CrossStreet crossStreet3 = new CrossStreet("Cross Street", "Стальные", "CR-20", "5x114.3", 17, 37, 7750, 66.1F);
        CrossStreet crossStreet4 = new CrossStreet("Cross Street", "Стальные", "CR-20", "5x114.3", 17, 41, 7990, 67.1F);

        ReplicaFR replicaFR1 = new ReplicaFR("Replica FR", "Стальные", "HND486", "5x114.3", 17, 47, 9840, 67.1F);
        ReplicaFR replicaFR2 = new ReplicaFR("Replica FR", "Стальные", "Ki5210", "5x114.3", 16, 50, 9780, 67.1F);
        ReplicaFR replicaFR3 = new ReplicaFR("Replica FR", "Стальные", "HND486", "5x114.3", 16, 43, 9540, 67.1F);

        bridgestone2.nameTires();
        crossStreet2.nameWeels();
        replicaFR3.nameWeels();

        ArrayList<String> arrayModelTire = new ArrayList<>()   //вывод всех моделей на экран
        {{
            add(0,michelin1.modelTire);
            add(1,michelin2.modelTire);
            add(2,michelin3.modelTire);
            add(3,michelin4.modelTire);
            add(4,michelin5.modelTire);
            add(5,michelin6.modelTire);
            add(6,michelin7.modelTire);
            add(7,michelin8.modelTire);
            add(8,bridgestone1.modelTire);
            add(9,bridgestone2.modelTire);
            add(10,bridgestone3.modelTire);
            add(11,bridgestone4.modelTire);
            add(12,bridgestone5.modelTire);
            add(13,bridgestone6.modelTire);
            add(14,bridgestone7.modelTire);
        }};

            int a;                                                                  //вывод всех моделей шин
            arrayModelTire.add("");
            for (a=0;a<arrayModelTire.size();a++){
                /*if (arrayModelTire.get(a).equals(arrayModelTire.get(a)))
                    continue;*/
                    System.out.println(arrayModelTire.get(a));}

        ArrayList<String> arrayModelWeel = new ArrayList<>()                        //вывод всех моделей дисков на экран
        {{
            add(0,crossStreet1.modelWeel);
            add(1,crossStreet2.modelWeel);
            add(2,crossStreet3.modelWeel);
            add(3,crossStreet4.modelWeel);
            add(4,replicaFR1.modelWeel);
            add(5,replicaFR2.modelWeel);
            add(6,replicaFR3.modelWeel);
        }};
            int b;
            arrayModelWeel.add("");
            for (b=0;b<arrayModelWeel.size();b++)/*{
                if (arrayModelWeel.get(b+1).equals(arrayModelWeel.get(b)))
                    continue;*/
                System.out.println(arrayModelWeel.get(b));

        ArrayList<Integer> arrayWidthTire = new ArrayList<>()                        //'array ширины'
        {{
            add(0,michelin1.widthTire);
            add(1,michelin2.widthTire);
            add(2,michelin3.widthTire);
            add(3,michelin4.widthTire);
            add(4,michelin5.widthTire);
            add(5,michelin6.widthTire);
            add(6,michelin7.widthTire);
            add(7,michelin8.widthTire);
            add(8,bridgestone1.widthTire);
            add(9,bridgestone2.widthTire);
            add(10,bridgestone3.widthTire);
            add(11,bridgestone4.widthTire);
            add(12,bridgestone5.widthTire);
            add(13,bridgestone6.widthTire);
            add(14,bridgestone7.widthTire);
        }};

        ArrayList<Integer> arrayProfileTire = new ArrayList<>()                        //array профиль
        {{
            add(0,michelin1.profileTire);
            add(1,michelin2.profileTire);
            add(2,michelin3.profileTire);
            add(3,michelin4.profileTire);
            add(4,michelin5.profileTire);
            add(5,michelin6.profileTire);
            add(6,michelin7.profileTire);
            add(7,michelin8.profileTire);
            add(8,bridgestone1.profileTire);
            add(9,bridgestone2.profileTire);
            add(10,bridgestone3.profileTire);
            add(11,bridgestone4.profileTire);
            add(12,bridgestone5.profileTire);
            add(13,bridgestone6.profileTire);
            add(14,bridgestone7.profileTire);
        }};

        ArrayList<Integer> arrayDiameterTire = new ArrayList<>()                        //вывод всех моделей дисков на экран
        {{
            add(0,michelin1.diameterTire);
            add(1,michelin2.diameterTire);
            add(2,michelin3.diameterTire);
            add(3,michelin4.diameterTire);
            add(4,michelin5.diameterTire);
            add(5,michelin6.diameterTire);
            add(6,michelin7.diameterTire);
            add(7,michelin8.diameterTire);
            add(8,bridgestone1.diameterTire);
            add(9,bridgestone2.diameterTire);
            add(10,bridgestone3.diameterTire);
            add(11,bridgestone4.diameterTire);
            add(12,bridgestone5.diameterTire);
            add(13,bridgestone6.diameterTire);
            add(14,bridgestone7.diameterTire);
        }};

        ArrayList<String> arrayBrandTire = new ArrayList<>()   //вывод всех моделей на экран
        {{
            add(0,michelin1.brandTire);
            add(1,michelin2.brandTire);
            add(2,michelin3.brandTire);
            add(3,michelin4.brandTire);
            add(4,michelin5.brandTire);
            add(5,michelin6.brandTire);
            add(6,michelin7.brandTire);
            add(7,michelin8.brandTire);
            add(8,bridgestone1.brandTire);
            add(9,bridgestone2.brandTire);
            add(10,bridgestone3.brandTire);
            add(11,bridgestone4.brandTire);
            add(12,bridgestone5.brandTire);
            add(13,bridgestone6.brandTire);
            add(14,bridgestone7.brandTire);
        }};

        Scanner size = new Scanner(System.in);                                    //подбор шин по параметрам(фильтр)
        System.out.println("Введите ширину: ");
        int widthTirePerson = size.nextInt();
        System.out.println("Введите высоту профиля: ");
        int profileTirePerson = size.nextInt();
        System.out.println("Введите диаметр: ");
        int diameterTirePerson = size.nextInt();

        int c;
        arrayBrandTire.add("");
        for (c=0;c<arrayModelTire.size();c++){
            if (arrayWidthTire.get(c).equals(widthTirePerson) && (arrayProfileTire.get(c).equals(profileTirePerson)&& (arrayDiameterTire.get(c).equals(diameterTirePerson))))
                System.out.println("Есть совпадения: " + arrayBrandTire.get(c) + " " + arrayModelTire.get(c));}

        //System.out.println(michelin1.michelinArrayList.get());
        //System.out.println(michelin1.allmodels());

    }
}