package kanoko.akira.techacademy.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("山田", 25, "野球")
        val human2 = Human("香川", 30, "サッカー")

        human.say()
        human.think()

        human2.say()
        human2.think()

    }

}