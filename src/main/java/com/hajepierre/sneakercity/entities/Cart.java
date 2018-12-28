/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.sneakercity.entities;


/**
 *
 * @author jeanpierre
 */

public class Cart 
{


    private int id;
    private String buyer;
    private double amountPaid;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBuyer()
    {
        return buyer;
    }

    public void setBuyer(String buyer)
    {
        this.buyer = buyer;
    }

    public double getAmountPaid()
    {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid)
    {
        this.amountPaid = amountPaid;
    }
    
    
}
