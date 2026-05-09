package app;

public class Corrector {

    public String handleData(String[] strs) {

        if (strs == null || strs.length == 0) {
            throw new IllegalArgumentException("Input data cannot be null or empty");
        }

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (String str : strs) {

            if (str == null) {
                continue; // або можна теж вважати помилкою — залежить від вимог
            }

            if (str.contains("b")) {
                str = str.replace("b", "o");
            }

            count++;

            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(str)
                    .append("\n");
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        return stringBuilder.toString();
    }
}