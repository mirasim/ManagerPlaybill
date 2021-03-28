package ru.netology.manager;

import ru.netology.domain.Cinema;


public class AfishaManager {
    private int cinemaCount = 0;
    private int maximumCinemaCount = 10;
    private Cinema[] cinemaList;

    public AfishaManager() {
        cinemaList = new Cinema[maximumCinemaCount];
    }

    public AfishaManager(int count) {
        maximumCinemaCount = count;
        cinemaList = new Cinema[count];
    }

    public void add(Cinema item) {
        cinemaList[cinemaCount] = item;
        if (cinemaCount < maximumCinemaCount)
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
}
