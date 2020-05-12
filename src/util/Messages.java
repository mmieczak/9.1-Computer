package util;

public final class Messages {
    public static String printMessageCode(int code, String name) {
        return switch (code) {
            case 100 -> name + " ERROR! New clock for is below based value. Operation cancelled";
            case 200 -> name + " WARNING! MAX temp exceeded. Changing this clock to desired value will harm this element.  ";

            default -> throw new IllegalStateException("Unexpected value: " + code);
        };
    }

}
