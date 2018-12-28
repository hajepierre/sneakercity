/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.sneakercity.entities;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.time.DateUtils;

/**
 *
 * @author jeanpierre
 */
public class SneakerModel
{

    private int id;
    private String name;
    private String price;
    private Picture picture;
    private Date releaseDate;
    private String profile;
    private List<Size> sizes;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public Date getReleaseDate()
    {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public Picture getPicture()
    {
        return picture;
    }

    public void setPicture(Picture picture)
    {
        this.picture = picture;
    }

    public String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        this.profile = profile;
    }

    public List<Size> getSizes()
    {
        return sizes;
    }

    public void setSizes(List<Size> sizes)
    {
        this.sizes = sizes;
    }

    public void complete()
    {
        sizes = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(10);
        size = size > 0 ? size : 1;

        for (int i = 0; i < size; i++)
        {
            double value = random.nextDouble() * 100;
            Size s=new Size();
            s.setSize(formatNumber(value));
            s.complete();
            sizes.add(s);
        }

        int days = random.nextInt(200);
        days = days > 30 ? days : (-1 * days);

        releaseDate = DateUtils.addDays(new Date(), days);
    }

    private String formatNumber(double value)
    {
        DecimalFormat formatter = new DecimalFormat("###.#");
        return formatter.format(value);
    }

}
