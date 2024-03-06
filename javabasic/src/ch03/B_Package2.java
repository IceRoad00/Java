           package ch03;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class B_Package2 {

	public static void main(String[] args) {
 
//		Math 클래스: 수학 연산과 관련된 다양한 메서드를 제공해주는 클래스
		
//		절대값 메서드: abs()
		System.out.println(Math.abs(-10));
		
//		*올림값 메서드: ceil()
		System.out.println(Math.ceil(3.14));
		
//		*내림값 메서드: floor()
		System.out.println(Math.floor(3.14));
		
//		*반올림 메서드: round()
		System.out.println(Math.round(3.14));
		
//		특정 소수점 자리수에서 올림, 내림, 반올림
		System.out.println(Math.round((3.1415*100) / 100.0)); // 소수점 세번째 자리에서 반올림
		
//		최솟값 메서드: min()
		System.out.println(Math.min(10, 20));
		
//		최대값 메서드: max()
		System.out.println(Math.max(10, 20));
		
//		거듭제곱값 메서드: pow()
		System.out.println(Math.pow(10, 3));
		
//		제곱근값 메서드: sqrt()
		System.out.println(Math.sqrt(100));
		
//		Random 클래스: 난수를 생성해주는 클래스
		Random random = new Random();
		System.out.println(random.nextInt());
//		범위 제약
		System.out.println(random.nextInt(45));
		System.out.println(random.nextInt() % 45);
		
//		Lotto: 1~45, 중복 없는 6개의 수
		
		for(int count=0; count<5; count++) {
			Set<Integer> lotto = new TreeSet<>();
			
		while(lotto.size()<6) {
		int number = random.nextInt(45)+1;
		lotto.add(number);
		}
		System.out.println(lotto);
			
		}
		
//		연금복권: 1-5조 0-9 중복허용한 6자리 수 5조 588526
		List<Integer> annuity = new ArrayList<>();
		
		int jo = random.nextInt(5) + 1;
		annuity.add(jo);
		
		for(int count = 0; count < 6; count++) {
			int number = random.nextInt(10);
			annuity.add(number);
			
		}
		
		System.out.println(annuity);
		
//		Date 클래스: 날짜르 다루는 클래스
//		Date 클래스의 대부분의 메서드는 JDK 1.1 부터 사용하지 않도록 권장하고 있음.
		Date dateNow = new Date();
		System.out.println(dateNow);
		System.out.println(dateNow.getDate());
		
//		LocalDateTime 클래스: Java 8 버전 이후부터 Date 클래스를 대체하기 위해 만들어진 클래스

//		LocalDate 클래스, LocalTime 클래스, LocalDateTime 클래스
//		현재 날짜 및 시간의 인스턴스 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
//		특정 날짜 및 시간의 인스턴스 생성
		LocalDateTime date1 = LocalDateTime.of(2024, 1, 18, 9, 0, 0);
		System.out.println(date1);
		
//		특정 요소 가져오기 getXXX()
		int year = now.getYear();
		System.out.println(year);
		int month = now.getMonthValue();
		System.out.println(month);
		int day = now.getDayOfMonth();
		System.out.println(day);
		
//		특정 요소 변경하기 withXXX()
//		변경한 값을 반환 함.
		now = now.withYear(2025).withHour(15);
		System.out.println(now);
		
//		날짜 계산하기
//		특정 요소의 값을 더하거나 빼기 plusXXX() / miunsXXX()
//		변경한 값을 반환 함.
		now = now.plusMonths(2).minusDays(15);
		System.out.println(now);
		
//		LocalDataTime을 Data 클래스로 변경
		Date localToDate = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(localToDate);
		
//		Date -> String
//		SimpleDateFormat 클래스를 사용하여 지정한 포멧으로 문자열으로 변경
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		String dateString = simpleDateFormat.format(localToDate);
		System.out.println(dateString);
		
//		y:연도, M:월, d:일, a:오전오후, H:시간(24), h:시간(12), m:분, s:초, E:요일
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateString = simpleDateFormat.format(localToDate);
		System.out.println(dateString);
		
//		LocalDateTime -> String
		dateString = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(dateString);

		
		 
	}
	  
	}










