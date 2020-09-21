package quiz06;

public class Computer extends Calculator{
	double circle(int a) {
		return a*a*Math.PI;
	}
	double rect(double a) { //- 정사각형의 넓이 를 리턴
		return a*a;
	}
	double rect(double a, double b) { // - 직사각형의 넓이 를 리턴
		return (a*b)/0.5;
	}
	double rect(double a, double b, double c) {//- 직육면체의 넓이 를 리턴
		return 2*(a*b+b*c+c*a);
	}
}
