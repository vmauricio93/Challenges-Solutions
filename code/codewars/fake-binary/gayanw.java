import static java.util.stream.Collectors.joining;

public class FakeBinary {
    public static String fakeBin(String str) {
        return str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
    }
}
