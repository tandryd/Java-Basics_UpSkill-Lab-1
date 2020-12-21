package com.epam.upskill.module5.task5.builder;

import com.epam.upskill.module5.task5.action.CustomerAction;
import com.epam.upskill.module5.task5.enity.Wrap;

import java.util.ArrayList;

import static com.epam.upskill.module5.task5.action.CheckInput.getDoubleFromKeyboard;
import static com.epam.upskill.module5.task5.action.CheckInput.getStringFromKeyboard;

public class FlowersPresentBuilder extends PresentBuilder {
    @Override
    void buildName() {
        System.out.println("Who do you want to give a gift to?");
        String name = getStringFromKeyboard();
        present.setName(name);
    }

    @Override
    void buildPrice() {
        System.out.println("What price do you want to buy a gift for?");
        double price = getDoubleFromKeyboard();
        present.setPrice(price);
    }

    @Override
    void buildWrap() {
        Wrap wrap = CustomerAction.chooseWrap();
        present.setWrap(wrap);
    }

    @Override
    void buildProducts() {
        present.setProducts(new ArrayList<>());
    }
}
