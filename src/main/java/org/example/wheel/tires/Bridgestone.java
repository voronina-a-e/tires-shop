package org.example.wheel.tires;

public class Bridgestone extends Tire {
    private int widthBridgestone, profileBridgestone, diameterBridgestone;                  //заданы переменные для шин(ширина,профиль,диаметр)
    private int priceBridgestone;                                           //заданы переменные для шин(цена)
    private String seasonBridgestone, brandBridgestone, modelBridgestone;                 //заданы переменные для шин(сезон, бренд)
    private boolean tireSpikesBridgestone, allSeasonBridgestone;

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

    public void nameTires() {
        System.out.println(brandBridgestone + " " + modelBridgestone + " " + widthBridgestone + "/" + profileBridgestone + "/" + diameterBridgestone);
    }

    @Override
    public String toString() {
        return brandBridgestone +
                ", модель: " + modelBridgestone +
                " " + widthBridgestone +
                "/" + profileBridgestone +
                "/" + diameterBridgestone +
                ", стоимость: " + priceBridgestone +" руб." +
                ", сезон: " + seasonBridgestone;
    }

    @Override
    public Integer getWidth() {return widthBridgestone;}
    @Override
    public Integer getProfile() {return profileBridgestone;}
    @Override
    public Integer getDiameter() {return diameterBridgestone;}
    @Override
    public Integer getET() {return null;}
    @Override
    public String PCD() {return null;}
    @Override
    public Integer getPrice() {return priceBridgestone;}

}
