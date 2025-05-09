package formatting;

public class ReverseFormatter {
    @Override
    public String format(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
