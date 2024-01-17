package exercises.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
	public static void main(String[] args) {
		String data = """
				    16,Fanchette,Williamson,fwilliamson0@github.com,F
				    26,Aleksandr,Matts,amatts1@webs.com,M
				    3,Maurie,Cordero,mcordero2@google.co.jp,M
				    45,Donnajean,Crowson,dcrowson3@google.com.hk,F
				    5,Ricardo,Gofton,rgofton4@nytimes.com,M
				    65,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
				    37,Marjorie,Blumsom,mblumsom6@joomla.org,F
				    18,Lester,Huyghe,lhuyghe7@jugem.jp,M
				    39,Merrily,Stangoe,mstangoe8@tiny.cc,F
				    10,Reider,Karel,rkarel9@github.io,M
				    11,Dory,Jolliff,djolliffa@wufoo.com,F
				    32,Homerus,Averay,haverayb@skyrock.com,M
				    13,Alyda,Muglestone,amuglestonec@is.gd,F
				    14,Pinchas,Louca,ploucad@google.es,M
				    11,Cherin,Eltringham,celtringhame@parallels.com,F
				    2,Mufi,Rothert,mrothertf@dropbox.com,F
				    17,Jordana,Everex,jeverexg@ucla.edu,F
				    18,Belle,Rother,brotherh@gov.uk,F
				    19,Clevie,Sifflett,csiffletti@furl.net,M
				    20,Gretchen,Abell,gabellj@1688.com,F
				""";
		List<String> userStrings = Arrays.asList(data.split("\n"))
				.stream()
				.map(u -> u.strip())
				.collect(Collectors.toList());

		String user = userStrings.stream().filter(u -> {
			String[] detail = u.split(",");
			Integer age = Integer.parseInt(detail[0]);
			String gender = detail[4];
			String email = detail[3];
			return (age > 12 && age < 20) && gender.equals("F") && email.endsWith("gov.uk");
		}).findFirst().get();

		System.out.println(user);
	}
}
