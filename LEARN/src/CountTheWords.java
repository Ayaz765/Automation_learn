

class CountTheWords
{
    public static void main(String[] args)
    {
       String name1="                    sgwhjjhas asksaash sajasjlaslkjkl              ";
       String name=name1.trim();
 
        int count = 1;
 
        for (int i = 0; i < name.length()-1; i++)
        {
            if((name.charAt(i) == ' ') && (name.charAt(i+1) != ' '))
            {
                count++;
            }
        }
 
        System.out.println("Number of words in a string = "+count);
    }
}