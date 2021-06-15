package com.example.vanthiruplease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    int n1;
    int score;
    int dayOfWeek;
    TextView txt;
    String m1;
    String m2;
    String m3;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    String a1;
    String a2;
    String a3;
    String a4;
    Date date;
    String dt;
    String weekDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt = findViewById(R.id.text_view);



        Random num = new Random();
        int n1 = 1 + num.nextInt(12);
        int n2 = 1 + num.nextInt(28);
        int n3 = 1990 + num.nextInt(30);
        String a = Integer.toString(n2) + "/" + Integer.toString(n1) + "/" + Integer.toString(n3);
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(a);

            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            if (Calendar.MONDAY == dayOfWeek) {
                weekDay = "monday";
            } else if (Calendar.TUESDAY == dayOfWeek) {
                weekDay = "tuesday";
            } else if (Calendar.WEDNESDAY == dayOfWeek) {
                weekDay = "wednesday";
            } else if (Calendar.THURSDAY == dayOfWeek) {
                weekDay = "thursday";
            } else if (Calendar.FRIDAY == dayOfWeek) {
                weekDay = "friday";
            } else if (Calendar.SATURDAY == dayOfWeek) {
                weekDay = "saturday";
            } else if (Calendar.SUNDAY == dayOfWeek) {
                weekDay = "sunday";
            }
            txt.setText("Guess the day: " + a);

            List<String> list = new ArrayList<String>();
            list.add("monday");
            list.add("tuesday");
            list.add("wednesday");
            list.add("thursday");
            list.add("friday");
            list.add("saturday");
            list.add("sunday");
            Collections.shuffle(list);
            list.remove(weekDay);

            m1 = list.get(0);
            m2 = list.get(1);
            m3 = list.get(2);

            List<String> list1 = new ArrayList<String>();
            list1.add(m1);
            list1.add(m2);
            list1.add(m3);
            list1.add(weekDay);
            Collections.shuffle(list1);

            a1 = list1.get(0);
            a2 = list1.get(1);
            a3 = list1.get(2);
            a4 = list1.get(3);


            Button btn1 = (Button) findViewById(R.id.btn1);
            btn1.setText(a1);
            Button btn2 = (Button) findViewById(R.id.btn2);
            btn2.setText(a2);
            Button btn3 = (Button) findViewById(R.id.btn3);
            btn3.setText(a3);
            Button btn4 = (Button) findViewById(R.id.btn4);
            btn4.setText(a4);


        } catch (ParseException e) {
            e.printStackTrace();

        }


    }

    public void submitOrder1(View view) {
        if (a1 == weekDay) {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Correct Answer");
            score = score + 10;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            txt = findViewById(R.id.text_view);



            Random num = new Random();
            int n1 = 1 + num.nextInt(12);
            int n2 = 1 + num.nextInt(28);
            int n3 = 1990 + num.nextInt(30);
            String a = Integer.toString(n2) + "/" + Integer.toString(n1) + "/" + Integer.toString(n3);
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(a);

                Calendar c = Calendar.getInstance();
                c.setTime(date);
                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                if (Calendar.MONDAY == dayOfWeek) {
                    weekDay = "monday";
                } else if (Calendar.TUESDAY == dayOfWeek) {
                    weekDay = "tuesday";
                } else if (Calendar.WEDNESDAY == dayOfWeek) {
                    weekDay = "wednesday";
                } else if (Calendar.THURSDAY == dayOfWeek) {
                    weekDay = "thursday";
                } else if (Calendar.FRIDAY == dayOfWeek) {
                    weekDay = "friday";
                } else if (Calendar.SATURDAY == dayOfWeek) {
                    weekDay = "saturday";
                } else if (Calendar.SUNDAY == dayOfWeek) {
                    weekDay = "sunday";
                }
                txt.setText("Guess the day: " + a);

                List<String> list = new ArrayList<String>();
                list.add("monday");
                list.add("tuesday");
                list.add("wednesday");
                list.add("thursday");
                list.add("friday");
                list.add("saturday");
                list.add("sunday");
                Collections.shuffle(list);
                list.remove(weekDay);

                m1 = list.get(0);
                m2 = list.get(1);
                m3 = list.get(2);

                List<String> list1 = new ArrayList<String>();
                list1.add(m1);
                list1.add(m2);
                list1.add(m3);
                list1.add(weekDay);
                Collections.shuffle(list1);

                a1 = list1.get(0);
                a2 = list1.get(1);
                a3 = list1.get(2);
                a4 = list1.get(3);


                Button btn1 = (Button) findViewById(R.id.btn1);
                btn1.setText(a1);
                Button btn2 = (Button) findViewById(R.id.btn2);
                btn2.setText(a2);
                Button btn3 = (Button) findViewById(R.id.btn3);
                btn3.setText(a3);
                Button btn4 = (Button) findViewById(R.id.btn4);
                btn4.setText(a4);


            } catch (ParseException e) {
                e.printStackTrace();

            }




        } else {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Wrong answer");
            score = score+0;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);



        }


    }
    public void submitOrder2(View view) {
        if (a2 == weekDay) {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Correct Answer");
            score = score + 10;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            txt = findViewById(R.id.text_view);



            Random num = new Random();
            int n1 = 1 + num.nextInt(12);
            int n2 = 1 + num.nextInt(28);
            int n3 = 1990 + num.nextInt(30);
            String a = Integer.toString(n2) + "/" + Integer.toString(n1) + "/" + Integer.toString(n3);
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(a);

                Calendar c = Calendar.getInstance();
                c.setTime(date);
                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                if (Calendar.MONDAY == dayOfWeek) {
                    weekDay = "monday";
                } else if (Calendar.TUESDAY == dayOfWeek) {
                    weekDay = "tuesday";
                } else if (Calendar.WEDNESDAY == dayOfWeek) {
                    weekDay = "wednesday";
                } else if (Calendar.THURSDAY == dayOfWeek) {
                    weekDay = "thursday";
                } else if (Calendar.FRIDAY == dayOfWeek) {
                    weekDay = "friday";
                } else if (Calendar.SATURDAY == dayOfWeek) {
                    weekDay = "saturday";
                } else if (Calendar.SUNDAY == dayOfWeek) {
                    weekDay = "sunday";
                }
                txt.setText("Guess the day: " + a);

                List<String> list = new ArrayList<String>();
                list.add("monday");
                list.add("tuesday");
                list.add("wednesday");
                list.add("thursday");
                list.add("friday");
                list.add("saturday");
                list.add("sunday");
                Collections.shuffle(list);
                list.remove(weekDay);

                m1 = list.get(0);
                m2 = list.get(1);
                m3 = list.get(2);

                List<String> list1 = new ArrayList<String>();
                list1.add(m1);
                list1.add(m2);
                list1.add(m3);
                list1.add(weekDay);
                Collections.shuffle(list1);

                a1 = list1.get(0);
                a2 = list1.get(1);
                a3 = list1.get(2);
                a4 = list1.get(3);


                Button btn1 = (Button) findViewById(R.id.btn1);
                btn1.setText(a1);
                Button btn2 = (Button) findViewById(R.id.btn2);
                btn2.setText(a2);
                Button btn3 = (Button) findViewById(R.id.btn3);
                btn3.setText(a3);
                Button btn4 = (Button) findViewById(R.id.btn4);
                btn4.setText(a4);


            } catch (ParseException e) {
                e.printStackTrace();

            }



        } else {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Wrong answer");
            score = score+0;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }


    }
    public void submitOrder3(View view) {
        if (a3 == weekDay) {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Correct Answer");
            score = score+10;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            txt = findViewById(R.id.text_view);



            Random num = new Random();
            int n1 = 1 + num.nextInt(12);
            int n2 = 1 + num.nextInt(28);
            int n3 = 1990 + num.nextInt(30);
            String a = Integer.toString(n2) + "/" + Integer.toString(n1) + "/" + Integer.toString(n3);
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(a);

                Calendar c = Calendar.getInstance();
                c.setTime(date);
                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                if (Calendar.MONDAY == dayOfWeek) {
                    weekDay = "monday";
                } else if (Calendar.TUESDAY == dayOfWeek) {
                    weekDay = "tuesday";
                } else if (Calendar.WEDNESDAY == dayOfWeek) {
                    weekDay = "wednesday";
                } else if (Calendar.THURSDAY == dayOfWeek) {
                    weekDay = "thursday";
                } else if (Calendar.FRIDAY == dayOfWeek) {
                    weekDay = "friday";
                } else if (Calendar.SATURDAY == dayOfWeek) {
                    weekDay = "saturday";
                } else if (Calendar.SUNDAY == dayOfWeek) {
                    weekDay = "sunday";
                }
                txt.setText("Guess the day: " + a);

                List<String> list = new ArrayList<String>();
                list.add("monday");
                list.add("tuesday");
                list.add("wednesday");
                list.add("thursday");
                list.add("friday");
                list.add("saturday");
                list.add("sunday");
                Collections.shuffle(list);
                list.remove(weekDay);

                m1 = list.get(0);
                m2 = list.get(1);
                m3 = list.get(2);

                List<String> list1 = new ArrayList<String>();
                list1.add(m1);
                list1.add(m2);
                list1.add(m3);
                list1.add(weekDay);
                Collections.shuffle(list1);

                a1 = list1.get(0);
                a2 = list1.get(1);
                a3 = list1.get(2);
                a4 = list1.get(3);


                Button btn1 = (Button) findViewById(R.id.btn1);
                btn1.setText(a1);
                Button btn2 = (Button) findViewById(R.id.btn2);
                btn2.setText(a2);
                Button btn3 = (Button) findViewById(R.id.btn3);
                btn3.setText(a3);
                Button btn4 = (Button) findViewById(R.id.btn4);
                btn4.setText(a4);


            } catch (ParseException e) {
                e.printStackTrace();

            }





        } else {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Wrong answer");
            score = score+0;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }


    }
    public void submitOrder4(View view) {
        if (a4 == weekDay) {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Correct Answer");
            score = score + 10;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            txt = findViewById(R.id.text_view);



            Random num = new Random();
            int n1 = 1 + num.nextInt(12);
            int n2 = 1 + num.nextInt(28);
            int n3 = 1990 + num.nextInt(30);
            String a = Integer.toString(n2) + "/" + Integer.toString(n1) + "/" + Integer.toString(n3);
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(a);

                Calendar c = Calendar.getInstance();
                c.setTime(date);
                int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
                if (Calendar.MONDAY == dayOfWeek) {
                    weekDay = "monday";
                } else if (Calendar.TUESDAY == dayOfWeek) {
                    weekDay = "tuesday";
                } else if (Calendar.WEDNESDAY == dayOfWeek) {
                    weekDay = "wednesday";
                } else if (Calendar.THURSDAY == dayOfWeek) {
                    weekDay = "thursday";
                } else if (Calendar.FRIDAY == dayOfWeek) {
                    weekDay = "friday";
                } else if (Calendar.SATURDAY == dayOfWeek) {
                    weekDay = "saturday";
                } else if (Calendar.SUNDAY == dayOfWeek) {
                    weekDay = "sunday";
                }
                txt.setText("Guess the day: " + a);

                List<String> list = new ArrayList<String>();
                list.add("monday");
                list.add("tuesday");
                list.add("wednesday");
                list.add("thursday");
                list.add("friday");
                list.add("saturday");
                list.add("sunday");
                Collections.shuffle(list);
                list.remove(weekDay);

                m1 = list.get(0);
                m2 = list.get(1);
                m3 = list.get(2);

                List<String> list1 = new ArrayList<String>();
                list1.add(m1);
                list1.add(m2);
                list1.add(m3);
                list1.add(weekDay);
                Collections.shuffle(list1);

                a1 = list1.get(0);
                a2 = list1.get(1);
                a3 = list1.get(2);
                a4 = list1.get(3);


                Button btn1 = (Button) findViewById(R.id.btn1);
                btn1.setText(a1);
                Button btn2 = (Button) findViewById(R.id.btn2);
                btn2.setText(a2);
                Button btn3 = (Button) findViewById(R.id.btn3);
                btn3.setText(a3);
                Button btn4 = (Button) findViewById(R.id.btn4);
                btn4.setText(a4);




            } catch (ParseException e) {
                e.printStackTrace();

            }



        }
        else {
            TextView textView = (TextView) findViewById(R.id.text_view1);
            textView.setText("Wrong answer");

            score = score +0;
            textView = (TextView) findViewById(R.id.text_view2);
            textView.setText("Total Score: "+Integer.toString(score));
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);




        }


    }
}