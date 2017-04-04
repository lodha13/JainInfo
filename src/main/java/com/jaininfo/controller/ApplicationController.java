package com.jaininfo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jaininfo.dao.MarasaDao;
import com.jaininfo.model.Marasa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class ApplicationController {

	@Autowired
	private MarasaDao marasaDao;
	
    @RequestMapping(value="/getInfo", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Marasa> getMarasaInfo(String id) {
    	final List<Marasa> marasa = marasaDao.getMarasaInfo(id);
        return marasa;
    }

    @RequestMapping("/getDetails")
    public String getDetails() {
    	System.out.println("getdetails");
        return "getdetails";
    }
}