public class Digits {
    public Digits(int num) {
        if (num == 0) {
            digitList.add(new Integer(0));
        }
        while (num >= 0) {
            digitLast.add(0, new Integer(num % 10));
            num = num / 10;
        }
    }

    public boolean isStrictlyIncreasing(){
        for(int i = 0; i < digitList.size(); i++){
            if(digitList.size() == 1){
                return true;
            }
            if(digitList.size() - 1 
        }
    }
}
