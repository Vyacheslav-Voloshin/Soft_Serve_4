package Java_kurs.HomeWork4;

public class Lynx{
    private static int count = 0;// ����� ��� ��������� ������� ���������� �����
    private String name;        // ���� ��� ������� ��� �������
    private int age;           // ����� ��� ������ �� �������

    // ���� �����������
    public Lynx(String name, int age) {
        this.name = name;
        this.age = age;
        new Counter().setCount(); // ������ ��������� ������� ���������� �����
    }
    // ���� ������� �� ������� ��� ����� Lynx
    public static int getCount(){
        return count;
    }
    public  String getName() {
        return name;
    }
    public void setName(String value){
        name = value;
    }
    public int getAge(){ return age; }
    public void setAge(int number) {age = number;}

   private static class Counter{ //���� - �������� ���������� �����
        public void setCount(){
            count ++;
        }
   }
   public static class LynxHabibat{ // ����� � ����� ���������� �������� ���������� ��� ���� ���������� ��� � �����
        public static void habibat(){
            System.out.println("���� ���������� �� ������ �������� ����, ���� ��������� �� ������� ����� ������." +
                    " � ����� ���������� ����� �������� �� ������� ������ � ����� �-�� ���������," +
                    " �����������, �������, г��������,���������� ��������. ���������� ����� " +
                    "����������� � �������� �� ������� ��������, ������������, �����-����������," +
                    " ���������� ��������. �� XIX ��. ��� ��� ��������� � ��������, �����, ˳������� � �����.");
        }
   }
   public  class MasterOfLynk { //���� � ����� ������������ ���������� �������� ���
        private String firstName; //����� ��������
        private String secondName;//��� ��������
        // ���� �����������
        public MasterOfLynk(String firstName,String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }
        // ���� ������� �� �������
       public String getFirstName() {
           return firstName;
       }

       public String getSecondName() {
           return secondName;
       }

       public String toString(){
           return "Lynx name: "+getName()+", age:" + getAge()+ "; Master name: " + getFirstName() +" "+getSecondName();
       }

       }
   }


