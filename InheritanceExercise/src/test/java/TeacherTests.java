import model.Historian;
import model.Mathematician;
import model.Teacher;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeacherTests {

    private static final Logger log = LoggerFactory.getLogger(TeacherTests.class);

    @Test
    public void defaultTeacherMessageTest() {
        Teacher teacher = new Teacher();

        log.info("What is default teacher doing? {}", teacher.classes());

        Assert.assertEquals("The teacher conducts a class.", teacher.classes());
    }

    @Test
    public void mathTeacherMessageTest() {
        Teacher teacher = new Mathematician();

        log.info("What is math teacher doing? {}", teacher.classes());

        Assert.assertNotEquals("The teacher conducts a class.", teacher.classes());
    }

    @Test
    public void historyTeacherMessageTest() {
        Teacher teacher = new Historian();

        log.info("What is history teacher doing? {}", teacher.classes());

        Assert.assertEquals("The teacher conducts a history class.", teacher.classes());
    }

}
