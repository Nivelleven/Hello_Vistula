public class ParzystaCzyNieParzysta {
    public static void main(String[] args) {

        double randomiserLobyntsev = Math.random(); //tutaj tworzę program generujący losowę liczbę
        double xLobyntsev = randomiserLobyntsev * 100; //wskazuję maxymalną granicę, ale w tym momencie ona będzie równa 99
        double yLobyntsev = (int)xLobyntsev + 1; //...dlatego piszę tutaj +1, żeby było 100

        System.out.println( "Losowa liczba jest równa: " + yLobyntsev); //wypisuję wynik do konsoli

        //tutaj sprawdzę czy liczba jest parzysta
        if (yLobyntsev %2 == 0) {
            System.out.println("Liczba jest parzysta ");
        } else {
            System.out.println("Liczba nie jest parzysta ");
        }

    }
}
