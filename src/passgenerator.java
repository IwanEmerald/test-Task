import java.util.Random;
import java.util.Scanner;

public class passgenerator {





        public static String generation(String[] bukvu,int len) {
            String pas="";
            boolean dcount=false,lcount=false,ucount=false,scount=false;
            for (int i=0;i<len;i++){
                int j= new Random().nextInt(4)+0;
                switch (j) {
                    case 0 :
                        dcount=true;
                        break;
                    case 1 :
                        lcount=true;
                        break;
                    case 2:
                        ucount=true;
                        break;
                    case 3:
                        scount=true;
                        break;
                }
                pas+=bukvu[j].charAt(new Random().nextInt(bukvu[j].length())+0);

            }
            if (dcount==true&&ucount==true&&lcount==true&&scount==true){return pas;}
            else {return "";}
        }

        public static void main(String[] args) {
            final String digits="0123456789";
            final String lowerletters="abcdefghijklmnopqrstuvwxyz";
            final String upperletters="ABCDEFGJKLMNPRSTUVWXYZ";
            final String specsimbols="^$?!@#%&";

            String[] passobj={digits,lowerletters,upperletters,specsimbols};

            Scanner scanner=new Scanner(System.in);
            byte len;

            System.out.print("Выберите количество букв для пароля (от 8 до 12) :");
            len=scanner.nextByte();
            String[] pass=new String[len];
            String pas;
            while (true){

                pas=generation(passobj, len);
                if (pas!=""){break;}

            }
            System.out.println(pas);

        }

    }


