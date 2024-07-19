package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Answer {
	@Id
	private int aid;
	private String answer;
	@OneToOne
	private Question ques;

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

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	public Answer(int aid, String answer, Question ques) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.ques = ques;
	}

	public Answer() {
		
	}
}
