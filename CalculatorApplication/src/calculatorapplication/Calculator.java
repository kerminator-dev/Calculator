package calculatorapplication;

public class Calculator 
{
    public static String Solve(double num1, char operand, double num2)
    {
        String result = "";
        
        try
        {
            switch (operand)
            {
                case '+':
                    result += String.valueOf(num1 + num2);
                    break;
                case '-':
                    result += String.valueOf(num1 - num2);
                    break;
                case '*':
                    result += String.valueOf(num1 * num2);
                    break;
                case '/':
                    if (num2 != 0) 
                        result += String.valueOf(num1 / num2);
                    else 
                        result += "∞"; // error: divide by zero
                    break;
                default:
                    result = "unknown operand";
                    break;
            }
        } 
        catch (Exception ex)
        {
            result = ex.getMessage();
        }
        
        return result;
    }
}
