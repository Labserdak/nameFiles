import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Александра\\Desktop");
        if(file.isDirectory())
        {
            for(File item : file.listFiles()){

                if(item.isDirectory()){

                    System.out.println(item.getName() + "  \t папка");
                }
                else{

                    System.out.println(item.getName() + "\t файл");
                }
            }
        }
    }
}
