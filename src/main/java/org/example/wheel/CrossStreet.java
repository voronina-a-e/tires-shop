package org.example.wheel;
import org.example.Shop;
import org.example.tires.Michelin;

import java.util.ArrayList;


public class CrossStreet extends Shop {

    public CrossStreet(String brandWeel, String typeWeel, String modelWeel, String drillingPCDWeel, int diameterWeel, int departureETWeel, int priceWeel, float holeDiameterDIAWeel) {
        super(brandWeel, typeWeel, modelWeel, drillingPCDWeel, diameterWeel, departureETWeel, priceWeel, holeDiameterDIAWeel);
    }

    public ArrayList<CrossStreet> michelinArrayList = new ArrayList();
    public String allmodels () {
        StringBuilder sb = new StringBuilder();
        for (CrossStreet m : michelinArrayList) {
            sb.append(m).append("\n");
        }
        return sb.toString();

    }

   /* @Override
    public void allModels() {

    }*/
}
