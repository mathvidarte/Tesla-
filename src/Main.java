import processing.core.PApplet;
import processing.core.PImage;


public class Main extends PApplet {

	// CARGAR LAS IMAGENES
	PImage allNegrita1;
	PImage bottonSignIn;
	PImage compare1;
	PImage compare2;
	PImage compare3;
	PImage compare4;
	PImage details;
	PImage dropDownMenu1;
	PImage dropDownMenu2;
	PImage dropDownMenu3;
	PImage dropDownMenu4;
	PImage flechaBig;
	PImage history;
	PImage model3;
	PImage modelS;
	PImage modelX;
	PImage modelY;
	PImage logIn;
	PImage menu1;
	PImage menu2;
	PImage menu3;
	PImage menu4;
	PImage payment;
	PImage service;
	PImage shopp;
	PImage signIn;
	PImage signInWithOut;
	PImage storeGallery;
	PImage superchargers;
	
	
	//VAR PARA PANTALLAS
	int screen;
	int home;
	int menu;
	int drop;
	
	//BOOLEAN
	boolean allNegrita;
	
	//ANIMACIONES
	int flechas [];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");
		
	
	

	}
	
	public void settings () {
		size(375, 812);
		
	
	}
	
	public void setup () {
		allNegrita1 = loadImage("imagen/allNegrita.png");
		bottonSignIn = loadImage("imagen/bottonSignIn.jpg");
		compare1 = loadImage("imagen/compare1.jpg");
		compare2 = loadImage("imagen/compare2.jpg");
		compare3 = loadImage("imagen/compare3.jpg");
		compare4 = loadImage("imagen/compare4.jpg");
		details = loadImage("imagen/details.jpg");
		dropDownMenu1 = loadImage("imagen/dropDownMenu1.jpg");
		dropDownMenu2 = loadImage("imagen/dropDownMenu2.jpg");
		dropDownMenu3 = loadImage("imagen/dropDownMenu3.jpg");
		dropDownMenu4 = loadImage("imagen/dropDownMenu4.jpg");
		
		history = loadImage("imagen/history.jpg");
		logIn = loadImage("imagen/logIn.jpg");
		menu1 = loadImage("imagen/menu1.jpg");
		menu2 = loadImage("imagen/menu2.jpg");
		menu3 = loadImage("imagen/menu3.jpg");
		menu4 = loadImage("imagen/menu4.jpg");
		model3 = loadImage("imagen/model3.jpg");
		modelS = loadImage("imagen/modelS.jpg");
		modelX = loadImage("imagen/modelX.jpg");
		modelY = loadImage("imagen/modelY.jpg");
		payment = loadImage("imagen/payment.jpg");
		service = loadImage("imagen/service.jpg");
		shopp = loadImage("imagen/shopp.jpg");
		signIn = loadImage("imagen/signIn.jpg");
		signInWithOut = loadImage("imagen/signInWithOut.jpg");
		storeGallery = loadImage("imagen/storeGallery.jpg");
		superchargers = loadImage("imagen/superchargers.jpg");
		
		screen = 0;
		home = 0;
		menu = 0;
		drop = 0;
		
		allNegrita = false;

		
		
	}
	
	public void draw () {
background (225);
		
		switch (screen) {
		case 0:
			rect (0, 0, 375, 812);
			fill (255, 0, 0);
			break ;
		case 1:
			switch (home) {
			case 0:
				image(model3, 0, 0);
				break;
			case 1: 
				image(modelS, 0, 0);
				break;
			case 2:
				image(modelX, 0, 0);
				break;
			case 3:
				image(modelY, 0, 0);
				break;
			}
			break;
		case 2:
			switch (menu) {
			case 0: 
				image(menu1, 0, 0);
				break;
			case 1:
				image(menu2, 0, 0);
				break;
			case 2:
				image(menu3, 0, 0);
				break;
			case 3:
				image(menu4, 0, 0);
				break;
			}
			break;
		case 3: 
			switch (drop) {
			case 0:
				image (dropDownMenu1, 0, 0);
				break;
			case 1:
				image (dropDownMenu2, 0, 0);
				break;
			case 2:
				image (dropDownMenu3, 0, 0);
				break;
			case 3:
				image (dropDownMenu4, 0, 0);
				break;
			}
			break;
			
		
			}
		
	fill (255);
	//textSize(20);
	text("X: " + mouseX + "y: " + mouseY, mouseX, mouseY);

		
		
	}

	public void mousePressed () {
		switch (screen) {
		case 0:
			screen = 1;
			break;
		case 1:
			switch (home) {
			case 0:
				//FLECHA DERECHA
				if (mouseX > 323 && mouseX < 341 && mouseY > 402 && mouseY < 441) {
						home = 1;
		        //FLECHA IZQUIERDA
				} else if (mouseX > 37 && mouseX < 53 && mouseY > 402 && mouseY < 441) {
					home = 3;
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 0;
				}
				break;
			case 1:
				//FLECHA DERECHA
				if (mouseX > 323 && mouseX < 341 && mouseY > 402 && mouseY < 441) {
						home = 2;
				//FLECHA IZQUIERDA
				} else if (mouseX > 37 && mouseX < 53 && mouseY > 402 && mouseY < 441) {
					home = 0;
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 1;
				}
				break;
			case 2:
				//FLECHA DERECHA
				if (mouseX > 323 && mouseX < 341 && mouseY > 402 && mouseY < 441) {
						home = 3;
				//FLECHA IZQUIERDA
				} else if (mouseX > 37 && mouseX < 53 && mouseY > 402 && mouseY < 441) {
					home = 1;
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 2;
				}
				break;
			case 3:
				//FLECHA DERECHA
				if (mouseX > 323 && mouseX < 341 && mouseY > 402 && mouseY < 441) {
						home = 0;
				//FLECHA IZQUIERDA
				} else if (mouseX > 37 && mouseX < 53 && mouseY > 402 && mouseY < 441) {
					home = 2;
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 3;
				}
				break;
			}
			break;
		case 2:
			switch (menu) {
			case 0:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 0;
				}
		
				if (mouseX > 35 && mouseX < 136 && mouseY > 87 && mouseY < 101) {
					screen = 3;
					drop = 0;
				}
				
				break;
			case 1: 
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 1;
				}
				if (mouseX > 35 && mouseX < 136 && mouseY > 87 && mouseY < 101) {
					screen = 3;
					drop = 1;
				}
				break;
			case 2:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 2;
				}
				if (mouseX > 35 && mouseX < 136 && mouseY > 87 && mouseY < 101) {
					screen = 3;
					drop = 2;
				}
				break;
			case 3:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 3;
				}
				if (mouseX > 35 && mouseX < 136 && mouseY > 87 && mouseY < 101) {
					screen = 3;
					drop = 3;
				}
				break;
			}
			break;
		case 3:
			switch (drop) {
			case 0:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 0;
				}
				break;
			case 1:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 1;
				}
				break;
			case 2:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 2;
				}
				break;
			case 3:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 3;
				}
				break;
				
			}
			break;
			
			
		}
	}
}
