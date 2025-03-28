package com.example.cardGuess.weapons.ammunition;

public final class WeaponFactory {
    private WeaponFactory() {

    }
//    Револьвер: 3-6, 7
//    Пистолет: 5-8, 5
//    Ружье: 6-10, 3

    public static Weapon createWeapon(String type) {
        return switch (type.toLowerCase()) {
            case "0" -> new Revolver(3, 6, 7);
            case "1" -> new Pistol(5, 8, 5);
            case "2" -> new Shotgun(6, 10, 3);
            default -> throw new IllegalArgumentException("Unknown weapon type: " + type);
        };
    }
}