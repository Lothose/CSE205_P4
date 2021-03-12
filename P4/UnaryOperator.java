//**************************************************************************************************************
// CLASS: UnaryOperator
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
 * UnaryOperator is the superclass of all unary operators.
 */
public abstract class UnaryOperator extends Operator {

    public UnaryOperator() {
    }
    
    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pOperand);

    /**
     * Returns false since all subclasses of UnaryOperator are unary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}
