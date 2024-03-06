package myfirstproject;

interface Vehicle{
	public abstract String accelerate();
	public abstract String stop();
	public abstract String setStart();
	
}

class Car{
	String vin;
	String color;
	boolean isStart;
	
	void setGear() {
	}
}

class ManualCar extends Car implements Vehicle{
	int gear;
	
	ManualCar(String vin, String color, boolean isStart, int gear){
		this.vin = vin;
		this.color = color;
		this.isStart = isStart;
		this.gear = gear;
	}

	@Override
	public String accelerate() {
		System.out.println("수동 변속기 자동차가 가속합니다.");
		return null;
	}

	@Override
	public String stop() {
		System.out.println("수동 변속기 자동차가 정차합니다.");
		return null;
	}

	@Override
	public String setStart() {
		isStart = !isStart;
		return null;
	}
	
	public int gear() {
		return 0;
	}
		
	}
	
class AutomaticCar extends Car implements Vehicle{
			
	AutomaticCar(String vin, String color, boolean isStart){
		this.vin = vin;
		this.color = color;
		this.isStart = isStart;
	}

	@Override
	public String accelerate() {
		System.out.println("자동 변속기 자동차가 가속합니다.");
		return null;
	}
	public String stop() {
		System.out.println("자동 변속기 자동차가 정차합니다.");
		return null;
	}
	public String setStart() {
		isStart = !isStart;
		return null;
	}	
}	
class Train{
    String trainNumber;
	String departureStation;
	String arrivalStation;
	boolean isStart;
		
}

class PassengerTrain extends Train implements Vehicle{
    int passsengerCount;
    
    PassengerTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, int passsengerCount){
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.isStart = isStart;
		this.passsengerCount = passsengerCount;
    }
	
	@Override
	public String accelerate() {
		System.out.println("여객 열차가 천천히 가속합니다.");
		return null;
	}
	@Override
	public String stop() {
		System.out.println("여객 열차가 천천히 정차합니다.");
		return null;
	}
	@Override
	public String setStart() {
	    isStart = !isStart;
		return null;
	}
	}

class FreightTrain extends Train implements Vehicle{
    double cargoWeight;
    
    FreightTrain (String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight){
		this.trainNumber = trainNumber;
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.isStart = isStart;
		this.cargoWeight = cargoWeight;
    }
    
	@Override
	public String accelerate() {
		System.out.println("화물 열차가 천천히 가속합니다.");
		return null;
	}
	@Override
	public String stop() {
		System.out.println("화물 열차가 천천히 정차합니다.");
		return null;
	}
	@Override
	public String setStart() {
		isStart = !isStart;
		return null;
	}
	}

public class A_4 {

	public static void main(String[] args) {
		
		ManualCar car = new ManualCar("10가1234", "blue", false, 0);
		System.out.print("수동 변속기 자동차 {");
		System.out.print("차량번호=" + car.vin + ", ");
		System.out.print("색상=" + car.color + ", " );
		System.out.print("시동 상태=" + car.isStart + ", " );
		System.out.println("기어 상태=" + car.gear + "}" );
		
		AutomaticCar car1 = new AutomaticCar("10가1234", "blue", false);
		System.out.print("자동 변속기 자동차 {");
		System.out.print("차량번호=" + car1.vin + ", ");
		System.out.print("색상=" + car1.color + ", " );
		System.out.println("시동 상태=" + car1.isStart + ", " );
		
		PassengerTrain train1 = new PassengerTrain("KTX001", "서울", "부산", false, 200);
		System.out.print("여객 열차 {");
		System.out.print("열차번호=" + train1.trainNumber + ", ");
		System.out.print("출발역=" + train1.departureStation + ", " );
		System.out.print("도착역=" + train1.arrivalStation + ", " );
		System.out.print("기어 상태=" + train1.isStart + ", " );
		System.out.println("탑승객 수=" + train1.passsengerCount + "}" );
		
		FreightTrain train2 = new FreightTrain("Cargo001", "부산", "서울", false, 100.0);
		System.out.print("화물 열차 {");
		System.out.print("열차번호=" + train2.trainNumber + ", ");
		System.out.print("출발역=" + train2.departureStation + ", " );
		System.out.print("도착역=" + train2.arrivalStation + ", " );
		System.out.print("기어 상태=" + train2.isStart + ", " );
		System.out.print("화물 무게=" + train2.cargoWeight + "}" );

	}

}
