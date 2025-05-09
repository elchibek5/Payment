package formatting;

public class CamelCaseFormatter implements Formatter {
    @Override
    public String format(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder result  = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == ' ') {
                capitalizeNext = true;
            } else {
                if (i == 0) {
                    result.append(Character.toLowerCase(c));
                } else if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
