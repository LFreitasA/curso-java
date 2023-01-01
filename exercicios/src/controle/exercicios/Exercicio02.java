package controle.exercicios;

import java.util.Calendar;
import java.util.Date;

public class Exercicio02 {
	public static void main(String[] args) {

		Date date = new Date();
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);
		int dateYear = calendar.get(Calendar.YEAR);
		System.out.println(dateYear);
		
		if(dateYear %4 == 0) {
			System.out.println("Ano bissexto");
		} else {
			System.out.println("O ano nao e bissexto");
		}

	}
}
