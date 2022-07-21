public class Buffer_Builder {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for(int i=0;i<1000;i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffere:"+(System.currentTimeMillis()-startTime)+"ms");

         startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for(int i=0;i<1000;i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffere:"+(System.currentTimeMillis()-startTime)+"ms");
        
    }
}
