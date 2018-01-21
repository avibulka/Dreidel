
package net.drscoding.dreidel;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    AnimationDrawable dreidelAnimation;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView imgFrame= (ImageView) findViewById(R.id.imageView1);
        imgFrame.setBackgroundResource(R.drawable.animation);
        dreidelAnimation=(AnimationDrawable) imgFrame.getBackground();

        Button button1= (Button) findViewById(R.id.btnSpin);
        Button button2= (Button) findViewById(R.id.btnStop);

        dreidelAnimation.stop();

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dreidelAnimation.start();
            }});

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

         double rand = (Math.random()*4)+1;
                rand = (int) (Math.random()*4) +1;

                if (rand==1){
                    startActivity(new Intent(MainActivity.this, Shin.class));
                }
                else if (rand==2){

                    startActivity(new Intent(MainActivity.this, Hey.class));

                }
                else if (rand ==3) {

                    startActivity(new Intent(MainActivity.this, Nun.class));

                }
                else if (rand ==4) {
                    startActivity(new Intent(MainActivity.this, Gimel.class));


                }



            }
        }
                                  );
    }
}
