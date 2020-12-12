package com.epam.upskill.module5.task5.enity;

public class Wrap {
    private WrapType wrapType;
    private double price;

    public Wrap(WrapType wrapType) {
        price = wrapType.getPrice();
        this.wrapType = wrapType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return wrapType.getName();
    }

//    public enum WrapType implements Type{
//        CARDBOARD_BOX("Cardboard box", 1.5),
//        METAL_BOX("Metal Box", 5.0),
//        FOIL_POUCHES("Foil Pouch", 2),
//        PLASTIC_BAG("Plastic Bag", 0.5);
//        private String name;
//        private double price;
//
//        WrapType(String name, double price) {
//            this.name = name;
//            this.price = price;
//        }
//
//        public double getPrice() {
//            return price;
//        }
//
//        public void setPrice(double price) {
//            this.price = price;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//    }

}
