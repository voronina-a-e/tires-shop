package org.example.basket;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Object> productInBasket = new ArrayList<>();                   //корзина arrayList productInBasket
    public void addProductBasket(Object product) {                                  //метод, добавляющий товар в корзину
        productInBasket.add(product);
    }  //TODO как сделать аргумент на выбор?? Можно в условии, но есть ли возможность аргумент не вносить?
    public void deliteProductBasket(int element) {                      //метод, удаляющий товар из корзины
        productInBasket.remove(element);
    }    //удаление элемента из корзины
    public void clearProductBasket() {
        productInBasket.clear();
    }

}

//    public void listProduct(ArrayList<String> nameTyre, ArrayList<Integer> arrayWidthTire, ArrayList<Integer> arrayProfileTire, ArrayList<Integer> arrayDiameterTire) {
//        Scanner size = new Scanner(System.in);
//        System.out.println("Введите ширину: ");
//        int widthTirePerson = size.nextInt();
//        System.out.println("Введите высоту профиля: ");
//        int profileTirePerson = size.nextInt();
//        System.out.println("Введите диаметр: ");
//        int diameterTirePerson = size.nextInt();
//        int c;
//        for (c = 0; c < nameTyre.size(); c++) {
//            if (arrayWidthTire.get(c).equals(widthTirePerson) && (arrayProfileTire.get(c).equals(profileTirePerson) && (arrayDiameterTire.get(c).equals(diameterTirePerson)))) {
//                System.out.println("Есть совпадения: " + nameTyre.get(c));
//                Scanner addBasket = new Scanner(System.in);
//                System.out.println("Добавить в корзину?\nвведите: \"да\", если хотите добавить товар в корзину");
//                String response = addBasket.nextLine();
//                if (response.equalsIgnoreCase("да")) {
//                    System.out.println("Товар : " + nameTyre.get(c) + " успешно добавлен в корзину");
//                }
//                else
//                    System.out.println("Товар в корзину не добавлен");
//            }
//        }
//    }







