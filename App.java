import java.awt.*;

public class App extends Frame{
    App(){
        Frame frame = new Frame("awt1");
        frame.setSize(600, 400);
        
        Label email = new Label("Email:");
        email.setBounds(50, 130, 100, 30);

        TextField emailInput = new TextField("Enter email");
        emailInput.setBounds(170, 130, 100, 30);

        Label password = new Label("Password:");
        password.setBounds(50, 170, 100, 30);

        TextField passwordInput = new TextField("Enter passwod");
        passwordInput.setBounds(170, 170, 100, 30);

        Label age = new Label("Age:");
        age.setBounds(50, 210, 100, 30);

        TextField ageInput = new TextField("Enter age");
        ageInput.setBounds(170, 210, 100, 30);



        frame.add(email);
        frame.add(password);
        frame.add(emailInput);
        frame.add(passwordInput);
        frame.add(age);
        frame.add(ageInput);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
