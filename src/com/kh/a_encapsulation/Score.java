package com.kh.a_encapsulation;

//학생의 국어, 영어, 수학 점수의 
//종합, 평균, 등급을 계산하는 기능을 가진 클래스 
public class Score {

	private String name;
	private int kor;
	private int math;
	private int eng;
	
	//자바빈규약 
	//클래스는 직렬화 되어야한다 
	//클래스의 필드변수의 접근제한자는 private 이여야한다 
	//필드변수는 getter/setter 메서드를 통해 접근할 수 있다 
	
	
	//생성자 : 클래스가 인스턴스화 될 때 가장 먼저 호출되는 메서드 
	//		클래스의 속성(필드변수)를 초기화 하는 코드를 작성 
	//*** 다른 생성자가 없다면 반드시 있어야함 -> 작성하지 않을 경우 JVM이 자동으로 생성 
	
	// 생성자도 메서드이기 때문에 오버로딩이 가능하다 
	public Score() {}
	
	//매개변수가 있는 생성자 
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}

	//getter / setter -> 자동완성 : 마우스 우클릭, 소스
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
		this.kor = kor;
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
		if(eng < 0 || eng > 100) {
			System.out.println("[error] : 값을 다시 입력해주세요");
		}else {
			this.eng = eng;
		}
	}
	
	//총합을 구해 반환하는 메서드 
	public double calSum() { //double이 int의 데이터보다 크기 때문에 데이터가 커도 값이 손상이 날 확률이 적음 
		return kor + eng + math;
	}
	//평균을 구해 반환하는 메서드 
	public double calAvg() {
		return calSum()/3;
	}
	//등급을 구해 반환하는 메서드
	//등급 : 90점 이상 'A'
	//		80점 이상 'B'
	//		70점 이상 'C'
	//		60점 이상 'D'
	//		60점 미만 'F'
	
	public char calGrade() {
		char grade = ' ';
		
		switch((int)calAvg()/10) {
		case 10 : 
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
		
		return grade;
	}

	@Override // 자동완성 : 마우스 우클릭, 소스, toString 
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	
	
}
	
	
	
	

