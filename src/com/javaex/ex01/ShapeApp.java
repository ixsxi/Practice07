package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강"); // 추상과 추상은 못함?
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		sr1.showInfo1(); // 부모 추상에 자식이랑 같은 메소드로 하는법 
		
		System.out.println(((Ractangle)sr1).getWidth()); // 다운캐스팅으로 하는법
	}
}

	
	