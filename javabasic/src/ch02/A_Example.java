package ch02;

// GalaxyPhone
// 제조사: (maker - String)
// 모델명: (modelName - String)
// 소유자: (owner - String)
// 전화번호: (toTelNumber - String)
// 전원상태: (power - boolean)

// 전원버튼누름: onPower - power 상태를 부정
// 전화걸기: call - power가 true일 때 "(상대 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기: emergency - "112로 전화를 겁니다." 출력
// 휴대전화정보보기: getInformation - power가 true일 때
//
// ===== (전화번호) =====
// 제조사: (제조사)
// 모델명: (모델명)
// 소유자: (소유자)
//
// 출력

class GalaxyPhone {
	static String maker;
	String modelName;
	String owner;
	String telNumber;
	boolean power;
	
	void onPower() {
		power = !power;
	}
	void call(String toTelNumber) {
		if(!power) return;
		System.out.println(toTelNumber + "로 전화를 겁니다.");
	}
	static void emergency() {
		System.out.println("112로 전화를 겁니다.");
	}
	void getInformation() {
		if(!power) return;
		System.out.println("===== " + telNumber + " =====");
		System.out.println("제조사: " + maker);
		System.out.println("모델명: " + modelName);
		System.out.println("소유자: " + owner);

		
	}
}

// Drmam
// 방송사: (boardcastingCompany - String)
// 제목 : (title - String)
// 배우 : (actors - String[])
// 장르 : (genre - String)
// 시청률 : (viewRating - double)
// 부작 : (series - int)

// 정보보기: getInformation
// ===== (title) =====
// 방송사 : (boardcastingCompany)
// 장르 : (genre)
// 부작 : (series)부작
// 시청률 : (viewRating)%
// 배우 : (actor), (actor), (actor), ... 

class Drama {
	String boardcastingCompany;
	String title;
	String genre;
	String[] actors;
	double viewRating;
	int series;
	
	void getInformation() {
		System.out.println("===== " + title + " =====");
		System.out.println("방송사: " + boardcastingCompany);
		System.out.println("장르: " + genre);
		System.out.println("부작: " + series + "부작");
		System.out.println("시청률: " + viewRating + "%");
		System.out.print("배우: ");
		for (int index=0; index < actors.length; index++) {
//			System.out.print(actors[index]);
//			{"A", "B", "C"}`
//			if (index < actors.length-1) System.out.print(", ");
//			index < actors.length-1 /; true - actors[index] + ", " / true = actors[index]
			String actor = index < actors.length-1 ? actors[index] + ", " : actors[index];
			System.out.println(actor);

		}
		System.out.println("");

	}
}


// TriangleMath
// 빗변 구하기 - getHypotenuse
// 둘레 구하기 - getCircumference
// sin 구하기 - getSin
// con 구하기 - getCon
// tan 구하기 - getTan

class TriangleMath {
	
//	static final double PI = 3.14;
	
	static double getHypotenuse(int bottom, int height) {
		if(bottom <= 0 || height <= 0) return 0;
//		if(!(bottom > 0 && height > 0)) return 0;
		double result = Math.pow(bottom, 2) + Math.pow(height, 2);
		return Math.sqrt(result);	
	}
	
	static double getCircumference(int height, int hypotenuse, int bottom) {
		if(bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + hypotenuse + bottom;
	}  
	
	static double getSin(int height, int hypotenuse) {
		if(hypotenuse <= 0 || height <= 0) return 0;
		return height / hypotenuse;
	}
	
	static double getCos(int bottom, int hypotenuse) {
		if(bottom <= 0 || hypotenuse <= 0) return 0;
		return bottom / hypotenuse;
	}
	
	static double getTan(int height, int bottom) {
		if(bottom <= 0 || height <= 0) return 0;
		return height / bottom;
	}
}

public class A_Example {

	public static void main(String[] args) {

		GalaxyPhone flip = new GalaxyPhone(); // new 메서드(); 이 부분이 인스턴스 생성
		GalaxyPhone fold = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG";
		
//		flip.maker = "SAMSUNG";
		flip.modelName = "Z플립";
		flip.owner = "홍길동";
		flip.telNumber = "010-3151-6482";
		flip.power = false;
		
//		fold.maker = "SAMSUNG";
		fold.modelName = "Z폴드";
		fold.owner = "김철수";
		fold.telNumber = "010-3154-8482";
		fold.power = false;
		
		flip.onPower();
		flip.getInformation();
		
		GalaxyPhone.emergency();
		flip.emergency();
		fold.emergency();
		
		
		Drama war = new Drama();
		
		war.title = "고려거란전쟁";
		war.boardcastingCompany = "KBS2";
		war.genre = "사극드라마";
		war.series = 16;
		war.viewRating = 10.2;
 		war.actors = new String[] {"김동준", "최수종", "지승현", "이원종"};
		
		war.getInformation();
		
		
		TriangleMath triangleMath = new TriangleMath();
		double bit = TriangleMath.getHypotenuse(3, 4);
		System.out.println(bit);
		
//		System.out.println(TriangleMath.PI);
//		TriangleMath.PI = 0.0;
	}
	
	
	

}
