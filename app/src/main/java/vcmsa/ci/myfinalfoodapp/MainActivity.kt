package vcmsa.ci.thefoodsuggesterapp
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import vcmsa.ci.myfinalfoodapp.R


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.timeInput)                                            //this code i got it from learn app development on youtube
        val suggestButton = findViewById<Button>(R.id.suggestButton)                                      //this code i learnt on Andriod studio easy learning on youtube
        val mealSuggestion = findViewById<TextView>(R.id.mealsuggestion)

        suggestButton.setOnClickListener {
            val inputTimeOfDay =
                timeInput.text.toString().lowercase()

            val mealsuggestion = when                                                                  // this code i got it from tonikamiTv on youtube
                                         (inputTimeOfDay) {
                "morning"-> "waffles and juice"                                                            // this code i got it from arjun parajuli on youtube
                "afternoon"-> "A sandwhich with fresh juice"                                                  //this code i got it from serial coder on youtube
                "evening"-> " steak with fries and water"
                else-> "please specify morning,afternoon or evening"

            }

        }


    }
}