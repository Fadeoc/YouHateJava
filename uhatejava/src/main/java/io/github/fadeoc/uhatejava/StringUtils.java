package io.github.fadeoc.uhatejava;

/**
 * @author Scania
 * @version 1.0.0
 * @since 1.0.0
 */
public class StringUtils {

    // HideUtilityClassConstructor
    protected StringUtils() {
    }

    /**
     * check a string is real empty after trimming.
     *
     * @param s
     * @return boolean
     */
    public static boolean isEmptyAfterTrimmed(String s) {
        return s.trim().isEmpty();
    }

}
