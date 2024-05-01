package com.mvn.DependencyInjection;

public class Marks {
   private int telugu;
   private int english;
   private int maths;
   private int science;
  /* public Marks(int telugu,int english,int maths,int science) {
	   this.telugu=telugu;
	   this.english=english;
	   this.maths=maths;
	   this.science=science;
   }*/
   public void setTelugu(int telugu) {
	   this.telugu=telugu;
   }
   public void setEnglish(int english) {
	   this.english=english;
   }
   public void setMaths(int maths) {
	   this.maths=maths;
   }
   public void setScience(int science) {
	   this.science=science;
   }
   public int getTelugu() {
	   return this.telugu;
   }
   public int getEnglish() {
	   return this.english;
   }
   public int getMaths() {
	   return this.maths;
   }
   public int getScience() {
	   return this.science;
   }
}
