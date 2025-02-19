public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketsToBuy = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            bucketsToBuy = (int) Math.ceil((((width * height) - areaPerBucket * extraBuckets) / areaPerBucket));
        }
        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketsToBuy = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketsToBuy = (int) Math.ceil((((width * height) / areaPerBucket)));
        }
        return bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketsToBuy = 0;

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketsToBuy = (int) Math.ceil(area / areaPerBucket);
        }
        return bucketsToBuy;
    }
}
