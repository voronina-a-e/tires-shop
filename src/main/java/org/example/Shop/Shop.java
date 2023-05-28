package org.example.Shop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Shop {

    private ArrayList<Object> allProductArrayList = new ArrayList<>();                   //arrayList, содержащий все товары

    public void addAllProduct(Object object) {
        this.allProductArrayList.add(object);
    }  //метод, добавляющий все объекты в allProduct

    public ArrayList<Object> getAllProductArrayList() {
        return allProductArrayList;
    }   //геттер для allProductArrayList

    public void showAllProductArrayList() {
        int a;
        for (a = 0; a < this.allProductArrayList.size(); a++)
            System.out.println(this.allProductArrayList.get(a));
    }

    public HashSet<Object> allModelProduct = new HashSet<>();

    public void addModelProduct(Object object) {
        this.allModelProduct.add(object);
    }

    public void showAllModelProduct() {
        System.out.println("В магазине имеется " + allModelProduct.size() + " моделей шин и дисков: ");
        for (Object iterator : this.allModelProduct) {
            System.out.println(iterator);
        }
    }

    private ArrayList<Integer> widthTyreArrayList = new ArrayList<>();

    public void addWidthTyre(int width) {
        this.widthTyreArrayList.add(width);
    }

    public ArrayList<Integer> getWidthTyreArrayList() {
        return widthTyreArrayList;
    }

    private ArrayList<Integer> profileTyreArrayList = new ArrayList<>();

    public void addProfileTyre(int profile) {
        this.profileTyreArrayList.add(profile);
    }

    public ArrayList<Integer> getProfileTyreArrayList() {
        return profileTyreArrayList;
    }

    private ArrayList<Integer> diameterTyreArrayList = new ArrayList<>();

    public void addDiameterTyre(int diameter) {
        this.diameterTyreArrayList.add(diameter);
    }

    public ArrayList<Integer> getDiameterTyreArrayList() {
        return diameterTyreArrayList;
    }

    public void scannerTyre() {
        Scanner size = new Scanner(System.in);                                    //подбор шин по параметрам(фильтр)
        System.out.println("Введите ширину: ");
        int widthTirePerson = size.nextInt();
        System.out.println("Введите высоту профиля: ");
        int profileTirePerson = size.nextInt();
        System.out.println("Введите диаметр: ");
        int diameterTirePerson = size.nextInt();
        int c;
        for (c = 0; c < this.widthTyreArrayList.size(); c++) {
            if (this.widthTyreArrayList.get(c).equals(widthTirePerson) && (this.profileTyreArrayList.get(c).equals(profileTirePerson) && (this.diameterTyreArrayList.get(c).equals(diameterTirePerson))))
                System.out.println("Есть совпадения: " + allProductArrayList.get(c));
        }
    }

    public ArrayList<Object> basket2 = new ArrayList<>();

    public void addScannerBasket() {
        Scanner size = new Scanner(System.in);                                    //подбор шин по параметрам(фильтр)
        System.out.println("Введите ширину: ");
        int widthTirePerson = size.nextInt();
        System.out.println("Введите высоту профиля: ");
        int profileTirePerson = size.nextInt();
        System.out.println("Введите диаметр: ");
        int diameterTirePerson = size.nextInt();
        int c;
        for (c = 0; c < this.widthTyreArrayList.size(); c++) {
            if (this.widthTyreArrayList.get(c).equals(widthTirePerson) && (this.profileTyreArrayList.get(c).equals(profileTirePerson) && (this.diameterTyreArrayList.get(c).equals(diameterTirePerson)))) {
                System.out.println("Есть совпадения: " + allProductArrayList.get(c));
                Scanner addBasket = new Scanner(System.in);
                System.out.println("Добавить в корзину?\nвведите: \"да\", если хотите добавить товар в корзину: " + allProductArrayList.get(c));
                String response = addBasket.nextLine();
                    if (response.equalsIgnoreCase("да")) {
                    basket2.add(allProductArrayList.get(c));
                    //TODO перенести эту функцию в basket  и обратиться к al sHOP?
                    System.out.println("Товар: " + allProductArrayList.get(c) + " успешно добавлен в корзину");
                    }
            }
        }
    }
}


