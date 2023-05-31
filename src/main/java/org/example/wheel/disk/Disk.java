package org.example.wheel.disk;

import org.example.wheel.Wheel;

    public abstract class Disk implements Wheel {
        public abstract void nameDisk();                          //абстрактный метод для вывода дисков по форме из задания
        public abstract String toString();                        //абстрактный метод для переопределения toString

}
