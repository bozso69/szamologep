package szamologep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class util {
	matMuveletek mMuvelete;

	public util() {
	}

	public String szamtorles() {
		return "";

	}

	public String szamolas(String muveletString) {
		String eredmeny = new String();
		if (uersE(muveletString)) {
			System.out.println("üres");
			return null;
		}


		elemzo(muveletString);
		return eredmeny;
	}

	private void elemzo(String muveletString) {

		for (int i = 0; i <= muveletString.length() - 1; i++) {
			System.out.println(muveletString.charAt(i));


		}

	}

	private boolean uersE(String muveletString) {
		return muveletString.isEmpty() ? true : false;

	}


	public String elemzes(String bejovoErtek) {
		String visszaTeroErtek="";

		String szam1 = "";
		String szam2 = "";
		char muvelet= ' ';

		if (uersE(bejovoErtek)){
			return null;
		}

		for (int i = 0; i <= bejovoErtek.length()-1; i++) {



			if (tartalmazE(bejovoErtek.charAt(i),"[0-9]")) {
				visszaTeroErtek += bejovoErtek.charAt(i);
				System.out.println(bejovoErtek.charAt(i));
					if(muvelet == ' ') {
						szam1 += bejovoErtek.charAt(i);
					}else {szam2 += bejovoErtek.charAt(i);}
			}
			if (tartalmazE(bejovoErtek.charAt(i),"[/*--+X,]")){
				visszaTeroErtek += bejovoErtek.charAt(i);
				System.out.println(bejovoErtek.charAt(i));
				muvelet=bejovoErtek.charAt(i);
			}
			}
		System.out.println("visszaTeroErtek = " + visszaTeroErtek);

		System.out.println("szam1 = " + szam1);
		System.out.println("muvelet = " + muvelet);
		System.out.println("szam2 = " + szam2);

		return visszaTeroErtek= MuveletEldonto(szam1, szam2,muvelet);
		}
	private String MuveletEldonto(String szam1, String szam2, char muvelet) {
		mMuvelete = new matMuveletek();

		if (muvelet == '+'){
		return mMuvelete.osszeadas(szam1,szam2);
	}
	return null;}

	private boolean tartalmazE(char elem, String feltetel) {

		Pattern pattern = Pattern.compile(feltetel);
		Matcher matcher = pattern.matcher(String.valueOf(elem));
		boolean logika = matcher.find();

		return logika ? true : false;

	}


	}


