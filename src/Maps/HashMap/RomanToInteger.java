package Maps.HashMap;

class RomanToInteger
{
    public static void main(String[] args) {
        String str="IIIIVIX";
        System.out.println(romanToInt(str));
    }
    public static int romanToInt(String s)
    {
        int c = 0;
        for(int i = 0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'I' :
                    if(i+1 < s.length() && s.charAt(i+1) == 'V')
                    {
                        c=c+4;i++;
                    }
                    else if(i+1 < s.length() && s.charAt(i+1) == 'X')
                    {
                        c = c+9;i++;
                    }
                    else
                        c = c+1;
                    break;
                case 'V' :	c = c+5;
                    break;
                case 'X' :
                    if(i+1 < s.length() && s.charAt(i+1) == 'C')
                    {
                        c=c+90;
                        i++;
                    }
                    else if(i+1 < s.length() && s.charAt(i+1) == 'L')
                    {
                        c=c+40;
                        i++;
                    }
                    else
                    {
                        c = c+10;
                    }

                    break;
                case 'L' : c = c+50;
                    break;
                case 'C' :
                    if(i+1 < s.length() && s.charAt(i+1) == 'M')
                    {
                        c=c+900;
                        i++;
                    }
                    else if(i+1 < s.length() && s.charAt(i+1) == 'D')
                    {
                        c=c+400;
                        i++;
                    }
                    else
                        c = c+100;
                    break;
                case 'D' : c = c+500;
                    break;
                case 'M' :c = c+1000;
                    break;
                default:System.out.println("Invalid number ");
                    break;
            }
        }
        return c;
 }


}