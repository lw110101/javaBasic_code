package regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) throws Exception {
		String reg = "\\w+@[a-zA-Z]+(\\.[a-zA-Z]+)+";
		getMails(reg);
	}

	public static void getMailsByWeb(String regex) throws Exception {
		URL url = new URL("http://localhost:8080/myweb/mail.html");
		URLConnection conn = url.openConnection();
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = null;
		Pattern p = Pattern.compile(regex);
		while ((line = bufIn.readLine()) != null) {
			// System.out.println(line);
			Matcher m = p.matcher(line);
			while (m.find()) {
				System.out.println(m.group());
			}
		}
		bufIn.close();
	}

	public static void getMails(String regex) throws Exception {
		BufferedReader bufr = new BufferedReader(new FileReader("C:\\Users\\hasee\\Desktop\\65.txt"));
		String line = null;
		Pattern p = Pattern.compile(regex);
		while ((line = bufr.readLine()) != null) {
			// System.out.println(line);
			Matcher m = p.matcher(line);
			while (m.find()) {
				System.out.println(m.group());
			}
		}
		bufr.close();
	}
}
