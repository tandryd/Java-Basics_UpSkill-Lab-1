package com.epam.upskill.module5.task5.builder;

import static com.epam.upskill.module5.task5.action.CheckInput.*;
import com.epam.upskill.module5.task5.action.CustomerAction;
import com.epam.upskill.module5.task5.enity.Wrap;

import java.util.ArrayList;

public class CandyPresentBuilder extends PresentBuilder {

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
