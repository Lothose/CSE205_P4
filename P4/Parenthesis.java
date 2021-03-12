//**************************************************************************************************************
// CLASS: Parenthesis
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
 * Parenthesis is the superclass of LeftParen and RightParen. These are treated as a weird sort of Operator
 * because we need to be able to push LeftParens on the operator stack when evaluating the expression.
 */
public abstract class Parenthesis extends Operator {

    public Parenthesis() {
    }
    
    /**
     * Parenthesiss are not really operators so return false.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}