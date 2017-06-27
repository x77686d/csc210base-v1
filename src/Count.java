public class Count {
    public static void main(String args[]) {
        int[] vals = new int[Integer.parseInt(args[0])];
        if (args.length == 2) {
            int value = Integer.parseInt(args[1]);
            int n = count(value, vals);
            System.out.format("Found %d occurrences of %d\n", n, value);
            }
    }
    static int count(int wanted, int[] values)
    {
        int result = 0;
    
        for (int value: values)
            if (value == wanted)
                result += 1;
    
        return result;
    }
}
/*
  0: iconst_0      18: aload_3           
  1: istore_2      19: iload   5     
  2: aload_1       21: iaload            
  3: astore_3      22: istore  6     
  4: aload_3       24: iload   6     
  5: arraylength   26: iload_0           
  6: istore 4      27: if_icmpne 33      
  8: iconst_0      30: iinc    2, 1  
  9: istore 5      33: iinc    5, 1  
 11: iload  5      36: goto    11    
 13: iload  4      39: iload_2           
 15: if_icmpge     40: ireturn             
*/




