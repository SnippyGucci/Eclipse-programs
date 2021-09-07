package cardDeck;

public class DeckOfCards 
{

 	private Card[] theDeck;

	

 	public DeckOfCards() 

 	{

	theDeck = new Card[52];  

	String [] suits = {"Spade", "Hearts", "Clubs", "Diamonds"};

	String [] faces = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7" ,"6", "5", "4", "3", "2"};

	

	String suit = "";

	int sval = 0;

	String face = "";

	int fval = 0;



		

		for(int s = 0; s < suits.length; s++)

		{

			suit = suits[s];

			sval = s + 1;

		

			for(int f = 0; f < faces.length; f++)

			{

				face = faces[f];

				fval = f+ 1;

				if(s == 1)

				{

					theDeck[f] = new Card(suit, face, sval, fval);

				}

				else if(s == 2)

				{

					theDeck[f + 13] = new Card(suit, face, sval, fval);

				}

				else if(s == 3)

				{

					theDeck[f + 26] = new Card(suit, face, sval, fval);
				}

				else 

				{

					theDeck[f + 39 ] = new Card(suit, face, sval, fval);

				}

			

			}

		}

	}

	

 

 	

 	public void shuffle (int [] i) 

 	{

 		int random;

		Card r;

 		

		for( int m = theDeck.length - 1; m > 0; m-- )

 		{	

 			random = (int) Math.abs((Math.random() * (m - 1)));

 			r = theDeck[random];

 			theDeck[random] = theDeck[m];

 			theDeck[m] = r;

 			

 		}

 		

 	}

 	

 	public void deal(int c, int [] i)

 	{

 		shuffle(i);

 		

 		for (int n = 0; n < c; n++)

 		{

 			System.out.println(i[c]);

 		}

 	}
 	
 
}
