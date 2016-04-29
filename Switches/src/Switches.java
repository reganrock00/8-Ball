import java.util.Scanner;

public class Switches
	{
    public static void main(String[] args)
	  {
	generatingGame();
	creatingMagicChallenge();
	  }
		public static void generatingGame()
    	{
		  int randomNumber1 = (int)(Math.random()*20)+1;
		  switch (randomNumber1)
		    {
		    	case 2:
		    	case 4:
		    	case 6:
		    	case 10:
		    	case 12:
		    	case 14:
		    	case 18:
		    	case 20:
		    	case 1:
		    			{
		    			System.out.println("Winner!");
		    			System.out.println(randomNumber1);
		    			break;
		    			}
		    	case 8:
		    	case 16:
		    			{
		    			System.out.println("Game Over!");
		    			System.out.println(randomNumber1);
		    			break;
		    			}
		    	default:
		    			{
		    			System.out.println("tie");
		    			System.out.println(randomNumber1);
		    			break;
		    			}
		    }
		} 
		public static void creatingMagicChallenge()
		   {
		   Scanner userInput1 =new Scanner (System.in);  
		   System.out.println("Ask me any question.");
		   String question = userInput1.nextLine();
		   int randomNumber2 = (int)(Math.random()*20)+1;
		   switch (randomNumber2)
		       {
		    	case 1:
		    			{
		    			System.out.println("It is certain");
		    			break;
		    			}
		    	case 2:
		    			{
		    			System.out.println("It is decidedly so");
		    			break;
		    			}
		    	case 3:
		    			{
		    			System.out.println("Without a doubt");
			    		break;	
		    			}
		    	case 4:
		    			{
		    			System.out.println("Yes, definetly");
			    		break;			
		    			}
		    	case 5:
		    			{
		    			System.out.println("You may rely on it");
			    		break;			
		    			}
		    	case 6:
		    			{
		    			System.out.println("As I see it, yes");
			    		break; 				
		    			}
		    	case 7:
		    			{
		    			System.out.println("Most likely");
			    		break;		
		    			}
		    	case 8:
		    			{
		    			System.out.println("Outlook good");
			    		break;	
		    			}
		    	case 9:
		    			{
		    			System.out.println("Yes");
			    		break;	
		    			}
		    	case 10:
		    			{
		    			System.out.println("Signs point to yes");
			    		break;	
		    			}
		    	case 11:
		    			{
		    			System.out.println("Reply hazy try again");
			    		break;	
		    			}
		    	case 12:
		    			{
		    			System.out.println("Ask again later");
			    		break;	
		    			}
		    	case 13:
		    			{
		    			System.out.println("Better not tell you now");
			    		break;	
		    			}
		    	case 14:
		    			{
		    			System.out.println("Cannot predict now");
			    		break;	
		    			}
		    	case 15:
		    			{
		    			System.out.println("Concentrate and ask again");
			    		break;	
		    			}
		    	case 16:
		    			{
		    			System.out.println("Don't count on it");
			    		break;	
		    			}
		    	case 17:
		    			{
		    			System.out.println("My reply is no");
			    		break;	
		    			}
		    	case 18:
		    			{
		    			System.out.println("My sources say no");
			    		break;	
		    			}
		    	case 19:
		    			{
		    			System.out.println("Outlook not so good");
			    		break;	
		    			}
		    	case 20: 
		    			{
		    			System.out.println("Very doubtful");
			    		break;	
		    			}
		       }
		    }
   }
