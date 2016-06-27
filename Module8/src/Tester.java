import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Алексей on 25.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        List<MusicalInstruments> list = new ArrayList<>();
        list.add(new Piano());
        list.add(new Trumpet());
        list.add(new Guitar());
        Printer.print(list);


        Set<MusicalInstruments> sortedSet = new HashSet<>();
        sortedSet.add(list.get(0));
        sortedSet.add(list.get(1));
        sortedSet.add(list.get(2));


    }
}
