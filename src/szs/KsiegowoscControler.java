package szs;

import javafx.fxml.FXML;

public class KsiegowoscControler {

    private LoginController loginControler;

    @FXML
    public void closeKsiegowosc(){
    }

    @FXML
    public void editKsieogwosc(){
    }

    public void setLoginControler(LoginController loginControler){
        try {
            this.loginControler = loginControler;
        }catch (Exception exp){
            exp.printStackTrace();
        }
    }

}
