package com.pastley.util;

import java.util.List;

public class PastleyValidate {
	
	/**
	 * Method that allows to validate the strings.
	 * 
	 * @param chain, Represents the string.
	 * @return Boolean true if it meets false if not.
	 */
	public static boolean isChain(String chain) {
		return chain != null && chain.trim().length() > 0;
	}
	
	public static boolean isObject(Object object) {
		return object != null;
	}
	
	public static boolean isLong(Long value) {
		return value != null && value >=0;
	}
	
	public static int toInteger(String str) {
		try {
			return Integer.valueOf(str);
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
	
	/**
	 * Method that allows to verify if a list is valid.
	 * @param <E>,  Represents the data type of the list.
	 * @param list, Represents the list.
	 * @return true if it meets false if not.
	 */
	public static <E> boolean isList(List<E> list) {
		return (list != null && list.size() > 0);
	}
}
