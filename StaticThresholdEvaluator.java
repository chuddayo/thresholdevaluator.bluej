public class StaticThresholdEvaluator {
    /**
     * Write a method named `isThresholdExceeding` which returns `true` if
     * its second integer parameter, `limit`, is less than
     * its first integer parameter, `threshold`.
     *
     * @param threshold - the value to compare against `limit`
     * @param limit - the value to compare against `threshold`
     * @return `true` if `limit` is less than `threshold`
     */ // TODO - Ensure the respective tests in the `StaticThresholdEvaluatorTest` class passes
    static Boolean isThresholdExceeding(Integer threshold, Integer limit) {
        System.out.println(String.valueOf(threshold));
        System.out.println(String.valueOf(limit));
        if (limit < threshold) {
            return true;
        }
        return false;
    }

    /**
     * Write a method named `isThresholdReached` which returns `true` if
     * its second integer parameter, `limit`, is greater than
     * its first integer parameter, `threshold`.
     *
     * @param threshold - the value to compare against `limit`
     * @param limit - the value to compare against `threshold`
     * @return `true` if `limit` is greater than `threshold`
     */ // TODO - Create a respective test in the `StaticThresholdEvaluatorTest` class
    static Boolean isThresholdReached(Integer threshold, Integer limit) {
        return !isThresholdExceeding(threshold, limit);
    }
}

