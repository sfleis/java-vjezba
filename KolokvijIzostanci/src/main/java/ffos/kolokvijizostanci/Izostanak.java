/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvijizostanci;

import java.util.Date;

/**
 *
 * @author Stella
 */
public class Izostanak {
    private Date datum;
    private String razlogIzostanka;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getRazlogIzostanka() {
        return razlogIzostanka;
    }

    public void setRazlogIzostanka(String razlogIzostanka) {
        this.razlogIzostanka = razlogIzostanka;
    }

    @Override
    public String toString() {
        return datum + " " + razlogIzostanka;
    }
    
    
}
