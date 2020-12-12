package com.epam.upskill.module5.task5;

import com.epam.upskill.module5.task5.action.CustomerAction;

public class PresentRunner {
    public static void main(String[] args) {
        CustomerAction customerAction= new CustomerAction();
        customerAction.run();
    }
}
