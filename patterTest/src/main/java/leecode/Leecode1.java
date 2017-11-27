package leecode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leecode1 {

    public static void main(String... args){
        Leecode1 l = new Leecode1();
        List<Integer> a = l.lexicalOrder(23489);
        for(int j=0;j<a.size();j++){
            System.out.println(a.get(j));
        }
    }

    public List<Integer> lexicalOrder1(int n) {
        List<String> sl=new ArrayList<String>();
        List<Integer> il=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            sl.add(String.valueOf(i));
        }
        Collections.sort(sl);
        for(int j=0;j<n;j++){
            il.add(Integer.parseInt(sl.get(j)));
        }
        return il;
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<Integer>(n);
        int curr = 1;
        for (int i = 1; i <= n; i++) {
            list.add(curr);
            if (curr * 10 <= n) {
                curr *= 10;
            } else if (curr % 10 != 9 && curr + 1 <= n) {
                curr++;
            } else {
                while ((curr / 10) % 10 == 9) {
                    curr /= 10;
                }
                curr = curr / 10 + 1;
            }
        }
        return list;
    }
}