//    public void allModelHashSet(HashSet<String> model){                 //метод, показывающий все модели без повторений
//        System.out.println("В магазине имеются следующие модели шин: ");
//        for (String str: model){
//            System.out.println(str);}
//    }

//    public void nameTyreArrayList(ArrayList<String> nameTyre){          //альтернативный метод, отображащий список всех шин
//        int a;
//        for(a=0;a<nameTyre.size();a++){
//            System.out.println(nameTyre.get(a));}
//    }


//        private ArrayList<Tire> tyreArrayList = new ArrayList<>();
//        public ArrayList<Tire> getShopArrayList() {
//                return tyreArrayList;
//        }
//
//        public void addTireToShop(Tire tyre) {
//                this.tyreArrayList.add(tyre);
//       }


//            public String toString() {                                                //переопределение
//                int a;
//                for (a = 0; arrayListBrandTyre.size() > a; a++)
//                    System.out.println(arrayListBrandTyre.get(a));
//                return arrayListBrandTyre.get(a).toString();
//            }


//        public void allBrands(){
//                int a;
//                for(a=0; a<arrayListBrandTyre.size();a++)
//                        System.out.println(arrayListBrandTyre.get(a));
//        }
//

//
//        public void allBrands(){
//                for(it:this.allBrandsSet) {
//                        System.out.println(it); //почему it красным?
//                }
//        }

/*3. Пользователь добавляет товар в корзину(enum). 4. Пользователь удаляет товар из корзины.

 */
////        private ArrayList<Tire> tyreArrayList = new ArrayList<>();
////        public ArrayList<Tire> getShopArrayList() {
////                return tyreArrayList;
////        }
//
//        public void addTireToShop(Tire tyre) {
//                this.tyreArrayList.add(tyre);
//       }


//    public ArrayList<Tire> arrayListTyre = new ArrayList<>();                   //создаем ArrayListTyre
//
//    public void addArrayListTyre(Tire tyre) {                       //метод, добавляющий объекты в ArrayListTyre
//                this.arrayListTyre.add(tyre);
//    }       //добавляем шины

//    public ArrayList<Disk> arrayListDisk = new ArrayList<>();
//    public void addArrayListDisk(Disk disk) {                       //метод, добавляющий объекты в ArrayListTyre
//        this.arrayListDisk.add(disk);
//    }


//    public void listModelArrayList(ArrayList<String> model){        //метод, отображащий список моделей по всем товарам
//        int a;
//        for(a=0;a<model.size();a++){
//            System.out.println(model.get(a));}
//    }

//    public void scanner(ArrayList<String> nameTyre,ArrayList<Integer> arrayWidthTire, ArrayList<Integer> arrayProfileTire, ArrayList<Integer> arrayDiameterTire) {
//        Scanner size = new Scanner(System.in);                                    //подбор шин по параметрам(фильтр)
//        System.out.println("Введите ширину: ");
//        int widthTirePerson = size.nextInt();
//        System.out.println("Введите высоту профиля: ");
//        int profileTirePerson = size.nextInt();
//        System.out.println("Введите диаметр: ");
//        int diameterTirePerson = size.nextInt();
//
//        int c;
//        for (c = 0; c < nameTyre.size(); c++) {
//            if (arrayWidthTire.get(c).equals(widthTirePerson) && (arrayProfileTire.get(c).equals(profileTirePerson)&& (arrayDiameterTire.get(c).equals(diameterTirePerson))))
//                System.out.println("Есть совпадения: " + nameTyre.get(c));
//        }
//    }

//    public void scannerDisk() {
//        Scanner size = new Scanner(System.in);                                    //подбор дисков по параметрам(фильтр)
//        System.out.println("Введите PCD: ");
//        int widthTirePerson = size.nextInt();
//        System.out.println("Введите диаметр: ");
//        int profileTirePerson = size.nextInt();
//        System.out.println("Введите ET: ");
//        int diameterTirePerson = size.nextInt();
//        int c;
//        for (c = 0; c < this.widthTyreArrayList.size(); c++) {
//            if (this.widthTyreArrayList.get(c).equals(widthTirePerson) && (this.profileTyreArrayList.get(c).equals(profileTirePerson) && (this.diameterTyreArrayList.get(c).equals(diameterTirePerson))))
//                System.out.println("Есть совпадения: " + allProductArrayList.get(c));
//        }
//    }