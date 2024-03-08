import java.io.*;
class InputDemo{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter num ");
                int num=Integer.parseInt(br.readLine());

                int fact=1;

                while(num>0){
                        fact=fact*num;
                        num--;
                }
                System.out.println(fact +" is a factorial");

        }
}
