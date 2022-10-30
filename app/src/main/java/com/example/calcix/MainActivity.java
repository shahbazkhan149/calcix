package com.example.calcix;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;


import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3, button4, button5,button6,button7,button8,button9,button10,add,minus,div,mul,dot,clear,equal;
    EditText nums,nums2;
    TextView result;
    public String finalres;

    @SuppressLint("ClickableViewAccessibility")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1= findViewById(R.id.button1);
        button2= findViewById(R.id.button2);
        button3= findViewById(R.id.button3);
        button4= findViewById(R.id.button4);
        button5= findViewById(R.id.button5);
        button6= findViewById(R.id.button6);
        button7= findViewById(R.id.button7);
        button8= findViewById(R.id.button8);
        button9= findViewById(R.id.button9);
        button10= findViewById(R.id.button10);
        add= findViewById(R.id.add);
        minus= findViewById(R.id.minus);
        div= findViewById(R.id.div);
        mul= findViewById(R.id.mul);
        dot= findViewById(R.id.dot);
        clear= findViewById(R.id.clear);
        equal= findViewById(R.id.equal);

        nums=findViewById(R.id.nums);
        nums2=findViewById(R.id.nums2);
        nums.setShowSoftInputOnFocus(false);
        nums2.setShowSoftInputOnFocus(false);
        result=findViewById(R.id.result);



        nums.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("1");
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("2");
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("3");
                    }
                });
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("4");
                    }
                });
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("5");
                    }
                });
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("6");
                    }
                });
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("7");
                    }
                });
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("8");
                    }
                });
                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("9");
                    }
                });
                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append("0");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums.append(".");
                    }
                });
                return true;

            }
        });

        nums2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("1");
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("2");
                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("3");
                    }
                });
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("4");
                    }
                });
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("5");
                    }
                });
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("6");
                    }
                });
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("7");
                    }
                });
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("8");
                    }
                });
                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("9");
                    }
                });
                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append("0");
                    }
                });
                dot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        nums2.append(".");
                    }
                });
                return true;

            }
        });
//        Double n1= Double.parseDouble(nums.getText().toString());
//        Double n2= Double.parseDouble(nums2.getText().toString());
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(nums.getText().toString()) && !TextUtils.isEmpty(nums2.getText().toString())) {
                    Double n1 = Double.parseDouble(nums.getText().toString());
                    Double n2 = Double.parseDouble(nums2.getText().toString());
                    double addition = n1 + n2;
                    finalres = Double.valueOf(addition).toString();
                }
                else{
                    Toast.makeText(MainActivity.this, "enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(nums.getText().toString()) && !TextUtils.isEmpty(nums2.getText().toString())) {
                    Double n1 = Double.parseDouble(nums.getText().toString());
                    Double n2 = Double.parseDouble(nums2.getText().toString());
                    double multiply = n1 * n2;
                    finalres = Double.valueOf(multiply).toString();
                }
                else{
                    Toast.makeText(MainActivity.this, "enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(nums.getText().toString()) && !TextUtils.isEmpty(nums2.getText().toString())) {
                    Double n1 = Double.parseDouble(nums.getText().toString());
                    Double n2 = Double.parseDouble(nums2.getText().toString());
                    double division = n1 / n2;
                    finalres = Double.valueOf(division).toString();
                }
                else{
                    Toast.makeText(MainActivity.this, "enter a value", Toast.LENGTH_SHORT).show();
                }

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(nums.getText().toString()) && !TextUtils.isEmpty(nums2.getText().toString())) {
                    Double n1 = Double.parseDouble(nums.getText().toString());
                    Double n2 = Double.parseDouble(nums2.getText().toString());
                    double subtract = n1 - n2;
                    finalres = Double.valueOf(subtract).toString();
                }
                else{
                    Toast.makeText(MainActivity.this, "enter a value", Toast.LENGTH_SHORT).show();
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(finalres.endsWith(".0")){
                finalres=finalres.replace(".0"," ");
            }
                    result.setText(String.valueOf(finalres));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nums.setText(" ");
                nums2.setText(" ");
                result.setText(" ");
                Toast.makeText(MainActivity.this, "Cleared", Toast.LENGTH_SHORT).show();


            }
        });



    }
}

