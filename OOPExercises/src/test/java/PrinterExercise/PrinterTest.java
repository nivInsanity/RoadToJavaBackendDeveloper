package PrinterExercise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class PrinterTest {

    private static final Logger log = LoggerFactory.getLogger(PrinterTest.class);

    @Test
    void addTonerTest() {
        Printer printer = new Printer(-40, true);

        log.info("Adding some toner, returned value {}", printer.addToner(50));
    }
}