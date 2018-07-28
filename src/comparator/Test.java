package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    class Dog {
        public int age;
        public String name;

        public Dog(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(new Test().new Dog(5, "DogA"));
        list.add(new Test().new Dog(6, "DogB"));
        list.add(new Test().new Dog(7, "DogC"));
        Dog maxAge = Collections.max(list, new Comparator<Dog>() {

            @Override
            public int compare(Dog o1, Dog o2) {
                return o2.age - o1.age;
            }
        });
        System.out.println("给狗狗按照年龄倒序：" + maxAge.name);
        for (Dog dog : list) {
            System.out.println("name = [" + dog.name + "]" + "age = [" + dog.age + "]");
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(720);
        numbers.add(540);
        numbers.add(640);
        numbers.add(660);
        Integer integer = Collections.max(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("o1 = [" + o1 + "], o2 = [" + o2 + "]");
                return 1;
            }
        });
        System.out.println("integer = [" + integer + "]");
/**
 *
 o1 = [540], o2 = [720]
 o1 = [640], o2 = [720]
 o1 = [660], o2 = [720]
 integer = [720]
 */
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("o1 = [" + o1 + "], o2 = [" + o2 + "]");
                return o2 - o1;
            }
        });
        for (Integer itg : numbers) {
            System.out.println("itg = [" + itg + "]");
        }
        /**
         * return 1
         * o1 = [540], o2 = [720]
         * o1 = [640], o2 = [540]
         * o1 = [660], o2 = [640]
         * itg = [720]
         * itg = [540]
         * itg = [640]
         * itg = [660]
         */
        /**
         * return -1
         * o1 = [540], o2 = [720]
         * o1 = [640], o2 = [540]
         * o1 = [660], o2 = [640]
         * itg = [660]
         * itg = [640]
         * itg = [540]
         * itg = [720]
         */
        /**
         * return o1 - o2  从小到大
         * o1 = [540], o2 = [720]
         * o1 = [640], o2 = [540]
         * o1 = [640], o2 = [720]
         * o1 = [640], o2 = [540]
         * o1 = [660], o2 = [640]
         * o1 = [660], o2 = [720]
         * itg = [540]
         * itg = [640]
         * itg = [660]
         * itg = [720]
         */
        /**
         * return o2 - o1 从大到小
         * o1 = [540], o2 = [720]
         * o1 = [640], o2 = [540]
         * o1 = [640], o2 = [540]
         * o1 = [640], o2 = [720]
         * o1 = [660], o2 = [640]
         * o1 = [660], o2 = [720]
         * itg = [720]
         * itg = [660]
         * itg = [640]
         * itg = [540]
         */
        Integer itg = Collections.max(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("o1 = [" + o1 + "], o2 = [" + o2 + "]");
                return o2 - o1;
            }
        });
        System.out.println("itg = [" + itg + "]");
        /**
         *         numbers.add(720);
         *         numbers.add(540);
         *         numbers.add(640);
         *         numbers.add(660);
         * o1 = [660], o2 = [720]
         * o1 = [640], o2 = [660]
         * o1 = [540], o2 = [640]
         * itg = [540]
         */
        Integer itg1 = Collections.max(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("o1 = [" + o1 + "], o2 = [" + o2 + "]");
                return o1 - o2;
            }
        });
        System.out.println("itg1 = [" + itg1 + "]");
        /**
         * o1 = [660], o2 = [720]
         * o1 = [640], o2 = [720]
         * o1 = [540], o2 = [720]
         * itg1 = [720]
         */
    }
}
