package org.example.basket;

import org.example.wheel.Wheel;
import java.util.ArrayList;
import java.util.Scanner;

public class Basket {
    public ArrayList<Wheel> productInBasket = new ArrayList<>();                  //корзина arrayList productInBasket
    public void addProductBasket(Wheel product) {productInBasket.add(product);}                                                                             //TODO добавление товара в корзину(ТЗ)
    public void deliteProductBasket(int element) {productInBasket.remove(element);} //TODO удаление товара из корзины(ТЗ)
    public void clearProductBasket() {productInBasket.clear();}                     //очистить корзину полностью
    public void countFinalPrice() {                                                 //TODO вывести сумму покупки (ТЗ)
        int sum = 0;
        for (int i = 0; i < productInBasket.size(); i++) {
            sum = sum + this.productInBasket.get(i).getPrice();
        }
        System.out.println("В корзине товары на: " + sum + "  руб.");
    }

    //TODO оформление заказа(ТЗ).(итоговый список товаров, стоимость каждого товара и сумму покупки.):
    public void FinalOrder() {                                                               //TODO оформление заказа(ТЗ)
        int sum = 0;
        for (int i = 0; i < productInBasket.size(); i++) {
            sum = sum + this.productInBasket.get(i).getPrice();
        }
        System.out.println("Всего товаров в корзине: " + productInBasket.size() + " шт. на общую сумму: " + sum + " руб. \n Товары в корзине: " + productInBasket);
        if (productInBasket.size() >= 1) {
            Scanner finalOrder = new Scanner(System.in);
            System.out.println("Для оформления заказа напишите: \"оформить заказ\"");
            String response = finalOrder.nextLine();
            if (response.equalsIgnoreCase("оформить заказ")) {
                System.out.println("Ваш заказ успешно оформлен");
            }
        }
    }

}






