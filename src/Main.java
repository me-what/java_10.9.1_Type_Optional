// Тип Optional

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get()); // 1
        System.out.println();


        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        Optional<Integer> min2 = numbers2.stream().min(Integer::compare);
        if(min2.isPresent()) {
            System.out.println(min2.get());
        }


        ArrayList<Integer> numbers3 = new ArrayList<Integer>();
        Optional<Integer> min3 = numbers3.stream().min(Integer::compare);
        System.out.println(min3.orElse(-1)); // -1

        numbers3.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        min3 = numbers3.stream().min(Integer::compare);
        System.out.println(min3.orElse(-1)); // 4
        System.out.println();


        ArrayList<Integer> numbers4 = new ArrayList<Integer>();
        Optional<Integer> min4 = numbers4.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min4.orElseGet(()->rnd.nextInt(100)));
        System.out.println();


        ArrayList<Integer> numbers5 = new ArrayList<Integer>();
        Optional<Integer> min5 = numbers5.stream().min(Integer::compare);
        System.out.println();


        ArrayList<Integer> numbers6 = new ArrayList<Integer>();
        numbers6.addAll(Arrays.asList(new Integer[]{4,5,6,7,8,9}));
        Optional<Integer> min6 = numbers6.stream().min(Integer::compare);
        min6.ifPresent(v->System.out.println(v)); // 4
        System.out.println();


        ArrayList<Integer> numbers7 = new ArrayList<Integer>();
        Optional<Integer> min7 = numbers7.stream().min(Integer::compare);
        min7.ifPresentOrElse(
                v -> System.out.println(v),
                () -> System.out.println("Value not found")
        );
    }
}