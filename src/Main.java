public class Main {
    public static void main(String[] args) {

        char karakter = 'ö';
        String result = chackesliSessizHarf(karakter);

        System.out.println(result);

    }

    public static String chackesliSessizHarf(char letter) {
        return switch (letter) {
            case 'a', 'ı', 'o', 'u' -> "\nKalın sesli harf\n";
            case 'e', 'i', 'ö', 'ü' -> "\nİnce sesli harf\n";
            default -> "\nGeçersiz harf veya karakter girişi yaptınız!\n ";
        };
    }
}
