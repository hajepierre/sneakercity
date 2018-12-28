/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.sneakercity.entities;

import java.io.Serializable;

/**
 *
 * @author jeanpierre
 */

public class CartItems implements Serializable
{

    private int id;
    private Cart cart;
    private SneakerModel item;
    private int itemNumber;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Cart getCart()
    {
        return cart;
    }

    public void setCart(Cart cart)
    {
        this.cart = cart;
    }

    public SneakerModel getItem()
    {
        return item;
    }

    public void setItem(SneakerModel item)
    {
        this.item = item;
    }

    public int getItemNumber()
    {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber)
    {
        this.itemNumber = itemNumber;
    }
    
    

}
