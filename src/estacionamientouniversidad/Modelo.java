/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamientouniversidad;

/**
 *
 * @author gozie
 */
public enum Modelo {
    GOL_TREND_CONFORTLINE(Marca.VOLKSWAGEN,01),
    GOL_TREND_TRENDLINE(Marca.VOLKSWAGEN,02),
    GOL_TREND_HIGHLINE(Marca.VOLKSWAGEN,03),
    SURAN_CONFORTLINE(Marca.VOLKSWAGEN,04),
    SURAN_TRENDLINE(Marca.VOLKSWAGEN,05);
   
    
    private int codigo;
    private Marca marca;
    Modelo(Marca marca, int codigo){
        this.marca = marca;
        this.codigo = codigo;
    }
  
    
    
}
