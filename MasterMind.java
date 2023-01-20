package mastermind;

import java.util.Random;
import java.util.Scanner;

public class MasterMind
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	
	
	
	//kleuren
	String[] color = {"rood","groen","geel","blauw","paars","oranje"};
	
	//randomer
	Random r = new Random();
      	int randomNumber=r.nextInt(color.length);
	
	//random code
	String code1 = color[r.nextInt(color.length)];
	String code2 = color[r.nextInt(color.length)];
	String code3 = color[r.nextInt(color.length)];
	String code4 = color[r.nextInt(color.length)];
	
	
	
	//hoeveel hijd pogingen gedaan
	int set = 1;
	
	//of code ge kraakt is
	boolean kraak = false;
	
	
	//output of goed is of wel aanwezig in code maar op verkeerde plek
	String goed = "●";
	String bijna = "○";
	
	//code gekraakt
	String win = "Code gekraakt";
	
	//game start
	System.out.println("Break the coller code!");
	System.out.println("You can choose among: Rood, Groen, Geel, Paars, Blauw & Oranje");
	System.out.println("Good luck!");
	Scanner sc = new Scanner(System.in);
	while (kraak == false) {
	System.out.println("Set: " + set);
	System.out.println("Enter your code:");
	// inpute zijn 4 kleuren en worden opgedeeld in 4 delen.
		
		String break1 = sc.next();
		String break2 = sc.next();
		String break3 = sc.next();
		String break4 = sc.next();
	//+1 bij set counter	
	set = set+1;
		
	
	//controler
	//control 1
	if (break1.equalsIgnoreCase(code1)) {
	    System.out.print(goed);
	    if (break2.equalsIgnoreCase(code2)) {
		if (break3.equalsIgnoreCase(code3)){
		    if (break4.equalsIgnoreCase(code4)) {
			kraak = true;
			if (kraak == true)
			    System.out.print(win + win + win);
			    System.out.println("Je hebt gewonnen en de code gekraakt");
			    System.out.println("   _______________                        |*\\_/*|________\r\n"
			    	+ "  |  ___________  |     .-.     .-.      ||_/-\\_|______  |\r\n"
			    	+ "  | |           | |    .****. .****.     | |           | |\r\n"
			    	+ "  | |   0   0   | |    .*****.*****.     | |   0   0   | |\r\n"
			    	+ "  | |     -     | |     .*********.      | |     -     | |\r\n"
			    	+ "  | |   \\___/   | |      .*******.       | |   \\___/   | |\r\n"
			    	+ "  | |___     ___| |       .*****.        | |___________| |\r\n"
			    	+ "  |_____|\\_/|_____|        .***.         |_______________|\r\n"
			    	+ "    _|__|/ \\|_|_.............*.............._|________|_\r\n"
			    	+ "   / ********** \\                          / ********** \\\r\n"
			    	+ " /  ************  \\                      /  ************  \\\r\n"
			    	+ "--------------------                    --------------------");
		    }
		}
	    }
	}
	
	else {
	    
	    if (break1.equalsIgnoreCase(code2)) {
		    System.out.print(bijna);
		}
	    else {
		if (break1.equalsIgnoreCase(code3)) {
		    System.out.print(bijna);
		}
		else {
			if (break1.equalsIgnoreCase(code4)) {
			    System.out.print(bijna);
			}
			else {
			    System.out.print("x");
			}

		    }

	    }
	    

	}	
	
	
	//control 2
	if (break2.equalsIgnoreCase(code2)) {
	    System.out.print(goed);
	}
	else {
	    if (break2.equalsIgnoreCase(code1)) {
		    System.out.print(bijna);
		}
	    else {
		if (break2.equalsIgnoreCase(code3)) {
		    System.out.print(bijna);
		}
		else {
			if (break3.equalsIgnoreCase(code4)) {
			    System.out.print(bijna);
			}
			else {
			    System.out.print("x");
			}

		    }

	    }
	    

	}
	
	
	//cortrol 3
	if (break3.equalsIgnoreCase(code3)) {
	    System.out.print(goed);
	}
	else {
	    if (break3.equalsIgnoreCase(code1)) {
		    System.out.print(bijna);
		}
	    else {
		if (break3.equalsIgnoreCase(code2)) {
		    System.out.print(bijna);
		}
		else {
			if (break3.equalsIgnoreCase(code4)) {
			    System.out.print(bijna);
			}
			else {
			    System.out.print("x");
			}

		    }

	    }
	    

	}
	
	//control 4
	if (break4.equalsIgnoreCase(code4)) {
	    System.out.println(goed);
	}
	else {
	    if (break4.equalsIgnoreCase(code1)) {
		    System.out.println(bijna);
		}
	    else {
		if (break4.equalsIgnoreCase(code2)) {
		    System.out.println(bijna);
		}
		else {
			if (break4.equalsIgnoreCase(code3)) {
			    System.out.println(bijna);
			}
			else {
			    System.out.println("x");
			}

		    }

	    }
	    

	} 
	//check of 10 sets zijn geweest
	if (set ==  11) {
	    System.out.println("You lose!");
	    kraak = true; }
	}
	sc.close();

    	}
    }
    

