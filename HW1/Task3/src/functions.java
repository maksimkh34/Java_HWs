public class functions {
    static boolean isInString(String text, char s)
    {
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i)==s) return true;
        }
        return false;
    }

    static int[] splitOperation(String operation, char delimiter)
    {
        for(int i = 0; i < operation.length(); i++)
        {
            if(operation.charAt(i)==delimiter)
            {
                int[] data = new int[2];
                data[0] = Integer.parseInt(operation.substring(0, i));
                data[1] = Integer.parseInt(operation.substring(i+1));
                return data;
            }
        }
        return new int[]{-1};

    }


    static int calculate(int a, int b, char operation)
    {
        switch (operation) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '%' -> {
                return a % b;
            }
            case '/' -> {
                return a / b;
            }
            case '*' -> {
                return a * b;
            }
            case '^' -> {
                return (int)Math.pow(a, b);
            }
        }
        return -1;

    }

}
