package org.example.wheel.tires;

import org.example.wheel.Wheel;

public abstract class Tire implements Wheel {
    public abstract void nameTires();                       //абстрактный метод для вывода шин по форме из задания
    public abstract String toString();                      //абстрактный метод для переопределения toString

}
