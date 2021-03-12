//**************************************************************************************************************
// CLASS: DivOperator
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
 * Represents the division operator which is a specific type of binary operator.
 */
public class DivOperator extends BinaryOperator{
	public DivOperator() {	
	}
	@Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand) {
        return new Operand(pLhsOperand.getValue() / pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
	@Override
    public int precedence() {
        return 3;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
	@Override
    public int stackPrecedence() {
        return 3;
    }
}