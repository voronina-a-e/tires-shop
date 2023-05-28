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

        michelin1.nameTires();                                                  //вывод резины по форме из задания
        replicaFR1.nameDisk();                                                  //вывод диска по форме из задания

        Shop shop = new Shop();                                                 //создание объекта shop

        shop.addAllProduct(michelin1);              // Добавление объектов в единый arrayList-allProduct через shop
        shop.addAllProduct(michelin2);
        shop.addAllProduct(michelin3);
        shop.addAllProduct(michelin4);
        shop.addAllProduct(michelin5);
        shop.addAllProduct(michelin6);
        shop.addAllProduct(michelin7);
        shop.addAllProduct(michelin8);
        shop.addAllProduct(bridgestone1);
        shop.addAllProduct(bridgestone2);
        shop.addAllProduct(bridgestone3);
        shop.addAllProduct(bridgestone4);
        shop.addAllProduct(bridgestone5);
        shop.addAllProduct(bridgestone6);
        shop.addAllProduct(bridgestone7);
        shop.addAllProduct(crossStreet1);
        shop.addAllProduct(crossStreet2);
        shop.addAllProduct(crossStreet3);
        shop.addAllProduct(crossStreet4);
        shop.addAllProduct(replicaFR1);
        shop.addAllProduct(replicaFR2);
        shop.addAllProduct(replicaFR3);

        System.out.println(shop.getAllProductArrayList().size());         //показать количество всех имеющихся объектов(товаров)
        shop.showAllProductArrayList();                                   //вывести все товары циклом

        shop.addModelProduct(michelin1.getModelMichelin());               //добавление всех моделей шин и дисков в HashSet
        shop.addModelProduct(michelin2.getModelMichelin());
        shop.addModelProduct(michelin3.getModelMichelin());
        shop.addModelProduct(michelin4.getModelMichelin());
        shop.addModelProduct(michelin5.getModelMichelin());
        shop.addModelProduct(michelin6.getModelMichelin());
        shop.addModelProduct(michelin7.getModelMichelin());
        shop.addModelProduct(michelin8.getModelMichelin());
        shop.addModelProduct(bridgestone1.getModelBridgestone());
        shop.addModelProduct(bridgestone2.getModelBridgestone());
        shop.addModelProduct(bridgestone3.getModelBridgestone());
        shop.addModelProduct(bridgestone4.getModelBridgestone());
        shop.addModelProduct(bridgestone5.getModelBridgestone());
        shop.addModelProduct(bridgestone6.getModelBridgestone());
        shop.addModelProduct(bridgestone7.getModelBridgestone());
        shop.addModelProduct(crossStreet1.getModelCrossStreet());
        shop.addModelProduct(crossStreet2.getModelCrossStreet());
        shop.addModelProduct(crossStreet3.getModelCrossStreet());
        shop.addModelProduct(crossStreet4.getModelCrossStreet());
        shop.addModelProduct(replicaFR1.getModelReplicaFR());
        shop.addModelProduct(replicaFR2.getModelReplicaFR());
        shop.addModelProduct(replicaFR3.getModelReplicaFR());

        //shop.showAllModelProduct();                              //вызов всех моделей шин и дисков без повторений по ТЗ

        shop.addWidthTyre(michelin1.getWidthMichelin());                //добавление ширины в widthTyreArrayList
        shop.addWidthTyre(michelin2.getWidthMichelin());
        shop.addWidthTyre(michelin3.getWidthMichelin());
        shop.addWidthTyre(michelin4.getWidthMichelin());
        shop.addWidthTyre(michelin5.getWidthMichelin());
        shop.addWidthTyre(michelin6.getWidthMichelin());
        shop.addWidthTyre(michelin7.getWidthMichelin());
        shop.addWidthTyre(michelin8.getWidthMichelin());
        shop.addWidthTyre(bridgestone1.getWidthBridgestone());
        shop.addWidthTyre(bridgestone2.getWidthBridgestone());
        shop.addWidthTyre(bridgestone3.getWidthBridgestone());
        shop.addWidthTyre(bridgestone4.getWidthBridgestone());
        shop.addWidthTyre(bridgestone5.getWidthBridgestone());
        shop.addWidthTyre(bridgestone6.getWidthBridgestone());
        shop.addWidthTyre(bridgestone7.getWidthBridgestone());

        shop.addProfileTyre(michelin1.getProfileMichelin());                //добавление профиля в profileTyreArrayList
        shop.addProfileTyre(michelin2.getProfileMichelin());
        shop.addProfileTyre(michelin3.getProfileMichelin());
        shop.addProfileTyre(michelin4.getProfileMichelin());
        shop.addProfileTyre(michelin5.getProfileMichelin());
        shop.addProfileTyre(michelin6.getProfileMichelin());
        shop.addProfileTyre(michelin7.getProfileMichelin());
        shop.addProfileTyre(michelin8.getProfileMichelin());
        shop.addProfileTyre(bridgestone1.getProfileBridgestone());
        shop.addProfileTyre(bridgestone2.getProfileBridgestone());
        shop.addProfileTyre(bridgestone3.getProfileBridgestone());
        shop.addProfileTyre(bridgestone4.getProfileBridgestone());
        shop.addProfileTyre(bridgestone5.getProfileBridgestone());
        shop.addProfileTyre(bridgestone6.getProfileBridgestone());
        shop.addProfileTyre(bridgestone7.getProfileBridgestone());

        shop.addDiameterTyre(michelin1.getDiameterMichelin());         //добавление диаметра в diameterTyreArrayList
        shop.addDiameterTyre(michelin2.getDiameterMichelin());
        shop.addDiameterTyre(michelin3.getDiameterMichelin());
        shop.addDiameterTyre(michelin4.getDiameterMichelin());
        shop.addDiameterTyre(michelin5.getDiameterMichelin());
        shop.addDiameterTyre(michelin6.getDiameterMichelin());
        shop.addDiameterTyre(michelin7.getDiameterMichelin());
        shop.addDiameterTyre(michelin8.getDiameterMichelin());
        shop.addDiameterTyre(bridgestone1.getDiameterBridgestone());
        shop.addDiameterTyre(bridgestone2.getDiameterBridgestone());
        shop.addDiameterTyre(bridgestone3.getDiameterBridgestone());
        shop.addDiameterTyre(bridgestone4.getDiameterBridgestone());
        shop.addDiameterTyre(bridgestone5.getDiameterBridgestone());
        shop.addDiameterTyre(bridgestone6.getDiameterBridgestone());
        shop.addDiameterTyre(bridgestone7.getDiameterBridgestone());

        //shop.scannerTyre();                                       //фильтр. Подбор размерности по ТЗ

        Basket basket = new Basket();

        basket.addProductBasket(michelin1);                         // добавление товароа в корзину
        basket.addProductBasket(bridgestone1);
        basket.addProductBasket(michelin3);
        basket.addProductBasket(replicaFR3);
        System.out.println(basket.productInBasket.size());          // проверка кол-ва товаров в корзине
        System.out.println(basket.productInBasket);                 // вывод на экран

        basket.deliteProductBasket(1);                       // удаление выборочного товара из корзины
        System.out.println(basket.productInBasket.size());          // проверка размера корзины
        System.out.println(basket.productInBasket);                 // вывод на экран товара

        basket.clearProductBasket();                                //удаление всех товаров из корзины
        System.out.println(basket.productInBasket.size());          //проверка кол-ва товаров в корзине

        basket.addProductBasket(michelin1);
        basket.addProductBasket(michelin1);
        System.out.println(basket.productInBasket);

        //shop.addScannerBasket();
        //System.out.println(shop.basket2);

