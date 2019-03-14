/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
        

public class Methos extends Application {
    //////////////////////////////////initial  values///////////////////////////////////////////////
String numToString=new String();
    Stage primaryStage;
    long  num;
    int delNum;
    int H=0;
    int His=0;
    int count=1;
    int ArrayOfBalance[]=new int[5];
    int ArrayOfWithdrawal[]=new int[5];
    int ArrayOfDeposit[]=new int[5];
    int Lastinput=0;
    ////////////////////////////////main////////////////////////////////////////////////
    public static void main(String[] args) {
       launch(args);
    }@Override
    
    ////////////////  method which take all scenes from other methods to its stage /////////////
    
     public void start(Stage primaryStage) throws Exception{
        this.primaryStage=primaryStage;
         Atm customer1=new Atm();
         String x= new String();
         
         /////////////////page 1 card number scene///////////////////////////////////////
         Label cardNumber1 =new Label("Card Number");
         Label space1 =new Label("");
         Label space3 =new Label("");
         Label check =new Label();
         Button confirm =new Button("submit");
         Button Okay = null;
         TextField cardNumberField=new TextField();
         Button zero=new Button("  0  ");
         Button one=new Button("  1  ");
         Button two=new Button("  2  ");
         Button three=new Button("  3  ");
         Button four=new Button("  4  ");
         Button five=new Button("  5  ");
         Button six=new Button("  6  ");
         Button seven=new Button("  7  ");
         Button eight=new Button("  8  ");
         Button nine=new Button("  9  ");
         Button del=new Button("Del ");
         Button clc=new Button(" clc ");
    
    ///////////////////// set on action of 0-9 number pad ///////////////////////////////////////
     zero.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         { numToString+="0";
         
         char c=numToString.charAt(0);
        if(c=='0')
        { 
      StringBuffer sb= new StringBuffer(numToString);
      sb.deleteCharAt(0);numToString=new String(sb);
        }
        else{ cardNumberField.setText(numToString);}
             
         
         }
         
         
         
         
         
     }
         );
          
          one.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {numToString+="1";
             cardNumberField.setText(numToString);
         
         }
         
         
         
         
         
     }
         );
          two.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {numToString+="2";
             cardNumberField.setText(numToString);
             
         
         }
         
         
         
         
         
     }
         );
          three.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             numToString+="3";
             cardNumberField.setText(numToString);
         
         }
         
         
         
         
         
     }
         );
          four.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             numToString+="4";
             cardNumberField.setText(numToString);
         
         }
         
         
         
         
         
     }
         );
          five.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             numToString+="5";
             cardNumberField.setText(numToString);
         
         }
         
         
         
         
         
     }
         );
          six.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             
         numToString+="6";
             cardNumberField.setText(numToString);
         }
         
         
         
         
         
     }
         );
          seven.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             numToString+="7";
             cardNumberField.setText(numToString);
         
         }
         
         
         
         
         
     }
         );
          eight.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             
         numToString+="8";
             cardNumberField.setText(numToString);
         }
         
         
         
         
         
     }
         );
          nine.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             numToString+="9";
             cardNumberField.setText(numToString);
         
         }
         
         
         
         
         
     }
         );
     /////////////// setonaction of Delete button////////////////////////////////////////////
          del.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {if(numToString.equals(x))
            {popup(Okay,"Please enter the number");}
         else{
           String str = numToString;
           StringBuffer sb= new StringBuffer(str);
           sb.deleteCharAt(sb.length()-1);
           numToString=new String(sb);
      
      
           
             cardNumberField.setText(numToString);}
         
         }
         
         
         
         
         
     }
         );
          
        confirm.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {if(numToString.equals("0"))
             cardNumberField.setText("");
         else{
             
             
                 if(numToString.equals(x))
                       {popup(Okay,"Please enter the number");}
                else{
                         num= Long.parseLong(numToString);
                         if(numToString.length()>9)
                         {
                              popup(Okay,"the number is too long \n please enter card number again ");}
                         else if(num==customer1.cardNumber)
                         {    primaryStage.setScene(prepareHomepage());
                         
                         }
          
                        else
                        {   numToString="";
                            cardNumberField.setText("");
                            popup(Okay,"Wrong input \n please enter card number again ");
                        }
                    }  
         } 
         }
        }
        );
        //////////////////////// setonaction of clear Button/////////////////////
        clc.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {numToString="";
          cardNumberField.setText("");
         } });
         
         
        
        
        GridPane grid=new GridPane();
        
        grid.add( cardNumber1 , 3,  1);
        grid.add( cardNumberField , 4 ,  1);
        grid.add( confirm , 3,  3);
        grid.add( zero , 1,  4);
         grid.add( one , 0,  1);
         grid.add( two , 1,  1);
         grid.add( three , 2,  1);
         grid.add( four , 0,  2);
         grid.add( five , 1,  2);
         grid.add( six , 2,  2);
         grid.add( seven , 0, 3);
         grid.add( eight , 1,  3);
         grid.add( nine , 2,  3);
         grid.add( del , 0,  4);
         grid.add( clc, 2,  4);
                

        Scene scene=new Scene(grid,350,100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Atm");
        primaryStage.show();
}
     
     /////////////////////////////Home page/////////////////////////////////////////////////////////
      Scene homepage;
   
    Atm customer=new Atm();
    
     

    

   
    

     
    
    public Scene prepareHomepage ()
    {            
         Button Balance =new Button("   Balance   ");
         Button Deposit =new Button("Deposit");
         Button Withdrawal =new Button("Withdrawal");
         Button Exit=new Button("   Exit   ");
         Button Previous =new Button ("  Previous  ");
         Button Next=new Button ("  Next  ");
         Label History=new Label("History");
         Label BalanceHistory=new Label("Balance");
         Label WithdrawalHistory=new Label("Withdrawal");
         Label DepositHistory=new Label("Deposit");
         Label HistoryField=new Label(String.valueOf(5-Lastinput) );H=Lastinput;
         Label BalanceHistoryField=new Label(String.valueOf(ArrayOfBalance[H])  );
         Label WithdrawalHistoryField=new Label(String.valueOf(ArrayOfWithdrawal[H]));
         Label DepositHistoryField=new Label(String.valueOf(ArrayOfDeposit[H]));
         
         
         Button Okay=new Button("Okay");
         
         
         
         GridPane gridOfHomePage=new GridPane();
         
         
          Exit.setOnAction(e ->primaryStage.close() );
          
          
          Deposit.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {primaryStage.setScene(prepareDepositpage());
             
         
         }}
         );
          
          
         Balance.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {primaryStage.setScene(prepareBalancepage());
             
         
         }});
         
         
         Withdrawal.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {primaryStage.setScene(prepareWithdrawalpage());
             
         
         }});
         
         Previous.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         { if(!(H>0&&H<=5))
         {      H=5; }
             if((H>0&&H<=5))
         {H--;if(ArrayOfBalance[H]==0)
             {H=Lastinput;}
             
              HistoryField.setText(String.valueOf(5-H));
             BalanceHistoryField.setText(String.valueOf(ArrayOfBalance[H]));
         WithdrawalHistoryField.setText(String.valueOf(ArrayOfWithdrawal[H]));
               DepositHistoryField.setText(String.valueOf(ArrayOfDeposit[H]));}
         
         }});
         
         
         
         Next.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {if(H>=4)
         {      H=-1; }
             if((H>=-1&&H<=3))
             {H++;
             if(ArrayOfBalance[H]==0)
             {H=0;
             }
             HistoryField.setText(String.valueOf(5-H));
             BalanceHistoryField.setText(String.valueOf(ArrayOfBalance[H]));
             WithdrawalHistoryField.setText(String.valueOf(ArrayOfWithdrawal[H]));
               DepositHistoryField.setText(String.valueOf(ArrayOfDeposit[H]));}
         
         }});
         
         
         
         
         
         
         
        gridOfHomePage.add( Balance , 0,  0);
        gridOfHomePage.add( Deposit , 3,  0);
        gridOfHomePage.add( Withdrawal , 0,  1);
        gridOfHomePage.add( Exit , 3,  1);
        gridOfHomePage.add( Previous , 0,  2);
        gridOfHomePage.add( Next , 3,  2);
        gridOfHomePage.add( History , 1,  2);
        gridOfHomePage.add( BalanceHistory , 1,  3);
        gridOfHomePage.add( WithdrawalHistory , 1,  4);
        gridOfHomePage.add( DepositHistory , 1,  5);
        gridOfHomePage.add( HistoryField , 2,  2);
        gridOfHomePage.add( BalanceHistoryField , 2,  3);
        gridOfHomePage.add( WithdrawalHistoryField , 2,  4);
        gridOfHomePage.add( DepositHistoryField , 2,  5);
        
        
        
        
        
        
        
        
        
        
        
        
         homepage=new Scene(gridOfHomePage,250,150);
         
              return homepage;  
    
    
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
     
     Scene depositpage;
    
    double bal;
    String number=new String();
   //SimpleATM bb=new SimpleATM();
    
   
    
    

  
    

    
    public Scene prepareDepositpage ()
    {Label DepositLabel =new Label ("Deposit = ");
    Button confirm=new Button("confirm");
    Label Balance=new Label("New Balance = ");
    Label BalanceField=new Label();
    Label DepositResult=new Label();
    
    
    Button Back=new Button("<-");
    Button zero=new Button("  0  ");
    Button one=new Button("  1  ");
    Button two=new Button("  2  ");
    Button three=new Button("  3  ");
    Button four=new Button("  4  ");
    Button five=new Button("  5  ");
    Button six=new Button("  6  ");
    Button seven=new Button("  7  ");
    Button eight=new Button("  8  ");
    Button nine=new Button("  9  ");
    
    Button del=new Button("Del ");
    Button clc=new Button(" clc ");
    
        String x=number;
        
         GridPane gridOfDepositPage=new GridPane();
          
          zero.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         { number+="0";
         char c=number.charAt(0);
        if(c=='0')
        { 
      StringBuffer sb= new StringBuffer(number);
      sb.deleteCharAt(0);number=new String(sb);
        }
        else{ DepositResult.setText(number);}
             
             
         
         }
         
         
         
         
         
     }
         );
          
          one.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number+="1";
             DepositResult.setText(number);
         
         }
         
         
         
         
         
     }
         );
          two.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number+="2";
             DepositResult.setText(number);
             
         
         }
         
         
         
         
         
     }
         );
          three.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number+="3";
             DepositResult.setText(number);
         
         }
         
         
         
         
         
     }
         );
          four.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number+="4";
             DepositResult.setText(number);
         
         }
         
         
         
         
         
     }
         );
          five.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number+="5";
             DepositResult.setText(number);
         
         }
         
         
         
         
         
     }
         );
          six.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             
         number+="6";
             DepositResult.setText(number);
         }
         
         
         
         
         
     }
         );
          seven.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number+="7";
             DepositResult.setText(number);
         
         }
         
         
         
         
         
     }
         );
          eight.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             
         number+="8";
             DepositResult.setText(number);
         }
         
         
         
         
         
     }
         );
          nine.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number+="9";
             DepositResult.setText(number);
         
         }
         
         
         
         
         
     }
         );
          
          
          Button Okay=new Button("Okay");
         
        confirm.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {if(His>4)
         {      His=0; }
             if((His>=0&&His<=4))
             {if(number.equals(x))
            {popup(Okay,"Please enter the number");}
         else{ long k=Long.parseLong(number);
             if(number.length()<=9)
             {customer.deposit(k);
             ArrayOfDeposit[His]=(int) k;
         String newBalance=String.valueOf(customer.getBalance());
             BalanceField.setText(newBalance);
            number="";
            ArrayOfBalance[His]=(int) customer.getBalance();Lastinput=His;His++;
            
             DepositResult.setText(number);}
             else
             {popup(Okay,"the number is too long \n please enter number again ");}
         }
         
         }}
         
         
         
         
         
     }
         );
        clc.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number="";
          DepositResult.setText("");
         } });
        Back.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number="";
          DepositResult.setText("");
             primaryStage.setScene(prepareHomepage());
         } }
         );
        del.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {if(number.equals(x))
            {popup(Okay,"Please enter the number");}
         else{
             String str = number;
           StringBuffer sb= new StringBuffer(str);
           sb.deleteCharAt(sb.length()-1);
           number=new String(sb);
           DepositResult.setText(number);}
         } }
         );
        
        
        
         gridOfDepositPage.add( DepositLabel , 3 ,  1);
         gridOfDepositPage.add( DepositResult, 4, 1);
         gridOfDepositPage.add( confirm , 3,  3);
         gridOfDepositPage.add( zero , 1,  4);
         gridOfDepositPage.add( one , 0,  1);
         gridOfDepositPage.add( two , 1,  1);
         gridOfDepositPage.add( three , 2,  1);
         gridOfDepositPage.add( four , 0,  2);
         gridOfDepositPage.add( five , 1,  2);
         gridOfDepositPage.add( six , 2,  2);
         gridOfDepositPage.add( seven , 0, 3);
         gridOfDepositPage.add( eight , 1,  3);
         gridOfDepositPage.add( nine , 2,  3);
         gridOfDepositPage.add( BalanceField , 4,  5);
         gridOfDepositPage.add( Balance , 3,  5);
         gridOfDepositPage.add( Back , 1,  6);
         gridOfDepositPage.add( del , 0,  4);
         gridOfDepositPage.add( clc , 2,  4);
         
         depositpage=new Scene(gridOfDepositPage,300,300);
    
    
    
    return depositpage;}
     ////////////////////////////////////Balance page////////////////////////////////////////////////////////
    Scene balancepage;
    
    public Scene prepareBalancepage ()
    {Label BalanceLabel =new Label ("balance = ");
    Button confirm=new Button("confirm");
    Button Back=new Button("<-");
    Label BalanceResult=new Label();
    
         GridPane gridOfBalancePage=new GridPane();
          Back.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {primaryStage.setScene(prepareHomepage());
         }
         
         
         
         
         
     }
         );
         
          
        confirm.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {String num;
             num=String.valueOf(customer.getBalance());
             BalanceResult.setText(num);
             
         
         }
         
         
         
         
         
     }
         );
        gridOfBalancePage.add( BalanceLabel , 0 ,  0);
        gridOfBalancePage.add( BalanceResult , 1,  0);
        gridOfBalancePage.add( confirm , 1,  1);
        gridOfBalancePage.add( Back , 0,  1);
         
         balancepage=new Scene(gridOfBalancePage,600,400);
    
    
    
    return balancepage;}
     ///////////////////////////////////Withdrawal Page////////////////////////////////////////////
     
      Scene withdrawalPage;
    
    double bal1;
    String number1=new String();
    
      public Scene prepareWithdrawalpage ()
    {Label WithdrawalLabel =new Label ("withdrawal = ");
    Button confirm=new Button("confirm");
    Label Balance=new Label("New Balance = ");
    Label WithdrawalField=new Label();
    Label WithdrawalResult=new Label();
    Button Back=new Button("<-");
    Button zero=new Button("  0  ");
    Button one=new Button("  1  ");
    Button two=new Button("  2  ");
    Button three=new Button("  3  ");
    Button four=new Button("  4  ");
    Button five=new Button("  5  ");
    Button six=new Button("  6  ");
    Button seven=new Button("  7  ");
    Button eight=new Button("  8  ");
    Button nine=new Button("  9  ");
    Button del=new Button("Del ");
    
    Button Okay=null;
    
    Button clc=new Button(" clc ");
        
         GridPane gridOfWithdrawalPage=new GridPane();
          
          zero.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         { number1+="0";
         char c=number1.charAt(0);
        if(c=='0')
        { 
      StringBuffer sb= new StringBuffer(number1);
      sb.deleteCharAt(0);number1=new String(sb);
        }
        else{ WithdrawalResult.setText(number1);}
             
             
         
         }
         
         
         
         
         
     }
         );
          
          one.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number1+="1";
             WithdrawalResult.setText(number1);
         
         }
         
         
         
         
         
     }
         );
          two.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number1+="2";
             WithdrawalResult.setText(number1);
             
         
         }
         
         
         
         
         
     }
         );
          three.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number1+="3";
             WithdrawalResult.setText(number1);
         
         }
         
         
         
         
         
     }
         );
          four.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number1+="4";
             WithdrawalResult.setText(number1);
         
         }
         
         
         
         
         
     }
         );
          five.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number1+="5";
             WithdrawalResult.setText(number1);
         
         }
         
         
         
         
         
     }
         );
          six.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             
         number1+="6";
             WithdrawalResult.setText(number1);
         }
         
         
         
         
         
     }
         );
          seven.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number1+="7";
             WithdrawalResult.setText(number1);
         
         }
         
         
         
         
         
     }
         );
          eight.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             
         number1+="8";
             WithdrawalResult.setText(number1);
         }
         
         
         
         
         
     }
         );
          nine.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             number1+="9";
             WithdrawalResult.setText(number1);
         
         }
         
         
         
         
         
     }
         );
          
          String x=new String();
         
        confirm.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {
             if(His>4)
         {      His=0; }
             if((His>=0&&His<=4))
             {
             if(number1.equals(x))
            {popup(Okay,"Please enter the number");}
         else if(number1.length()<=9){
             int withDrawalNumber=Integer.parseInt(number1);
             customer.withdrawal(withDrawalNumber);
             
             double Balance=customer.getBalance();
             
             if(withDrawalNumber>Balance)
             {
                 popup(Okay,"The WithDrawal value biggger than Balance\nPlease enter again");}
             else{ArrayOfWithdrawal[His]=withDrawalNumber;
             ArrayOfBalance[His]=(int)Balance;Lastinput=His;
             His++;}
         String newBalance1=String.valueOf(Balance);
             WithdrawalField.setText(newBalance1);
            number1="";
             WithdrawalResult.setText(number1);}
         else
         {popup(Okay,"the number is too long \n please enter number again ");}
         
         }}
         
         
         
         
         
     }
         );
        
        clc.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number1="";
          WithdrawalResult.setText("");
         } });
        
        
        Back.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {number1="";
          WithdrawalResult.setText("");
             primaryStage.setScene(prepareHomepage());
         }}
         );
        
        del.setOnAction(new EventHandler<ActionEvent>()  {@Override
         public void handle (ActionEvent event)
         {if(number1.equals(x))
            {popup(Okay,"Please enter the number");}
         else{
             String str = number1;
           StringBuffer sb= new StringBuffer(str);
           sb.deleteCharAt(sb.length()-1);
           number1=new String(sb);
           WithdrawalResult.setText(number1);}
         } }
         );
        
        
        
         gridOfWithdrawalPage.add( WithdrawalLabel , 3 ,  1);
         gridOfWithdrawalPage.add( WithdrawalResult, 4, 1);
         gridOfWithdrawalPage.add( confirm , 3,  3);
         gridOfWithdrawalPage.add( zero , 1,  4);
         gridOfWithdrawalPage.add( one , 0,  1);
         gridOfWithdrawalPage.add( two , 1,  1);
         gridOfWithdrawalPage.add( three , 2,  1);
         gridOfWithdrawalPage.add( four , 0,  2);
         gridOfWithdrawalPage.add( five , 1,  2);
         gridOfWithdrawalPage.add( six , 2,  2);
         gridOfWithdrawalPage.add( seven , 0, 3);
         gridOfWithdrawalPage.add( eight , 1,  3);
         gridOfWithdrawalPage.add( nine , 2,  3);
         gridOfWithdrawalPage.add( WithdrawalField , 4,  5);
         gridOfWithdrawalPage.add( Balance , 3,  5);
         gridOfWithdrawalPage.add( Back , 1,  6);
         gridOfWithdrawalPage.add( del , 0,  4);
         gridOfWithdrawalPage.add( clc , 2,  4);
         
         withdrawalPage=new Scene(gridOfWithdrawalPage,300,300);
    
    
    
    return withdrawalPage;}
     
     //////////////////////////////////////////////////////////////////////////////////////////////
      
     
      void popup(Button Okay,String message)
      {Stage AlertStage=new Stage();
      AlertStage.setTitle("Alert");
      Scene Alertscene ;
      Label AlertMessage=new Label(message);
      Okay =new Button ("okay");
      Okay.setOnAction(e ->AlertStage.close());
      GridPane GridOfAlert = new GridPane();
      GridOfAlert.add(AlertMessage, 0, 0);
      GridOfAlert.add(Okay, 1, 1);
       Alertscene=new Scene(GridOfAlert,280,80);
      AlertStage.setScene(Alertscene);
      AlertStage.show();
      
      }
      
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    

