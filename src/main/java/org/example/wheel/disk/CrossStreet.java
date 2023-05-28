package org.example.wheel.disk;
import org.example.Shop.Shop;
import org.example.wheel.tires.Tire;

import java.util.ArrayList;
public class CrossStreet extends Disk {

    private String brandCrossStreet, typeCrossStreet,modelCrossStreet, drillingPCDCrossStreet; //заданы переменные (бренд,тип,модель,сверлов) для дисков
    private int diameterCrossStreet, departureETCrossStreet, priceCrossStreet; //заданы переменные (диаметр, вылет, цена) для дисков
    private float holeDiameterCrossStreet;                                      //заданы переменные для дисков

    public String getBrandCrossStreet() {
        return brandCrossStreet;
    }

    public void setBrandCrossStreet(String brandCrossStreet) {
        this.brandCrossStreet = brandCrossStreet;
    }

    public String getTypeCrossStreet() {
        return typeCrossStreet;
    }

    public void setTypeCrossStreet(String typeCrossStreet) {
        this.typeCrossStreet = typeCrossStreet;
    }

    public String getModelCrossStreet() {
        return modelCrossStreet;
    }

    public void setModelCrossStreet(String modelCrossStreet) {
        this.modelCrossStreet = modelCrossStreet;
    }

    public String getDrillingPCDCrossStreet() {
        return drillingPCDCrossStreet;
    }

    public void setDrillingPCDCrossStreet(String drillingPCDCrossStreet) {
        this.drillingPCDCrossStreet = drillingPCDCrossStreet;
    }

    public int getDiameterCrossStreet() {
        return diameterCrossStreet;
    }

    public void setDiameterCrossStreet(int diameterCrossStreet) {
        this.diameterCrossStreet = diameterCrossStreet;
    }

    public int getDepartureETCrossStreet() {
        return departureETCrossStreet;
    }

    public void setDepartureETCrossStreet(int departureETCrossStreet) {
        this.departureETCrossStreet = departureETCrossStreet;
    }

    public int getPriceCrossStreet() {
        return priceCrossStreet;
    }

    public void setPriceCrossStreet(int priceCrossStreet) {
        this.priceCrossStreet = priceCrossStreet;
    }

    public float getHoleDiameterCrossStreet() {
        return holeDiameterCrossStreet;
    }

    public void setHoleDiameterCrossStreet(float holeDiameterCrossStreet) {
        this.holeDiameterCrossStreet = holeDiameterCrossStreet;
    }

    public CrossStreet(String brandCrossStreet, String typeCrossStreet, String modelCrossStreet, String drillingPCDCrossStreet, int diameterCrossStreet, int departureETCrossStreet, int priceCrossStreet, float holeDiameterCrossStreet) {
        this.brandCrossStreet = brandCrossStreet;
        this.typeCrossStreet = typeCrossStreet;
        this.modelCrossStreet = modelCrossStreet;
        this.drillingPCDCrossStreet = drillingPCDCrossStreet;
        this.diameterCrossStreet = diameterCrossStreet;
        this.departureETCrossStreet = departureETCrossStreet;
        this.priceCrossStreet = priceCrossStreet;
        this.holeDiameterCrossStreet = holeDiameterCrossStreet;
    }

    public void nameDisk() {
        System.out.println(brandCrossStreet + " " + modelCrossStreet + " диаметр окружности(PCD): " + drillingPCDCrossStreet + " вылет(ET): " + departureETCrossStreet + " R: " + diameterCrossStreet);
    }

    @Override
    public String toString() {
        return brandCrossStreet +
                ", модель: " + modelCrossStreet +
                ", сверловка(PCD): " + drillingPCDCrossStreet +
                ", диаметр: " + diameterCrossStreet +
                ", ET: " + departureETCrossStreet +
                ", стоимость: " + priceCrossStreet +  " руб." +
                ", диаметр отверстия: " + holeDiameterCrossStreet;
    }
}
