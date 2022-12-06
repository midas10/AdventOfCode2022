// solution by @midas10			
import java.io.*;
import java.util.*;
import java.util.regex.*;

// Part 1

public class Day6 {
	public static void main (String[] args) throws IOException {
		HashSet<Character> hash = new HashSet<>();
		Scanner input = new Scanner(new File("day6.txt"));
		String y = input.next();
		char[] strArr = y.toCharArray();
		int result = 0;
		int hashSize = 0;

		int  i = 0;
		int j = 0;

		while (result == 0 && i < strArr.length-3) {
			j = 0;
			boolean check = true;
			while (hash.size() != 4 && j < 4 && check) {
				hash.add(strArr[i+j]);
				hashSize++;
				if (hashSize > hash.size()) {
					hash.clear();
					hashSize=0;
					check = false;
				}
				if (hash.size() == 4) {
					result = i+4;
				}
				j++;
			}
			i++;
		}

		System.out.println(result);
	}
}

//Part 2

public class Day6 {
	public static void main (String[] args) throws IOException {
		HashSet<Character> hash = new HashSet<>();
		Scanner input = new Scanner(new File("day6.txt"));
		String y = input.next();
		char[] strArr = y.toCharArray();
		int result = 0;
		int hashSize = 0;
		int  i = 0;
		int j = 0;

		while (result == 0 && i < strArr.length-13) {
			j = 0;
			boolean check = true;
			while (hash.size() != 14 && j < 14 && check) {
				hash.add(strArr[i+j]);
				hashSize++;
				if (hashSize > hash.size()) {
					hash.clear();
					hashSize=0;
					check = false;
				}
				if (hash.size() == 14) {
					result = i+14;
				}
				j++;
			}
			i++;
		}

		System.out.println(result);
	}
}
