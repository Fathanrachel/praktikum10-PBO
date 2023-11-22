public class Mobil {
    public Mesin mesin;
    public Ban ban;
    public HeadUnit headUnit;

    public Mobil() {
    }

    public void jalan() {
        System.out.println("Mobil Sedang Berjalan");
    }

    public void putarMusik() {
        headUnit.putarMusik();
    }

    public class Mesin {
        int silinder;
        int tenagaKuda;

        Mesin(int silinder, int tenagaKuda) {
            this.silinder = silinder;
            this.tenagaKuda = tenagaKuda;
        }

        public void hidupkan() {
            System.out.println("Mesin Dinyalakan");
        }
    }

    public class Ban {
        String merek;
        int ukuran;

        public Ban(String merek, int ukuran) {
            this.merek = merek;
            this.ukuran = ukuran;
        }

        public void putar() {
            System.out.println("Ban berputar!");
        }
    }

    public class HeadUnit {
        String merek;
        int ukuranLayar;

        public HeadUnit(String merek, int ukuranLayar) {
            this.merek = merek;
            this.ukuranLayar = ukuranLayar;
        }

        public void putarMusik() {
            System.out.println("Memutar musik!");
        }
    }

}
