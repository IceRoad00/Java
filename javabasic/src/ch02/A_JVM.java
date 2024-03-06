package ch02;

class ExampleClass2 {
	static int number = 3;
	double doubleNumber;
	
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;

	}
	
	static void staticmethod() {
		
	}
}

class Sample1 {
	int data;
	
	Sample1 (){}
	
	Sample1 (Sample1 sample){
		this.data = sample.data;
	}
	
}
public class A_JVM {

	public static void main(String[] args) {

		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		sample = instance1.method();
		
		System.out.println(sample.data);
		
//		number = 10;    << 10으로 바꾸게 되면 메소드가 종료되서 스택 영역 안의 instance1.method(); 공간이 없어지고 데이터 값은 반환됨.
		
		int number2 = number;
		number2++;
		System.out.println(number);
		System.out.println(number2);
		
		Sample1 sample2 = sample;
		sample2.data++;
		System.out.println(sample.data);
		System.out.println(sample2.data);
		
		Sample1 sample3 = new Sample1(sample);
		System.out.println(sample.data);
		System.out.println(sample3.data);
		
		sample3.data++;
		System.out.println(sample.data);
		System.out.println(sample3.data);
		

	}

}
