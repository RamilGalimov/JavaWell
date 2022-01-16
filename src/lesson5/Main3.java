package lesson5;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "75000", "9", "4 звезды", "самолет"},
                {"Египет", "90000", "6", "3 звезды", "автобус"},
                {"Тунис", "150000", "7", "3 звезды", "самолет"},
                {"Турция", "120000", "5", "4 звезды", "автобус"},
                {"ОАЭ", "40000", "5", "5 звезд", "самолет"},
                {"ОАЭ", "90000", "4", "4 звезды", "самолет"}};

//        ToursUtils.printToursByCountry(tours, "Турция");
//        ToursUtils.printToursFromToPrice(tours, 60000, 100000);


//        ДОМАШНЕЕ ЗАДАНИЕ:
//        ToursUtils.printToursFromTheStarsAndAbove(tours, 4);
//        ToursUtils.printToursByTypeOfTransport(tours, "автобус");
//        ToursUtils.printToursByCountryFromToPrice(tours, "ОАЭ", 40000, 60000);
        ToursUtils.printToursByAveragePricePerCountry(tours, "Турция");
    }
}
