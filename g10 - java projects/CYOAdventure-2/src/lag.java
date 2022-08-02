import java.util.*;

public class lag {

	public static void main(String[] args) {
		Scanner adventure = new Scanner(System.in);
		String stage1 = "Back";
		int terminator = 0;
		
		String room1 = "You wake up in front of two doors.\nChoose between the \"FIRST\" door and the \"SECOND\" door.";
		String room2 = "You chose the first door and find yourself in a bright room and see a house in front of you.\nDo you want to enter the \"HOUSE\"?";
		String room3 = "You enter the house. You see a \"BEDROOM\", the \"KITCHEN\", and a \"DINING\" room. Where do you want to go?";
		String room4 = "You enter the bedroom and see a \"WINDOW\" and a \"CLOSET\""; 
		String room5 = "You enter the dining room, and realize you can only go into the \"BASEMENT\".";
		String room6 = "You enter the kitchen, but you can only go into the \"DINING\" room.";
		String room7 = "You jump out the window, only to fall to your death. You lose."; 
		String room8 = "You enter the closet, which turns out to end the simulation. You escaped!";
		String room9 = "You enter the basement, to see... aliens. They have high tech and are controlling the room somehow. They see you... and everything fades away. You lose.";
		String room10 = "You enter the second door to see a \"BASEMENT\".";										
		
		System.out.println("Type \"BACK\" if you want to move back to your original room\n");
		
		while (terminator == 0) {
			System.out.println(room1);
			stage1 = adventure.nextLine();
			while ((stage1.equals("First") || stage1.equals("first")) && terminator!=1) {
				terminator = 0;
				System.out.println(room2);
				String stage2 = adventure.nextLine();
				if (stage2.equals("Back") || stage2.equals("back")) {
					terminator = 1;
				} while ((stage2.equals("House") || stage2.equals("house")) && terminator!=2 && terminator!=3) {
					terminator = 2;
					System.out.println(room3);
					String stage3 = adventure.nextLine();
					if (stage3.equals("Back") || stage3.equals("back")) {
						terminator = 3;
					} while ((stage3.equals("Bedroom") || stage3.equals("bedroom")) && terminator!=3 && terminator!=4) {
						System.out.println(room4);
						String stage4 = adventure.nextLine();
						if (stage4.equals("Back") || stage4.equals("back")) {
							terminator = 4;
						} while (stage4.equals("Window") || stage4.equals("window")) {
							System.out.println(room7);
							System.exit(0);
						} while (stage4.equals("Closet") || stage4.equals("closet")) {
							System.out.println(room8);
							System.exit(0);
						}
					} while ((stage3.equals("Kitchen") || stage3.equals("kitchen")) && terminator!=3 && terminator!=4) {
						System.out.println(room6);
						String stage4 = adventure.nextLine();
						if (stage4.equals("Back") || stage4.equals("back")) {
							terminator = 4;
						} else {
							stage3 = "Dining";
						}
					} while ((stage3.equals("Dining") || stage3.equals("dining")) && terminator!=3 && terminator!=4) {
						System.out.println(room5);
						String stage4 = adventure.nextLine();
						if (stage4.equals("Basement") || stage4.equals("basement")) {
							System.out.print(room9);
							System.exit(0);
						} else {
							terminator = 4;
						}
					}
				}
			} while ((stage1.equals("Second") || stage1.equals("second")) && terminator!=1) {
				System.out.println(room10);
				String stage2 = adventure.nextLine();
				if (stage2.equals("Back") || stage2.equals("back")) {
					terminator++;
				} else {
					System.out.println(room9);
					System.exit(0);
				}
			} if (stage1.equals("Back") || stage1.equals("back")) {
				System.out.println("You cannot go more back!");
			}
			
			terminator = 0;
			
			
			/*
				System.out.println("Room 2 > Room 3");
				System.out.println("choose room 4, 5, or 6");
				String stage2 = adventure.nextLine();
				while (stage2.equals("B") || stage2.equals("b") || stage2.equals("C") || stage2.equals("c")) {
					System.out.println("Room 2 > Room 3");
					System.out.println("choose room 4, 5, or 6");
					stage2 = adventure.nextLine();
					if (stage2.equals("A") || stage2.equals("a")) {
						System.out.println("Room 4");
						System.out.println("choose room 7 or 8");
						String stage3 = adventure.nextLine();
						while (stage3.equals("S") || stage3.equals("s")) {
							if (stage3.equals("S") || stage3.equals("s")) {
								System.out.println("Room 7");
								
							} if (stage3.equals("T") || stage3.equals("t")) {
								System.out.println("Room 8 > ESCAPE");
							}
						}
						
					} if (stage2.equals("B") || stage2.equals("b")) {
						System.out.println("Room 5 >10> Room 12 BAD ENDING");
						
					} if (stage2.equals("C") || stage2.equals("c")) {
						System.out.println("Room 6 > Room 5 >10> Room 13 BAD ENDING");
						
					}
				}
			} if (stage1.equals("Y") || stage1.equals("y")) {
				System.out.println("Room 12 > Room 10 > Room 13 BAD ENDING");
			}
			
			*/
			
		}		
		
		adventure.close();
		
	}

}
