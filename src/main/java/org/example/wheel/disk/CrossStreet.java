package org.example.wheel.disk;

public class CrossStreet extends Disk {

    private String brandCrossStreet, typeCrossStreet,modelCrossStreet, drillingPCDCrossStreet; //заданы переменные (бренд,тип,модель,сверлов) для дисков
    private int diameterCrossStreet, departureETCrossStreet, priceCrossStreet; //заданы переменные (диаметр, вылет, цена) для дисков
    private float holeDiameterCrossStreet;

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

    public void nameDisk() {System.out.println(brandCrossStreet + " " + modelCrossStreet + " диаметр окружности(PCD): " + drillingPCDCrossStreet + " вылет(ET): " + departureETCrossStreet + " R: " + diameterCrossStreet);}

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

    @Override
    public Integer getPrice() {return priceCrossStreet;}
    @Override
    public Integer getWidth() {return null;}
    @Override
    public Integer getProfile() {return null;}
    @Override
    public Integer getDiameter() {return diameterCrossStreet;}
    @Override
    public Integer getET() {return departureETCrossStreet;}
    @Override
    public String PCD() {return drillingPCDCrossStreet;}

}
