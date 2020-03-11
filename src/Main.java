import processing.core.PApplet;
import processing.core.PImage;


public class Main extends PApplet {

	// CARGAR LAS IMAGENES
	PImage allNegrita;
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
	PImage carroAzul;
	PImage carroBlanco;
	PImage carroGris;
	PImage carroNegro;
	PImage carroRojo;
	PImage signIn;
	PImage signInWithOut;
	PImage storeGallery;
	PImage superchargers;
	PImage signInBlack;
	
	
	//VAR PARA PANTALLAS
	int screen;
	int home;
	int menu;
	int drop;
	int color;
	int next;
	int modal;
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Main");
		
	
	

	}
	
	public void settings () {
		size(375, 812);
		
	
	}
	
	public void setup () {
		allNegrita = loadImage("imagen/allNegrita.png");
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
		carroAzul = loadImage("imagen/carroAzul.jpg");
		carroBlanco = loadImage("imagen/carroBlanco.jpg");
		carroGris = loadImage("imagen/carroGris.jpg");
		carroNegro = loadImage("imagen/carroNegro.jpg");
		carroRojo = loadImage("imagen/carroRojo.jpg");
		signIn = loadImage("imagen/signIn.jpg");
		signInWithOut = loadImage("imagen/signInWithOut.jpg");
		storeGallery = loadImage("imagen/storeGallery.jpg");
		superchargers = loadImage("imagen/superchargers.jpg");
		signInBlack = loadImage("imagen/signInBlack.png");
		
		screen = 0;
		home = 0;
		menu = 0;
		drop = 0;
		color = 0;
		next = 0;
		modal = 0;
		
		

		
		
	}
	
	public void draw () {
background (225);
		
		switch (screen) {
		case 0:
			image (signIn, 0, 0);
			if (mouseX > 127 && mouseX < 251 && mouseY > 594 && mouseY < 621) {
				image (signInBlack, 0, 0);
			}
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
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					image(allNegrita, 0, 0);
				}
				break;
			case 1:
				image (dropDownMenu2, 0, 0);
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					image(allNegrita, 0, 0);
				}
				break;
			case 2:
				image (dropDownMenu3, 0, 0);
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					image(allNegrita, 0, 0);
				}
				break;
			case 3:
				image (dropDownMenu4, 0, 0);
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					image(allNegrita, 0, 0);
				}
				break;
			}
			break;
		case 4:
			image (history, 0, 0);
			break;
		case 5:
			image (carroBlanco, 0, 0);
			break;
		case 6:
			image (payment, 0, 0);
			break;
		case 7:
			image (details, 0, 0);
		case 8:
			switch (next) {
			case 0:
				image (compare1, 0, 0);
				break;
			case 1: 
				image (compare2, 0, 0);
				break;
			case 2:
				image (compare3, 0, 0);
				break;
			case 3:
				image (compare4, 0, 0);
				break;
			}
			break;
		case 9: 
			switch (modal) {
			case 0:
				image(storeGallery, 0, 0);
				break;
			case 1:
				image (superchargers, 0, 0);
				break;
			case 2:
				image (service,0, 0);
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
			if (mouseX > 127 && mouseX < 251 && mouseY > 594 && mouseY < 621) {
				screen = 9;
				modal = 0;
			}
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
				//CLICK MENU	
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 0;
				}
				//CLICK ORDER NOW 
				if (mouseX > 133 && mouseX < 226 && mouseY > 115 && mouseY < 135) {
					screen = 5;
				}
				//CLICK COMPARE
				if (mouseX > 133 && mouseX < 226 && mouseY > 153 && mouseY < 175) {
					screen = 8;
					next = 0;
				}
				
				
				break;
			case 1:
				//FLECHA DERECHA
				if (mouseX > 323 && mouseX < 341 && mouseY > 402 && mouseY < 441) {
						home = 2;
				//FLECHA IZQUIERDA
				} else if (mouseX > 37 && mouseX < 53 && mouseY > 402 && mouseY < 441) {
					home = 0;
				//CLICK MENU	
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 1;
				}
				//CLICK ORDER NOW 
				if (mouseX > 133 && mouseX < 226 && mouseY > 115 && mouseY < 135) {
					screen = 5;
					color = 0;
				}
				break;
			case 2:
				//FLECHA DERECHA
				if (mouseX > 323 && mouseX < 341 && mouseY > 402 && mouseY < 441) {
						home = 3;
				//FLECHA IZQUIERDA
				} else if (mouseX > 37 && mouseX < 53 && mouseY > 402 && mouseY < 441) {
					home = 1;
				//CLICK MENU	
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 2;
				}
				//CLICK ORDER NOW 
				if (mouseX > 133 && mouseX < 226 && mouseY > 115 && mouseY < 135) {
					screen = 5;
					color = 0;
				}
				break;
			case 3:
				//FLECHA DERECHA
				if (mouseX > 323 && mouseX < 341 && mouseY > 402 && mouseY < 441) {
						home = 0;
				//FLECHA IZQUIERDA
				} else if (mouseX > 37 && mouseX < 53 && mouseY > 402 && mouseY < 441) {
					home = 2;
				//CLICK MENU	
				} else if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40) {
					screen = 2;
					menu = 3;
				}
				//CLICK ORDER NOW 
				if (mouseX > 133 && mouseX < 226 && mouseY > 115 && mouseY < 135) {
					screen = 5;
					color = 0;
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
				
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					screen = 4;
				}
				break;
			case 1:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 1;
				}
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					screen = 4;
				}
				break;
			case 2:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 2;
				}
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					screen = 4;
				}
				break;
			case 3:
				if (mouseX > 37 && mouseX < 68 && mouseY > 19 && mouseY < 40 ||
						mouseX > 245 && mouseX < 375 && mouseY > 0 && mouseY < 812)  {
					screen = 1;
					home = 3;
				}
				if (mouseX > 37 && mouseX < 192 && mouseY > 183 && mouseY < 211) {
					screen = 4;
				}
				break;
				
			}
			break;
		case 4:
			if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
					mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
				screen = 1;
			}
			if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
					mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
				screen = 1;
			}
			break;
		case 5:
			if (mouseX > 109 && mouseX < 268 && mouseY > 588 && mouseX < 625) {
				screen = 6;
			}
			if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
					mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
				screen = 1;
			}
			break;
		case 6:
			if (mouseX > 109 && mouseX < 268 && mouseY > 588 && mouseX < 625) {
				screen = 7;
			}
			if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
					mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
				screen = 1;
			}
			break;
		case 7:
		
			break;
		case 8:
			switch (next) {
			case 0:
				if (mouseX > 323 && mouseX < 339 && mouseY > 405 && mouseX < 435) {
					//screen = 7;
					next = 1;
				}
				if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
						mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
					screen = 1;
				}
				break;
			case 1:
				if (mouseX > 323 && mouseX < 339 && mouseY > 405 && mouseX < 435) {
					//screen = 7;
					next = 2;
				} else if (mouseX > 37 && mouseX < 58 && mouseY > 405 && mouseX < 435) {
					next = 0;
				}
				if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
						mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
					screen = 1;
				}
				break;
			case 2:
				if (mouseX > 323 && mouseX < 339 && mouseY > 405 && mouseX < 435) {
					//screen = 7;
					next = 3;
				} else if (mouseX > 37 && mouseX < 58 && mouseY > 405 && mouseX < 435) {
					next = 1;
				}
				if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
						mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
					screen = 1;
				}
				break;
			case 3:
				if (mouseX > 37 && mouseX < 58 && mouseY > 405 && mouseX < 435) {
					next = 2;
				}
				if (mouseX > 298 && mouseX < 317 && mouseY > 80 && mouseY < 100 ||
						mouseX > 123 && mouseX < 251 && mouseY > 20 && mouseY < 39) {
					screen = 1;
				}
				
				break;
		
			}
			break;
		case 9:
			switch (modal) {
			case 0:
				if (mouseX > 146 && mouseX < 236 && mouseY > 465 && mouseY < 478) {
					screen = 9;
					modal = 1;
				} else if (mouseX > 164 && mouseX < 209 && mouseY > 515 && mouseY < 530) {
					screen = 9;
					modal = 2;
				} else if (mouseX > 289 && mouseX < 305 && mouseY > 253 && mouseY < 272) {
					screen = 1;
					home = 0;
				}
				break;
			case 1:
				if (mouseX > 126 && mouseX < 248 && mouseY > 421 && mouseY < 434) {
					screen = 9;
					modal = 0;
				} else if (mouseX > 164 && mouseX < 209 && mouseY > 515 && mouseY < 530) {
					screen = 9;
					modal = 2;
				} else if (mouseX > 289 && mouseX < 305 && mouseY > 253 && mouseY < 272) {
					screen = 1;
					home = 0;
				}
				break;
			case 2:
				if (mouseX > 126 && mouseX < 248 && mouseY > 421 && mouseY < 434) {
					screen = 9;
					modal = 0;
				} else if (mouseX > 146 && mouseX < 236 && mouseY > 465 && mouseY < 478) {
					screen = 9;
					modal = 1;
				} else if (mouseX > 289 && mouseX < 305 && mouseY > 253 && mouseY < 272) {
					screen = 1;
					home = 0;
				}
				break;
				
			
			}
		}
	}
}
