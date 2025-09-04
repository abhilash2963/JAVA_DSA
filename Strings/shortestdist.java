package Strings;
public class shortestdist{
public static double shortestdistindirections(String str){
    int x=0,y=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch == 'N'){
            y++;
        }
        else if(ch == 'S'){
            y--;
        }
        else if(ch=='E'){
            x++;
        }
        else{
            x--;
        }
    }
    double res=Math.sqrt((x*x)+(y*y));
    return res;
}
public static void main(String[] args) {
    String str="WNEENESENNN";
    System.out.println(shortestdistindirections(str));
}
}