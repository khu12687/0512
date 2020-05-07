package event;
//강아지 훔친자!!
public class BadMan{
	//has a
	Dog d; //훔친개
	int money;
	DogMaster master;

	//강아지를 납치해서 자기의 소유로 만드는 메서드!!
	public void catchDog(Dog d){
		this.d= d; 
		System.out.println("도둑인 내가 훔친 강아지 : "+d);
	}
	//주인에게 납치한 개를 다시 돌려주는 메서드
	public void returnToMaster(){
		
	}
}
