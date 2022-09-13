package com.example.CollegeService.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.CollegeService.Entity.College;
import com.example.CollegeService.Repository.CollegeRepository;
import com.example.CollegeService.vo.ResponseTemplate;
import com.example.CollegeService.vo.Student;

@Service
public class CollegeService {
	       @Autowired
	       private CollegeRepository clgRepo;
	       private RestTemplate restTemp;
		
		
		public College addCollege(College c) {
			return clgRepo.save(c);
		}
		public List<College> getAllCollege(){
			return clgRepo.findAll();
		}
		public College getCollegeById(int clgId) {
			
			College c=clgRepo.findById(clgId).get();
			if(c!=null) {
				return c;
			}
			return null;
			
		}
		public List<ResponseTemplate> listWithStudent()
		{
			List<ResponseTemplate> list=new ArrayList<ResponseTemplate>();
			List<College> allclg = this.getAllCollege();
			Iterator<College> i = allclg.iterator();
			while(i.hasNext()) {
				College c =i.next();
				ResponseEntity<Student[]> resp=restTemp.getForEntity("http://STUDENT_SERVICE/student/student_with_ascname/"+c.getClgId(), Student[].class);
				Student[] students = resp.getBody();
				List<Student> s = Arrays.asList(students);
				ResponseTemplate rt = new ResponseTemplate();
				rt.setCollege(c);
				rt.setStudents(s);
				list.add(rt);
				}
			return list;
			
		}
	}
		
		
		
		
		
		
		
		



