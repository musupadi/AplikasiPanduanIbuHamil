package com.destinyapp.aplikasipanduanibuhamil.Model;

import java.util.ArrayList;

public class InformasiData {
    public static String[][] data = new String[][]{
            {"Perkembangan Janin Minggu Ke-4 (1 Bulan)",
                    "Kehamilan baru bisa di deteksi jika usia kehamilan sudah mencapai usia 4 minggu. Meski ada ibu hamil yang bisa mendeteksi kehamilan sebelum usianya 4 minggu, namun dokter kandungan baru bisa menyatakan bahwa ibu hamil tersebut benar-benar hamil jika usia kandungannya sudah 4 minggu. Dokter kandungan akan menyuruh ibu hamil tersebut kembali lagi jika selama 4 minggu atau lebih jika belum mendapatkan menstruasi.",
                    "Saat hamil usia 4 minggu, akan ada proses pembentukan embrio dan bakal janin di dalam rahim. Berikut ini proses pembentukan embrio yang ada di dalam rahim :\n" +
                            "\n" +
                            "    Embrio atau bakal janin telah tumbuh di dalam rahim ibu.\n" +
                            "    Ukurannya baru sebiji kacang hijau. Bahkan jika dilakukan USG maka hanya akan terlihat seperti setitik gumpalan darah.\n" +
                            "    Otak, tulangg punggung, tulang belakang dan juga syaraf mendapatkan perkembangan dan berada di lapisan atas.\n" +
                            "    Sel plasenta mulai ada.\n" +
                            "    Sel plasenta membentuk jaringan mikrokopis.\n" +
                            "    Plasenta mampu memberikan nutrisi kepada embrio di dalam rahim.",
                    "Ciri ciri orang hamil saat usia 4 minggu, ibu hamil akan merasakan bad mood. Mudah marah dan tersinggung, sangat sensitif terhadap perkataan dan bau-bau yang ada di sekitarnya. Ibu hamil juga akan merasakan hal-hal di bawah ini :\n" +
                            "\n" +
                            "    Mual\n" +
                            "    Malas\n" +
                            "    Pusing\n" +
                            "    Kepala berat\n" +
                            "    Pegal-pegal seperti sebelum menstruasi\n" +
                            "    Kram juga dirasakan ibu hamil\n" +
                            "    Jumlah lendir lebih banyak\n" +
                            "    Payudara terasa nyeri",
                    "Pada saat minggu keempat atau bulan pertama kehamilan. Janin baru memiliki ukuran setitik darah atau seukuran kacang hijau.",
                    "Perkembangan janin yang ada di dalam rahim saar berusia empat minggu sudah membentuk organ-organ di bawah ini :\n" +
                            "\n" +
                            "    Plasenta\n" +
                            "    Otak\n" +
                            "    Tulang punggung\n" +
                            "    Tulang belakang\n" +
                            "\n" +
                            "Perkembangan Janin Minggu ke 5 : Bulan 1"
            },
            {"Perkembangan Janin Minggu Ke-5 (1 Bulan)",
                    "Saat ibu hamil menggunakan tes pendeteksi kehamilan, hormon HCG pun sudah terdeteksi. Jumlah garis yang dihasilkan berjumlah dua atau tes menunjukkan simbol positif. Segera kunjungi dokter untuk cara menjaga kehamlan agar tetap sehat, untuk mendapatkan vitamin asam folat dan prenatal yang sangat dibutuhkan oleh embrio anda.",
                    "Proses yang ada di rahim mulai banyak. Embrio yang dulunya hanya sekecil biji kacang hijau kini mulai berkembang dengan pesat. Berikut ini berbagai macam proses yang ada di dalam rahim :\n" +
                            "\n" +
                            "    Embrio sudah terhubung dengan aliran darah di dalam tubuh ibu hamil.\n" +
                            "    Embrio jika diamati menggunakan USG,  sudah berbentuk seperti kecebong.\n" +
                            "    Organ utamanya mulai tumbuh yaitu hati dan ginjalnya.\n" +
                            "    Embrio juga sedang terbentuk usus buntu.\n" +
                            "    Tabung syaraf embrio sudah terbuka, tabung tersebut akan terhubung ke otak dan juga ke bagian sumsum tulang belakang embrio.\n" +
                            "    Tangan dan kaki juga sudah mulai muncul meski bentuknya masih seperti tunas tumbuhan yang masih kecil.\n" +
                            "    Mulut juga sudah ada, meski hanya membentuk lipatan kecil saja.\n" +
                            "    Hati sudah bisa berdebar.\n" +
                            "    Kerangka tubuh mulai terbentuk.",
                    ""
            }
    };
    public static ArrayList<DataModel> getListData(){
        DataModel dm= null;
        ArrayList<DataModel> list = new ArrayList<>();
        for (String[] aData : data) {
            dm = new DataModel();
            dm.setTittle(aData[0]);
            dm.setDeskripsi(aData[1]);
            dm.setPerkembangan(aData[2]);
            dm.setYangdirasakan(aData[3]);
            dm.setUkuran(aData[4]);
            dm.setPanjang(aData[5]);
            dm.setOrganterbentuk(aData[6]);
            list.add(dm);
        }
        return list;
    }
}
