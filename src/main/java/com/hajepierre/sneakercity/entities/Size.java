/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.sneakercity.entities;

import java.util.List;
import java.util.Random;

/**
 *
 * @author jeanpierre
 */
public class Size
{

    String size;
    private int quantity;

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public void complete()
    {

        Random random = new Random();
        quantity = random.nextInt(1000);
    }
}
