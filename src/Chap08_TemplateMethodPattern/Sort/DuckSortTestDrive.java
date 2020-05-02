package Chap08_TemplateMethodPattern.Sort;

import java.util.Arrays;

import static Chap08_TemplateMethodPattern.Sort.Comparable.sort;

public class DuckSortTestDrive {
    public static void main(String[] args){
        Duck[] ducks={
                new Duck("Daffy", 8),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10)
        };
        System.out.println("정렬 전:");
        display(ducks);
        sort(ducks);

        System.out.println("\n 정렬 후:");
        display(ducks);
    }
    public static void display(Duck[] ducks){
        for(int i=0;i<ducks.length;i++){
            System.out.println(ducks[i]);
        }
    }
}
