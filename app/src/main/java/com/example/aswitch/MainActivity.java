package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //switch 1 :
        final Switch aSwitch = (Switch) findViewById(R.id.switch1);

        aSwitch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (aSwitch.isChecked()) //checking if  switch is checked
                {
                    Toast.makeText(MainActivity.this, "AC is On ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "AC is Off ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    //switch 2 :
        final Switch bSwitch = (Switch) findViewById(R.id.switch2);

        bSwitch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (bSwitch.isChecked()) //checking if  switch is checked
                {
                    Toast.makeText(MainActivity.this, "Light is On ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Light is Off ", Toast.LENGTH_SHORT).show();
                }
            }
        });
         //switch 3 :
        final Switch cSwitch = (Switch) findViewById(R.id.switch3);

        cSwitch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (cSwitch.isChecked()) //checking if  switch is checked
                {
                    Toast.makeText(MainActivity.this, "Fridge is On ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Fridge is Off ", Toast.LENGTH_SHORT).show();
                }
            }
        });
         //switch 4 :
        final Switch dSwitch = (Switch) findViewById(R.id.switch4);

         dSwitch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (dSwitch.isChecked()) //checking if  switch is checked
                {
                    Toast.makeText(MainActivity.this, "Laptop is On ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Laptop is Off ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
//         TRY THIS ALL ATTRIBUTE ALSO :

//        android:showText             	       : Whether to draw on/off text.
//        android:splitTrack	               : Whether to split the track and leave a gap for the thumb drawable.
//        android:switchMinWidth	           : Minimum width for the switch component.
//        android:switchPadding	               : Minimum space between the switch and caption text.
//        android:switchTextAppearance	       : TextAppearance style for text displayed on the switch thumb.
//        android:textOff	                   : Text to use when the switch is in the unchecked/"off" state.
//        android:textOn	                   : Text to use when the switch is in the checked/"on" state.
//        android:textStyle	                   : Style (normal, bold, italic, bold|italic) for the text.
//        android:thumb	                       : Drawable to use as the "thumb" that switches back and forth.
//        android:thumbTextPadding	           : Amount of padding on either side of text within the switch thumb.
//        android:thumbTint	                   : Tint to apply to the thumb.
//        android:thumbTintMode	               : Blending mode used to apply the thumb tint.
//        android:track	                       : Drawable to use as the "track" that the switch thumb slides within.
//        android:trackTint	                   : Tint to apply to the track.
//        android:trackTintMode	               : Blending mode used to apply the track tint.
//        android:typeface	                   : Typeface (normal, sans, serif, monospace) for the text.
//        android:switchMinWidth               : To increase/decrease the width of switch.
//        android:thumb="@null"                : to remove partition between on and off
//        android:thumbTextPadding             : Horizontal padding for switch thumb text in pixels


