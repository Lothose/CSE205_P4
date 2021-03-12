//**************************************************************************************************************
// CLASS: NegOperator
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
 * Represents the negation operator which is a specific type of unary operator.
 */
 public class NegOperator extends UnaryOperator{
	public NegOperator() {
	}
	@Override
	public Operand evaluate(Operand pOperand){
		return new Operand(pOperand.getValue());
	}
	@Override
	public int precedence() {
		return 4;
	}
	@Override
	public int stackPrecedence() {
		return 4;
	}
 }