public class BicycleRegistration
	{

		public static void main(String[] args){

			Bicycle bike_1, bike_2,bike_3,bike1,bike2,bike3;
			String  owner1, owner2,owner3;

			bike1 = new Bicycle(); //Create and assign Value to Bike1 
			bike1.setOwnerName("Michelle Sinangote");

			bike2 = new Bicycle(); //Create and assign Value to Bike2
			bike2.setOwnerName("Mildren Sinangote");

			bike_1 = new Bicycle(); 
			bike_1 .setTagNo("2003-07MA");
			bike_2 = new Bicycle(); 
			bike_2 .setTagNo("2000-181M");

			//out the information

			owner1 = bike1.getOwnerName();
			owner2 = bike2.getOwnerName();	

			String tagno_1=bike_1.getTagNo( );
			String tagno_2=bike_2.getTagNo( );


			bike_3=new Bicycle("1960-27MC","Mila Cordero");
			String tagno_3=bike_3.getId( );
			owner3=bike_3.getOwnerName( );

			System.out.println(owner1 + " owns the Bicycle");
			System.out.println(tagno_1 + " is the tag number");
			System.out.println(owner2+" also owns  the Bicycle");
			System.out.println(tagno_2 + " also owns a Bicycle");
			System.out.println(tagno_3 + " is the tag number "+owner3);
			}
	}
