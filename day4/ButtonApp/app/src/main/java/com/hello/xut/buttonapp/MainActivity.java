package com.hello.xut.buttonapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.security.PrivateKey;
import java.util.HashSet;
import java.util.Set;


public class MainActivity extends Activity {
     private RadioGroup group;
     private CheckBox box1,box2,box3;
     private Set<String> hobby=new HashSet<String>();
     private Switch s1;
     private ToggleButton s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s2=(ToggleButton)findViewById(R.id.s2);
        s2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    group.setOrientation(LinearLayout.VERTICAL);
                }else{
                    group.setOrientation(LinearLayout.HORIZONTAL);
                }
            }
        });




        s1=(Switch)findViewById(R.id.s1);
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this,"您选择了开",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"您选择了关",Toast.LENGTH_SHORT).show();
                }
            }
        });




        box1=(CheckBox)findViewById(R.id.basketball);
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b) {
                    hobby.add("篮球");
                } else {
                    if (hobby.contains("篮球")) hobby.remove("篮球");
                }
                Toast.makeText(MainActivity.this,"您选择了"+hobby.toString(),Toast.LENGTH_SHORT).show();
            }

        });
        box2=(CheckBox)findViewById(R.id.football);
        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    hobby.add("足球");
                }else{
                    if(hobby.contains("足球"))hobby.remove("足球");
                }
                Toast.makeText(MainActivity.this,"您选择了"+hobby.toString(),Toast.LENGTH_SHORT).show();
            }
        });
        box3=(CheckBox)findViewById(R.id.music);
        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    hobby.add("音乐");
                }else{
                    if(hobby.contains("音乐"))hobby.remove("音乐");
                }
                Toast.makeText(MainActivity.this,"您选择了"+hobby.toString(),Toast.LENGTH_SHORT).show();
            }
        });




        group=(RadioGroup)findViewById(R.id.gender);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if(i==R.id.male){
                    Toast.makeText(MainActivity.this,"您选择了男性...",Toast.LENGTH_SHORT).show();
                }else if(i==R.id.female){
                    Toast.makeText(MainActivity.this,"您选择了女性...",Toast.LENGTH_SHORT).show();
                }
}
});
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
