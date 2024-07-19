package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
	@Id
	private int aid;
	private String answer;
	@ManyToOne	
	private Question1 ques;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question1 getQues() {
		return ques;
	}
	public void setQues(Question1 ques) {
		this.ques = ques;
	}
	public Answer1(int aid, String answer, Question1 ques) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.ques = ques;
	}
	public Answer1() {
		
	}
	
	

}
