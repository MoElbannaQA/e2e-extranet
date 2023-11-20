package utils;



public class SeleniumConfig {
    private static final String BASE_URL;

    static {
        BASE_URL = "https://extranet.stg.legateonline.com/login?redirect=%2Fdashboard";

    }
    public static String getValue() {
        return BASE_URL;
    }
}
