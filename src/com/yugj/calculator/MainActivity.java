package com.yugj.calculator;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.yugj.calcutor.R;


public class MainActivity extends Activity {
    private static MediaPlayer player = null;
    private static Vibrator vibrator = null;
    private static final Long VIBRATOR_LENGTH = 50L;
    private static ButtonListener numberButtonListener = null;
    private static ButtonListener operateButtonListener = null;
    private static ButtonListener equalButtonListener = null;
    private static ButtonListener clearButtonListener = null;

    private static Button clearBtn = null;
    private static Button deleteBtn = null;
    private static Button divideBtn = null;
    private static Button multiplyBtn = null;
    private static Button sevenBtn = null;
    private static Button eightBtn = null;
    private static Button nineBtn = null;
    private static Button subtractBtn = null;
    private static Button fourBtn = null;
    private static Button fiveBtn = null;
    private static Button sixBtn = null;
    private static Button addBtn = null;
    private static Button oneBtn = null;
    private static Button twoBtn = null;
    private static Button threeBtn = null;
    private static Button zeroBtn = null;
    private static Button pointBtn = null;
    private static Button equalBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        numberButtonListener = new NumberButtonListener();
        operateButtonListener = new OperateButtonListener();
        equalButtonListener = new EqualButtonListener();
        clearButtonListener = new ClearButtonListener();
        initBtn();
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //playMusic(R.raw.click);
            vibrator.vibrate(VIBRATOR_LENGTH);
        }
    }

    private final class NumberButtonListener extends ButtonListener {
        @Override
        public void onClick(View v) {
            super.onClick(v);
            System.out.println("test");
        }
    }

    private final class OperateButtonListener extends ButtonListener {
        @Override
        public void onClick(View v) {
            super.onClick(v);
            //do sth
        }
    }

    private final class ClearButtonListener extends ButtonListener {
        @Override
        public void onClick(View v) {
            super.onClick(v);
            //do sth
        }
    }

    private final class EqualButtonListener extends ButtonListener {
        @Override
        public void onClick(View v) {
            super.onClick(v);
            //do sth
        }
    }

    /**
     * 
     * @param musicId
     */
    private void playMusic(int musicId) {
       /* if(null == player) {
            player = MediaPlayer.create(this, musicId);
        }
        player.start();*/
    }

    private void initBtn() {
        clearBtn = getButton(R.id.id_clear);
        deleteBtn = getButton(R.id.id_delete);
        divideBtn = getButton(R.id.id_divide);
        multiplyBtn = getButton(R.id.id_multiply);
        sevenBtn = getButton(R.id.id_seven);
        eightBtn = getButton(R.id.id_eight);
        nineBtn = getButton(R.id.id_nine);
        subtractBtn = getButton(R.id.id_subtract);
        fourBtn = getButton(R.id.id_four);
        fiveBtn = getButton(R.id.id_five);
        sixBtn = getButton(R.id.id_six);
        addBtn = getButton(R.id.id_add);
        oneBtn = getButton(R.id.id_one);
        twoBtn = getButton(R.id.id_two);
        threeBtn = getButton(R.id.id_three);
        equalBtn = getButton(R.id.id_equal);
        zeroBtn = getButton(R.id.id_zero);
        pointBtn = getButton(R.id.id_point);

        clearBtn.setOnClickListener(clearButtonListener);
        deleteBtn.setOnClickListener(clearButtonListener);
        divideBtn.setOnClickListener(operateButtonListener);
        multiplyBtn.setOnClickListener(operateButtonListener);
        sevenBtn.setOnClickListener(numberButtonListener);
        eightBtn.setOnClickListener(numberButtonListener);
        nineBtn.setOnClickListener(numberButtonListener);
        subtractBtn.setOnClickListener(operateButtonListener);
        fourBtn.setOnClickListener(numberButtonListener);
        fiveBtn.setOnClickListener(numberButtonListener);
        sixBtn.setOnClickListener(numberButtonListener);
        addBtn.setOnClickListener(operateButtonListener);
        oneBtn.setOnClickListener(numberButtonListener);
        twoBtn.setOnClickListener(numberButtonListener);
        threeBtn.setOnClickListener(numberButtonListener);
        equalBtn.setOnClickListener(equalButtonListener);
        zeroBtn.setOnClickListener(numberButtonListener);
        pointBtn.setOnClickListener(numberButtonListener);

    }

    private Button getButton(int id) {
        return (Button) findViewById(id);
    }
}
