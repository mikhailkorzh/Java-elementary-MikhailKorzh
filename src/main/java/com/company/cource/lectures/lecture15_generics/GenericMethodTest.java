package lectures.lecture15_generics;

public class GenericMethodTest {
    public static <E> void print(E[] array) {

        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 4};
        String[] strArray = {"str1", "str2", "str3"};
        Double[] dblArray = {2.4, 4.6, 6.7};

        System.out.println("intArray:");
        print(intArray);
        System.out.println("strArray:");
        print(strArray);
        System.out.println("dblArray:");
        print(dblArray);
    }
}
