package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btn_num1;
	Button btn_num2;
	Button btn_num3;
	Button btn_num4;
	Button btn_num5;
	Button btn_num6;
	Button btn_num7;
	Button btn_num8;
	Button btn_num9;
	Button btn_num0;
	Button btnAdd;
	Button btnJian;
	Button btnCheng;
	Button btnChu;
	Button btnEqual;
	Button btnPoint;
	Button btnDel;
	Button btnClear;
	OnClickListener listener0 = null;
	OnClickListener listener1 = null;
	OnClickListener listener2 = null;
	OnClickListener listener3 = null;
	OnClickListener listener4 = null;
	OnClickListener listener5 = null;
	OnClickListener listener6 = null;
	OnClickListener listener7 = null;
	OnClickListener listener8 = null;
	OnClickListener listener9 = null;
	OnClickListener listenerAdd = null;
	OnClickListener listenerJian = null;
	OnClickListener listenerCheng = null;
	OnClickListener listenerChu = null;
	OnClickListener listenerEqual = null;
	OnClickListener listenerPoint = null;
	OnClickListener listenerDel = null;
	OnClickListener listenerClear = null;
	EditText displayText;
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	int CalType = 0;
	boolean EquBtnDownFlag = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// getWindow().setBackgroundDrawableResource(R.drawable.tmac);//背景图片
		displayText = (EditText) findViewById(R.id.editText1);
		displayText.setText(null);
		btn_num0 = (Button) findViewById(R.id.button16);
		btn_num1 = (Button) findViewById(R.id.button11);
		btn_num2 = (Button) findViewById(R.id.button12);
		btn_num3 = (Button) findViewById(R.id.button13);
		btn_num4 = (Button) findViewById(R.id.button7);
		btn_num5 = (Button) findViewById(R.id.button8);
		btn_num6 = (Button) findViewById(R.id.button9);
		btn_num7 = (Button) findViewById(R.id.button3);
		btn_num8 = (Button) findViewById(R.id.button4);
		btn_num9 = (Button) findViewById(R.id.button5);
		btnAdd = (Button) findViewById(R.id.button18);
		btnJian = (Button) findViewById(R.id.button14);
		btnCheng = (Button) findViewById(R.id.button10);
		btnChu = (Button) findViewById(R.id.button6);
		btnEqual = (Button) findViewById(R.id.button17);
		btnPoint = (Button) findViewById(R.id.button15);
		btnDel = (Button) findViewById(R.id.button2);
		btnClear = (Button) findViewById(R.id.button1);
		listener0 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "0";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener1 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "1";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener2 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "2";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener3 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "3";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener4 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "4";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener5 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "5";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener6 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "6";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener7 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "7";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener8 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "8";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listener9 = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += "9";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listenerPoint = new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (EquBtnDownFlag) {
					displayText.setText(null);
					EquBtnDownFlag = false;
				}
				CharSequence temp = displayText.getText();
				String myString = temp.toString();
				myString += ".";
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};
		listenerAdd = new OnClickListener() {

			@Override
			public void onClick(View v) {
				CharSequence temp = displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString = temp.toString();
				num1 = Double.parseDouble(myString);
				CalType = 1;
				displayText.setText(null);
			}
		};
		listenerJian = new OnClickListener() {

			@Override
			public void onClick(View v) {
				CharSequence temp = displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString = temp.toString();
				num1 = Double.parseDouble(myString);
				CalType = 2;
				displayText.setText(null);
			}
		};
		listenerCheng = new OnClickListener() {

			@Override
			public void onClick(View v) {
				CharSequence temp = displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString = temp.toString();
				num1 = Double.parseDouble(myString);
				CalType = 3;
				displayText.setText(null);
			}
		};
		listenerChu = new OnClickListener() {

			@Override
			public void onClick(View v) {
				CharSequence temp = displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString = temp.toString();
				num1 = Double.parseDouble(myString);
				CalType = 4;
				displayText.setText(null);
			}
		};
		listenerEqual = new OnClickListener() {

			@Override
			public void onClick(View v) {
				CharSequence temp = displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString = temp.toString();
				num2 = Double.parseDouble(myString);
				switch (CalType) {
				case 0:
					result = num2;
					break;
				case 1:
					result = num1 + num2;
					break;
				case 2:
					result = num1 - num2;
					break;
				case 3:
					result = num1 * num2;
					break;
				case 4:
					result = num1 / num2;
					break;
				default:
					result = 0;
					break;
				}
				String temp_result = String.valueOf(result);
				displayText.setText(temp_result);
				EquBtnDownFlag = true;
				displayText.setSelection(temp_result.length());
			}
		};
		listenerClear = new OnClickListener() {

			@Override
			public void onClick(View v) {
				displayText.setText(null);
			}
		};
		listenerDel = new OnClickListener() {

			@Override
			public void onClick(View v) {
				CharSequence temp = displayText.getText();
				if (temp.equals(null)) {
					return;
				}
				String myString = temp.toString();
				if (myString.length() > 0)
					myString = myString.substring(0, myString.length() - 1);
				displayText.setText(myString);
				displayText.setSelection(myString.length());
			}
		};

		btn_num0.setOnClickListener(listener0);
		btn_num1.setOnClickListener(listener1);
		btn_num2.setOnClickListener(listener2);
		btn_num3.setOnClickListener(listener3);
		btn_num4.setOnClickListener(listener4);
		btn_num5.setOnClickListener(listener5);
		btn_num6.setOnClickListener(listener6);
		btn_num7.setOnClickListener(listener7);
		btn_num8.setOnClickListener(listener8);
		btn_num9.setOnClickListener(listener9);
		btnAdd.setOnClickListener(listenerAdd);
		btnJian.setOnClickListener(listenerJian);
		btnCheng.setOnClickListener(listenerCheng);
		btnChu.setOnClickListener(listenerChu);
		btnPoint.setOnClickListener(listenerPoint);
		btnDel.setOnClickListener(listenerDel);
		btnClear.setOnClickListener(listenerClear);
		btnEqual.setOnClickListener(listenerEqual);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
