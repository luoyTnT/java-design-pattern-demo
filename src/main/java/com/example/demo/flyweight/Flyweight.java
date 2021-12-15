package com.example.demo.flyweight;

import java.util.HashMap;

public class Flyweight {

    private static final HashMap<Integer, Engineer> map = new HashMap<>();

    public static Engineer getEngineer(Integer mapKey) {
        Engineer engineer;

        switch (mapKey) {
            case Engineer.EASY:
                if (map.get(mapKey) == null) {
                    engineer = new JuniorEngineer();
                    map.put(mapKey, engineer);
                } else {
                    engineer = map.get(mapKey);
                }
                break;
            case Engineer.MEDIUM:
                if (map.get(mapKey) == null) {
                    engineer = new IntermediateEngineer();
                    map.put(mapKey, engineer);
                } else {
                    engineer = map.get(mapKey);
                }
                break;
            case Engineer.DIFFICULT:
                if (map.get(mapKey) == null) {
                    engineer = new SeniorEngineer();
                    map.put(mapKey, engineer);
                } else {
                    engineer = map.get(mapKey);
                }
                return engineer;
            default:
                if (map.get(-1) == null) {
                    engineer = () -> System.out.println("其他开发");
                    map.put(-1, engineer);
                } else {
                    engineer = map.get(mapKey);
                }
                break;
        }
        return engineer;
    }

}
