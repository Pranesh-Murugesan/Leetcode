class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(num);
            } else if (ch == '[') {
                resultStack.push(current);
                current = new StringBuilder();
                index++;
            } else if (ch == ']') {
                StringBuilder temp = resultStack.pop();
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(current);
                }
                current = temp;
                index++;
            } else {
                current.append(ch);
                index++;
            }
        }

        return current.toString();
    }
}
