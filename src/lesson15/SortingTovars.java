package lesson15;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingTovars {
    public static TreeSet<Tovar> sortByPriceFromTo(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new SortByPriceFromToComparator());

        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;

    }

    public static TreeSet<Tovar> sortByPriceToFrom(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                //        o1- первый товар
                //        o2- второй товар

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();

                }

                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o2.totalRate(), o1.totalRate());
                }
                if (!o1.getName().equals(o2.getName())) {
                    return o2.getName().compareTo(o1.getName());
                }

                return o2.getDialogs().size() - o1.getDialogs().size();
            }
        });

        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;
    }
}
