package com.zarowoks;

import java.util.List;

public class Solver {

public class Elems {
	private int[] elems;

	Elems(int size) {
		this.elems = new int[size];
	}

	public int multiplication() {
		int result = 1;
		for (int i = 0; i < elems.length; i++) {
			result *= elems[i];
		}
		return result;
	}

	public int sum() {
		int result = 0;
		for (int i = 0; i < elems.length; i++) {
			result += elems[i];
		}
		return result;
	}

	public void add(int parseInt) {
		

	}

}

	private Input input;
	private Elems elems;



	Solver(Input argInput, int size) {
		this.input = argInput;
		this.elems = new Elems(size);
	}

	int getResult() {

		List<String> passwords = input.readFile(
				"C:\\Users\\oksana.zarowska\\Desktop\\JAVA\\adventofcode-main\\Day1_v2\\aoc-day1\\src\\main\\java\\com\\zarowoks\\file.txt");

		for (String elem : passwords) {
			this.elems.add(Integer.parseInt(elem));
			for (String elem2 : passwords) {
				this.elems.add(Integer.parseInt(elem));
				if (elems.sum() == 2020) {
					return elems.multiplication();
				}
			}

		}
		throw new IllegalStateException();
	}


}
