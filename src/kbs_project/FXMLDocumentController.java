/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbs_project;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import jess.Context;
import jess.JessException;
import jess.Rete;
import jess.Value;

/**
 *
 * @author asd
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Pane  p_login,p_admain, p_title,p_insert, p_main,p_user,p_delet,p_updata;

    @FXML
    private JFXButton b_main, b_insert, b_update,b_delet;

   @FXML
    private JFXTextField user_input;

    @FXML
    private JFXToggleButton togg;

    
    @FXML
    private TextField user_name, pass,insert_type,insert_res, insert_dam, insert_solu, insert_prob
       , up_type, up_res, up_dam, up_sol, up_prob, de_type, de_res, de_dam,
            de_sol,de_prob, user_type,user_res, user_dam,user_sol;
    
    public void main(ActionEvent e) throws Exception {
       
        b_main.setBackground(p_main.getBackground());
        p_delet.setVisible(false);
        p_insert.setVisible(false);
        p_updata.setVisible(false);
        p_main.setVisible(true);

    }
    public void pane_insert(ActionEvent e) throws Exception {
       
        b_insert.setBackground(p_main.getBackground());
        p_delet.setVisible(false);
        p_insert.setVisible(true);
        p_updata.setVisible(false);
        p_main.setVisible(false);

    }
    public void pane_delet(ActionEvent e) throws Exception {
       
        b_delet.setBackground(p_main.getBackground());
        p_delet.setVisible(true);
        p_insert.setVisible(false);
        p_updata.setVisible(false);
        p_main.setVisible(false);

    }
    public void pane_update(ActionEvent e) throws Exception {
       
        b_update.setBackground(p_main.getBackground());
        p_delet.setVisible(false);
        p_insert.setVisible(false);
        p_updata.setVisible(true);
        p_main.setVisible(false);

    }
    public void back(ActionEvent e) throws Exception {
    
    p_login.setVisible(true);
    p_user.setVisible(false);
    p_admain.setVisible(false);
    
    }
    public void login(ActionEvent e) throws Exception {
     if(!togg.isSelected()){
    
         p_login.setVisible(false);
         p_user.setVisible(true);
         p_admain.setVisible(false);}
     
     else{
     
    p_login.setVisible(false);
    p_user.setVisible(false);
    p_admain.setVisible(true);
     
     }
    
    }
    
    
    
    public void use_user(ActionEvent e) throws Exception {
    
        Rete r=new Rete();
//        Rete r1=new Rete();
//        Rete r2=new Rete();
//        Rete r3=new Rete();
        
        String x=user_input.getText();
        System.out.println(x);
       try{
           System.out.println(r.executeCommand("(clear)")); 
           r.executeCommand("(watch all)");
           r.executeCommand("(reset)");
           r.executeCommand("(batch kps.txt)");
           r.executeCommand("(assert(problem(prob\""+x+"\")))");
           Value res=  r.executeCommand("(run)");
           Value v = r.executeCommand("?*x*");
           Value v1 = r.executeCommand("?*y*");
           Value v2 = r.executeCommand("?*z*");
           Value v3 = r.executeCommand("?*s*");
           System.out.println(v.toString());
           System.out.println(v1.toString());
           System.out.println(v2.toString());
           System.out.println(v3.toString());
           
           user_type.setText(v.toString().replace("\"", ""));
           user_res.setText(v1.toString().replace("\"", ""));
           user_dam.setText(v2.toString().replace("\"", ""));
           user_sol.setText(v3.toString().replace("\"", ""));
           
//           System.out.println(r.executeCommand(("(facts)"))); 
//           String all_f=r.executeCommand(("(facts)")).toString();
//           Context cntxt = null;Context c=new Context(cntxt, r);
//           System.out.println(res.factValue(c).get(1)); 
//           System.out.println(res.stringValue(c));
//           System.out.println(res.resolveValue(cntxt));
           
          // StringTokenizer k=new StringTokenizer(all_f, "\"");
           //System.out.println(k.countTokens());
           
           //System.out.println(res.);
//           Context cntxt = null;Context c=new Context(cntxt, r);
//           System.out.println(res.factValue(c)); 
//          
//           r.executeCommand("(assert(problem(prob\""+x+"\")))");
//           Value res=  r.executeCommand("(run)");
//           Context cntxt = null;Context c=new Context(cntxt, r);
//           System.out.println(res.factValue(c).get(0));
//           System.out.println(res.stringValue(cntxt));
//           String s1=res.factValue(c).get(0).toString();
//
//           r1.executeCommand("(watch all)");
//           r1.executeCommand("(reset)");
//           r1.executeCommand("(batch kps.txt)");
//           r1.executeCommand("(assert(reason(rea"+s1+")))");
//           Value res2=  r1.executeCommand("(run)"); 
//           Context cn = null; Context  c1=new Context(cn, r1);
//           System.out.println(res2.factValue(c1).get(0));
//           String s2=res2.factValue(c1).get(0).toString();
//           
//           
//           r2.executeCommand("(watch all)");
//           r2.executeCommand("(reset)");
//           r2.executeCommand("(batch kps.txt)");
//           r2.executeCommand("(assert(damage(dam"+s2+")))");
//           Value res3=  r2.executeCommand("(run)"); 
//           Context cn1 = null; Context  c2=new Context(cn1, r1);
//           System.out.println(res2.factValue(c2).get(0));
//           String s3=res3.factValue(c2).get(0).toString();           
//
//
//           r3.executeCommand("(watch all)");
//           r3.executeCommand("(reset)");
//           r3.executeCommand("(batch kps.txt)");
//           r3.executeCommand("(assert(over_come(oc"+s3+")))");
//           Value res4=  r3.executeCommand("(run)"); 
//           Context cn2 = null; Context  c3=new Context(cn2, r1);
//           System.out.println(res2.factValue(c3).get(0));
//           String s4=res4.factValue(c3).get(0).toString();           

       }catch(JessException ex){
       
           System.out.println(ex);
       }
    
    
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
