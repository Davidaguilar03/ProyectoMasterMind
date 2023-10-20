package controller;

import model.Mastermind;
import view.IoManager;

public class Control {
  public IoManager io;
  
  public Control() {
	io=new IoManager();
  }

  public void init() {
	  Mastermind mastermind = new Mastermind();
	  mastermind.juego();
  }
  
 
  
}
