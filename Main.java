package Java_kurs.HomeWork4;

public class Main {
    public static void main(String[] args) {
        Lynx.MasterOfLynk[] lynx = {
                new Lynx("Barsik", 15).new MasterOfLynk("Sidorov","Vanya"),
                new Lynx("Tuzik", 15).new MasterOfLynk("Petrov","Sasha"),
                new Lynx("Myrchik", 2).new MasterOfLynk("Ivanov","Kolya")};
        NewName newname = new NewName();
        System.out.println("���������� ��� ������ �� �� ��������");
        for (Lynx.MasterOfLynk aaa : lynx) {
            System.out.println(aaa);
        }
        System.out.println();

        //��������� ���������� ��� ���� ���������� ��� � �����
        Lynx.LynxHabibat.habibat();
        System.out.println();

        //��������� ��������� ������� ���������� ����� ���� Lynx
        System.out.println("ʳ������ ���������� ����� ���� Lynx -"+ Lynx.getCount());
        System.out.println();

        //��������� ��������� ����������� ���� ��� ���������������� ������ ���
        newname.printNewName();
    }
}


