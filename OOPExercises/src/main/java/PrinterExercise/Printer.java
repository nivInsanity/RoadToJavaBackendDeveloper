package PrinterExercise;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        int tempLevel = tonerLevel + tonerAmount;

        if (tempLevel < 0 || tempLevel > 100) {
            return -1;
        } else {
            return tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2 ) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
