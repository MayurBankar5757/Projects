package com.learn.packageStruc.service;

import java.util.ArrayList;

import com.learn.packageStruc.Dao.CollegeDao;
import com.learn.packageStruc.entity.StudentInfo;

public class ClgStudentService {
	CollegeDao d = new CollegeDao();

	public ClgStudentService() {
		d.CreateCollegeStudent();
	}
	public ArrayList<String> getCollegeNameM(){
		return d.getcollegeStudentM();
		}
	public ArrayList<String> getCollgeName() {
		// TODO Auto-generated method stub
		
		return d.getCollegeStudent();
	}
	public ArrayList<StudentInfo> getAllInfo(){
		return d.getAllInfo();
	}
	
	
	

}
