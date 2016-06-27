import java.util.List;

/**
 Создать класс, который печатает созданные коллекции на экран в виде таблицы.
 Колонки таблицы соответствуют полям объектов.
 Каждая строка в таблице соответствует объекту из коллекции.
 */
public class Printer {

    static void print(List<MusicalInstruments> list){

        System.out.printf("%-17s%-10s", "Instrument Name", "Object");
        System.out.println();
        System.out.println("------------------------------");
        for (MusicalInstruments instrument:list){
            System.out.println(instrument.getName() +"           "+instrument);
        }

    }
}
