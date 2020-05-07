package event;
public class UseApp{
	public static void main(String[] args){
		//얘기의 주인공인 강아지 생성
		Dog merry = new Dog("메리",5,"white");
		Dog bony = new Dog("뽀미",9,"black");
		Dog arong = new Dog("아롱이",7,"yellow");

		//나쁜놈 생성
		BadMan badMan = new BadMan();

		//메리의 주소값을 넘긴것임!!
		badMan.catchDog(merry); //call by reference 

		//개주인 생성
		DogMaster master = new DogMaster();
		master.saveDog(merry); //call by reference 주소값에 의한 호출이라 한다!!
	}
}
