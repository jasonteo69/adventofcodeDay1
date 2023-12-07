public class Digits {
    private final String digit;


    public Digits(String digit) {
        this.digit = digit;
    }


    public String firstLast() {
        String result = "";
        String total = "";
        for (int i = 0; i < digit.length(); i++) {
            result = digit.substring(i, i + 1);
            if (result.equals("1") || result.equals("2") || result.equals("3") || result.equals("4") || result.equals("5") || result.equals("6") || result.equals("7") || result.equals("8") || result.equals("9") || result.equals("0")) {
                total += result;
            }
        }
        return total;
    }

    public String reverseFirstLast() {
        String result = "";
        String total = "";
        int i = 0;
            for (i = 0; i < digit.length(); i++) {
                result += digit.charAt(i);
                if (result.contains("one") || result.contains("1")) {
                    total += "1";
                    result = digit.substring(i);
                } else if (result.contains("two") || result.contains("2")) {
                    total += "2";
                    result = digit.substring(i);
                } else if (result.contains("three") || result.contains("3")) {
                    total += "3";
                    result = digit.substring(i);
                } else if (result.contains("four") || result.contains("4")) {
                    total += "4";
                    result = digit.substring(i);
                } else if ((result.contains("five")) || result.contains("5")) {
                    total += "5";
                    result = digit.substring(i);
                } else if ((result.contains("six")) || result.contains("6")) {
                    total += "6";
                    result = digit.substring(i);
                } else if ((result.contains("seven")) || result.contains("7")) {
                    total += "7";
                    result = digit.substring(i);
                } else if ((result.contains("eight")) || result.contains("8")) {
                    total += "8";
                    result = digit.substring(i);
                } else if ((result.contains("nine")) || result.contains("9")) {
                    total += "9";
                    result = digit.substring(i);
                }
                if (result.endsWith("1")) {
                    total += "1";
                }
                if (result.endsWith("2")) {
                    total += "2";
                }
                if (result.endsWith("3")) {
                    total += "3";
                }
                if (result.endsWith("4")) {
                    total += "4";
                }
                if (result.endsWith("5")) {
                    total += "5";
                }
                if (result.endsWith("6")) {
                    total += "6";
                }
                if (result.endsWith("7")) {
                    total += "7";
                }
                if (result.endsWith("8")) {
                    total += "8";
                }
                if (result.endsWith("9")) {
                    total += "9";
                }
            }
        return total;
    }
}