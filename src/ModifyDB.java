import java.io.File;

public class ModifyDB {

    public String ModifyNameDirectory(String nameDB, String newNameDB){
        File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + nameDB );

        // Comprueba si el directoria ya existe
        if (!file.exists()) {
            System.out.println(" La Base de Datos no existe ");
            return " La Base de Datos no existe ";
        }

        else{
            File filerename = new File ("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + newNameDB);
            file.renameTo(filerename);
            System.out.println("El cambio de nombre se realizo con exito");
            return "El cambio de nombre se realizo con exito";

        }

    }
}
