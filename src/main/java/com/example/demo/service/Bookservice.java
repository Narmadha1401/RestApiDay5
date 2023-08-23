package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bookmodel;
import com.example.demo.repository.Bookrepo;

@Service
public class Bookservice {
	@Autowired
	Bookrepo br;
	public List<Bookmodel> saveinfo(List<Bookmodel> bm)
	{
		return (List<Bookmodel>)br.saveAll(bm);
	}
	//to get
	public List<Bookmodel> showinfo()
	{
		return br.findAll();
	}
	//get by id
	public Optional<Bookmodel> showbyid(int id)
	{
		return br.findById(id);
	}
	//put by id
	public String updateinfo(int id,Bookmodel bm)
	{
		br.saveAndFlush(bm);
		if(br.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Invalid id";
		}
	}
	//delete by id
	public void deleteid(int id)
	{
		br.deleteById(id);
	}

}
