/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hajepierre.sneakercity.controllers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hajepierre.sneakercity.entities.Brand;
import com.hajepierre.sneakercity.entities.SneakerModel;
import static java.util.stream.Collectors.toList;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author jeanpierre
 */
//@RestController
@Controller
public class ApplicationController
{

    @Autowired
    private ResourceLoader resourceLoader;

    private Brand brand;

    @GetMapping("/index")
    public String index(Model model)
    {
        if (brand == null)
        {
            brand = getData();
        }
        model.addAttribute("brand", brand.getName());
        model.addAttribute("models", brand.sort());
        return "index";
    }
    
    @GetMapping("/sneaker/{id}")
    public String getSneakerById(@PathVariable("id") int id, Model model)
    {
        if (brand == null)
        {
            brand = getData();
        }
        model.addAttribute("brand", brand.getName());
        model.addAttribute("model", getById(id));
        return "sneaker";
    }

//    @GetMapping("/test")
//    public Brand test()
//    {
//      return getData();
//    }
    private String getFileContent()
    {
        try
        {
            String content = IOUtils.toString(resourceLoader.getResource("classpath:/json/models.json").getInputStream());
            return content;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public <T> T toObject(Object object, Class className)
    {
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            return (T) mapper.readValue(object.toString(), className);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    private Brand getData()
    {

        Brand brand = toObject(getFileContent(), Brand.class);
        brand.getModels().forEach((m) ->
        {
            m.complete();
        });

        return brand;
    }

    private SneakerModel getById(int id)
    {
        return brand.getModels().stream().filter(m->m.getId()==id).collect(toList()).get(0);
    }

}
