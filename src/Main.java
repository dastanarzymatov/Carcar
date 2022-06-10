import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Car деген класс тузунуз (Id, номер авто)
//        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
//        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.

        HashMap<Car, Id> hashMap2 = new HashMap<>();
        Car car=new Car("hechbek",517);
        Id id=new Id("Honda",2008,450000,"kara");
        hashMap2.put(car,id);

        Car car2=new Car("hechbek",124);
        Id id2=new Id("Toyota",2012,10000,"ak");
        hashMap2.put(car2,id2);


        Car car3=new Car("sedan",153);
        Id id3=new Id("Toyota",2012,10000,"kara");
        hashMap2.put(car3,id3);

        Car car4=new Car("sport",124);
        Id id4=new Id("Toyota",2017,10000,"kara");
        hashMap2.put(car4,id4);

        for (Map.Entry maps:hashMap2.entrySet()) {
            System.out.println(maps.getKey()+" "+maps.getValue());

        }


    }
}