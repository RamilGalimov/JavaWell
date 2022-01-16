package lesson5;

public class ToursUtils {
    public static void printToursByCountry(String[][] toursBySort, String country) {
        for (int i = 0; i < toursBySort.length; i++) {
            if (toursBySort[i][0].equals(country)) {
                System.out.printf("Тур: %s, %s рублей, на %s дня, %s, транспорт-%s\n", toursBySort[i][0],
                        toursBySort[i][1], toursBySort[i][2],
                        toursBySort[i][3], toursBySort[i][4]);
            }
        }
    }

    public static void printToursFromToPrice(String[][] tours, int from, int to) {
        for (int i = 0; i < tours.length; i++) {
            String tourPrice = tours[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);
            if (tourPriceNum >= from && tourPriceNum <= to) {
                System.out.printf("Тур: %s, %s рублей, на %s дня, %s, транспорт-%s\n", tours[i][0],
                        tours[i][1], tours[i][2],
                        tours[i][3], tours[i][4]);

            }
        }
    }

    //    ДОМАШНЕЕ ЗАДАНИЕ:
//    Напечатать все туры от ...звезд и выше
    public static void printToursFromTheStarsAndAbove(String[][] tours, int from) {
        for (int i = 0; i < tours.length; i++) {
            String tourByStars = tours[i][3];
            String byStars = tourByStars.substring(0, 1);
            int byStarsNum = Integer.parseInt(byStars);
            if (byStarsNum >= from) {
                System.out.printf("Тур: %s, %s рублей, на %s дня, %s, транспорт-%s\n", tours[i][0],
                        tours[i][1], tours[i][2],
                        tours[i][3], tours[i][4]);
            }
        }

    }


    //    Напечатать туры только в ... страну от... до... по бюджету
    public static void printToursByCountryFromToPrice(String[][] tours, String country, int from, int to) {
        for (int i = 0; i < tours.length; i++) {
            String tourPrice = tours[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);
            if (tours[i][0].equals(country) && (tourPriceNum >= from && tourPriceNum <= to)) {
                System.out.printf("Тур: %s, %s рублей, на %s дня, %s, транспорт-%s\n", tours[i][0],
                        tours[i][1], tours[i][2],
                        tours[i][3], tours[i][4]);
            }
        }
    }

    //    Напечатать туры только на ... (вид транспорта)
    public static void printToursByTypeOfTransport(String[][] tours, String transport) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][4].equals(transport)) {
                System.out.printf("Тур: %s, %s рублей, на %s дня, %s, транспорт-%s\n", tours[i][0],
                        tours[i][1], tours[i][2],
                        tours[i][3], tours[i][4]);
            }
        }
    }

    //    Напечатать среднюю цену тура в ... страну
    public static void printToursByAveragePricePerCountry(String[][] tours, String country) {
        int sumPrice = 0;
        int numberCountry = 0;
        for (int i = 0; i < tours.length; i++) {
            String tourPrice = tours[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);
            if (tours[i][0].equals(country)) {
                sumPrice = sumPrice + tourPriceNum;
                numberCountry++;
            }
        }
        System.out.println(sumPrice / numberCountry++);

    }

}