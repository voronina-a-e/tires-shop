package org.example.wheel.tires;

public class Michelin extends Tire {
    private int widthMichelin,profileMichelin,diameterMichelin;                  //заданы переменные для шин(ширина,профиль,диаметр)
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
    public Michelin() {
    }
    public int getWidthMichelin() {
        return widthMichelin;
    }
    public void setWidthMichelin(int widthMichelin) {
        this.widthMichelin = widthMichelin;
    }
    public int getProfileMichelin() {
        return profileMichelin;
    }
    public void setProfileMichelin(int profileMichelin) {
        this.profileMichelin = profileMichelin;
    }
    public int getDiameterMichelin() {
        return diameterMichelin;
    }
    public void setDiameterMichelin(int diameterMichelin) {
        this.diameterMichelin = diameterMichelin;
    }
    public int getPriceMichelin() {
        return priceMichelin;
    }
    public void setPriceMichelin(int priceMichelin) {
        this.priceMichelin = priceMichelin;
    }
    public String getSeasonMichelin() {
        return seasonMichelin;
    }
    public void setSeasonMichelin(String seasonMichelin) {
        this.seasonMichelin = seasonMichelin;
    }
    public String getBrandMichelin() {
        return brandMichelin;
    }
    public void setBrandMichelin(String brandMichelin) {
        this.brandMichelin = brandMichelin;
    }
    public String getModelMichelin() {
        return modelMichelin;
    }
    public void setModelMichelin(String modelMichelin) {
        this.modelMichelin = modelMichelin;
    }
    public boolean isTireSpikesMichelin() {
        return tireSpikesMichelin;
    }
    public void setTireSpikesMichelin(boolean tireSpikesMichelin) {
        this.tireSpikesMichelin = tireSpikesMichelin;
    }
    public boolean isAllSeasonMichelin() {
        return allSeasonMichelin;
    }
    public void setAllSeasonMichelin(boolean allSeasonMichelin) {
        this.allSeasonMichelin = allSeasonMichelin;
    }

    public void nameTires() {
        System.out.println(brandMichelin + " " + modelMichelin + " "+ widthMichelin+"/"+profileMichelin+"/"+diameterMichelin);
    }


}
