public class ToBinary {
    static String toBinary(int number) {
        if (number == 0 || number == 1) { return String.valueOf(number); }    }
    int remainder = number % 2;

    return toBinary(number / 2) + remainder;
    static void main(String[] args) {

    }
}
