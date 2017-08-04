package com.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	public @ResponseBody List<Student> getAllStudents() {
		List<Student> list = new ArrayList<Student>();
		Student st = new Student();
		st.setDescription("Spring REST Annotation tutorial");
		st.setStudentId(1001L);
		st.setName("Jay");
		list.add(st);
		
		Student st2 = new Student();
		st2.setDescription("Spring REST JSON Response Tutorial");
		st2.setStudentId(1001L);
		st2.setName("God");
		list.add(st2);
		
		return list;
	}
	@RequestMapping(value="/add-student", method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE},
			produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Student addStudent(@RequestBody Student st) {
		System.out.println("pr" + st.getName());
		return st;
	}
}
