package Homework14;


public class PseudoDigits {
public static String[][] givePseudoDigits(int index) {
        switch (index){
        case   0:
        return  new  String[][]{

                {"-@@@-"},
                {"@---@"},
                {"@---@"},
                {"@---@"},
                {"@---@"},
                {"-@@@-"}};

        case  1:
        return  new String[][]{

                {"---@-"},
                {"--@@-"},
                {"-@-@-"},
                {"---@-"},
                {"---@-"},
                {"---@-"}};

        case 2:

        return  new  String[][]{

                {"-@@@-"},
                {"@---@"},
                {"----@"},
                {"--@@-"},
                {"-@---"},
                {"@@@@@"}};

        case 3:

        return  new  String[][]{

                {"@@@@@"},
                {"----@"},
                {"--@@-"},
                {"----@"},
                {"@---@"},
                {"-@@@-"}};

        case 4:

        return  new  String[][]{

                {"--@-@"},
                {"-@--@"},
                {"@---@"},
                {"@@@@@"},
                {"----@"},
                {"----@"}};

        case 5:

        return  new  String[][]{

                {"@@@@@"},
                {"@----"},
                {"@@@@-"},
                {"----@"},
                {"----@"},
                {"@@@@-"}};

        case 6:

        return  new  String[][]{

                {"-@@@-"},
                {"@----"},
                {"@----"},
                {"@@@@-"},
                {"@---@"},
                {"-@@@-"}};

        case 7:

        return  new  String[][]{

                {"@@@@@"},
                {"----@"},
                {"---@-"},
                {"--@--"},
                {"--@--"},
                {"--@--"}};

        case 8:

        return  new  String[][]{

                {"-@@@-"},
                {"@---@"},
                {"-@@@-"},
                {"@---@"},
                {"@---@"},
                {"-@@@-"}};

        case 9:
        return  new  String[][]{

                {"-@@@-"},
                {"@---@"},
                {"-@@@@"},
                {"----@"},
                {"----@"},
                {"-@@@-"}};

        }
        return null;
        }


        }