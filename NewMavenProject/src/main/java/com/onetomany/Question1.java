package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1 {
	@Id
	private int qid;
	private String question;
	@OneToMany
	private List<Answer1> ans;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	public Question1(int qid, String question, List<Answer1> ans) {
		super();
		this.qid = qid;
		this.question = question;
		this.ans = ans;
	}
	public List<Answer1> getAns() {
		return ans;
	}
	public void setAns(List<Answer1> ans) {
		this.ans = ans;
	}
	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
