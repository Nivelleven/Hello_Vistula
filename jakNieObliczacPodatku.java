public class jakNieObliczacPodatku {
    public static void main(String[] args) {

        double nettoLobyntsev = 9.99;
        double vatLobyntsev = (nettoLobyntsev * 0.23);
        double bruttoLobyntsev = nettoLobyntsev + vatLobyntsev;
        double iloscSprzedanychLobyntsev = bruttoLobyntsev * 10000;
        double iloscVat = (iloscSprzedanychLobyntsev);

        System.out.println(String.format("%.4f%n" , bruttoLobyntsev));
        System.out.println(iloscSprzedanychLobyntsev);
    }
}
