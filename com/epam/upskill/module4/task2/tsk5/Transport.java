/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package com.epam.upskill.module4.task2.tsk5;

public enum  Transport {
    PLANE,
    BUS,
    TRAIN,
    SHIP,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}

