package ads.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Variable Scoping
    int randomNumber;

    public void makeToast (String string ){

        Toast.makeText(MainActivity.this,string, Toast.LENGTH_SHORT).show();

    }
    //Guess method
   public void guess(View view){
       EditText guessVal = findViewById(R.id.guess);

       int guessInt = Integer.parseInt(guessVal.getText().toString());


        if (guessInt > randomNumber){

            makeToast ("Lower!");//Sends a string to make toast method
        }

        else if (guessInt < randomNumber){

          makeToast ("Higher!");//Sends a string to make toast method
        }
       
        else{
            makeToast("That's Right! Try again!");
            Random rand = new Random();//Creates a new random number for the next round
            randomNumber = rand.nextInt( 20)+1;//Creates a number between 1 and 20
        }


   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Generates Random number when app is launched
        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;//Sets a number between 1 and 20
    }
}
