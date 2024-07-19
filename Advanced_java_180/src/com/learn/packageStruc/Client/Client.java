package com.learn.packageStruc.Client;

import java.util.ArrayList;

import com.learn.packageStruc.Controller.ClgStudentController;
import com.learn.packageStruc.entity.StudentInfo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClgStudentController con = new ClgStudentController();
		ArrayList<String> al = con.getCollgeStudentwithM();
//		System.out.println(al);
		System.out.println("--Student Name Start with M --");
		for(String s : al) {
			System.out.println(s);
		}
		ArrayList<String> s = con.getCollgeStudent();
		System.out.println("-- Student Name--");
		for(String s1 : s) {
			System.out.println(s1);
		}
		ArrayList<StudentInfo> s1 = con.getAllInfo();
		System.out.println("-- Student Information--");
		for(StudentInfo s2 : s1) {
			System.out.println(s2);
		}
		}

}
