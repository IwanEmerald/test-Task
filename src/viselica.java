import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class viselica {



        public static   int live;

        public static void OUT(String[][] arg) {
            for (int i=0;i<arg[0].length;i++){
                System.out.print(arg[1][i]);
            }
            System.out.println("");
        }

        public static String[][]  game(String[][] words) {
            Scanner gamescan=new Scanner(System.in);
            String[] bukva=new String[1];
            Boolean flag=false;

            System.out.println("Введите букву");
            bukva[0]=gamescan.nextLine();

            for (int i=0;i<words[0].length;i++){
                if(bukva[0].equals(words[0][i])){
                    words[1][i]=bukva[0];
                    flag=true;
                }
            }
            if (flag==true){
                System.out.print("Количество жизней не изменилось и также = "+live+" так как в слове есть такая буква - ");
                OUT(words);

            }else if (flag==false){
                live-=1;
                System.out.println("такой буквы в слове нету,ваше количество жизней уменьшилось и теперь оно равно : "+live);
            }
            return words;
        }

        public static int cinlives(int diff) {

            int countlives = 0;
            switch (diff) {
                case 1 :
                    countlives=5;
                    break;
                case 2 :
                    countlives=4;
                    break;
                case 3 :
                    countlives=3;
                    break;
                default:
                    break;
            }
            return countlives;
        }

        public static String choseword(int ch) {
            String chword="";
            final String[][] wordsforgame={
                    {"bedroom","kitchen","bathroom","toilet","playroom","hall","basement","attic"},
                    {"толерантность","эксгумация","либерализм ","экспонат","пышность","скабрёзность","шаловливость","экспозиция"}
            };

            if (ch==1)
            {
                int num= new Random().nextInt(6)+0;
                chword=wordsforgame[0][num];
            }
            else if (ch==2)
            {
                int num= new Random().nextInt(6)+0;
                chword=wordsforgame[1][num];
            }
            return chword;
        }

        public static void main(String[] args) throws IOException {

            //настрока сложности и т.д.
            String SWord;
            int languache,diff;
            Scanner scanner=new Scanner(System.in);

            while (true)
            {
                System.out.println("Выберите язык ( Eng=1 , RU=2 )");
                languache=scanner.nextInt();
                SWord=choseword(languache);
                if (SWord!="") break;
            }
            String[] secretword=new String[SWord.length()];
            String[] word=new String[SWord.length()];
            for (int i=0;i<SWord.length();i++){
                secretword[i]=Character.toString(SWord.charAt(i));
                word[i]="_";
            }

            while(true)
            {
                System.out.println("Выберите сложность игры ( 1=easy , 2=medium , 3=hard )");
                diff=scanner.nextInt();
                live=cinlives(diff);
                if (live!=0) break;
            }

            System.out.print("Ваше количество жизней:"+live+" \nа в вашем слове :"+SWord.length()+" букв\n");
            String[][] allword=new String[2][SWord.length()];

            for (int i=0;i<secretword.length;i++){
                allword[0][i]=secretword[i];
                allword[1][i]=word[i];
            }
            OUT(allword);
            //начало игры
            while (true){
                game(allword);
                Boolean flag=false;
                for (int i=0;i<allword[1].length;i++){
                    if ("_".equals(allword[1][i])){
                        flag=true;
                    }
                }
                if (flag==false){
                    System.out.println("Вы Победили");
                    break;
                }
                if (live==0){
                    System.out.println("Вы проиграли");
                    break;
                }
            }

        }//конец Main
    }
