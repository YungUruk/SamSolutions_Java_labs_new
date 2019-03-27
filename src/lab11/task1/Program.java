package lab11.task1;

import java.io.*;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
      getCommand("mkdir");
        //getCommand("rmdir");
        //getCommand("ls");
        getCommand("cat");
        //getCommand("rm");
       // getCommand("find");
    }
    /*public String setCommand(){
        Scanner sc =new Scanner(System.in);
        String command = sc.nextLine();
        return command;
    }*/
    public static void getCommand(String command){
        File file = new File("C:\\temp", "test.txt");
        switch (command){
            case "ls":{
                File dir =new File("C:\\");
                if(dir.isDirectory()){
                    for(File item:dir.listFiles()){
                        if(item.isDirectory()){
                            System.out.println(item.getName()+" dir");

                        }
                        else{
                            System.out.println(item.getName()+ " file");
                        }
                    }
                }

                break;}
            case "cd":{
                File newFile=new File("C:\\");
                file = newFile;
            }
                break;
            case "cat": {

                try {
                    boolean created = file.createNewFile();
                    if (created)
                        System.out.println("File has been created");
                } catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
                try( FileReader fileStream = new FileReader( file );
                     BufferedReader bufferedReader = new BufferedReader( fileStream ) ) {

                    String line = null;

                    while( (line = bufferedReader.readLine()) != null ) {
                        System.out.println(line);
                    }

                } catch ( FileNotFoundException ex ) {
                    //exception Handling
                } catch ( IOException ex ) {
                    //exception Handling
                }


                    break;

            }
            case "rm":{
                if(file.delete()){
                    System.out.println("deleted");
                }
                else System.out.println("not deleted");
            }
                break;
            case "find":{
for(File item: file.listFiles()){
    if(item.equals("test.txt")){
        System.out.println("gotcha");
    }
}

                break;}
            case "mkdir":{
                File dir1=new File("C:\\temp");
                dir1.mkdir();
                System.out.println("done");
                break;
            }

            case "rmdir":{
                if(file.delete()){
                    System.out.println("deleted");
                }else System.out.println("not deleted");

                break;}
        }

    }
    private static void appendUsingBufferedWriter(String filePath, String text, int noOfLines) {
        File file = new File(filePath);
        FileWriter fr = null;
        BufferedWriter br = null;
        try {
            //для обновления файла нужно инициализировать FileWriter с помощью этого конструктора
            fr = new FileWriter(file,true);
            br = new BufferedWriter(fr);
            for(int i = 0; i < noOfLines; i++){
                br.newLine();
                //теперь мы можем использовать метод write или метод append
                br.write(text);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}