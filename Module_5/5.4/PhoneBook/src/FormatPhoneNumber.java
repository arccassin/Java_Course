/**
 * Created by User on 16 Июнь, 2019
 */
class FormatPhoneNumber
{
    static String formatPhone(String input)
    {
        if (input == null)
        {
            return null;
        }

        input = input.replaceAll("\\D", "");
        if (input.length() == 0)
        {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        if (input.length() > 8 && input.length() < 12)
        {
            if (input.length() == 10)
            {
                input = "7" + input;
            }

            if (!((input.charAt(0) != '7') && (input.charAt(0) != '8')))
            {
                builder.append("+ 7 ");


                for (int i = 1; i < input.length(); i++)
                {

                    if (i == 4)
                    {
                        builder.append(" ");
                    }
                    if ((i == 7) || (i == 9))
                    {
                        builder.append("-");
                    }
                    builder.append(input.charAt(i));

                }
            }
        } else
        {
            return null;
        }
        return builder.toString();
    }

}
