package com.pastley.models.dto;

public class ConvertDTO {
	
	/**
	 * Method that converts a boolean to state.
	 * @param statu, represents the boolean.
	 * @return the converted state.
	 */
	public static String statu(boolean statu) {
		return (statu) ? "ACTIVO" : "BLOQUEDAO";
	}
	
	/**
	 * Method that converts a string to plural.
	 * @param size, represents the state.
	 * @param chain, represents the string.
	 * @return the resulting string.
	 */
	public static String plural(int size, String chain) {
		return (size > 1) ? chain+"s" : chain;
	}
}
