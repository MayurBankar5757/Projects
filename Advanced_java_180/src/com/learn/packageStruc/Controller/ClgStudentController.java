package com.learn.packageStruc.Controller;

import java.util.ArrayList;

import com.learn.packageStruc.entity.StudentInfo;
import com.learn.packageStruc.service.ClgStudentService;

public class ClgStudentController {

	ClgStudentService s = new ClgStudentService();
	
	public ArrayList<String> getCollgeStudent(){
		return s.getCollgeName();
	}
	public ArrayList<String> getCollgeStudentwithM(){
		return s.getCollegeNameM();
	}
	public ArrayList<StudentInfo> getAllInfo(){
		return s.getAllInfo();
	}
}