//      basket.listProduct(nameTyre,widthTireArrayList,profileTireArrayList, diameterTireArrayList);    //подбор и добавление.

        //shop.addProductInTyreArrayList();

        //shop.addDiskArrayList();
        //System.out.println("всего дисков в списке :" + shop.getDiskArrayList().size());
        //System.out.println(shop.getDiskArrayList());
    }
}

//        System.out.println("кол-во данных по ширине: "+ shop.getWidthTyreArrayList().size());         //размер WidthTyreArrayList
//                System.out.println("кол-во данных по профилю: "+ shop.getProfileTyreArrayList().size());      //размер ProfileTyreArrayList
//                System.out.println("кол-во данных по диаметру: "+ shop.getDiameterTyreArrayList().size());    //размер DiameterTyreArrayList

//    ArrayList<String> listModelArrayList = new ArrayList<>(){{
//        add(michelin1.getModelMichelin());
//        add(michelin2.getModelMichelin());
//        add(michelin3.getModelMichelin());
//        add(michelin4.getModelMichelin());
//        add(michelin5.getModelMichelin());
//        add(michelin6.getModelMichelin());
//        add(michelin7.getModelMichelin());
//        add(michelin8.getModelMichelin());
//        add(bridgestone1.getModelBridgestone());
//        add(bridgestone2.getModelBridgestone());
//        add(bridgestone3.getModelBridgestone());
//        add(bridgestone4.getModelBridgestone());
//        add(bridgestone5.getModelBridgestone());
//        add(bridgestone6.getModelBridgestone());
//        add(bridgestone7.getModelBridgestone());
//    }};
//
//        System.out.println(listModelArrayList.size());                 //кол-во моделей в
//                shop.listModelArrayList(listModelArrayList);           //отображение всех моделей с повторением
//        ArrayList<String> arrayModelTire = new ArrayList<>()              //вывод всех моделей на экран
//        {{
//            add(0,michelin1.getModelTire());
//            add(1,michelin2.modelTire);
//            add(2,michelin3.modelTire);
//            add(3,michelin4.modelTire);
//            add(4,michelin5.modelTire);
//            add(5,michelin6.modelTire);
//            add(6,michelin7.modelTire);
//            add(7,michelin8.modelTire);
//            add(8,bridgestone1.modelTire);
//            add(9,bridgestone2.modelTire);
//            add(10,bridgestone3.modelTire);
//            add(11,bridgestone4.modelTire);
//            add(12,bridgestone5.modelTire);
//            add(13,bridgestone6.modelTire);
//            add(14,bridgestone7.modelTire);
//        }};
//
//            int a;                                                                  //вывод всех моделей шин
//            arrayModelTire.add("");
//            for (a=0;a<arrayModelTire.size();a++){
//                    System.out.println(arrayModelTire.get(a));}
//
//        ArrayList<String> arrayModelDisk = new ArrayList<>()                        //вывод всех моделей дисков на экран
//        {{
//            add(0,crossStreet1.modelDisk);
//            add(1,crossStreet2.modelDisk);
//            add(2,crossStreet3.modelDisk);
//            add(3,crossStreet4.modelDisk);
//            add(4,replicaFR1.modelDisk);
//            add(5,replicaFR2.modelDisk);
//            add(6,replicaFR3.modelDisk);
//        }};
//            int b;
//            arrayModelDisk.add("");
//            for (b=0;b<arrayModelDisk.size();b++)/*{
//                if (arrayModelDisk.get(b+1).equals(arrayModelDisk.get(b)))
//                    continue;*/
//                System.out.println(arrayModelDisk.get(b));
//

