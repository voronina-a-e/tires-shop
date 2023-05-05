package org.example;

import org.example.tires.Bridgestone;
import org.example.tires.Michelin;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Michelin michelin=new Michelin();
        Bridgestone bridgestone = new Bridgestone();

        bridgestone.printModel();
        michelin.printModel();

    }
}