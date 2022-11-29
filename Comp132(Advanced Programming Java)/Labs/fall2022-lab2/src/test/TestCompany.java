
// Please include your Pledge of Honor here.
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: İdil İşsever, 80447
********************************************************************************/

// Import the necessary classes.

import company.Engineer;
import company.Position;
import company.Company;

public class TestCompany {

	public static void main(String[] args) {

		
		
		// define engineer objects
		Engineer m1 = new Engineer("John", "38899", "PHD");
		Engineer m2 = new Engineer("Mary", "03121", "PHD");
		Engineer m3 = new Engineer("Dennis", "06569", "PHD");
		Engineer m4 = new Engineer("Cate", "08953", "MS");
		Engineer m5 = new Engineer("Phoebe", "04956", "MS");
		Engineer m6 = new Engineer("Andrew", "93201", "BS");
		Engineer m7 = new Engineer("Carey", "05786", "PHD");

		// update education levels for some engineers
		m1.updateLevel();
		m6.updateLevel("PHD");

		// define company objects
		Company meta = new Company("Meta");
		Company telegram = new Company("Telegram");
		Company twitter = new Company("Twitter");

		// set positions for companies
		meta.openPosition("Graphic Designer", "BS");
		telegram.openPosition("Manager", "MS");
		twitter.openPosition("Research Engineer", "PHD");

		// hire engineers to given positions
		meta.hireEngineer("Graphic Designer", m1);
		meta.hireEngineer("Manager", m2);
		meta.hireEngineer("Graphic Designer", m3);
		meta.hireEngineer("Manager", m4);
		meta.hireEngineer("Graphic Designer", m5);

		telegram.hireEngineer("Manager", m2);
		telegram.hireEngineer("Manager", m4);
		telegram.hireEngineer("Manager", m6);

		twitter.hireEngineer("Research Engineer", m1);
		twitter.hireEngineer("Research Engineer", m2);
		twitter.hireEngineer("Research Engineer", m3);
		twitter.hireEngineer("Research Engineer", m4);
		twitter.hireEngineer("Research Engineer", m5);
		twitter.hireEngineer("Research Engineer", m6);
		twitter.hireEngineer("Research Engineer", m7);

		// print company info
		System.out.println(meta);
		System.out.println(telegram);
		System.out.println(twitter);

		
	}

	public static String checkMultipleHirings(Company[] arrayOfCompany) {
		String[] arrayOfSingHiredEngineers = new String[15];
		String[] arrayofMultHiredEngineers = new String[7];
		int i = 0;
		int j = 0;
		String output = "";
		for (Company company : arrayOfCompany) {
			for (Position position : company.getArrayOfPositions()) {
				for (Engineer engineer : position.getArrayOfEngineers()) {
					arrayOfSingHiredEngineers[i] = engineer.getName();
					i++;	
				}	
			}
		}
		for (String string : arrayOfSingHiredEngineers) {
			for (String string2 : arrayofMultHiredEngineers) {
				arrayofMultHiredEngineers[j] = string;
				j++;

			}
		}			
		

		for (String string : arrayOfSingHiredEngineers) {
			for (String string2 : arrayofMultHiredEngineers) {
				if (string.equals(string2)){
					output = output + "Engineer: " + string + " is hired by multiple companies.\n";
				} else { output = output + "Engineer: " + string;

				}
			}
		}
			
		return output;

	}

}
