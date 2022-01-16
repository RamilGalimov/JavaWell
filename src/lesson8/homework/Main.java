package lesson8.homework;

public class Main {
    public static void main(String[] args) {
        Books books1 = new Books();
        Books books2 = new Books();
        Magazines magazines1 = new Magazines();
        Magazines magazines2 = new Magazines();
        PrintedEditions[] printedEditions = new PrintedEditions[4];
        printedEditions[0] = books1;
        printedEditions[1] = books2;
        printedEditions[2] = magazines1;
        printedEditions[3] = magazines2;
        printedFatEditions(printedEditions);
    }

    public static void printedFatEditions(PrintedEditions[] printedEditions) {
        PrintedEditions theFatEditions = printedEditions[0];
        for (PrintedEditions publ :
                printedEditions) {
            if (publ.getNumberOfPages() > theFatEditions.getNumberOfPages()) {
                theFatEditions = publ;
            }
        }
        System.out.println(theFatEditions);
    }

    public static void printedFatBooks(PrintedEditions[] printedEditions) {
        PrintedEditions theFatEditions = null;
        for (PrintedEditions publ :
                printedEditions) {
            if (publ instanceof Books) {
                if (theFatEditions == null) {
                    theFatEditions = publ;
                } else {
                    if (publ.getNumberOfPages() > theFatEditions.getNumberOfPages()) {
                        theFatEditions = publ;
                    }
                }
            }
        }
        System.out.println(theFatEditions);
    }
}


