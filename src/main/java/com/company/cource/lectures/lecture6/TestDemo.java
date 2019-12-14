package com.company.cource.lectures.lecture6;
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class TestDemo {
        /**
         * Изменение объекта
         *
         * @param box
         */
        static void changeObject(Box box) {
            box.width *= 2;
            box.height /= 2;
            box.depth += 2;
        }

        /**
         * Изменение примитивных типов
         *
         * @param a
         * @param b
         */
        static void changePrimitives(int a, int b) {
            a *= 2;
            b /= 2;
        }

        public static void main(String[] args) {
            Box box = new Box(5, 6, 7);

            int x = 10;
            int y = 10;
            /*System.out.println("x и y перед вызовом: " + x + " " + y);
            changePrimitives(x, y);
            System.out.println("x и y после вызова: " + x + " " + y);*/
            System.out.println(box.width);
            changeObject(box);
            System.out.println(box.width);

            //System.out.println("box перед вызовом: " + box.width + " " + box.height + " " + box.depth);
            //changeObject(box);
            //System.out.println("box после вызова: " + box.width + " " + box.height + " " + box.depth);
        }
    }