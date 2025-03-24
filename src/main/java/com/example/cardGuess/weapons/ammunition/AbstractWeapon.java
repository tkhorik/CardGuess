package com.example.cardGuess.weapons.ammunition;

import java.util.Random;

public abstract class AbstractWeapon implements Weapon {
    int damageMin;
    int damageMax;
    int magazineCapacity;

    public AbstractWeapon(int damageMin, int damageMax, int magazineCapacity) {
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.magazineCapacity = magazineCapacity;
    }

    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public int makeShot() {
        if (magazineCapacity <= 0) {
            System.out.println("Нет патронов!");
            throw new IllegalArgumentException("Нет патронов!");
        }
        System.out.println("capacity value = " + magazineCapacity);
        magazineCapacity--;
        System.out.println("после выстрела осталось " + magazineCapacity);
        Random random = new Random();
        return random.nextInt(damageMax - damageMin + 1) + damageMin;
    }
}
