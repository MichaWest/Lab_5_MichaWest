package ru.michawest.itmo.lab_5.fileManager;

import java.io.*;
import java.util.regex.*;
import ru.michawest.itmo.lab_5.exceptions.*;

public class FileWorker {
    private String path;

    public FileWorker(String s){
        this.path = s;
    }

    public FileWorker(){
        this.path = "";
    }

    public void setPath(String s){
        String way = "";
        try{
            way = System.getenv(s);
            Pattern pattern = Pattern.compile(";");
            Matcher matcher = pattern.matcher(way);
            if(countGroup(matcher)>1){
                System.out.println("Данная переменная окружения содержит больше одного путя");
            }
            pattern = Pattern.compile("xml");
            matcher = pattern.matcher(way);
            if(!matcher.find()){
                System.out.println("Вы указали путь введущий не к xml файлу");
            }
        }catch(SecurityException e){
            System.out.println(e.getMessage());
        }
        this.path = way;
    }

    public String read(){
        String str ="";
        try{
            if(path.isEmpty()) throw new EmptyPathException();
            InputStreamReader reader;
            File file = new File(path);
            if(!file.exists()) throw new FileNotExistException();
            if(!file.canRead()) throw new FileWrongPermissionsException("не могу прочитать файл");
            InputStream inputStream = new FileInputStream(file);
            reader = new InputStreamReader(inputStream);
            int currentSymbol;
            StringBuilder total = new StringBuilder();
            while((currentSymbol = reader.read())!=-1){
                total.append((char)currentSymbol);
            }
            str = total.toString();
            reader.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return str;
    }

    private static int countGroup(Matcher r){
        int i=0;
        while(r.find()){
            i++;
        }
        return i;
    }

    public boolean write(String str){
        boolean res = true;
        try{
            if (path == null) throw new EmptyPathException();

            File file = new File(path);

            if(!file.exists()) {
                System.out.println("Файл " + path +" не существует, попробуйте создать новый файл");
                create(file);
            }
            if(!file.canWrite()) throw new FileWrongPermissionsException("не могу записать в файл");
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            writer.write(str);
            writer.close();
        } catch(FileException e){
            System.out.println(e.getMessage());
            res = false;
        } catch (IOException e) {
            res = false;
            System.out.println("не удается получить доступ к файлу");
        }
        return res;
    }

    private void create(File file) throws CannotCreateFileException{
        try{
            file.createNewFile();
        } catch(IOException e){
            throw new CannotCreateFileException();
        }
    }

}
