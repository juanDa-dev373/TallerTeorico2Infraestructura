import javax.swing.*;

public class MetodoChino {

    public static void main(String[] args) {
        MetodoChino metodoChino = new MetodoChino();
        String cadena= "";
        char[][] encriptado = {};

        boolean bandera = true;
        while(bandera){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU" +
                    "\n\n1.Ingresar Cadena" +
                    "\n2.Encriptar Cadena" +
                    "\n3.Decifrar Cadena" +
                    "\n4.SALIR"));
            switch (opcion) {
                case 1:
                    cadena = JOptionPane.showInputDialog("Ingresa la cadena: ");
                    System.out.println(cadena);
                    break;

                case 2:
                    encriptado = metodoChino.encriptarChino(cadena);
                    String encriptar = "";
                    for(int i = 0; i<encriptado.length; i++){
                        for (int j = 0; j<encriptado.length; j++){
                            if(encriptado[i][j] != 42){
                                encriptar += encriptado[i][j];
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "La cadena encriptada es la siguente:\n"+encriptar);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "La cadena desencriptada es la siguente:\n"+metodoChino.desencriptaChino(encriptado));

                    break;
                case 4:
                    bandera=false;
                    break;
            }
        }
    }
    public char[][] encriptarChino(String cadena){
        char caracter[][] = new char[(int)Math.ceil(Math.sqrt(cadena.length()))][(int)Math.ceil(Math.sqrt(cadena.length()))];
        String nulo= "*";
        String encriptado = "";
        if(caracter.length*caracter.length<cadena.length()){
            throw new IllegalArgumentException("La matriz no tiene suficiente espacio para los caracteres de la cadena.");
        }
        int index = 0;
        for (int j = caracter[0].length - 1; j >= 0; j--) { // Comienza desde la última columna
            if (j % 2 == 0) { // Si la columna es par, imprime de abajo hacia arriba
                for (int i = caracter.length - 1; i >= 0; i--) {
                    if(index<cadena.length()){
                        caracter[i][j] = cadena.charAt(index++);
                    }else{
                        caracter[i][j] = nulo.charAt(0);
                    }
                }
            } else { // Si la columna es impar, imprime de arriba hacia abajo
                for (int i = 0; i < caracter.length; i++) {
                    if(index<cadena.length()){
                        caracter[i][j] = cadena.charAt(index++);
                    }else{
                        caracter[i][j] = nulo.charAt(0);
                    }
                }
            }
        }
        for (int i = 0 ; i< caracter.length; i++){
            for(int j = 0 ; j< caracter.length; j++){
                if(caracter[i][j] != 42){
                    encriptado += caracter[i][j];
                }
            }
        }
        return caracter;
    }
    public String desecriptarChino2(String cadena){
        return null;
    }

    public String desencriptaChino(char[][] cadena){
        String descriptado = "";


        for (int j = cadena[0].length - 1; j >= 0; j--) { // Comienza desde la última columna
            if (j % 2 == 0) { // Si la columna es par, imprime de abajo hacia arriba
                for (int i = cadena.length - 1; i >= 0; i--) {
                    if(cadena[i][j] != 42){
                        descriptado += cadena[i][j];
                    }
                }
            } else { // Si la columna es impar, imprime de arriba hacia abajo
                for (int i = 0; i < cadena.length; i++) {
                    if(cadena[i][j] != 42){
                        descriptado += cadena[i][j];
                    }
                }
            }
        }
        return descriptado;
    }
}
