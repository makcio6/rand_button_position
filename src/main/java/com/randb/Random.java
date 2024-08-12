package com.randb;

public class Random {

    int randomx = 90;
    int randomy = 100;

    int from = 1;
    int tox = 150;
    int toy = 100;

    public void setRandomx() {
        randomx = from + (int) (Math.random() * tox);

        randomy = from + (int) (Math.random() * toy);
    }
}