package com.tnsif.dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte takes 1 byte
				byte byteMax = 127;
				byte byteMin = -128;
				
				System.out.println("Min range of byte is" +
						byteMin+"\nMax range of byte is "+byteMax);
				
				//short - 2 bytes
				short shortMax = 32767;
				short shortMin = -32768;
				System.out.println("\nMinshort range of byte is" +
						shortMin+"\nMaxshort range of byte is "+shortMax);
				
				//int - 4bytes
				int maxInt = 2147483647;
				int minInt = -2147483648;
				System.out.println("\nMinint range of byte is" +
						minInt+"\nMaxint range of byte is "+maxInt);
				
				//long - 8bytes
				long maxLong = 9223372036854775807L;
				long minLong = -9223372036854775808L;
				
				System.out.println("\nMinlong range of byte is" +
						minLong+"\nMaxlong range of byte is "+maxLong);
				
				float f=3234.141243278345f;
				double d=3456.14124512345678902345678914f;
				System.out.println("\nfloat value is "+f+" \ndouble value is "+d);
				
				//boolean 
				boolean flag=false;
				System.out.println("\nboolean value is "+flag);

	}

}
