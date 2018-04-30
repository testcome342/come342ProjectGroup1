import java.io.IOException;
import java.util.Scanner;

import domain.Client;
import helper.Database;
import helper.PrintHelper;
import ui.AddNewClientUI;

public class Application {
	
	/*
	 * Arda Altunyay
	 * 12.04.2018
	 * */

	public static void main(String[] args) {
		Database.init();
		int choice;
				
		while(true) {
			//Brand UI
			PrintHelper.printLine(49);
			PrintHelper.print("|                                               |");
			PrintHelper.print("|                   AGATE LTD                   |");
			PrintHelper.print("|                                               |");
			
			//Menu UI
			PrintHelper.printLine(49);
			PrintHelper.print("|     1- Add a new client                       |");
			PrintHelper.print("|     2- Add a new campaign                     |");
			PrintHelper.print("|     5- Assign staff to work on a campaign     |");
			PrintHelper.print("|     11- Add a new advert to a campaign        |");
			PrintHelper.print("|     12- Add a new member of staff             |");
			PrintHelper.print("|     999- Exit                                 |");
			PrintHelper.printLine(49);
			
			PrintHelper.print("Enter a number=> ", true);
			choice = new Scanner(System.in).nextInt();
			PrintHelper.printLine(49);
			switch(choice) {
				
				case 1:
					AddNewClientUI.getInstance();
					break;
				case 2:
					PrintHelper.print("add a new campaign");
					break;
				case 5:
					PrintHelper.print("assign staff to work on a campaign");
					break;
				case 11:
					PrintHelper.print("add a new advert to a campaign");
					break;
				case 12:
					PrintHelper.print("add a new member of staff");
					break;
				case 999:
					PrintHelper.print("exit");
					System.exit(0);
					break;
				default:
					PrintHelper.print("error, try enter a number");
					break;
			}
			PrintHelper.printRow(40);
		}
		
	}

}