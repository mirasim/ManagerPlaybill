package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Cinema;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    void add() {

        AfishaManager manager = new AfishaManager();
        manager.add(new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg"));
        Cinema[] expected = new Cinema[1];
        expected[0] = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");
        Cinema[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAll() {

        Cinema first = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");
        Cinema second = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");
        Cinema third = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");

        Cinema[] expected = new Cinema[3];
        expected[2] = first;
        expected[1] = second;
        expected[0] = third;

        AfishaManager manager = new AfishaManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        Cinema[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetAllLess() {
        Cinema first = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");
        Cinema second = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");
        Cinema third = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");

        Cinema[] expected = new Cinema[2];
        expected[1] = second;
        expected[0] = third;

        AfishaManager manager = new AfishaManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        Cinema[] actual = manager.getAll(2);

        assertArrayEquals(expected, actual);
    }
    @Test
    void testGetAllMore() {
        Cinema first = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");
        Cinema second = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");
        Cinema third = new Cinema("BloodShot", "Action", "http://ya.ru/picture1.jpeg");

        Cinema[] expected = new Cinema[3];
        expected[2] = first;
        expected[1] = second;
        expected[0] = third;

        AfishaManager manager = new AfishaManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        Cinema[] actual = manager.getAll(5);

        assertArrayEquals(expected, actual);
    }
}