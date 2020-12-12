package com.epam.upskill.module5.task5.builder;

import com.epam.upskill.module5.task5.enity.Present;

public class PresentDirector {
    PresentBuilder presentBuilder;

    public void setPresentBuilder(PresentBuilder presentBuilder) {
        this.presentBuilder = presentBuilder;
    }

    public Present buildPresent (){
        presentBuilder.createPresent();
        presentBuilder.buildName();
        presentBuilder.buildPrice();
        presentBuilder.buildProducts();
        presentBuilder.buildWrap();
        return presentBuilder.getPresent();
    }

    public PresentBuilder getPresentBuilder() {
        return presentBuilder;
    }


}
