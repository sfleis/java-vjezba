/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvijizostanci;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Stella
 */
public class Start {

    private List<Kolegij> kolegiji;
    
    
    public Start() {
        kolegiji = new ArrayList<>();
        ucitajKolegije();
        ispisKolegija();
    }
    
    
    
    public static void main(String[] args) {
        new Start();
    }

    private void ucitajKolegije() {
        String s;
        while(true){
        ucitajKolegij();
        s=JOptionPane.showInputDialog("unesi k za prekid");
        if(s.trim().toLowerCase().equals("k")){break;}
    }
    }

    private void ucitajKolegij() {
        Kolegij kolegij = new Kolegij();
        kolegij.setSifra(Pomocno.ucitajBroj("šifra"));
        kolegij.setNaziv(Pomocno.ucitajString("naziv"));
        kolegij.setDozvoljenBroj(Pomocno.ucitajBroj("dozvoljeni broj izostanaka"));
        kolegij.setIzostanci(new ArrayList<>());
        
        
        
        String z;

while(true){
JOptionPane.showMessageDialog(null, "unos izostnka");
kolegij.getIzostanci().add(ucitajIzostanak());
z= JOptionPane.showInputDialog("unesi k za prekid");
if(z.trim().toLowerCase().equals("k")){break;}

}
        
        kolegiji.add(kolegij);
    }

    private Izostanak ucitajIzostanak() {
        Izostanak izostanak = new Izostanak();
        izostanak.setDatum(Pomocno.ucitajDatum("unesi datum"));
        izostanak.setRazlogIzostanka(Pomocno.ucitajString("razlog izostanka"));
    return izostanak;
    }

    private void ispisKolegija() {
for (Kolegij kolegij : kolegiji){
    int j =0;
     
    for(Izostanak izostanak : kolegij.getIzostanci()){
        j++;
    }
    if(j>kolegij.getDozvoljenBroj()){
        System.out.println(kolegij.getNaziv() + "previse izostanka");    }
else{
        System.out.println(kolegij.getNaziv()+ " " + j + "/"+kolegij.getDozvoljenBroj());
    }
        
        }
    }

    
    
    
    
    
}
