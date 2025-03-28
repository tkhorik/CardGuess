package com.example.cardGuess.weapons;

import com.example.cardGuess.weapons.ammunition.Weapon;
import com.example.cardGuess.weapons.ammunition.WeaponFactory;

public class Main {
    public static void main(String[] args) {

        Weapon revolver = WeaponFactory.createWeapon("0");
        Weapon pistol = WeaponFactory.createWeapon("1");
        Weapon shotgun = WeaponFactory.createWeapon("2");

        System.out.println(revolver);
        System.out.println(pistol);
        System.out.println(shotgun);

        for (int i = 0; i < 20; i++) {
            System.out.println(revolver.makeShot() + " нанес урона revolver");
            System.out.println(pistol.makeShot() + " нанес урона pistol");
            System.out.println(shotgun.makeShot() + " нанес урона shotgun");
        }
    }

//    private static void makeShot(int ammount, Weapon weapon) {
//        for (int i = 0; i < ammount; i++) {
//            weapon.makeShot();
//        }
//    }
}
