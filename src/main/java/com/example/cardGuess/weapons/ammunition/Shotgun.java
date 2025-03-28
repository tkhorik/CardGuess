package com.example.cardGuess.weapons.ammunition;

public class Shotgun extends AbstractWeapon {

    public Shotgun(int damageMin, int damageMax, int magazineCapacity) {
        super(damageMin, damageMax, magazineCapacity);
    }

    @Override
    public String toString() {
        return "Shotgun{" +
                "damageMax=" + damageMax +
                ", damageMin=" + damageMin +
                ", magazineCapacity=" + magazineCapacity +
                '}';
    }
}
