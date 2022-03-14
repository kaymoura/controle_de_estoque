/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaylane.controle_de_estoque;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author devsys-b
 */
class Movimento {

    Calendar dataMovto;
    Double qdtMovto;

    
    public Movimento() {
        dataMovto = new GregorianCalendar();
    }
    
    public void setDataMovto(String dataEmString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            this.dataMovto.setTime(sdf.parse(dataEmString));
        } catch (Exception e) {
            System.out.println("Ops... erro na conversão de Data!:" + e.getMessage());
        }
        
    }
    public void setDataMovto(Date dataMovto) {
        this.dataMovto.setTime(dataMovto);
    }

    public Double getQdtMovto() {
        return this.qdtMovto;
    }

    public void setQdtMovto(Double qdtMovto) {
        this.qdtMovto = qdtMovto;
    }
    
    public String getDataMovto() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        return sdf.format(this.dataMovto.getTime());
    }
    
}
