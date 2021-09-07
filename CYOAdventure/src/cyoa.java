import java.util.*;

public class cyoa {

	public static void main(String[] args) {
		Scanner adventure = new Scanner(System.in);
		
		System.out.println("It is 1 am when you wake up. You feel very hungry, but you do not want to get out of bed.");
		System.out.println("DO YOU WANT TO \"Sleep\" or \"Eat\"?");
		String stage1 = adventure.nextLine();
		
		if (stage1.equals("Sleep") || stage1.equals("sleep")) {
			System.out.println("You sleep for 8 more hours. You are bored, but you do not know what to do.");
			System.out.println("DO YOU WANT TO GO \"Outside\" OR PLAY \"Videogames\"?");
			String stage2 = adventure.nextLine();
			if (stage2.equals("Outside") || stage2.equals("outside")) {
				System.out.println("You go outside. It is a nice day out, so you decide to go to the movies. Right when that happens, your friends invite you to a picnic.");
				System.out.println("DO YOU WANT TO GO TO THE \"Movies\" OR ON A \"Picnic\"?");
				String stage3 = adventure.nextLine();
				if (stage3.equals("Movies") || stage3.equals("movies")) {
					System.out.println("You decide to go to the movies. You watch the new Sonic movie, and you decide to rate it an 8/10. You get home to see your house has been broken into, but the thief didn't steal anything of importance. You call a handyman to fix the broken window and go on and continue you day.");
				} if (stage3.equals("Picnic") || stage3.equals("picnic")) {
					System.out.println("You go out on a picnic. There, you meet up with your friends. They introduce you to someone they met and you two hit it off. Eventually you two start dating and get married happily ever after.");
				}
			} if (stage2.equals("Videogames") || stage2.equals("videogames")) {
				System.out.println("You boot up your pc and start playing. You hear what sounds like glass breaking, but it could just be the game.");
				System.out.println("DO YOU WANT TO \"Investigate\" THE SITUATION OR \"Ignore\" IT?");
				String stage3 = adventure.nextLine();
				if (stage3.equals("Investigate") || stage3.equals("investigate")) {
					System.out.println("You decide to investigate the situation. You find out that someone broke into your house. You use your martial arts skills to knock out the robber as the police come and arrest him. Turns out he was an alcoholic who found some guns and was breaking into houses in your neighborhood. At least you stopped him before there was any harm.");
				} if (stage3.equals("Ignore") || stage3.equals("ignore")) {
					System.out.println("You ignore the glass and continue playing. All of a sudden, you hear a loud crack, and everything goes black.");
					System.out.println("TWO MONTHS LATER");
					System.out.println("Turns out someone actually broke into your house. They shot you three times, once in the chest, another in your neck, and one last one right up your jaw. After waking up from the two month coma, you can no longer feel anything. Turns out you have been paralyzed from the neck down. You will need assistance for the rest of your life.");
				}
			}
		} if (stage1.equals("Eat") || stage1.equals("eat")) {
			System.out.println("You get up to get food.");
			System.out.println("DO YOU WANT TO \"Cook\" FOOD OR \"Buy\" FOOD?");
			String stage2 = adventure.nextLine();
			if (stage2.equals("Cook") || stage2.equals("cook")) {
				System.out.println("You decide to put together a sandwich, but when you go to get the bready, it looks slightly moldy. Tortillas could work though.");
				System.out.println("DO YOU WANT TO USE THE \"Moldy\" BREAD OR USE THE \"Tortillas\"?");
				String stage3 = adventure.nextLine();
				if (stage3.equals("Moldy") || stage3.equals("moldy")) {
					System.out.println("You decide to use the moldy bread. You eat it, and it turns out it was not mold, but instead, green food coloring. Well, at least you did not waste the bread!");
				} if (stage3.equals("Tortillas") || stage3.equals("tortillas")) {
					System.out.println("You decide to use tortillas. After taking a couple of bites, your stomach starts feeling queasy. You check the package and realize the tortillas expired 3 years ago. You realize you have food poisoning and now you have to go to the bathroom every 45 minutes.");
				}
			} if (stage2.equals("Buy") || stage2.equals("buy")) {
				System.out.println("You decide to buy some food. You are not sure if you should just order takeout or go to the local bar.");
				System.out.println("DO YOU WANT TO ORDER \"Takeout\" OR GO TO THE \"Bar\"?");
				String stage3 = adventure.nextLine();
				if (stage3.equals("Takeout") || stage3.equals("takeout")) {
					System.out.println("You decide to get takeout. You eat the food, enjoy it, and then go to bed. It was very tasty.");
				} if (stage3.equals("Bar") || stage3.equals("bar")) {
					System.out.println("You go to the local bar. You lose a bet and get too drunk. As you go back home, your drunk self breaks into another house. You get arrested and sentenced to 10 years in prison. Maybe you should have just not have arm wrestled that 350 lb dude.");	
				}
			}
		}
	}

}
