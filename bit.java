package bit;

public class bit {

	public static void main(String[] args) {
		/*
		 bit : 0, 1
		 
		 &   AND
		 |   OR
		 ^   XOR
		 <<  left shift
		 >>  right shift
		 ~   반전
		 
		 
		 */
		int result;
		
		//AND 1011 1100 -> B C
		//    8421 8421
		//    1100 1001 -> C 9
		//    1000 1000 -> 8 8
		//result = 0xbc & 0xc9;
		//System.out.println("result ="+result);
		//System.out.printf("%x \n", result);
		
		/*
		 0x5D | 0xE3
		 8421 8421   /   8421  8421    
		 0101 1101   /   1110  0011
		 
		 0101 1101
		 1110 0011
		 F    F
		 
		 */
		result = 0x5D & 0xE3;
		System.out.println("result ="+result);
		System.out.printf("%x \n", result);
		
		
		/*
		 0x37   ^   0xAB
		 8421 8421  8421 8421
		 0011 0111  1010 1011
		 
		 0011 0111
		 1010 1011
		 
		 1001 1100
		 8421 8421
		 
		 9    12
		 
		 9    C
		 
		 */
		result = 037 ^ 0xAB;
		System.out.printf("result ="+result);
		System.out.printf("%x \n", result);
		
		
		//~반전 0->1 1->0
		byte by = ~0x55; // 0101 0101
		                 //  ↓반전↓
		                 // 1010 1010
		                 // 8421 8421
		                 // 8 2  8 2
		                 // 10   10
		                 // A    A
		System.out.printf("%x \n", by);
		
		/*
		   left shift
		   right shift
		   
		   1010 1100 * 2
		  10101 1000 
		  
		   1000=> 8
		    100=> 4
		 */
		
		byte by1;
		by1= 0x1 << 1;
		System.out.println("by1 = "+by1);
		
		by1 <<=1;
		System.out.println("by1="+by1);
		
		by1 >>=1;
		System.out.println("by1="+by1);
		
		
		
		
		
		
		
		
		

	}

}
