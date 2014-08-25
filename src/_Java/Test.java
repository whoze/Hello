package _Java;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {

		float ff = 12.99f;
		System.out.println(Math.floor(ff));
		System.out.println(Math.round(ff));
		getPass();

		//System.out.println(isAllCharacter("adminadmin333", 1, 12));
		List<String> ls = new ArrayList<String>();
		System.out.println(getSign("wwwwwwwww2ww"));
		System.out.println(getSign("wwwwwwwwwww112221wwwwwwwww").length());
		StringBuffer sb=	new StringBuffer("222222222w/");
		System.out.println(sb.substring(0, sb.length()-1));
		System.out.println(System.currentTimeMillis());
	}

	private static void getPass() {
		String str = "0ssseeeeeeeeeeeeee";
		System.out.println(Pattern.matches("^[0-9a-zA-Z]{1,16}", str));
		if (Pattern.matches("^[0-9a-zA-Z]", str)) {
			System.out.println("success");
		}
	}

	public static boolean isAllCharacter(String str, int min, int max) {
		return str.matches("[0-9a-zA-Z]+");
	}
	
	public static String getSign(String param) {
		try {
			String url = URLEncoder.encode(param, "utf-8")+"";
			MessageDigest digest = MessageDigest.getInstance("MD5");
			byte[] code = digest.digest(url.getBytes());
			if (code != null) {
				StringBuffer buffer = new StringBuffer();
				for (byte b : code) {
					int v = b & 0xFF;
					String hv = Integer.toHexString(v);
					if (hv.length() < 2) {
						buffer.append(0);
					}
					buffer.append(hv);
				}
				return buffer.toString();
			}
		} catch (NoSuchAlgorithmException e) {
		} catch (UnsupportedEncodingException e) {
		}
		return "";

	}
}
