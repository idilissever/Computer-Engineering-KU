package test;

import simulation.Intern;
import simulation.Simulation;
import simulation.Training;

public class MainTest {

	public static void main(String[] args) {
		/* TODO 1: create seven Intern objects with the names surnames:
		Eda Yilmaz, Ali Korkmaz, Burak Hasan, Can Kuyucu, Ege Argun,
		Burcu Celebi, and Seyma Ece
		
		While creating the objects, you should demonstrate the use all the constructors that are defined in the Intern class. 
		*/
		
		//  two-argument constructor
		Intern Eda= new Intern("Eda Yilmaz", "0067234");
		Intern Ali= new Intern("Ali Korkmaz", "0067456");
		
		//no-argument constructor
		Intern Burak= new Intern();
		Burak.setName("Burak Hasan");
		Burak.setID("0067543");
		
		Intern Can= new Intern();
		Can.setName("Can Kuyucu");
		Can.setID("0067213");
		
		//one argument constructor
		Intern Ege= new Intern("Ege Argun");
		Ege.setID("0067983");
		
		Intern Burcu= new Intern("Burcu Celebi");
		Burcu.setID("0067761");
		
		Intern Seyma= new Intern("Seyma Ece");
		Seyma.setID("0067801");
		
		/*
		 * TODO 2: create five objects of type Training class, named as Math, Java, Python, ML, and DS
		 * */
		
		Training math = new Training("Math", "01");
		Training Java = new Training("Java", "02");
		Training Python = new Training("Python", "03");
		Training ml = new Training("ML", "04");
		Training ds = new Training("DS", "05");
		
		
		/*
		 * TODO 3: add all the interns to all the trainings
		 * */
		math.appendIntern(Eda);
		math.appendIntern(Ali);
		math.appendIntern(Burak);
		math.appendIntern(Can);
		math.appendIntern(Ege);
		math.appendIntern(Burcu);
		math.appendIntern(Seyma);
		
		Java.appendIntern(Eda);
		Java.appendIntern(Ali);
		Java.appendIntern(Burak);
		Java.appendIntern(Can);
		Java.appendIntern(Ege);
		Java.appendIntern(Burcu);
		Java.appendIntern(Seyma);
		
		Python.appendIntern(Eda);
		Python.appendIntern(Ali);
		Python.appendIntern(Burak);
		Python.appendIntern(Can);
		Python.appendIntern(Ege);
		Python.appendIntern(Burcu);
		Python.appendIntern(Seyma);
		
		ml.appendIntern(Eda);
		ml.appendIntern(Ali);
		ml.appendIntern(Burak);
		ml.appendIntern(Can);
		ml.appendIntern(Ege);
		ml.appendIntern(Burcu);
		ml.appendIntern(Seyma);
		
		ds.appendIntern(Eda);
		ds.appendIntern(Ali);
		ds.appendIntern(Burak);
		ds.appendIntern(Can);
		ds.appendIntern(Ege);
		ds.appendIntern(Burcu);
		ds.appendIntern(Seyma);
		
		
		/*
		 * TODO 4: create an object of Simulation class with the size of a x b, 
		 * where a is the number of interns (the number of rows) 
		 * and b is the number of trainings (the number of columns).
		 * */
		
		Simulation sc = new Simulation(ds.getInternList().size(),5);
		
		/*
		 * TODO 5: Add all the trainings to the simulation object.
		 * */
		sc.appendTraining(math);
		sc.appendTraining(Java);
		sc.appendTraining(Python);
		sc.appendTraining(ml);
		sc.appendTraining(ds);
		
	
		
		/*
		 * TODO 6: Call the simulateTable() method that fills in and displays the table.
		 * */
		sc.simulateTable();
		
		
		System.out.println("------------------------ Interns performance ---------------------------------\n");

		/*
		 * TODO 7: Call showInternPerformance() method that finds and displays the performance of interns as shown in the sample output.
		 * */
		sc.showInternPerformance();
		
     	System.out.println("------------------------ Trainings performance ---------------------------------\n");
		
     	/*
		 * TODO 8: Call showTrainingLevel() that finds and displays the level of each training as shown in the sample output.
		 * */
		sc.showTrainingLevel();
		
		
		
		/*
		 * Inlab TODO 1: Call findMax() that displays the maximum performance details. 
		 */
		sc.findMax();
		
		
		
		/*
		 * Inlab TODO 2: Call updateTrainingPerformance(String trainingName, String internName, int newPerformance) 
		 * that updates the interns' performances at given trainings. 
		 */
		sc.updateTrainingPerformance("Math", "Burcu Celebi", 92);
		sc.updateTrainingPerformance("ML", "Burak Hasan", 35);
		/*
		 *  Call showTrainingLevel() and showInternPerformance() to observe the effects of performance updates
		 */
		sc.showInternPerformance();
		sc.showTrainingLevel();

	}

}
