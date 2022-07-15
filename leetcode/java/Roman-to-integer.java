class Solution {
    public int romanToInt(String s) {
       if(s.length() ==0){
            return 0;
    }
    int sum =0;
    for(int i=0;i<s.length();i++){
        String a = String.valueOf(s.charAt(i));
        if(i+1<s.length()){
            String a1 = String.valueOf(s.charAt(i+1));
            if(a.equals("I")&&a1.equals("V")){
                sum=sum+4;
                i++;
                continue;
            }else if(a.equals("I")&&a1.equals("X")){
                sum=sum+9;
                i++;
                continue;
            }
            else if(a.equals("X")&&a1.equals("L")){
                sum=sum+40;
                i++;
                continue;
            }
            else if(a.equals("X")&&a1.equals("C")){
                sum=sum+90;
                i++;
                continue;
            }
            else if(a.equals("C")&&a1.equals("D")){
                sum=sum+400;
                i++;
                continue;
            }
            else if(a.equals("C")&&a1.equals("M")){
                sum=sum+900;
                i++;
                continue;
            }
        }
        sum = sum+romanCharToInt(a);
    }

    return sum;
}
    
    public static Integer romanCharToInt(String s) {
        	switch (s) {
        		case "I": 	return 1;
        		case "V":	return 5;
        		case "X":	return 10;
                case "L":	return 50;
        		case "C":	return 100;
        		case "D":	return 500;
        		case "M":	return 1000;
        		default:	return 0;
    }
     
    }
}