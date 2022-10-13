package Java_kurs.HomeWork4;

import java.util.Random;
/* *Даний клас реалізує виведення випадкового імені зі списку імен
(використовуючи тип enum для списку імен) */
public class NewName {
    public static String GetRandomName(){
        Random random = new Random();
        NamesLynx newName = NamesLynx.values()[random.nextInt(NamesLynx.values().length)];
        return getNewName(newName);
    }
    public void printNewName(){
        System.out.println("Дамо нове ім'я малюку рисі");
        System.out.println("Нехай це буде:");
        System.out.println(GetRandomName());

    }
    public static String getNewName (NamesLynx namesLynx){
        switch (namesLynx){
            case VASYA:
                return "Vasya";
            case PUSHOK:
                return "Pushok";
            case SNEGOK:
                return "Snegok";
            case DRUGOK:
                return "Drugok";
            case LION:
                return "Lion";
            default:
                throw new RuntimeException();
        }
    }
    public enum NamesLynx {
        VASYA,
        PUSHOK,
        SNEGOK,
        DRUGOK,
        LION
    }
}
