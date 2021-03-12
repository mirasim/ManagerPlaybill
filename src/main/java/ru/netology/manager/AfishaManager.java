package ru.netology.manager;

import ru.netology.domain.Cinema;


public class AfishaManager {
    public AfishaManager(){
        cinemaList = new Cinema[10];
    }
    public AfishaManager(int count){
        cinemaList = new Cinema[count];
    }

    private Cinema[] cinemaList;
    private int cinemaCount = 0;

    public void add(Cinema item) {
        cinemaList[cinemaCount] = item;
        cinemaCount++;
    }

    public Cinema[] getAll() {
        Cinema[] result = new Cinema[cinemaCount];
        for (int i = 0; i < result.length; i++) {
            int index = cinemaCount - i - 1;
            result[i] = cinemaList[index];
        }
        return result;
    }


    public Cinema[] getAll(int count) {

        Cinema[] result = new Cinema[count>cinemaCount?cinemaCount:count];
        for (int i = 0; i < result.length; i++) {
            int index = cinemaCount - i - 1;
            result[i] = cinemaList[index];
        }
        return result;
    }
}