//        shop.addHashSetModelTyre(michelin1);
//        shop.addHashSetModelTyre(michelin2);
//        shop.addHashSetModelTyre(michelin3);
//        shop.addHashSetModelTyre(michelin4);
//        shop.addHashSetModelTyre(michelin5);
//        shop.addHashSetModelTyre(michelin6);
//        shop.addHashSetModelTyre(michelin7);
//        shop.addHashSetModelTyre(michelin8);
//        shop.addHashSetModelTyre(bridgestone1);
//        shop.addHashSetModelTyre(bridgestone2);
//        shop.addHashSetModelTyre(bridgestone3);
//        shop.addHashSetModelTyre(bridgestone4);
//        shop.addHashSetModelTyre(bridgestone5);
//        shop.addHashSetModelTyre(bridgestone6);
//        shop.addHashSetModelTyre(bridgestone7);


//          shop.addArrayListTyre(michelin1);                                     //загрузка объектов в ArrayListTyre
//          shop.addArrayListTyre(michelin2);
//          shop.addArrayListTyre(michelin3);
//          shop.addArrayListTyre(michelin4);
//          shop.addArrayListTyre(bridgestone1);
//          shop.addArrayListTyre(bridgestone5);
//          shop.addArrayListDisk(crossStreet1);
//          shop.addArrayListDisk(crossStreet2);
//          shop.addArrayListDisk(crossStreet3);
//          shop.addArrayListDisk(crossStreet4);


//    public ArrayList<Disk> arrayListDisk = new ArrayList<>();
//    public void addArrayListDisk(Disk disk) {                       //метод, добавляющий объекты в ArrayListTyre
//        this.arrayListDisk.add(disk);
//    }

