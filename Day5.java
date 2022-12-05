// solution by @midas10
import java.io.*;
import java.util.*;
import java.util.regex.*;
//part1
public class Day5 {

    static HashMap<Integer, List<String>> hash = new HashMap<>();
    static int size = 8;

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(new File("day5.txt"));
        String ans = "";
        int line = 0;

        while (input.hasNext()) {
            line++;
            String y = input.nextLine();
            if (line <= size) {
                mover(y);
            }
            if (line > size + 2) {
                movee(y);
            }
        }

        for (int i = 0; i < hash.size(); i++) {
			String x = hash.get(i+1).get(0);
			String y = x.substring(1, 2);
			ans = ans + y;
		}

		System.out.println(ans);
	}

	static List<Integer> firstNums(String s) {
		Matcher matcher = Pattern.compile("\\d+").matcher(s);

		List<Integer> numbers = new ArrayList<>();
		while (matcher.find()) {
			numbers.add(Integer.valueOf(matcher.group()));
		}
		return numbers;
	}

	static void movee(String st) {
		List<Integer> nums = firstNums(st);
		int firstNum = nums.get(0);
	    int secondNum = nums.get(1);
	    int thirdNum = nums.get(2);

		List<String> moverC = hash.get(secondNum);
		List<String> moveeC = new ArrayList<>();
		for (int i = 0; i < firstNum; i++) {
			moveeC.add(moverC.get(0));
			moverC.remove(0);
		}
		hash.put(secondNum, moverC);

		List<String> toC = hash.get(thirdNum);
		for (String s : moveeC) {
			toC.add(0, s);
		}
		hash.put(thirdNum, toC);
	}

	static void mover(String str) {
		String s;
		Matcher m = Pattern.compile("\\[(.*?)]").matcher(str);
		while (m.find()) {
			s = m.group();
			int x = str.indexOf(m.group()) / 4;
			x++;
			if (hash.get(x) == null) {
				List<String> strs = new ArrayList<>();
				hash.put(x, strs);
			}
			List<String> strs = hash.get(x);
			strs.add(s);
			hash.put(x, strs);
			str = str.replaceFirst(s, "0");
		}
    }
}
//part2
public class Day5 {

    static HashMap<Integer, List<String>> hash = new HashMap<>();
    static int size = 8;

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(new File("day5.txt"));
        String ans = "";
        int line = 0;

        while (input.hasNext()) {
            line++;
            String y = input.nextLine();
            if (line <= size) {
                mover(y);
            }
            if (line > size + 2) {
                movee(y);
            }
        }

        for (int i = 0; i < hash.size(); i++) {
			String x = hash.get(i+1).get(0);
			String y = x.substring(1, 2);
			ans = ans + y;
		}

		System.out.println(ans);
	}

	static List<Integer> firstNums(String s) {
		Matcher matcher = Pattern.compile("\\d+").matcher(s);

		List<Integer> numbers = new ArrayList<>();
		while (matcher.find()) {
			numbers.add(Integer.valueOf(matcher.group()));
		}
		return numbers;
	}

	static void movee(String st) {
		List<Integer> nums = firstNums(st);
		int firstNum = nums.get(0);
	    int secondNum = nums.get(1);
	    int thirdNum = nums.get(2);

		List<String> moverC = hash.get(secondNum);
		List<String> moveeC = new ArrayList<>();
		for (int i = 0; i < firstNum; i++) {
			moveeC.add(moverC.get(firstNum-1-i));
			moverC.remove(firstNum-1-i);
		}
		hash.put(secondNum, moverC);

		List<String> toC = hash.get(thirdNum);
		for (String s : moveeC) {
			toC.add(0, s);
		}
		hash.put(thirdNum, toC);
	}

	static void mover(String str) {
		String s;
		Matcher m = Pattern.compile("\\[(.*?)]").matcher(str);
		while (m.find()) {
			s = m.group();
			int x = str.indexOf(m.group()) / 4;
			x++;
			if (hash.get(x) == null) {
				List<String> strs = new ArrayList<>();
				hash.put(x, strs);
			}
			List<String> strs = hash.get(x);
			strs.add(s);
			hash.put(x, strs);
			str = str.replaceFirst(s, "0");
		}
    }
}
