package com.example.cardGuess.weapons.ammunition;

//Револьвер: 3-6, 7
public class Revolver extends AbstractWeapon {

    public Revolver(int damageMin, int damageMax, int magazineCapacity) {
        super(damageMin, damageMax, magazineCapacity);
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "damageMin=" + damageMin +
                ", damageMax=" + damageMax +
                ", magazineCapacity=" + magazineCapacity +
                '}';
    }
}
