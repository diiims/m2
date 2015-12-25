package com.company;

/**
 * Created by pc on 23.12.2015.
 */
public class Parenthesis {
 String s="";
    static void par(int n,int L,int J,String s) {
       // System.out.println(s);

        if((L+J)==(n*2)) {
            System.out.println(s);

            return;
        }
        if (L<n) {
            //L++;
            s=s+"(";
            par(n,++L,J,s);
        }
        if (L>J) {
           // J++;
            s=s+")";
            par(n,L,++J,s);
            
        }

    }

//    if counter_open + counter_close == 2 * n
//    print(ans)
//    return
//            if counter_open < n
//    gen(n, counter_open + 1, counter_close, ans + '(')
//    if counter_open > counter_close
//    gen(n, counter_open, counter_close + 1, ans + ')')
    }

