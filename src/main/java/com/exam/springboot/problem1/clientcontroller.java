package com.exam.springboot.problem1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class clientcontroller {
	List<data> s= new ArrayList<data>();
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String demo()
	{
		return "hello Spring boot";
	}

	@PostMapping("add")
	public String adddata(@RequestBody data d)
	{
		s.add(d);
		return "The recordeds add";
	}
	
	@GetMapping("viewall")
	public List<data> viewall()
	{
		return s;
	}
	
	@GetMapping("count")
	public String count()
	{
		if(s.size()!=0)
		{
			int count=s.size();
			return Integer.toString(count);
		}
		else
		{
			return "Data Not Found";
		}
	}
	
	@GetMapping("viewbyid/{id}")
	public List<data> viewbyid(@PathVariable("id") int id) {
	    List<data> result = new ArrayList<>();

	    for (data d : s) {
	        if (d.getId() == id) {
	            result.add(d);
	        }
	    }

	    return result;
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deletebyid(@PathVariable("id") int id) {
	    List<data> result = new ArrayList<>();

	    for (data d : s) {
	        if (d.getId() == id) {
	            result.remove(d);
	        }
	    }

	    return "Data removed";
	}
	
	@PutMapping("updatebyid/{id}")
	public data updatebyid(@PathVariable("id") int id, @RequestBody data updatedData) {
	    for (data d : s) {
	        if (d.getId() == id) {
	            d.setName(updatedData.getName());
	            d.setAge(updatedData.getAge());
	            d.setProblem(updatedData.getProblem());
	            d.setAddress(updatedData.getAddress());
	            return d;  
	        }
	    }
	    return null;  
	}

	
	
}
