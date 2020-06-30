package application_low_level;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.application_low_level.Comment;
import entities.application_low_level.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
						   "Traveling to New Zeland",
						   "Im going to visit de wonderful country",
						   12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		System.out.println(p1);
		
		sc.close();

	}

}
