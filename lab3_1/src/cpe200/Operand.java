package cpe200;

import java.util.DoubleSummaryStatistics;

/**
 * Created by pruet on 5/9/2559.
 */
public class Operand {
    String operand;
    public Operand(String operand)
    {
        this.operand = operand;
    }
    public Operand(int operand)
    {
        this.operand = Integer.toString(operand);
    }
    /* your code here */
    public Operand(double operand)

    {
        this.operand = Double.toString(operand);
    }

}
