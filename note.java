public class UpperCaseCounter
{
    public static void main(String[] args)
    {
        String str = "ONCE UPON a time";

        int numberOfUpperCaseChars=0;
        numberOfUpperCaseChars = (new UpperCaseCounter()).computeHowManyUpperCapitalLetters(str);
//        for(int i=0;i<str.length();i++)
//        {
//            char charAt = str.charAt(i);
//            int asciivalue = (int)charAt;
//            if (charAt >='A' && asciivalue <='Z'){
//                numberOfUpperCaseChars++;
//            }
//        }
//        //return numberOfUpperCaseChars;
        System.out.println("No of uppercase letter : " + numberOfUpperCaseChars);

    }

    public int computeHowManyUpperCapitalLetters(String str){
        int numberOfUpperCaseChars=0;
        for(int i=0;i<str.length();i++)
        {
            char charAt = str.charAt(i);
            int asciivalue = (int)charAt;
            if (charAt >='A' && asciivalue <='Z'){
                numberOfUpperCaseChars++;
            }
        }
        return numberOfUpperCaseChars;
    }

}