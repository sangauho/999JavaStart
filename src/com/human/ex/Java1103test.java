package com.human.ex;

class Student{
	public String name="»´±Êµø";
	public int kor=50;
	public int math=50;
	public int eng=60;
	public int total() {
		return kor+math+eng;
	}
	
	public double avg() {
		return total()/3.;
	}
	public String toString() {
		return name+"¥‘¿« √—¡° : "+total()+"\n"+
				name+"¥‘¿« ∆Ú±’ : "+avg();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(kor<0) {
			this.kor = 0;
		}
		if(kor>100) {
			this.kor = 100;
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
}

public class Java1103test {

	public static void main(String[] args) {
		
		Student st1=new Student();
//		System.out.println(st1.name+"¥‘¿« √—¡°¿∫ "+st1.total());
//		System.out.println(st1.name+"¥‘¿« ∆Ú±’¿∫ "+st1.avg());
		System.out.println(st1);
		
		Student st2=new Student();
		st2.setKor(2313);
		st2.setName("»´±Êµø2");
//		st2.name="»´±Ê≥≤";
//		System.out.println(st2.name+"¥‘¿« √—¡°¿∫ "+st2.total());
//		System.out.println(st2.name+"¥‘¿« ∆Ú±’¿∫ "+st2.avg());
		System.out.println(st2);
		
		
//		System.out.println(kor+math+eng);
//		System.out.println((kor+math+eng)/3.);
		
		
	}

}
