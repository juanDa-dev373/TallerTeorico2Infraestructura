import javax.swing.*;

public class MetodoCesar {

    public static void main(String[] args) {
        MetodoCesar metodoCesar = new MetodoCesar();
        String cadena= "";
        String encriptado = "";
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
                    encriptado = metodoCesar.encriptarCesar(cadena);
                    JOptionPane.showMessageDialog(null, "La cadena encriptada es la siguente:\n"+encriptado);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "La cadena encriptada es la siguente:\n"+metodoCesar.desencriptarCesar(encriptado));
                    break;
                case 4:
                    bandera=false;
                    break;
            }
        }
    }
    public String encriptarCesar(String mensaje){
        char []cha = new char[mensaje.length()];
        for(int i = 0; i<mensaje.length(); i++){
            cha[i] = mensaje.charAt(i);
        }
        String encriptado = "";
        for (int i = 0; i<cha.length; i++){
            encriptado += (char)((int)cha[i]+3);
        }
        System.out.println(encriptado);
        return encriptado;
    }
    public String desencriptarCesar(String cadena){
        char []cha = new char[cadena.length()];
        for(int i = 0; i<cadena.length(); i++){
            cha[i] = cadena.charAt(i);
        }
        String desencriptado = "";
        for (int i = 0; i<cha.length; i++){
            desencriptado += (char)((int)cha[i]-3);
        }
        System.out.println(desencriptado);
        return desencriptado;
    }
}
