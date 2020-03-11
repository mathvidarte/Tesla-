import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;

public class RegisterUser {
	String name, email, password, confirmPassword;
	PApplet app;
	ControlP5 cp5;
	
	
	public RegisterUser (PApplet app) {
		this.app = app;
		cp5 = new ControlP5(app);
		PFont font = app.createFont("barlow", 20);
		
		
		/*cp5.addTextfield("Name")
		.setPosition(16,304)
		.setSize(342,52)
		.setColor(app.color(0))
		.setColorBackground(app.color(255,255,255,30))
		.setFont(font);
		
		
		cp5.addTextfield("email")
		.setPosition(16,420)
		.setSize(342,52)
		.setColor(app.color(0))
		.setColorBackground(app.color(255,255,255,30))
		.setFont(font)
		;
		
		
		cp5.addTextfield("password")
		.setPosition(16,420)
		.setSize(342,52)
		.setColor(app.color(0))
		.setColorBackground(app.color(255,255,255,30))
		.setFont(font)
		;
		
		
		cp5.addTextfield("confirmPassword")
		.setPosition(16,420)
		.setSize(342,52)
		.setColor(app.color(0))
		.setColorBackground(app.color(255,255,255,30))
		.setFont(font)
		;*/
		
		
	}
	
	public void getInfo() {
		name = cp5.get(Textfield.class,"Name").getText();
		email = cp5.get(Textfield.class,"email").getText();
		password = cp5.get(Textfield.class,"password").getText();
		confirmPassword = cp5.get(Textfield.class,"confirmPassword").getText();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return email;
	}

	public void setMail(String mail) {
		this.email = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public ControlP5 getCp5() {
		return cp5;
	}

	public void setCp5(ControlP5 cp5) {
		this.cp5 = cp5;
	}
	
	
	
	

}
