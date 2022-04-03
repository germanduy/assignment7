package Assignment7;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class QuanlyDSSP {
    public TextField ten;
    public TextField gia;
    public TextField donvi;
    public TextField soluong;
    public Text result;
    public Text error;
    public ArrayList<SanPham> DSSP = new ArrayList<>();
    public void themsp(){
        try{
            SanPham p = new SanPham(ten.getText(), Integer.parseInt(gia.getText()),donvi.getText(),Integer.parseInt(soluong.getText()));
            this.DSSP.add(p);
            ten.setText("");
            gia.setText("");
            donvi.setText("");
            soluong.setText("");
            this.error.setVisible(true);
            this.error.setText("Thêm thành công");
        }catch (Exception e){
            this.error.setText(e.getMessage());
            this.error.setVisible(true);

        }
    }
    public void hiendssp(){
        for(SanPham p:DSSP){
            result.setText(result.getText()+p.hiends());
        }

    }

}
