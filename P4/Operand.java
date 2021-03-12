//**************************************************************************************************************
// CLASS: Operand
//
// * COURSE AND PROJECT INFORMATION 
// * CSE205 Object Oriented Programming and Data Structures, Spring 2021
// * Project Number: p4
// *
// * GROUP INFORMATION  
// * AUTHOR 1: Brandon Murata, bmurata1, bmurata1@asu.edu
// * AUTHOR 2: Brandon Billmeyer, bbillmey , bbillmey@asu.edu
// * AUTHOR 3: Delaney Claussen , djclaus1, djclaus1@asu.edu
// * AUTHOR 4: Taylor Hedrick, tmhedric, tmhedric@asu.edu
//**************************************************************************************************************
package P4;
/**
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token{
	private Double mValue;
	
	
	public Operand(Double pValue) {
		setValue(pValue);
	}
	
	public Double getValue() {
		return mValue;
	}
	
	public void setValue(Double pValue) {
		mValue = pValue;
	}
}