//        HashSet<String> allModel = new HashSet<>(){{
//            add(michelin1.getModelMichelin());
//            add(michelin2.getModelMichelin());
//            add(michelin3.getModelMichelin());
//            add(michelin4.getModelMichelin());
//            add(michelin5.getModelMichelin());
//            add(michelin6.getModelMichelin());
//            add(michelin7.getModelMichelin());
//            add(michelin8.getModelMichelin());
//            add(bridgestone1.getModelBridgestone());
//            add(bridgestone2.getModelBridgestone());
//            add(bridgestone3.getModelBridgestone());
//            add(bridgestone4.getModelBridgestone());
//            add(bridgestone5.getModelBridgestone());
//            add(bridgestone6.getModelBridgestone());
//            add(bridgestone7.getModelBridgestone());
//        }};
//
//        shop.allModelHashSet(allModel);                                         //вызов всех моделей без повторений

//    ArrayList<Integer> widthTireArrayList = new ArrayList<>()                       //array ширина
//    {{
//        add(0,michelin1.getWidthMichelin());
//        add(1,michelin2.getWidthMichelin());
//        add(2,michelin3.getWidthMichelin());
//        add(3,michelin4.getWidthMichelin());
//        add(4,michelin5.getWidthMichelin());
//        add(5,michelin6.getWidthMichelin());
//        add(6,michelin7.getWidthMichelin());
//        add(7,michelin8.getWidthMichelin());
//        add(8,bridgestone1.getWidthBridgestone());
//        add(9,bridgestone2.getWidthBridgestone());
//        add(10,bridgestone3.getWidthBridgestone());
//        add(11,bridgestone4.getWidthBridgestone());
//        add(12,bridgestone5.getWidthBridgestone());
//        add(13,bridgestone6.getWidthBridgestone());
//        add(14,bridgestone7.getWidthBridgestone());
//    }};
//    ArrayList<Integer> profileTireArrayList = new ArrayList<>()                      //array профиль
//    {{
//        add(michelin1.getProfileMichelin());
//        add(michelin2.getProfileMichelin());
//        add(michelin3.getProfileMichelin());
//        add(michelin4.getProfileMichelin());
//        add(michelin5.getProfileMichelin());
//        add(michelin6.getProfileMichelin());
//        add(michelin7.getProfileMichelin());
//        add(michelin8.getProfileMichelin());
//        add(bridgestone1.getProfileBridgestone());
//        add(bridgestone2.getProfileBridgestone());
//        add(bridgestone3.getProfileBridgestone());
//        add(bridgestone4.getProfileBridgestone());
//        add(bridgestone5.getProfileBridgestone());
//        add(bridgestone6.getProfileBridgestone());
//        add(bridgestone7.getProfileBridgestone());
//    }};
//    ArrayList<Integer> diameterTireArrayList = new ArrayList<>()                     //array diameterTireArrayList
//    {{
//        add(michelin1.getDiameterMichelin());
//        add(michelin2.getDiameterMichelin());
//        add(michelin3.getDiameterMichelin());
//        add(michelin4.getDiameterMichelin());
//        add(michelin5.getDiameterMichelin());
//        add(michelin6.getDiameterMichelin());
//        add(michelin7.getDiameterMichelin());
//        add(michelin8.getDiameterMichelin());
//        add(bridgestone1.getDiameterBridgestone());
//        add(bridgestone2.getDiameterBridgestone());
//        add(bridgestone3.getDiameterBridgestone());
//        add(bridgestone4.getDiameterBridgestone());
//        add(bridgestone5.getDiameterBridgestone());
//        add(bridgestone6.getDiameterBridgestone());
//        add(bridgestone7.getDiameterBridgestone());
//    }};
//ArrayList<String> nameTyre = new ArrayList<>(){{
//    add(michelin1.getBrandMichelin() + " " + michelin1.getModelMichelin() + " " + michelin1.getWidthMichelin()+ "/" + michelin1.getProfileMichelin() + "/" + michelin1.getDiameterMichelin() + "стоимостью: " + michelin1.getPriceMichelin() + "руб.");
//    add(michelin2.getBrandMichelin() + " " +  michelin2.getModelMichelin()+ " " +michelin2.getWidthMichelin()+ "/" +michelin2.getProfileMichelin() + "/" + michelin2.getDiameterMichelin()+ "стоимостью: " + michelin2.getPriceMichelin() + "руб.");
//    add(michelin3.getBrandMichelin() + " " + michelin3.getModelMichelin()+ " " +michelin3.getWidthMichelin() + "/" + michelin3.getProfileMichelin() + "/" + michelin3.getDiameterMichelin()+ " стоимостью: " + michelin3.getPriceMichelin() + "руб.");
//    add(michelin4.getBrandMichelin() + " " + michelin4.getModelMichelin() + " " + michelin4.getWidthMichelin()+ "/" + michelin4.getProfileMichelin() + "/" + michelin4.getDiameterMichelin()+ " стоимостью: " + michelin4.getPriceMichelin() + "руб.");
//    add(michelin5.getBrandMichelin() + " " +  michelin5.getModelMichelin()+ " " +michelin5.getWidthMichelin()+ "/" +michelin5.getProfileMichelin() + "/" + michelin5.getDiameterMichelin()+ " стоимостью: " + michelin5.getPriceMichelin() + "руб.");
//    add(michelin6.getBrandMichelin() + " " + michelin6.getModelMichelin()+ " " +michelin6.getWidthMichelin() + "/" + michelin6.getProfileMichelin() + "/" + michelin6.getDiameterMichelin()+ " стоимостью: " + michelin6.getPriceMichelin() + "руб.");
//    add(michelin7.getBrandMichelin() + " " + michelin7.getModelMichelin() + " " + michelin7.getWidthMichelin()+ "/" + michelin7.getProfileMichelin() + "/" + michelin7.getDiameterMichelin()+ " стоимостью: " + michelin7.getPriceMichelin() + "руб.");
//    add(michelin8.getBrandMichelin() + " " +  michelin8.getModelMichelin()+ " " +michelin8.getWidthMichelin()+ "/" +michelin8.getProfileMichelin() + "/" + michelin8.getDiameterMichelin()+ " стоимостью: " + michelin8.getPriceMichelin() + "руб.");
//    add(bridgestone1.getBrandBridgestone() + " " + bridgestone1.getModelBridgestone()+ " " +bridgestone1.getWidthBridgestone() + "/" + bridgestone1.getProfileBridgestone() + "/" + bridgestone1.getDiameterBridgestone() + " стоимостью: " + bridgestone1.getPriceBridgestone() +"руб.");
//    add(bridgestone2.getBrandBridgestone() + " " + bridgestone2.getModelBridgestone()+ " " +bridgestone2.getWidthBridgestone() + "/" + bridgestone2.getProfileBridgestone() + "/" + bridgestone2.getDiameterBridgestone()+ " стоимостью: " + bridgestone2.getPriceBridgestone() +"руб.");
//    add(bridgestone3.getBrandBridgestone() + " " + bridgestone3.getModelBridgestone()+ " " +bridgestone3.getWidthBridgestone() + "/" + bridgestone3.getProfileBridgestone() + "/" + bridgestone3.getDiameterBridgestone()+ " стоимостью: " + bridgestone3.getPriceBridgestone() +"руб.");
//    add(bridgestone4.getBrandBridgestone() + " " + bridgestone4.getModelBridgestone()+ " " +bridgestone4.getWidthBridgestone() + "/" + bridgestone4.getProfileBridgestone() + "/" + bridgestone4.getDiameterBridgestone()+ " стоимостью: " + bridgestone4.getPriceBridgestone() +"руб.");
//    add(bridgestone5.getBrandBridgestone() + " " + bridgestone5.getModelBridgestone()+ " " +bridgestone5.getWidthBridgestone() + "/" + bridgestone5.getProfileBridgestone() + "/" + bridgestone5.getDiameterBridgestone()+ " стоимостью: " + bridgestone5.getPriceBridgestone() +"руб.");
//    add(bridgestone6.getBrandBridgestone() + " " + bridgestone6.getModelBridgestone()+ " " +bridgestone6.getWidthBridgestone() + "/" + bridgestone6.getProfileBridgestone() + "/" + bridgestone6.getDiameterBridgestone()+ " стоимостью: " + bridgestone6.getPriceBridgestone() +"руб.");
//    add(bridgestone7.getBrandBridgestone() + " " + bridgestone7.getModelBridgestone()+ " " +bridgestone7.getWidthBridgestone() + "/" + bridgestone7.getProfileBridgestone() + "/" + bridgestone7.getDiameterBridgestone()+ " стоимостью: " + bridgestone7.getPriceBridgestone() +"руб.");
//}};
//
//        shop.nameTyreArrayList(nameTyre);                        //вывод всего ассортимента циклом из nameTyre ArrayList(кривая альтетрнатива)