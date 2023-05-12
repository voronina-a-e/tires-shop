package org.example;

import org.example.person.Person;

public  abstract class Shop implements Person {
        public int widthTire,profileTire,diameterTire;                  //заданы переменные для шин(ширина,профиль,диаметр)
        public int priceTire;                                           //заданы переменные для шин(цена)
        public String seasonTire, brandTire, modelTire;                 //заданы переменные для шин(сезон, бренд)
        public  boolean tireSpikesTire, allSeasonTire;                  //заданы переменные для шин(шипы, сезон)

        public Shop(int widthTire, int profileTire, int diameterTire, int priceTire, String seasonTire, String brandTire, String modelTire, boolean tireSpikesTire, boolean allSeasonTire) {
            this.widthTire = widthTire;
            this.profileTire = profileTire;
            this.diameterTire = diameterTire;
            this.priceTire = priceTire;
            this.seasonTire = seasonTire;
            this.brandTire = brandTire;
            this.modelTire = modelTire;
            this.tireSpikesTire = tireSpikesTire;
            this.allSeasonTire = allSeasonTire;
        }

        public String brandWeel, typeWeel,modelWeel, drillingPCDWeel;         //заданы переменные (бренд,тип,модель,сверлов) для дисков
        public int diameterWeel, departureETWeel, priceWeel;                  //заданы переменные (диаметр, вылет, цена) для дисков
        public float holeDiameterDIAWeel;                                     //заданы переменные для дисков

        public Shop (String brandWeel, String typeWeel, String modelWeel, String drillingPCDWeel, int diameterWeel, int departureETWeel, int priceWeel, float holeDiameterDIAWeel) {
            this.brandWeel = brandWeel;
            this.typeWeel = typeWeel;
            this.modelWeel = modelWeel;
            this.drillingPCDWeel = drillingPCDWeel;
            this.diameterWeel = diameterWeel;
            this.departureETWeel = departureETWeel;
            this.priceWeel = priceWeel;
            this.holeDiameterDIAWeel = holeDiameterDIAWeel;
        }

        public void nameWeels() {
        System.out.println(brandWeel + " " + modelWeel + " диаметр окружности(PCD): " + drillingPCDWeel + " вылет(ET): " + departureETWeel + " R: " + diameterWeel);
        }

        public void nameTires() {
        System.out.println(brandTire + " " + modelTire + " "+ widthTire+"/"+profileTire+"/"+diameterTire);
        }


    //public abstract void allModels();
}

/*3. Пользователь добавляет товар в корзину. 4. Пользователь удаляет товар из корзины.  Вопрос: все товары хранятся в переменной
или в др. объекте?? Но товары- объекты, как несколько объектов(товаров) сохранить в переменную или другой объект?

задание: все взаимодействие с магазином осуществляется через пользователя! К примеру, пользователь хочет посмотреть
список товаров в корзине:  person.showBucket();   Как обращаться к корзине через другой класс? Пользователь не интерфейс,а  класс?
*/