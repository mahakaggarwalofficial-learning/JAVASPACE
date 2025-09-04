package oops;

public class TestBuildings {

	public static void main(String[] args) {

		new Buildings(); // annonymous object
		
		Buildings bd = new Buildings();
		
		
		//bd.isGarden = true;
		
	
		System.out.println(bd.isGarden);

		System.out.println(bd.numberBalcony);

		System.out.println(bd.numberOfFloors);

		System.out.println(bd.numberOfRooms);

		System.out.println(bd.numberOfWashrooms);
		bd.isGarden = true;
		System.out.println(bd.isGarden);

		
		
		
		
		
	}

}
