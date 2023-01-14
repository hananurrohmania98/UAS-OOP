import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone galaxyFlip = new Samsung();
        Phone reno8 = new Oppo();

        // membuat objek user
        PhoneUser hana = new PhoneUser(redmiNote8);
        PhoneUser rizki = new PhoneUser(galaxyFlip);
        PhoneUser abdu = new PhoneUser(reno8);

        // kita coba nyalakan HP-nya
        hana.turnOnThePhone();
        rizki.turnOnThePhone();
        abdu.turnOnThePhone();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                hana.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                hana.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                hana.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                hana.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }

}