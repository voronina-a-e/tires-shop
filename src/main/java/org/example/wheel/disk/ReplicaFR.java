package org.example.wheel.disk;

public class ReplicaFR extends Disk {

    private String brandReplicaFR, typeReplicaFR,modelReplicaFR, drillingPCDReplicaFR; //заданы переменные (бренд,тип,модель,сверлов) для дисков
    private int diameterReplicaFR, departureETReplicaFR, priceReplicaFR; //заданы переменные (диаметр, вылет, цена) для дисков
    private float holeDiameterReplicaFR;

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

    @Override
    public Integer getPrice() {
        return priceReplicaFR;
    }
    @Override
    public Integer getWidth() {
        return null;
    }
    @Override
    public Integer getProfile() {
        return null;
    }
    @Override
    public Integer getDiameter() {
        return diameterReplicaFR;
    }
    @Override
    public Integer getET() {return departureETReplicaFR;}
    @Override
    public String PCD() {return drillingPCDReplicaFR;}

}

