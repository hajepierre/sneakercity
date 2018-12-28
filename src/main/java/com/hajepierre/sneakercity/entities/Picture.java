/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.sneakercity.entities;

import java.util.List;

/**
 *
 * @author jeanpierre
 */
public class Picture
{
    private String name;
    private List<Color> colors;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Color> getColors()
    {
        return colors;
    }

    public void setColors(List<Color> colors)
    {
        this.colors = colors;
    }
    
    
}
