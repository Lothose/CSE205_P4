//**************************************************************************************************************
// CLASS: RightParen
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
 * Represents a right parenthesis in the expression.
 */
public class RightParen extends Parenthesis {

    public RightParen() {
    }

    /**
     * Right parentheses really don't have precedence since they are not pushed on the operator stack, but we
     * have to override precedence() so we assign the lowest precedence level to RightParen.
     */
    @Override
    public int precedence() {
        return 1;
    }

    /**
     * See comments in precedence().
     */
    @Override
    public int stackPrecedence() {
        return 1;
    }

}