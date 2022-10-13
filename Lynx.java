package Java_kurs.HomeWork4;

public class Lynx{
    private static int count = 0;// змінна для підрахунку кількості створенних обєктів
    private String name;        // зміна яка смістить імя тварини
    private int age;           // змінна яка містить вік тварини

    // блок конструктор
    public Lynx(String name, int age) {
        this.name = name;
        this.age = age;
        new Counter().setCount(); // виклик лічильника кількості створенних обєктів
    }
    // блок геттерів та сеттерів для класу Lynx
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

   private static class Counter{ //Клас - лічильник створенних обєктів
        public void setCount(){
            count ++;
        }
   }
   public static class LynxHabibat{ // класс в якому зберігається особиста інформація про місце проживання рисі в Україні
        public static void habibat(){
            System.out.println("Рись відноситься до тварин рідкісного виду, який занесений до Червоної книги України." +
                    " В Україні номінативна форма поширена на території Полісся — окремі р-ни Волинської," +
                    " Житомирської, Київської, Рівненської,Чернігівської областей. Карпатська форма " +
                    "трапляється в Карпатах на території Львівської, Закарпатської, Івано-Франківської," +
                    " Чернівецької областей. До XIX ст. вид був поширений в Карпатах, Поліссі, Лісостепу і Степу.");
        }
   }
   public  class MasterOfLynk { //Клас в якому ініціалізується інформація власників рисі
        private String firstName; //Фамілія власника
        private String secondName;//Імя власника
        // блок конструктор
        public MasterOfLynk(String firstName,String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }
        // блок геттерів та сеттерів
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


