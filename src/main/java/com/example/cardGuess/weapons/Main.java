package com.example.cardGuess.weapons;

import com.example.cardGuess.weapons.ammunition.Weapon;
import com.example.cardGuess.weapons.ammunition.WeaponFactory;

//todo: на данный момент игра производит поочередно выстрелы из всех орудии нанося урон в диапазоне каждого из них
// на этом этапе работа завершена так ак реализовано абстрактным классом
public class Main {
    public static void main(String[] args) {
        Weapon revolver = WeaponFactory.createWeapon("0");
        Weapon pistol = WeaponFactory.createWeapon("1");
        Weapon shotgun = WeaponFactory.createWeapon("2");

        System.out.println(revolver);
        System.out.println(pistol);
        System.out.println(shotgun);

        shootWeapon(revolver);
        shootWeapon(pistol);
        shootWeapon(shotgun);
    }

    private static void shootWeapon(Weapon weapon) {
        for (int i = 0; i < weapon.getMagazineCapacity() + 1; i++) {
            System.out.println(weapon.getClass().getSimpleName().toLowerCase() + " magazine capacity: " + weapon.getMagazineCapacity());
            System.out.println(weapon.makeShot() + " damage dealt by " + weapon.getClass().getSimpleName().toLowerCase());
        }
    }
}
