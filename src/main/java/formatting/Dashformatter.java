package formatting;

public class Dashformatter implements Formatter{
    @Override
    public String format(String input) {
        return input.replace(' ', '-');
    }

}
