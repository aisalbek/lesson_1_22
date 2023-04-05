import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(proverka(21,30));
        System.out.println(proverka(70,-45));
        System.out.println(proverka(30,35));
        System.out.println(proverka(1,40));
        System.out.println(proverka(20,5));
        System.out.println(proverka(generRandom1(),generRandom2()));

    }

    public static String proverka(int vozrast, int tempr) {
        if (vozrast >= 20 && vozrast <= 45 && tempr >= -20 && tempr <= 30)
            return "Можно идти гулять";
        else if (vozrast>=20&& tempr>=0&&tempr<28)
            return "Можно идти гулять";
        else if (vozrast>=45&&tempr>=-10&&tempr<25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }
    public static int generRandom1(){
        Random random = new Random();
        int ran = random.nextInt(100);
        return ran;
    }
    public static int generRandom2(){
        Random random = new Random();
        int ran = random.nextInt(-50, 50);
        return ran;
    }
}