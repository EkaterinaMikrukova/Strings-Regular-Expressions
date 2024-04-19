public class Main {
    public static void main(String[] args) {
        len();
        split();
        trim();
        charAt();
        stringBuilder();
        checkRegex1();
        checkRegex2();
        checkRegex3();
        passwordRegex();
    }

    /**
     * ^ - начало строки
     * [a-zA-Z]* - любое количество латинских букв
     * [0-9]+ - одна или более цифр
     * [a-zA-Z0-9]* - любое количество латинских букв и/или цифр
     * $ - конец строки
     */
    private static void passwordRegex() {
        String regex = "^[[a-zA-Z]+[0-9]*[a-zA-Z0-9]*]{5,8}$";
        String password = "qweйrty1";

        boolean result = password.matches(regex);
        print(String.valueOf(result));
    }

    private static void checkRegex3() {
        boolean res = "PrdStr".matches("[^a-z]?");
        print(String.valueOf(res));
    }

    private static void checkRegex2() {
        boolean res = "PrdStr".matches("[a-zA-Z]?");
        print(String.valueOf(res));
    }

    private static void checkRegex1() {
        boolean res = "q".matches("[a-z]");
        print(String.valueOf(res));
    }

    private static void charAt() {
        String str = "Строка";
        print(str.charAt(0) + "");
    }

    private static void stringBuilder() {
        int value1 = 300;
        double value2 = 3.14;
        short value3 = 5;
        char value4 = 'A';


        StringBuilder builder = new StringBuilder()
                .append(value1)
                .append("\n")
                .append(value2)
                .append("\n")
                .append(value3)
                .append("\n")
                .append(value4);

        String result = builder.toString();

        print(result);
    }

    private static void len() {
        String str = "Строка";
        print(str.length() + "");
    }

    private static void trim() {
        String str = "       Строка      ";
        print(String.valueOf(str.trim()));
    }

    private static void split() {
        String forSplit = "Нужно выделить отдельные слова";
        String[] res = forSplit.split(" ");
        for (String str : res) {
            print(str);
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}