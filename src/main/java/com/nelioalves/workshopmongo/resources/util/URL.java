package com.nelioalves.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {

	/**
	 * Recebe um texto codificado, tipo 'alo%20voce' e decodifica para o formato utf-8 'alo voce' 
	 * @param text
	 * @return
	 */
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return "";
		}
	}
	
	/**
	 * Pega um texto contendo uma data no formato yyyy-MM-dd e converte para um objeto Date. Se falhar retorna um defaultValue
	 * @param textDate
	 * @param defaultValue
	 * @return
	 */
	public static Date convertDate(String textDate, Date defaultValue) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			return sdf.parse(textDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return defaultValue;
		}
	}
}
