// solution by @midas10 on github
// Advent of Code Day 4
import java.io.*;
import java.util.*;
// part1
public class Day4 {
	public static void main(String[] args) throws IOException  {
		Scanner input  = new Scanner(new File("day4.txt"));
		int sum = 0;

		while (input.hasNext()) {
			String x = input.nextLine();
			String[] split1 = x.split(",");
			String s1 = split1[0];
			String s2 = split1[1];

			String[] split2 = s1.split("-");
			String[] split3 = s2.split("-");

			int firstPair1 = Integer.parseInt(split2[0]);
			int firstPair2 = Integer.parseInt(split2[1]);
			int secondPair1 = Integer.parseInt(split3[0]);
			int secondPair2 = Integer.parseInt(split3[1]);

			if (firstPair1 <= secondPair1 && firstPair2 >= secondPair2) {
				sum+=1;
			} else if (secondPair1 <= firstPair1 && secondPair2 >= firstPair2) {
				sum+=1;
			}
		}
		System.out.println(sum);
	}
}
// part2
public class Day4 {
	public static void main(String[] args) throws IOException  {
		Scanner input  = new Scanner(new File("day4.txt"));
		int sum = 0;

		while (input.hasNext()) {
			String x = input.nextLine();
			String[] split1 = x.split(",");
			String s1 = split1[0];
			String s2 = split1[1];

			String[] split2 = s1.split("-");
			String[] split3 = s2.split("-");

			int firstPair1 = Integer.parseInt(split2[0]);
			int firstPair2 = Integer.parseInt(split2[1]);
			int secondPair1 = Integer.parseInt(split3[0]);
			int secondPair2 = Integer.parseInt(split3[1]);

			if (secondPair1 <= firstPair2 && secondPair2 >= firstPair1) {
				sum+=1;
			} else if (firstPair1 <= secondPair2 && firstPair2 >= secondPair1) {
				sum+=1;
			}

		}
		System.out.println(sum);
	}
}
