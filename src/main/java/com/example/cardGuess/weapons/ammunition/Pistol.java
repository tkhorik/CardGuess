package com.example.cardGuess.weapons.ammunition;

//Пистолет: 5-8, 5
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
