/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.sneakercity.entities;

import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author jeanpierre
 */
public class Brand
{

    private String name;
    private List<SneakerModel> models;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<SneakerModel> getModels()
    {
        return models;
    }

    public void setModels(List<SneakerModel> models)
    {
        this.models = models;
    }

    public List<SneakerModel> sort()
    {
        return models.stream().sorted(Comparator.comparing(SneakerModel::getReleaseDate).reversed()).collect(toList());
    }

}
