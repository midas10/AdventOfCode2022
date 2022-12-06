// solution by @midas10
import java.io.*;
import java.util.*;
import java.util.regex.*;
// Part 2
public class Day6 {
	public static void main (String[] args) throws IOException {
		HashSet<Character> hash = new HashSet<>();
		Scanner input = new Scanner(new File("day6.txt"));
		String y = input.next();
		char[] strArr = y.toCharArray();
		int result = 0;
		int hashSize = 0;

		for (int i = 0; i < strArr.length-3; i++) {
			for (int j = 0; j < 4; j++) {
				hash.add(strArr[i+j]);
				hashSize++;
				if (hashSize > hash.size()) {
					hash.clear();
					hashSize=0;
					break;
				}
				if (hash.size() == 4) {
					result = i+4;
					break;
				}
			}
			if (result > 0) {
				break;
			}
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

		for (int i = 0; i < strArr.length-13; i++) {
			for (int j = 0; j < 14; j++) {
				hash.add(strArr[i+j]);
				hashSize++;
				if (hashSize > hash.size()) {
					hash.clear();
					hashSize=0;
					break;
				}
				if (hash.size() == 14) {
					result = i+14;
					break;
				}
			}
			if (result > 0) {
				break;
			}
		}

		System.out.println(result);
	}
}
