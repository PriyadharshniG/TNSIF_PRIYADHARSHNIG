package com.tnsif.dayone;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// widening / implicit type casting
		
				byte b = 10; 
				int i = b; //4 bytes
				System.out.println(i);
				
				float f = 22.14f;	// 4 bytes
				double d = f;		// 8 byteas
				System.out.println(d);
				
				char ch = 'A';	// 2 bytes
				int i3 = ch;	// 4 bytes
				System.out.println(i3);
				
				char var1 = '\u00A7';
				int i4 = var1;
				System.out.println(i4);
				
				// narrowing/explicit type casting

				double f1 = 10.52f;	
				long l = (long) f1;
				System.out.println(l);

				long l1 = 923372036854775806l;
				int i2 = (int) l1;
				System.out.println(i2);

				float f2 = 34.56f;
				int i1 = (int) f2;
				System.out.println(i1);

				byte b1 = 90;
				char ch1 = (char) b1;
				System.out.println(ch1);

	}

}
