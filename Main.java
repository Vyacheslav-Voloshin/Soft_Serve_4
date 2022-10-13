package Java_kurs.HomeWork4;

public class Main {
    public static void main(String[] args) {
        Lynx.MasterOfLynk[] lynx = {
                new Lynx("Barsik", 15).new MasterOfLynk("Sidorov","Vanya"),
                new Lynx("Tuzik", 15).new MasterOfLynk("Petrov","Sasha"),
                new Lynx("Myrchik", 2).new MasterOfLynk("Ivanov","Kolya")};
        NewName newname = new NewName();
        System.out.println("Інформація про тварин та їх власників");
        for (Lynx.MasterOfLynk aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();

        //Реалізація інформації про місце проживання рисі в Україні
        Lynx.LynxHabibat.habibat();
        System.out.println();

        //Реалізація підрахунку кількості створенних обєктів типу Lynx
        System.out.println("Кількість створенних обєктів типу Lynx -"+ Lynx.getCount());
        System.out.println();

        //Реалізація виведення випадкового імені для новонародженного малюка рисі
        newname.printNewName();
    }
}


