package org.example.wheel.tires;

public class Michelin extends Tire {
    private int widthMichelin, profileMichelin,diameterMichelin;                  //заданы переменные для шин(ширина,профиль,диаметр)
    private int priceMichelin;                                                    //заданы переменные для шин(цена)
    private String seasonMichelin, brandMichelin, modelMichelin;                 //заданы переменные для шин(сезон, бренд)
    private  boolean tireSpikesMichelin, allSeasonMichelin;

    public Michelin(int widthMichelin, int profileMichelin, int diameterMichelin, int priceMichelin, String seasonMichelin, String brandMichelin, String modelMichelin, boolean tireSpikesMichelin, boolean allSeasonMichelin) {
        this.widthMichelin = widthMichelin;
        this.profileMichelin = profileMichelin;
        this.diameterMichelin = diameterMichelin;
        this.priceMichelin = priceMichelin;
        this.seasonMichelin = seasonMichelin;
        this.brandMichelin = brandMichelin;
        this.modelMichelin = modelMichelin;
        this.tireSpikesMichelin = tireSpikesMichelin;
        this.allSeasonMichelin = allSeasonMichelin;
    }

    @Override
    public String toString() {
        return
                brandMichelin +
                " модель: " + modelMichelin +
                " " + widthMichelin +
                "/" + profileMichelin +
                "/" + diameterMichelin +
                ", стоимость: " + priceMichelin +" руб."+
                ", сезон: " + seasonMichelin;
    }

    public void nameTires() {
        System.out.println(brandMichelin + " " + modelMichelin + " "+ widthMichelin+"/"+profileMichelin+"/"+diameterMichelin);
    }
    @Override
    public Integer getPrice() {
        return priceMichelin;
    }
    @Override
    public Integer getWidth() {
        return widthMichelin;
    }
    @Override
    public Integer getProfile() {return profileMichelin;}
    @Override
    public Integer getDiameter() {
        return diameterMichelin;
    }
    @Override
    public Integer getET() {return null;}
    @Override
    public String PCD() {return null;}

}
