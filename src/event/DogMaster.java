package event;
public class DogMaster{
	Dog d; //강아지 보유
	//훔친개 돌려받기 메서드 정의
	public void saveDog(Dog d){
		this.d = d;
		System.out.println("돌려받은 개의 주소값은 : "+d);
	}
}
