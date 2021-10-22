public class Zadanie_2 {
    public static void main(String[] args) {

        float wagaEarthLobyntsev = 70; //mój ciężar jako przykładowy
        double massaMarsLobyntsev = (wagaEarthLobyntsev * 0.38); //obliczenie ciężara, który by był na Marsie
        double wynikLobyntsev = massaMarsLobyntsev;
        int rzutowanieIntLobyntsev = (int) wynikLobyntsev; //wykonanie rzutowania double na int
        char rzutowanieCharLobyntsev = (char) rzutowanieIntLobyntsev; //wykonanie rzutowania int na char
        int resultLobyntsev = rzutowanieCharLobyntsev + 15; //zrobiłem matematyczne działanie dla przykładu

        System.out.println(resultLobyntsev); //output wyniku tego działania do konsoli

        System.out.println("Twój ciężar na Marsie będzie równy: " +
               String.format("%.4f%n", wynikLobyntsev));
    }
}
