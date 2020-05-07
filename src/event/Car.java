package event;

public class Car{
	//this. 이 this와
	//this란 외부의 제3자가 아닌 , 인스턴스 스스로가 자기 자신의 인스턴스를 가리키기 위한 레퍼런스변수!!

	int price=500;

	public Car(){
		System.out.println("this는 자동차중심관점 주소값"+this);
	}
	public static void main(String[] args){
		//this. 이 this의 차이점???
		Car c1 = new Car();
		System.out.println("제3자 관점에서 레퍼런스변수를 이용한 주소값"+c1);
	}
}
