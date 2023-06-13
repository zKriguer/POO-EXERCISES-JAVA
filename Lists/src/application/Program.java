package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Kriguer");
        list.add("Dean");
        list.add("Sam");
        list.add("Bobby");
        list.add("Kassio");

        list.add(2, "Ruby");



        System.out.println(list.size());

        for (String x: list){
            System.out.println(x);
        }

        list.removeIf(x -> x.charAt(0) == 'S');
        list.remove("Ruby");

        System.out.println("----------------");

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("----------------");
        System.out.println("Index of Bobby: "+ list.indexOf("Bobby"));

        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());

        for (String x: result){
            System.out.println(x);
        }

        System.out.println("----------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.println(name);
    }
}
