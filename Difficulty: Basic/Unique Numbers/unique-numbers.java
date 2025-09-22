class Solution {

    static ArrayList<Integer> uniqueNumbers(int L, int R) {
        // code here
        ArrayList<Integer> arrlst=new ArrayList<>();
        if(L>=1 && R<=10){
            for(int i=L;i<=R;i++){
                arrlst.add(i);
            }
            return arrlst;
        }
        
        for(int i=L;i<=R;i++){
            if(checkRepeat(i)){
                arrlst.add(i);
            }
        }
        return arrlst;
    }
    
    static boolean checkRepeat(int i){
        String x=i+"";
        char current_char;
        
        for(int j=0;j<x.length();j++){
            current_char=x.charAt(j);
            if(x.indexOf(current_char,j+1)!=-1 ){
                return false;
            }
        }
        return true;
    }
}