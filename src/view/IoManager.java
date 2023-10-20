package view;
//lee datos
import java.util.Scanner;
import javax.swing.JOptionPane;

public class IoManager {
  
	//CON SCANNER
  public void showMessage(String message) {
	  System.out.println(message);
  } 
  private Scanner sc;
  
  public IoManager(){
	  sc= new Scanner (System.in);
  }
  
  //para leer un mensage de scanner
  public short readShort (String message) {
	  this.showMessage(message);
	  return sc.nextShort();
  }
  public String readString (String message) {
	  this.showMessage(message);
	  return sc.next();
  }
  public float readFloat(String message) {
	  this.showMessage(message);
	  return sc.nextFloat();
  }
  public long readLong(String message) {
	  this.showMessage(message);
	  return sc.nextLong();
  }
  public int readInt(String message) {
	  this.showMessage(message);
	  return sc.nextInt();
  }
  public double readDouble(String message) {
	  this.showMessage(message);
	  return sc.nextDouble();
  }
  public boolean readBoolean(String message) {
	  this.showMessage(message);
	  return sc.nextBoolean();
  }
  //CON SWING (ambiente grafico)
  public void showGraphicMessage(String message) {
	  JOptionPane.showMessageDialog(null, message);
  }
  public String readGraphicString (String message) {
	  return JOptionPane.showInputDialog(message);
  }
  public short readGraphicShort (String message) {
	  return Short.parseShort(JOptionPane.showInputDialog(message));
  }
  public int readGraphicInt (String message) {
	  return Integer.parseInt(JOptionPane.showInputDialog(message));
  }
  public double readGraphicDouble(String message) {
	  return Double.parseDouble(JOptionPane.showInputDialog(message));
  }
  public float readGraphicFloat(String message) {
	  return Float.parseFloat(JOptionPane.showInputDialog(message));
  }
  public long readGraphicLong(String message) {
	  return Long.parseLong(JOptionPane.showInputDialog(message));
  }
 
	  
}
