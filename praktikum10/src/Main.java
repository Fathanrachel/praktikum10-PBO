public class Main {
    public static void main(String[] args) {

        Mobil VW = new Mobil();

        Mobil.Mesin v12 = VW.new Mesin(8, 750);
        Mobil.Ban ban1 = VW.new Ban("Michelin", 255/125);
        Mobil.Ban ban2 = VW.new Ban("Michelin", 255/125);
        Mobil.Ban ban3 = VW.new Ban("Michelin", 255/125);
        Mobil.Ban ban4 = VW.new Ban("Michelin", 255/125);
        Mobil.HeadUnit HU = VW.new HeadUnit("Venom", 18);

        Sopir sp = new Sopir("Pak Agus",VW,"Bandung");

        v12.hidupkan();
        ban1.putar();
        ban2.putar();
        ban3.putar();
        ban4.putar();

        sp.mengemudi();

    }
}