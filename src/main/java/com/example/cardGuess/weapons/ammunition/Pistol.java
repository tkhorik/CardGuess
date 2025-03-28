package com.example.cardGuess.weapons.ammunition;

public class Pistol extends AbstractWeapon {

    public Pistol(int damageMin, int damageMax, int magazineCapacity) {
        super(damageMin, damageMax, magazineCapacity);
    }

    @Override
    public String toString() {
        return "Pistol{" +
                "damageMax=" + damageMax +
                ", damageMin=" + damageMin +
                ", magazineCapacity=" + magazineCapacity +
                '}';
    }
}
