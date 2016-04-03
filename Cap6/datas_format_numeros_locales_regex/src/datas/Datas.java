package datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String... args) {
		Datas d = new Datas();
		d.testeDate();
		d.testeCalendar();
		d.testeDateFormat();
		d.testeDateFormat2();
	}

	public void testeDateFormat2() {
		DateFormat df = DateFormat.getDateInstance();
		// DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL);
		try {
			System.out.println(df.parse("08/01/2013"));
			/*
			 * Lancar� uma exce��o, pois a inst�ncia de DateFormat foi
			 * configurada com o estilo FULL, por�m uma String formatada com o
			 * estilo MEDIUM est� sendo passada como argumento para o m�todo
			 * parse(). System.out.println(df2.parse("08/01/2013"));
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * DateFormat n�o possui construtores p�blicos, para se obter uma inst�ncia
	 * � necess�rio utilizar alguma vers�o dos m�todos sobrecarregados
	 * getDateInstance, getTimeInstance ou getInstance.
	 */
	public void testeDateFormat() {
		// Inst�ncia de DateFormat formatada com estilo SHORT para Data/Hora
		DateFormat df1 = DateFormat.getInstance();
		System.out.println(df1.format(new Date()));

		// Inst�ncia de DateFormat formatada com estilo MEDIUM(Padr�o) para Data
		DateFormat df2 = DateFormat.getDateInstance();
		System.out.println(df2.format(new Date()));

		// Inst�ncia de DateFormat formatada com estilo SHORT para Data
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df3.format(new Date()));

		// Inst�ncia de DateFormat formatada com estilo MEDIUM para Data
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df4.format(new Date()));

		// Inst�ncia de DateFormat formatada com estilo LONG para Data
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df5.format(new Date()));

		// Inst�ncia de DateFormat formatada com estilo FULL para Data
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df6.format(new Date()));

		// Inst�ncia de DateFormat formatada com estilo MEDIUM(Padr�o) para Hora
		DateFormat df7 = DateFormat.getTimeInstance();
		System.out.println(df7.format(new Date()));

		// Inst�ncia de DateFormat formatada com estilo FULL para Hora
		DateFormat df8 = DateFormat.getTimeInstance(DateFormat.FULL);
		System.out.println(df8.format(new Date()));
	}

	/**
	 * A diferen�a entre o m�todo add e o m�todo roll da classe Calendar � que
	 * add altera, al�m do campo especificado, os outros campos maiores. J� o
	 * m�todo roll altera somente o campo especificado. Ex: hora - 09:30; Com
	 * add(): +35 min = 10:05; Com roll(): +35 min = 09:05.
	 */
	public void testeCalendar() {
		Calendar cal = Calendar.getInstance();
		cal.set(2013, 0, 8);
		System.out.println(cal.getTime());

		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.MINUTE, 35);
		System.out.println(c1.getTime());

		Calendar c2 = Calendar.getInstance();
		c2.roll(Calendar.MINUTE, 35);
		System.out.println(c2.getTime());
	}

	public void testeDate() {
		Date d = new Date();
		d.setTime(d.getTime() + 3600000);
		System.out.println(d);
	}

}
