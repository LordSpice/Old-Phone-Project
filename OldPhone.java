import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OldPhone {

	public static void main(String args[]) {

		Scanner file = null;

		try {
			file = new Scanner(new FileInputStream("OldPhone.txt"));
		} catch (FileNotFoundException ERROR) {
			System.out.println("ERROR, file not found");
			System.exit(0);
		}

		int loop = file.nextInt();

		for (int i = 0; i < loop; i++) {
			String toConvert = file.nextLine();

			for (int j = 0; j < toConvert.length(); j++) {
				char letter = toConvert.charAt(j);

				switch (letter) {
				case 'a':
					System.out.print("2");
					break;
				case 'b':
					System.out.print("22");
					break;
				case 'c':
					System.out.print("222");
					break;
				case 'd':
					System.out.print("3");
					break;
				case 'e':
					System.out.print("33");
					break;
				case 'f':
					System.out.print("333");
					break;
				case 'g':
					System.out.print("4");
					break;
				case 'h':
					System.out.print("44");
					break;
				case 'i':
					System.out.print("444");
					break;
				case 'j':
					System.out.print("5");
					break;
				case 'k':
					System.out.print("55");
					break;
				case 'l':
					System.out.print("555");
					break;
				case 'm':
					System.out.print("6");
					break;
				case 'n':
					System.out.print("66");
					break;
				case 'o':
					System.out.print("666");
					break;
				case 'p':
					System.out.print("7");
					break;
				case 'q':
					System.out.print("77");
					break;
				case 'r':
					System.out.print("777");
					break;
				case 's':
					System.out.print("7777");
					break;
				case 't':
					System.out.print("8");
					break;
				case 'u':
					System.out.print("88");
					break;
				case 'v':
					System.out.print("888");
					break;
				case 'w':
					System.out.print("9");
					break;
				case 'x':
					System.out.print("99");
					break;
				case 'y':
					System.out.print("999");
					break;
				case 'z':
					System.out.print("9999");
					break;
				default:
					System.out.print("0");
					break;
				}
			}

			String waste = null; // Weird behaviour?
			if (file.hasNextLine()) {
				waste = file.nextLine();
			}
			System.out.println(waste); // To check what is compiled
		}
	}
}
