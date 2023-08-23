package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bookmodel;
import com.example.demo.service.Bookservice;

@RestController
public class Bookcontroller {
	@Autowired
	Bookservice bs;
	@PostMapping("addbook")
	public List<Bookmodel> add(@RequestBody List<Bookmodel> bm)
	{
		return bs.saveinfo(bm);
	}
	@GetMapping("showbook")
	public List<Bookmodel> show()
	{
		return bs.showinfo();
	}
	@GetMapping("showbyid/{id}")
	public Optional<Bookmodel> showid(@PathVariable int id)
	{
		return bs.showbyid(id);
	}
	@PutMapping("updateid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Bookmodel bm)
	{
		return bs.updateinfo(id, bm);
	}
	@DeleteMapping("delid/{id}")
	public void deletebyid(@PathVariable int id)
	{
		bs.deleteid(id);
	}


}
