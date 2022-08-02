package cardDeck;

public class Card 

{

	private String suitName;

	private String faceName;

	private int suitVal;

	private int faceVal;



	public Card (String sn, String fn, int sv, int fv)

	{

		suitName = sn;

		faceName = fn;

		suitVal = sv;

		faceVal = fv;

		

	}

	

	public String getSuitName()

	{

		return suitName;

	}

	public String getFaceName()

	{

		return faceName;

	}

	public int getSuitVal()

	{

		return suitVal;

	}

	public int getFaceVal()

	{

		return faceVal;

	}

	

	public String toString()

	{

		return faceName + " of " + suitName;

	}

}