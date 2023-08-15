class Solution {
    public String decodeString(String s) {
        Stack<Integer> is = new Stack<>();
        Stack<StringBuilder> ss = new Stack<>();

        int n = s.length(), num = 0;
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                num = (num * 10) + ch - '0';
                System.out.println(num);
            } else if(ch == '[') {
                ss.push(str);
                System.out.println("String - " + str);
                str = new StringBuilder();

                is.push(num);
                num = 0;
            } else if(ch == ']') {
                StringBuilder temp = str;
                str = ss.pop();
                int count = is.pop();

                while(count-- > 0) {
                    str.append(temp);
                }
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
