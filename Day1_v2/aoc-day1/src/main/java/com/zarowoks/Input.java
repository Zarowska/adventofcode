package com.zarowoks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Input {

	public List<String> readFile(String fileName) {

		List<String> passwords = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String bufferLine = null;
			while ((bufferLine = br.readLine()) != null) {
				passwords.add(bufferLine);
			}
			br.close();
		} catch (Exception e) {
			System.err.println("There was an error loading the data");
			e.printStackTrace();
		}

		return passwords;
	}

}
