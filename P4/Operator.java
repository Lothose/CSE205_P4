//**************************************************************************************************************
// CLASS: Operator
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
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token{
	public Operator() {
	}
	
	public abstract boolean isBinaryOperator();
	
	public abstract int precedence();
	
	public abstract int stackPrecedence();
}
