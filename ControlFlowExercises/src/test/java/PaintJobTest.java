import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaintJobTest {

    private static final Logger log = LoggerFactory.getLogger(PaintJobTest.class);

    @Test
    public void firstMethodCountTest() {
        int bucketCountResult = PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);

        log.info("Bucket count for the first method: {}", bucketCountResult);

        Assert.assertEquals(3, bucketCountResult);
    }

    @Test
    public void secondMethodCountTest() {
        int bucketCountResult = PaintJob.getBucketCount(3.4, 2.1, 1.5);

        log.info("Bucket count for the second method: {}", bucketCountResult);
        Assert.assertEquals(5, bucketCountResult);
    }

    @Test
    public void thirdMethodCountTest() {
        int bucketCountResult = PaintJob.getBucketCount(3.4, 1.5);

        log.info("Bucket count for the third method: {}", bucketCountResult);

        Assert.assertEquals(3, bucketCountResult);
    }

    @Test
    public void negativeValueTest() {
        int bucketCountResult = PaintJob.getBucketCount(3.4, -1.5);

        log.info("With negative value result is: {}", bucketCountResult);

        Assert.assertNotEquals(3, bucketCountResult);
    }
}