package com.company;

public class Maximum <E extends Comparable<E>> {

    E first;
    E second;
    E third;



    public static <E extends Comparable<E>> void testMaximum(E first, E second, E third) {
        if(first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
            System.out.println(" First is largest ");
        }
        else if(second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            System.out.println(" Second is largest");
        }
        else
            System.out.println(" Third is largest");
    }

    public void testMaximum() {
        testMaximum(this.first, this.second, this.third);
    }

    public Maximum(E first, E second, E third) {
        super();
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printMax(E max) {
        System.out.println(" max = " + max);
    }
}


