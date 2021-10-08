package main.java.com.gmail.sabarov.e.taskoneanagrams;

public class LongColumnDivisioner {

    private StringBuilder result = new StringBuilder();
    private StringBuilder quotient = new StringBuilder();
    private StringBuilder reminder = new StringBuilder();
    public static final IllegalArgumentException exception = new IllegalArgumentException("Divisor cannot be 0, division by zero");


    public String longColumnDivision(long dividend, long divisor) {
        
        if (divisor == 0) {
            throw exception;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (dividend < divisor) {
            return "" + dividend + " / " + divisor + " = 0";
        }

        String[] digits = String.valueOf(dividend).split("");
        Long reminderNumber;
        Long multiplyResult;
        Long divisorDigit = calculateDigit(divisor);
        Long mod;

        for (int i = 0; i < digits.length; i++) {
            reminder.append(digits[i]);
            reminderNumber = Long.parseLong(reminder.toString());

            if (reminderNumber >= divisor) {
                mod = reminderNumber % divisor;
                multiplyResult = reminderNumber / divisor * divisor;

                String lastReminder = String.format("%" + (i + 2) + "s", "_" + reminderNumber);
                result.append(lastReminder).append("\n");

                    String multiply = String.format("%" + (i + 2) + "d", multiplyResult);
                result.append(multiply).append("\n");

                Long tab = lastReminder.length() - calculateDigit(multiplyResult);
                result.append(makeDivider(reminderNumber, tab)).append("\n");

                quotient.append(reminderNumber / divisor);

                reminder.replace(0, reminder.length(), mod.toString());
                reminderNumber = Long.parseLong(reminder.toString());
            } else {
                if (i >= divisorDigit) {
                    quotient.append(0);
                }
            }

            if (i == digits.length - 1) {
                result.append(String.format("%" + (i + 2) + "s", reminderNumber.toString())).append("\n");
            }
        }
        modifyResultToView(dividend, divisor);
        return result.toString();
    }

    private String makeDivider(Long reminderNumber, Long tab) {
        return assemblyString(tab, ' ') + assemblyString(calculateDigit(reminderNumber), '-');
    }

    private void modifyResultToView(Long dividend, Long divisor) {
        int[] index = new int[3];
        for (int i = 0, j = 0; i < result.length(); i++) {
            if (result.charAt(i) == '\n') {
                index[j] = i;
                j++;
            }

            if (j == 3) {
                break;
            }
        }

        long tab = calculateDigit(dividend) + 1 - index[0];
        result.insert(index[2], assemblyString(tab, ' ') +"|" + quotient.toString());
        result.insert(index[1], assemblyString(tab, ' ') +"|" + assemblyString(quotient.length(), '-'));
        result.insert(index[0], "|" + divisor);
        result.replace(1, index[0], dividend.toString());
    }

    private long calculateDigit(long i) {
        return (long) Math.log10(i) + 1;
    }
    private String assemblyString(long numberOfSymbols, char symbol) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < numberOfSymbols; i++) {
            string.append(symbol);
        }
        return string.toString();
    }
}