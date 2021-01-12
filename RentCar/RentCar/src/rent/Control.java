package rent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Control {

 String[] header = {"Nomor Plat", "Merek Mobil", "Nama Penyewa", "Alamat Penyewa", "Nomor telefon", "Lama Penyewaan", "Jumlah Pembayaran"};

 private ArrayList<Model> list = new ArrayList();

//  untuk menampilkan data pada tabel
    public void read(JTable bc) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);

        for (int i = 0; i < list.size(); i++) {
            Object[] oj = new Object[7];
            oj[0] = list.get(i).getNomor_Plat();
            oj[1] = list.get(i).getMerek_Mobil();
            oj[2] = list.get(i).getNama_Penyewa();
            oj[3] = list.get(i).getAlamat_Penyewa();
            oj[4] = list.get(i).getNomor_Telefon();
            oj[5] = list.get(i).getLama_Menyewa();
            oj[6] = list.get(i).getJumlah_Pembayaran();
            
            dtm.addRow(oj);

        }

        bc.setModel(dtm);
    }

//  untuk menambahkan data
    public void create(Model br ) {
        list.add(br);
        JOptionPane.showMessageDialog(null, "Berhasil di simpan!");
    }

//  untuk ubah data
    public void update(Model br) {
        for (int i = 0; i < list.size(); i++) {
            if (br.getNomor_Plat() == list.get(i).getNomor_Plat()) {
                list.set(i, br);
            }
        }

        JOptionPane.showMessageDialog(null, "Berhasil di ubah!");
    }

    //  untuk hapus data
    public void delete(String Merek_Mobil) {
        for (int i = 0; i < list.size(); i++) {
            if (Merek_Mobil == list.get(i).getMerek_Mobil()) {
                list.remove(i);
            }
        }

        JOptionPane.showMessageDialog(null, "Berhasil di hapus!");
    }

//    untuk melakukan pencarian berdasarkan MEREK MOBIL
    public boolean search(JTable bc, String Merek_Mobil) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);

        boolean Counter = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMerek_Mobil().equalsIgnoreCase(Merek_Mobil.trim())) {
                Object[] oj = new Object[7];
            oj[0] = list.get(i).getNomor_Plat();
            oj[1] = list.get(i).getMerek_Mobil();
            oj[2] = list.get(i).getNama_Penyewa();
            oj[3] = list.get(i).getAlamat_Penyewa();
            oj[4] = list.get(i).getNomor_Telefon();
            oj[5] = list.get(i).getLama_Menyewa();
            oj[6] = list.get(i).getJumlah_Pembayaran();
                dtm.addRow(oj);

                bc.setModel(dtm);

                Counter = true;

                break;
            }

        }

        if (Counter) {
            return true;
        }

        return false;

    }

}
