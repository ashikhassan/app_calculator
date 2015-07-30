package com.emythmakers.ashikhassan.calculater;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView showResult;
    Character operator='0';
    int num;
    int temNum;
    String string="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult=(TextView)findViewById(R.id.result_id);
    }
    public  void btn7Clicked(View v){
        insert(7);


    }
    public  void btn8Clicked(View v){
        insert(8);


    }
    public  void btn9Clicked(View v){
        insert(9);


    }
    public  void btn6Clicked(View v){
        insert(6);


    }
    public  void btn5Clicked(View v){
        insert(5);


    }
    public  void btn4Clicked(View v){
        insert(4);


    }
    public  void btn3Clicked(View v){
        insert(3);


    }
    public  void btn2Clicked(View v){
        insert(2);


    }
    public  void btn1Clicked(View v){
        insert(1);


    }
    public  void btnClearClicked(View v){
        string="";
        operator='0';
        num=0;
        temNum=0;
        showResult.setText("");



    }
    public  void btnPlusClicked(View v){
        operation();
        operator='+';



    }
    public  void btnMinusClicked(View v){
        operation();
        operator='-';


    }
    public  void btnEqualClicked(View v){
        calculate();


    }
    public  void btnDivideClicked(View v){
        operation();
        operator='/';


    }
    public  void btnMultiClicked(View v) {
        operation();
        operator='*';


    }
    public void insert(int i){
        string=string+Integer.toString(i);
        num=Integer.valueOf(string);
        showResult.setText(string);


    }
    public void operation(){
        string="";
        temNum=num;

    }
    public void calculate(){
        if (operator=='+'){
            num=temNum+num;

        }
        else  if(operator=='-'){
            num=temNum-num;

        }
        else  if(operator=='*'){
            num=temNum*num;

        }
        else  if(operator=='/'){
            num=temNum/num;

        }
        showResult.setText(Integer.toString(num));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
