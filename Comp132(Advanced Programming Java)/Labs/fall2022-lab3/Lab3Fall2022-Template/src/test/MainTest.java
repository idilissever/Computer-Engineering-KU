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

package test;

import simulation.*;

public class MainTest {

	public static void main(String[] args) {
		/* TODO 1: create seven Intern objects with the names surnames:
		Eda Yilmaz, Ali Korkmaz, Burak Hasan, Can Kuyucu, Ege Argun,
		Burcu Celebi, and Seyma Ece
		
		While creating the objects, you should demonstrate the use all the constructors that are defined in the Intern class. 
		*/
		Intern eda = new Intern();

		eda.setNameSurname("Eda Yılmaz");
		eda.setID("84363");
		
		Intern ali = new Intern("Ali Korkmaz");
		ali.setID("73329");
		Intern burak = new Intern("Burak Hasan", "73287");
		Intern can = new Intern("Can Kuyucu", "63888");
		Intern ege = new Intern("Ege Argun", "36288");
		var burcu = new Intern("Burcu Celebi", "76388");
		var seyma = new Intern();
		seyma.setID("66628");
		seyma.setNameSurname("Seyma Ece");

		Intern[] interns = new Intern[]{eda,ali,burak, can, ege, burcu, seyma};

		
		/*
		 * TODO 2: create five objects of type Training class, named as Math, Java, Python, ML, and DS
		 * */
		
		Training math = new Training("Math", "01");
		Training java = new Training("Java", "02");
		Training python = new Training("Python", "03");
		Training ml = new Training("ML", "04");
		Training ds = new Training("DS", "05");

		
		/*
		 * TODO 3: add all the interns to all the trainings
		 * */

		Training[] trainings = new Training[]{math, java, python, ml, ds};
		
		for (Training training : trainings) {
			for (Intern intern : interns) {
				training.appendIntern(intern);
			}
		}
		/*
		 * TODO 4: create an object of Simulation class with the size of a x b, 
		 * where a is the number of interns (the number of rows) 
		 * and b is the number of trainings (the number of columns).
		 * */

		var simulation = new Simulation(interns.length, trainings.length);

		/*
		 * TODO 5: Add all the trainings to the simulation object.
		 * */
		for (Training training : trainings) {
			simulation.appendTraining(training);
		}
		
		/*
		 * TODO 6: Call the simulateTable() method that fills in and displays the table.
		 * */
		
		 
		simulation.simulateTable();
		
		/*
		 * TODO 7: Call showInternPerformance() method that finds and displays the performance of interns as shown in the sample output.
		 * */

		simulation.showInternPerformance();
		
		/*
		 * TODO 8: Call showTrainingLevel() that finds and displays the level of each training as shown in the sample output.
		 * */

		simulation.showTrainingLevel();

		simulation.findMax();

		simulation.updateTrainingPerformance("Math", "Burcu Celebi", 92);
		simulation.updateTrainingPerformance("ML", "Burak Hasan", 35);

		simulation.showInternPerformance();
		simulation.showTrainingLevel();


	}

}
