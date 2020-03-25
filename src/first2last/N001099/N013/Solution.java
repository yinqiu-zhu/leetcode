package first2last.N001099.N013;

class Solution {
    public int romanToInt(String s) {

        int res = 0;
        int last = getValue(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int x = getValue(temp);
            if (x > last) {
                res = res + x - 2 * last;
            } else
                res = res + x;
            last = x;
        }
        return res;
    }

    private int getValue(char temp) {
        switch (temp) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        return 0;
    }
}

    /*
    *  public int romanToInt(String s) {

        int digit = s.length();
        for (int i = 0; digit != 0; i++, digit--){
            char temp = s.charAt(i);
            res.append(findSym(temp,digit));
        }
        return res.toString();
    }
    private String findSym(char temp, int digit){
        int val = (temp - 48);
        switch (digit){
            case 4: return "M";
            case 3:
                switch (val){
                    case 0: return null;
                    case 1: return "C";
                    case 2: return "CC";
                    case 3: return "CCC";
                    case 4: return "CD";
                    case 5: return "D";
                    case 6: return "DC";
                    case 7: return "DCC";
                    case 8: return "DCCC";
                    case 9: return "CM";
                }
            case 2:
                switch (val){
                    case 0: return null;
                    case 1: return "X";
                    case 2: return "XX";
                    case 3: return "XXX";
                    case 4: return "XL";
                    case 5: return "L";
                    case 6: return "LX";
                    case 7: return "LXX";
                    case 8: return "LXXX";
                    case 9: return "XC";
                }
            case 1:
                switch (val){
                    case 0: return null;
                    case 1: return "I";
                    case 2: return "II";
                    case 3: return "III";
                    case 4: return "IV";
                    case 5: return "V";
                    case 6: return "VI";
                    case 7: return "VII";
                    case 8: return "VIII";
                    case 9: return "IX";
                }
        }
    }*/
