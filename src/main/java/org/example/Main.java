package org.example;

import org.example.Shop.Shop;
import org.example.basket.Basket;
import org.example.wheel.disk.CrossStreet;
import org.example.wheel.disk.ReplicaFR;
import org.example.wheel.tires.Bridgestone;
import org.example.wheel.tires.Michelin;

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

        michelin1.nameTires();                                                  //TODO вывод резины по форме из ТЗ
        replicaFR1.nameDisk();                                                  //TODO вывод диска по форме из ТЗ

        Shop shop = new Shop();                                                 //создание объекта shop

        shop.addTyre(michelin1);                                                //добавление всех шин в allTyreArrayList
        shop.addTyre(michelin2);
        shop.addTyre(michelin3);
        shop.addTyre(michelin4);
        shop.addTyre(michelin5);
        shop.addTyre(michelin6);
        shop.addTyre(michelin7);
        shop.addTyre(michelin8);
        shop.addTyre(bridgestone1);
        shop.addTyre(bridgestone2);
        shop.addTyre(bridgestone3);
        shop.addTyre(bridgestone4);
        shop.addTyre(bridgestone5);
        shop.addTyre(bridgestone6);
        shop.addTyre(bridgestone7);

        shop.showAllTyreArrayList();                                        //TODO показать все шины (ТЗ)

        shop.addDisk(crossStreet1);                                         //добавление всех дисков в allDiskArrayList
        shop.addDisk(crossStreet2);
        shop.addDisk(crossStreet3);
        shop.addDisk(crossStreet4);
        shop.addDisk(replicaFR1);
        shop.addDisk(replicaFR2);
        shop.addDisk(replicaFR3);

        shop.showAllDiskArrayList();                                     //TODO показать все диски(ТЗ)

        shop.createAllProduct();                                            //создаю arrayList со всеми товарами.
        shop.showAllProductArrayList();                                     //демонстрация всего ассортимента

        shop.scannerDisk();                                              //TODO Фильтр. Подбор размерности дисков по ТЗ
        shop.scannerTyre();                                              //TODO Фильтр. Подбор размерности шин по ТЗ

        Basket basket = new Basket();

        basket.addProductBasket(michelin1);                              //TODO добавление товара в корзину(ТЗ)
        basket.addProductBasket(bridgestone1);
        basket.addProductBasket(michelin3);
        basket.addProductBasket(replicaFR3);
        basket.deliteProductBasket(1);                                //TODO удаление товара из корзины(ТЗ)
        //basket.clearProductBasket();                                       //удаление всех товаров из корзины(не тз)
        basket.countFinalPrice();                                            //TODO вывести сумму покупки (ТЗ)
        basket.FinalOrder();                                                 //TODO оформление заказа(ТЗ)

        System.out.println(basket.productInBasket.size());
    }
}
