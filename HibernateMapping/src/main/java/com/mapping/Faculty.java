package com.mapping;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int fId;
    
    private String fName;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fId")
    private List<FacultySubject> sub;

    public Faculty() {
    }

    public Faculty(String fName) {
        this.fName = fName;
    }

    public Faculty(int fId, String fName) {
        this.fId = fId;
        this.fName = fName;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public List<FacultySubject> getSub() {
        return sub;
    }

    public void setSub(List<FacultySubject> sub) {
        this.sub = sub;
    }
}
