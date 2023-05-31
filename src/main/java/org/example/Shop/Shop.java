package org.example.Shop;

import org.example.basket.Basket;
import org.example.wheel.Wheel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Shop {

    private ArrayList<Wheel> allTyreArrayList = new ArrayList<>();                     //ArrayList для всех шин
    public ArrayList<Wheel> getAllTyreArrayList() {                                    //геттер для allTyreArrayList
        return allTyreArrayList;
    }         //геттер
    public void addTyre(Wheel object) {                                                //метод для добавления всех шин
        this.allTyreArrayList.add(object);
    }           //метод,добавляющий object

    public void showAllTyreArrayList() {                                             //TODO показать все шины циклом(ТЗ)
        System.out.println("Всего : " + allTyreArrayList.size() + " шин в магазине");
        int a;
        for (a = 0; a < this.allTyreArrayList.size(); a++)
            System.out.println(this.allTyreArrayList.get(a));
    }
    private ArrayList<Wheel> allDiskArrayList = new ArrayList<>();                      //ArrayList для всех дисков
    public ArrayList<Wheel> getAllDiskArrayList() {                                     //геттер для allDiskArrayList
        return allDiskArrayList;
    }           //геттер
    public void addDisk(Wheel object) {this.allDiskArrayList.add(object);}          //метод для добавляющий все диски

    public void showAllDiskArrayList() {                                           //TODO показать все диски циклом(ТЗ)
        System.out.println("Всего : " + allDiskArrayList.size() + " дисков в магазине");
        int a;
        for (a = 0; a < this.allDiskArrayList.size(); a++)
            System.out.println(this.allDiskArrayList.get(a));
    }

    private ArrayList<Wheel> allProductArrayList = new ArrayList<>();             //arrayList, содержащий все товары
    public ArrayList<Wheel> getAllProductArrayList() {                          //геттер для allProductArrayList
        return allProductArrayList;
    }
    public void createAllProduct() {                                              //метод, создающий allProductArrayList
        this.allProductArrayList.addAll(allDiskArrayList);
        this.allProductArrayList.addAll(allTyreArrayList);
    }

    public void showAllProductArrayList() {                                        //TODO показать все товары циклом
        System.out.println("Всего в магазине : " + allProductArrayList.size() + " товара");
        int a;
        for (a = 0; a < this.allProductArrayList.size(); a++)
            System.out.println(this.allProductArrayList.get(a));
    }

    public void scannerTyre() {
        Scanner size = new Scanner(System.in);                                    //TODO подбор шин по параметрам(фильтр)
        System.out.println("Введите ширину: ");
        int widthTirePerson = size.nextInt();
        System.out.println("Введите высоту профиля: ");
        int profileTirePerson = size.nextInt();
        System.out.println("Введите диаметр: ");
        int diameterTirePerson = size.nextInt();
        int c;
        for (c = 0; c < this.allTyreArrayList.size(); c++) {
            if (this.allTyreArrayList.get(c).getWidth().equals(widthTirePerson) && (this.allTyreArrayList.get(c).getProfile().equals(profileTirePerson) && (this.allTyreArrayList.get(c).getDiameter().equals(diameterTirePerson)))) {
                System.out.println("Есть совпадения: " + this.allTyreArrayList.get(c));
            }
        }
    }

    public void scannerDisk() {
        Scanner size = new Scanner(System.in);                                    //TODO подбор дисков по параметрам(фильтр)
        System.out.println("Введите PCD, по формату: 5x114.3 ");
        String PCDPerson = size.nextLine();
        System.out.println("Введите вылет(ET): ");
        int getETPerson = size.nextInt();
        System.out.println("Введите диаметр: ");
        int diameterPerson = size.nextInt();
        int c;
        System.out.println("Совпадения: ");
        for (c = 0; c < this.allDiskArrayList.size(); c++) {
            if (this.allDiskArrayList.get(c).PCD().equals(PCDPerson) && (this.allDiskArrayList.get(c).getET().equals(getETPerson) && (this.allDiskArrayList.get(c).getDiameter().equals(diameterPerson)))) {
                System.out.println(this.allDiskArrayList.get(c));
            }
        }
    }
}
