package lectures.lecture15_generics;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
                "val=" + val +
                '}';
    }
}

class ArrayListClass {
    public static List<BoxPrinter> list = new ArrayList<>();

    public static List<BoxPrinter> getList() {
        return list;
    }

    public static <T> BoxPrinter findByObjectValue(T val) throws FileNotFoundException {
        for (BoxPrinter printer : list) {
            if (printer.getVal().equals(val)) {
                return printer;
            }
        }
        throw new FileNotFoundException("Nothing found");
    }

}

public class TestGeneric{
    public static void main(String[] args) throws FileNotFoundException {
        BoxPrinter<Integer> printer1 = new BoxPrinter<>(10);
        ArrayListClass.list.add(printer1);

        BoxPrinter<String> printer2 = new BoxPrinter<>("string2");
        ArrayListClass.list.add(printer2);

        //System.out.println(ArrayListClass.getList());
        System.out.println(ArrayListClass.findByObjectValue(101));
    }
}
