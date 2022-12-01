package test;

import java.util.*;

import file.*;

public class Test {

	public static void main(String[] args) {
		
		ExecutableFile browser = new ExecutableFile("chrome.exe", 824000, true, "Mac on Intel", new byte[1]);
		
		HTMLFile page1 = new HTMLFile("aboutme.html", 2000, "Unicode", 5, browser, null);
		HTMLFile page2 = new HTMLFile("publications.html", 5000, "Unicode", 5, browser, null);
		HTMLFile page3 = new HTMLFile("projects.html", 4000, "Unicode", 5, browser, null);
		HTMLFile page4 = new HTMLFile("contact.html", 1000, "Unicode", 5, browser, null);
		
		ArrayList<HTMLFile> myPageLinks = new ArrayList<HTMLFile>();
		myPageLinks.add(page1);
		myPageLinks.add(page2);
		myPageLinks.add(page3);
		myPageLinks.add(page4);
		
		File myWebpage = new HTMLFile("mywebpage.html", 9000, "Unicode", 5, browser, myPageLinks);
		
		File todos = new PlainTextFile("my todos", 3000, "ASCII", new String[]{"Do homework1", "Read the new paper", "Do homework2", "Go to gym"});
		
		ExecutableFile player = new ExecutableFile("vmplayer.exe", 160000, true, "Windows on Intel", new byte[1]);
		
		File music = new DataFile("Walking On Air.mp3", 350000, true, "mp3", player, new boolean[1]);
		
		File movie = new DataFile("Up.mkv", 1500000, true, "mkv", player, new boolean[1]);
		
		File[] files = new File[] {browser, myWebpage, todos, player, music, movie};

		System.out.println("Calling toString methods:");
		for(File f: files) {
            System.out.println(f.toString());
        }
        
        System.out.println("Calling polymorphic methods:");
		File.callPolymorphicMethods(files);
	}

}
