package netvine.ighub.calculatooo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity{

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private  Button btnDot, btnPlus, btnMinus, btnAnswer;
    private   Button btnDivide, btnClear, btnRemainder, btnMultiply;


        EditText etNum;
        TextView tvNum;

            double mValueOne;
            double mValueTwo;
            boolean Addition, Subtraction, Multiply, Division, Decimal,Remainder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnAnswer = (Button) findViewById(R.id.btnAnswer);
        tvNum = (TextView) findViewById(R.id.tvNum);
        etNum = (EditText) findViewById(R.id.etNum);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnRemainder = (Button) findViewById(R.id.btnRemainder);



               btn0.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText()+"0");
                      tvNum.setText(tvNum.getText()+ "0");
                   }
               });


               btn1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText()+ "1");
                       tvNum.setText(tvNum.getText()+ "1");
                   }
               });



               btn2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText()+ "2");
                       tvNum.setText(tvNum.getText()+ "2");
                   }
               });


               btn3.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText()+ "3");
                       tvNum.setText(tvNum.getText()+ "3");
                   }
               });


               btn4.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       tvNum.setText(etNum.getText()+ "4");
                       tvNum.setText(tvNum.getText()+ "4");
                   }
               });

               btn5.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(tvNum.getText()+ "5");
                       tvNum.setText(tvNum.getText()+ "5");
                   }
               });


               btn6.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText()+ "6");
                       tvNum.setText(tvNum.getText()+ "6");
                   }
               });


               btn7.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText()+ "7");
                       tvNum.setText(tvNum.getText()+ "7");
                   }
               });

               btn9.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText()+ "9");
                       tvNum.setText(tvNum.getText()+ "9");
                       tvNum.setText("");
                   }
               });


               btnDot.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if (Decimal) {
                           //do nothing or you can show the error
                       } else {
                           etNum.setText(etNum.getText() + ".");
                           Decimal = true;
                       }

                   }
               });

                btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                 public void onClick(View view) {
                etNum.setText(etNum.getText()+ "8");
                tvNum.setText(tvNum.getText()+ "8");
                tvNum.setText("");
            }
        });

               btn9.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText(etNum.getText() + "9");
                       tvNum.setText(tvNum.getText()+ "9");
                       tvNum.setText("");
                   }
               });


               btnPlus.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if (etNum.getText().length() !=0) {
                           mValueOne = Float.parseFloat(etNum.getText() + "");
                           Addition = true;
                           Decimal = false;
                           etNum.setText("");
                           tvNum.setText("");
                           etNum.setText(null);
                       }
                   }
               });



               btnClear.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       etNum.setText("");
                       tvNum.setText("");
                       mValueOne = 0.0;
                       mValueTwo = 0.0;
                   }
               });



               btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (etNum.getText().length() != 0) {
                        mValueOne = Float.parseFloat(etNum.getText() + "");
                        Subtraction = true;
                        Decimal = false;
                        etNum.setText("");
                        tvNum.setText("");

                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etNum.getText().length() !=0) {
                    mValueOne = Float.parseFloat(etNum.getText() + "");
                    Addition = true;
                    Decimal = false;
                    etNum.setText("");
                    tvNum.setText("");

                }
            }
        });




        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtraction || Multiply || Division) {
                    mValueTwo = Float.parseFloat(etNum.getText() + "");
                }

                    if (Addition) {

                        etNum.setText(mValueOne + mValueTwo + "");
                        Addition = false;
                        tvNum.setText("");
                    }

                    if (Subtraction) {

                        etNum.setText(mValueOne - mValueTwo + "");
                        Subtraction = false;
                        tvNum.setText("");
                    }

                    if (Multiply) {
                        etNum.setText(mValueOne * mValueTwo + "");
                        Multiply = false;
                        tvNum.setText("");
                    }
                    if (Division) {
                        etNum.setText(mValueOne / mValueTwo + "");
                        Division = false;
                    }
                    if (Remainder) {
                        etNum.setText(mValueOne % mValueTwo + "");
                        Remainder = false;
                    }
                }
            });
        }
    }