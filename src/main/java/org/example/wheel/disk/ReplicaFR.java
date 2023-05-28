package org.example.wheel.disk;

import org.example.Shop.Shop;

public class ReplicaFR extends Disk {

    private String brandReplicaFR, typeReplicaFR,modelReplicaFR, drillingPCDReplicaFR; //заданы переменные (бренд,тип,модель,сверлов) для дисков
    private int diameterReplicaFR, departureETReplicaFR, priceReplicaFR; //заданы переменные (диаметр, вылет, цена) для дисков
    private float holeDiameterReplicaFR;                                 //заданы переменные для дисков

    public String getBrandReplicaFR() {
        return brandReplicaFR;
    }

    public void setBrandReplicaFR(String brandReplicaFR) {
        this.brandReplicaFR = brandReplicaFR;
    }

    public String getTypeReplicaFR() {
        return typeReplicaFR;
    }

    public void setTypeReplicaFR(String typeReplicaFR) {
        this.typeReplicaFR = typeReplicaFR;
    }

    public String getModelReplicaFR() {
        return modelReplicaFR;
    }

    public void setModelReplicaFR(String modelReplicaFR) {
        this.modelReplicaFR = modelReplicaFR;
    }

    public String getDrillingPCDReplicaFR() {
        return drillingPCDReplicaFR;
    }

    public void setDrillingPCDReplicaFR(String drillingPCDReplicaFR) {
        this.drillingPCDReplicaFR = drillingPCDReplicaFR;
    }

    public int getDiameterReplicaFR() {
        return diameterReplicaFR;
    }

    public void setDiameterReplicaFR(int diameterReplicaFR) {
        this.diameterReplicaFR = diameterReplicaFR;
    }

    public int getDepartureETReplicaFR() {
        return departureETReplicaFR;
    }

    public void setDepartureETReplicaFR(int departureETReplicaFR) {
        this.departureETReplicaFR = departureETReplicaFR;
    }

    public int getPriceReplicaFR() {
        return priceReplicaFR;
    }

    public void setPriceReplicaFR(int priceReplicaFR) {
        this.priceReplicaFR = priceReplicaFR;
    }

    public float getHoleDiameterReplicaFR() {
        return holeDiameterReplicaFR;
    }

    public void setHoleDiameterReplicaFR(float holeDiameterReplicaFR) {
        this.holeDiameterReplicaFR = holeDiameterReplicaFR;
    }

    public ReplicaFR(String brandReplicaFR, String typeReplicaFR, String modelReplicaFR, String drillingPCDReplicaFR, int diameterReplicaFR, int departureETReplicaFR, int priceReplicaFR, float holeDiameterReplicaFR) {
        this.brandReplicaFR = brandReplicaFR;
        this.typeReplicaFR = typeReplicaFR;
        this.modelReplicaFR = modelReplicaFR;
        this.drillingPCDReplicaFR = drillingPCDReplicaFR;
        this.diameterReplicaFR = diameterReplicaFR;
        this.departureETReplicaFR = departureETReplicaFR;
        this.priceReplicaFR = priceReplicaFR;
        this.holeDiameterReplicaFR = holeDiameterReplicaFR;
    }

    public void nameDisk() {
        System.out.println(brandReplicaFR + " " + modelReplicaFR + " диаметр окружности(PCD): " + drillingPCDReplicaFR + " вылет(ET): " + departureETReplicaFR + " R: " + diameterReplicaFR);
    }

    @Override
    public String toString() {
        return brandReplicaFR +
                ", модель: " + modelReplicaFR +
                ", сверловка(PCD): " + drillingPCDReplicaFR +
                ", диаметр: " + diameterReplicaFR +
                ", ET: " + departureETReplicaFR +
                ", стоимость: " + priceReplicaFR + " руб." +
                ", диаметр отверстия: " + holeDiameterReplicaFR;
    }

}

