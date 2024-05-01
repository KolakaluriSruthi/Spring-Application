package com.student1.Student1.Interface;

public class StudentImp implements StudentInterface {
	private int rollno;
    private String name;
    private String course;
    private String batch;
    private String doj;
    private String location;
	@Override
	public void setRollno(int rollno) {
		// TODO Auto-generated method stub
      this.rollno=rollno;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;

	}

	@Override
	public void setCourse(String course) {
		// TODO Auto-generated method stub
		this.course=course;

	}

	@Override
	public void setBatch(String batch) {
		// TODO Auto-generated method stub
		this.batch=batch;

	}

	@Override
	public void setDOJ(String doj) {
		// TODO Auto-generated method stub
		this.doj=doj;

	}

	@Override
	public void setLocation(String location) {
		// TODO Auto-generated method stub
		this.location=location;

	}

	@Override
	public int getRollno() {
		// TODO Auto-generated method stub
		return this.rollno;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getCourse() {
		// TODO Auto-generated method stub
		return this.course;
	}

	@Override
	public String getBatch() {
		// TODO Auto-generated method stub
		return this.batch;
	}

	@Override
	public String getDOJ() {
		// TODO Auto-generated method stub
		return this.doj;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return this.location;
	}

}
