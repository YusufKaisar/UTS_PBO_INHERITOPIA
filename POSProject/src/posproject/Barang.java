/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posproject;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADVAN
 */
public class Barang {
    public String kode;
    public String nama;
    public float harga;
    public int jumlahBelanja;
    public float total;
    
    public String getKode(){
        return kode;
    }
    
    public float getHarga(){
        return harga;
    }
    
    public String getNama(){
        return nama;
    }
    
        // Getter dan setter untuk indeks
    
    public int getJumlah() {
        return jumlahBelanja;
    }

    public void setJumlah(int jumlahBelanja) {
        this.jumlahBelanja = jumlahBelanja;
    }
    
    public float getTotal() {
        return total;
    }
    
    public void setTotal(int Total) {
        this.total = Total;
    }
    
    
    
    
    
    
    static ArrayList<Barang> daftarBarang;
    
    public static void loadBarangFromDB()
    {
        daftarBarang =  new ArrayList<Barang>();
        
        Barang barang;
        try {
            Statement stmt = DBConnector.connection.createStatement();
            
            String sql = "SELECT * FROM barang";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next())
            {
                barang = new Barang();
                barang.kode = Integer.toString(rs.getInt("kode"));
                
                barang.nama = rs.getString("nama");
                
                barang.harga = rs.getFloat("harga");
                
                daftarBarang.add(barang);
            }
            
        }
        
        catch (Exception ex){
            System.out.println(ex);
        }
        
    }
}
