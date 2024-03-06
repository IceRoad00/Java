package ch02;

// 캡슐화: 멤버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음
class FootballPlayerB{
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerB(String name, String birth, String team, int goal){
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName() {
		return this.name;
	}
	
	String getBirth() {
		return this.birth;
	}
	
	String getTeam() {
		return this.team;
    }
	
	int getGoal() {
		return this.goal;
	}
	
	void setName(String name) {              // private에서 직접 변경 못하니 set 키워드를 이용하여 값 변경
		this.name = "손흥민";                    // 바뀌지 않는 데이터가 있으면 굳이 set 키워드를 사용하지 않아도 됨.
	}
	
	void setTeam(String team) {
		this.team = team;
	}
	
	void setGoal(int goal) {
		if(goal < 0) return;
		this.goal = goal;
	}
}
class FootballPlayerC{
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerC(String name, String birth, String team, int goal) {
		super();
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getTeam() {
		return team;
	}
	void setTeam(String team) {
		this.team = team;
	}
	int getGoal() {
		return goal;
	}
	void setGoal(int goal) {
		this.goal = goal;
	}
	String getBirth() {
		return birth;
	}
	
	
}

public class E_Encapsulation {

	public static void main(String[] args) {
		
		FootballPlayerB son = new FootballPlayerB("손흥민", "920207", "토트넘 훗스퍼", 0);
//		son.name = "손흥민";
//		son.team = "토트넘 홋스퍼";
//		son.goal = 0;
		
		son.setGoal(-1);
		
		System.out.println(son.getName());
		System.out.println(son.getBirth());
		System.out.println(son.getTeam());
		System.out.println(son.getGoal());


		
	}

}
