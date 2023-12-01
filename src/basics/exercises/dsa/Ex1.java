package basics.exercises.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Ex1 {
	public static void main(String[] args) {
		String input = "1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8";
		System.out.println(getNumCounter(input));
		System.out.println(mostNumOfOccurence(input));
		System.out.println(parenthesisValidator("[[[]]]"));
	}

	private static Map<String, Integer> getNumCounter(String input) {
		List<String> strNums = Arrays.asList(input.split(", "));
		Map<String, Integer> numCounter = new HashMap<>();

		for (String num : strNums) {
			Integer count = numCounter.getOrDefault(num, 0) + 1;
			numCounter.put(num, count);
		}

		return numCounter;
	}

	private static Integer mostNumOfOccurence(String input) {
		Map<String, Integer> numCount = getNumCounter(input);

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : numCount.entrySet()) {
			if (maxEntry == null) {
				maxEntry = entry;
			}

			if (entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}
		return maxEntry.getValue();
	}

	private static boolean parenthesisValidator(String input) {
		Map<Character, Character> bracketsMap = new HashMap<>() {
			{
				put(')', '(');
				put(']', '[');
				put('}', '{');
			}
		};

		Stack<Character> brackChars = new Stack<>();

		for (Character ch : input.toCharArray()) {
			if (bracketsMap.containsKey(ch)) {
				if (brackChars.isEmpty() ||
						!brackChars.pop().equals(bracketsMap.get(ch))) {
					return false;
				}
			} else {
				brackChars.push(ch);
			}
		}
		return brackChars.isEmpty();
	}
}
