import java.util.Scanner;

public class twicebudget {

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		String ticketType, housingSelection, foodChoice, merchYN, miscYN;
		int tickets=0 , housing=0, food=0, merch=0, misc=0, days=0, budget=0, budgetNoTickets=0;
		
		System.out.println("Hello, welcome to the TWICE trip budget estimator!");
		
		
		//DAYS STAYING
		System.out.println("How many days will you be staying?");
		days = userinput.nextInt();
		System.out.println("You will be staying for " + days + " days.");
		
		
		//TICKET PRICE
		System.out.println("Will you be purchasing high end($300) tickets or lower end($175)?");
		ticketType = userinput.next();
		
		if (ticketType.equals("High") || ticketType.equals("high")) 
		{
			System.out.println("High budget selected. ($300)");
			tickets = 300;
		}
		else if (ticketType.equals("Low") || ticketType.equals("low")) 
		{
			System.out.println("Low budget selected. ($175)");
			tickets = 175;
		}
		
		
		//HOUSING PRICE
		System.out.println("Will you be purchasing housing?");
		housingSelection = userinput.next();
		
		if (housingSelection.equals("Yes") || housingSelection.equals("yes")) 
		{
			System.out.println("Housing selected.");
			housing = 40;
		}	
		else if (housingSelection.equals("No") || housingSelection.equals("no"))
		{
			System.out.println("No housing selected.");
			housing = 0;
		}
		
		//FOOD PRICE
		System.out.println("High, low, or medium food budget plan? ($60/40/20 a day)");
		foodChoice = userinput.next();
		
		if (foodChoice.equals("High") || foodChoice.equals("high")) 
		{
			System.out.println("High budget selected. ($60/day)");
			food = 60;
		}
		else if (foodChoice.equals("Medium") || foodChoice.equals("medium")) 
		{
			System.out.println("Medium budget selected. ($40/day)");
			food = 40;
		}
		else if (foodChoice.equals("Low") || foodChoice.equals("low")) 
		{
			System.out.println("Low budget selected. ($20/day)");
			food = 20;
		}
		
		//MERCH
		System.out.println("Merch?");
		merchYN = userinput.next();
		
		if(merchYN.equals("Yes") || merchYN.equals("yes"))
		{
			System.out.println("$100 added to budget");
			merch = 100;
		}
		else if(merchYN.equals("No") || merchYN.equals("no"))
		{
			System.out.println("No merch selected");
			merch = 0;
		}
		
		//MISC
		System.out.println("Would you like to add a budget for misc? (random shopping, events, etc.)");
		miscYN = userinput.next();
		
		if(miscYN.equals("Yes") || miscYN.equals("yes"))
		{
			System.out.println("$50 added to budget");
			misc = 50;
		}
		else if(miscYN.equals("No") || miscYN.equals("no"))
		{
			System.out.println("No merch selected");
			misc = 0;
		}
		
		//BUDGETS
		budget = (housing * days) + (food * days) + (tickets + merch + misc);
		budgetNoTickets = (housing * days) + (food * days) + (merch + misc);
		System.out.println("\n\nAfter your selections,\n"
				 		+ "Your total estimated budget is $" + budget);
		System.out.println("Your budget without tickets included is $" 
						+ budgetNoTickets);
		
	}

}