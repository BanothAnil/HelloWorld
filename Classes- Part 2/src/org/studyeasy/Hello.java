package org.studyeasy;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Car car=new Car();
          car.setSpeed(80);
          System.out.println(car.getSpeed());
          
          car.setDoors("Closed");
          System.out.println(car.getDoors());
          car.setDriver("seated");
          car.setEngine("on");
          System.out.println(car.run());
	}

}
