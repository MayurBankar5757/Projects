package com.learn.packageStruc.Dao;

import java.util.ArrayList;

import com.learn.packageStruc.entity.StudentInfo;

public class CollegeDao {
	ArrayList<StudentInfo> al = new ArrayList<>();
	public void CreateCollegeStudent() {
		al.add(new StudentInfo (1,"Mahesh"));
		al.add(new StudentInfo (1,"Arjun"));
		al.add(new StudentInfo (1,"onkar"));
		al.add(new StudentInfo (1,"sham"));
		al.add(new StudentInfo (1,"shubham"));
		al.add(new StudentInfo (1,"Mayur"));

		
	}
	
	public ArrayList<String> getCollegeStudent() {
		ArrayList <String> name = new ArrayList<>();
		for(StudentInfo s : al) {
		  name.add(s.getStNa());
		}
		return name;
		
	}
	
	public ArrayList<String> getcollegeStudentM(){
		
		ArrayList<String> m = new ArrayList<>();
		for(StudentInfo s : al) {
			if(s.getStNa().startsWith("M")) {
				m.add(s.getStNa());
			}
		}
		return m;
		 
	}
	public ArrayList<StudentInfo> getAllInfo(){
		return al;
	}

}
