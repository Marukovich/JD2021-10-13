package by.it.karmyzov.jd02_02;

import by.it.karmyzov.jd02_02.model.Manager;

public class Runner {
    public static void main(String[] args) {
        Manager manager = new Manager(100);
            Store aplication = new Store(manager);
            aplication.start();
        }
    }
