package simulation;

import java.util.ArrayList;

public class Training {
	private String title;
	private String code;
	private ArrayList<Intern> interns = new ArrayList<Intern>();

	public Training(String title, String code) {
		this.title = title;
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public String getCode() {
		return code;
	}

	public void appendIntern(Intern intrn) {
		interns.add(intrn);
	}

	public ArrayList<String> getInternList() {
		ArrayList<String> InternList = new ArrayList<String>();
		for (int i = 0; i < this.interns.size(); i++) {
			InternList.add(this.interns.get(i).getName());
		}

		return InternList;
	}

	public ArrayList<Intern> getInterns() {
		return this.interns;
	}

}
