package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Simulation {
	int[][] performanceTable;
	private ArrayList<Training> tr = new ArrayList<Training>();

	// constructor
	public Simulation(int a, int b) {
		this.performanceTable = new int[a][b];
	}

	public int[][] getPerformanceTable() {
		return performanceTable;
	}

	public ArrayList<Training> getTr() {
		return tr;
	}

	public void setPerformanceTable(int[][] performanceTable) {
		this.performanceTable = performanceTable;
	}


	public void appendTraining(Training trn) {
		tr.add(trn);
	}

	// Simulate and fill the table 
	public void simulateTable() {
		System.out.println(" ");
		System.out.print("Name         ");
		for (int c = 0; c < this.tr.size(); c++) {
			System.out.print(this.tr.get(c).getTitle() + "  ");
		}
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		Random rand = new Random(1500);
		for (int i = 0; i < performanceTable.length; i++) {

			System.out.print(this.tr.get(1).getInternList().get(i));

			for (int j = 0; j < performanceTable[i].length; j++) {
				performanceTable[i][j] = rand.nextInt(100 - 10) + 10;
				System.out.print("  | " + performanceTable[i][j]);
			}

			System.out.println(" | ");
			System.out.println();
		}
	}

	// showing the intern performance by evaluating the average of their grades (average of rows)
	public void showInternPerformance() {
		for (int i = 0; i < performanceTable.length; i++) {
			int sumScore = 0;
			for (int j = 0; j < performanceTable[i].length; j++) {
				sumScore = sumScore + this.performanceTable[i][j];
			}
			float gg = sumScore / performanceTable[1].length;
			System.out.println(this.tr.get(1).getInternList().get(i) + "  has the Average score of  " + gg + "\n");

		}

	}
// Average of columns
	public void showTrainingLevel() {
		for (int i = 0; i < performanceTable[1].length; i++) {
			int sumScore = 0;
			String level = " ";
			for (int j = 0; j < performanceTable.length; j++) {
				sumScore = sumScore + this.performanceTable[j][i];

			}
			float gg2 = sumScore / performanceTable.length;
			if (gg2 > 65) {
				level = " above the threshold";
			} else {
				level = " under the threshold";
			}
			System.out.println(
					"The average of  " + this.tr.get(i).getTitle() + "  is " + gg2 + ", then, its level is " + level);
		}

	}
// in lab part
	public void updateTrainingPerformance(String trainingTitle, String internName, int newPerformance) {
		int col = 0;
		int row = 0;
		for (int i = 0; i < tr.size(); i++) {
			Training training = tr.get(i);
			if (training.getTitle() == trainingTitle) {
				col = i;
				for (int j = 0; j < training.getInternList().size(); j++) {
					if (training.getInternList().get(j) == internName) {
						row = j;
						break;
					}
				}
			}
		}
		performanceTable[row][col] = newPerformance;
	}
// in lab part
	public void findMax() {
		int max = 0;
		Intern internWithMaxScore = null;
		Training trainingWithMaxScore = null;

		for (int i = 0; i < performanceTable.length; i++) {
			for (int j = 0; j < performanceTable[0].length; j++) {
				if (performanceTable[i][j] > max) {
					max = performanceTable[i][j];
					trainingWithMaxScore = tr.get(j);
					internWithMaxScore = trainingWithMaxScore.getInterns().get(i);
					
				}
			}
		}
		System.out.println(" ");
		System.out.println("---------------------------------------------");
		System.out.println("Maximum performance:" + max);
		System.out.println("Intern: " + internWithMaxScore.getName() + ", ID: " + internWithMaxScore.getID());
		System.out.println("Training: " + trainingWithMaxScore.getTitle() + ", CODE: " + trainingWithMaxScore.getCode());
		System.out.println(" ");

	}

}
