package logic;

import java.util.Scanner;

import util.GenerateHashedPw;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("パスワード：");
		String password = sc.nextLine();
		System.out.print("ソルト：");
		String salt = sc.nextLine();

		String hashedStr = GenerateHashedPw.getSafetyPassword(password, salt);

		System.out.println("hashedPW:" + hashedStr);

	}

}
