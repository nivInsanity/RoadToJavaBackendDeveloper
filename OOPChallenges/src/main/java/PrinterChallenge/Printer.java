package PrinterChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount) {
        if ((tonerLevel + tonerAmount < 0) || (tonerLevel + tonerAmount > 100)) {
             return -1;
        } else {
            return tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages) {
        if (isDuplex()) {
            System.out.println("It's a duplex printer.");
        }
        int jobPages = (duplex) ? (pages / 2 ) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
