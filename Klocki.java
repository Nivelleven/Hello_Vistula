public class Klocki {
    public static void main(String[] args) {

        int iloscKlockiLobyntsev = 75;
        int pojemnoscLobyntsev = 8;
        int aLobyntsev = iloscKlockiLobyntsev / pojemnoscLobyntsev;
        int bLobyntsev = iloscKlockiLobyntsev % pojemnoscLobyntsev;
        double cLobyntsev = aLobyntsev + bLobyntsev;

        System.out.println(aLobyntsev);
        System.out.println(cLobyntsev);
    }
}
