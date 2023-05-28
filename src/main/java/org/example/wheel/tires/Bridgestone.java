package org.example.wheel.tires;

public class Bridgestone extends Tire {
    private int widthBridgestone,profileBridgestone,diameterBridgestone;                  //заданы переменные для шин(ширина,профиль,диаметр)
    private int priceBridgestone;                                           //заданы переменные для шин(цена)
    private String seasonBridgestone, brandBridgestone, modelBridgestone;                 //заданы переменные для шин(сезон, бренд)
    private  boolean tireSpikesBridgestone, allSeasonBridgestone;

    public Bridgestone(int widthBridgestone, int profileBridgestone, int diameterBridgestone, int priceBridgestone, String seasonBridgestone, String brandBridgestone, String modelBridgestone, boolean tireSpikesBridgestone, boolean allSeasonBridgestone) {
        this.widthBridgestone = widthBridgestone;
        this.profileBridgestone = profileBridgestone;
        this.diameterBridgestone = diameterBridgestone;
        this.priceBridgestone = priceBridgestone;
        this.seasonBridgestone = seasonBridgestone;
        this.brandBridgestone = brandBridgestone;
        this.modelBridgestone = modelBridgestone;
        this.tireSpikesBridgestone = tireSpikesBridgestone;
        this.allSeasonBridgestone = allSeasonBridgestone;
    }

    public int getWidthBridgestone() {
        return widthBridgestone;
    }

    public void setWidthBridgestone(int widthBridgestone) {
        this.widthBridgestone = widthBridgestone;
    }

    public int getProfileBridgestone() {
        return profileBridgestone;
    }

    public void setProfileBridgestone(int profileBridgestone) {
        this.profileBridgestone = profileBridgestone;
    }

    public int getDiameterBridgestone() {
        return diameterBridgestone;
    }

    public void setDiameterBridgestone(int diameterBridgestone) {
        this.diameterBridgestone = diameterBridgestone;
    }

    public int getPriceBridgestone() {
        return priceBridgestone;
    }

    public void setPriceBridgestone(int priceBridgestone) {
        this.priceBridgestone = priceBridgestone;
    }

    public String getSeasonBridgestone() {
        return seasonBridgestone;
    }

    public void setSeasonBridgestone(String seasonBridgestone) {
        this.seasonBridgestone = seasonBridgestone;
    }

    public String getBrandBridgestone() {
        return brandBridgestone;
    }

    public void setBrandBridgestone(String brandBridgestone) {
        this.brandBridgestone = brandBridgestone;
    }

    public String getModelBridgestone() {
        return modelBridgestone;
    }

    public void setModelBridgestone(String modelBridgestone) {
        this.modelBridgestone = modelBridgestone;
    }

    public boolean isTireSpikesBridgestone() {
        return tireSpikesBridgestone;
    }

    public void setTireSpikesBridgestone(boolean tireSpikesBridgestone) {
        this.tireSpikesBridgestone = tireSpikesBridgestone;
    }

    public boolean isAllSeasonBridgestone() {
        return allSeasonBridgestone;
    }

    public void setAllSeasonBridgestone(boolean allSeasonBridgestone) {
        this.allSeasonBridgestone = allSeasonBridgestone;
    }

    public void nameTires() {
        System.out.println(brandBridgestone + " " + modelBridgestone + " "+ widthBridgestone+"/"+profileBridgestone+"/"+diameterBridgestone);
    }

    @Override
    public String toString() {
        return brandBridgestone +
                ", модель: " + modelBridgestone +
                " " + widthBridgestone +
                "/" + profileBridgestone +
                "/" + diameterBridgestone +
                ", стоимость: " + priceBridgestone +
                ", сезон: " + seasonBridgestone;}

}
