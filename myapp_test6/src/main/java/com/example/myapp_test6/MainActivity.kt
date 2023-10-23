package com.example.myapp_test6

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var imgCheck:String
    lateinit var TAG :String
    lateinit var binding : ActivityMainBinding
//    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        imgCheck = "Y"
        TAG = "MainActivity "

        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

         setContentView(binding.root)
        /* 기본 뷰 선택 방법 1 */
            // 기본 findViewById -> 로그인 버튼 클릭 시 해당 화면으로 이동
        val loginBtn: Button = findViewById(R.id.loginBtn)

        // 뷰바인딩 선택 방법 2 -> 쉽게 뷰 선택 - 해당 화면으로 이동
        // 회원가입 폼으로 이동하는 화면
       // val joinBtn: Button = findViewById(R.id.joinBtn)
      /*
       // setOnClickListener - 해당 뷰로 이동
       binding.joinBtn.setOnClickListener{
            val intent = Intent{this@MainActivity, JoinActivity::class.java}
        }
        startActivity(intent)
        */

        // 버튼으로 뷰 show/hide 해보기
        val testBtn : Button =  findViewById(R.id.testBtn)
        testBtn.setOnClickListener{
            Log.d(TAG,"버튼을 클릭시 확인")

            if(imgCheck.equals("Y")) {
                val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.VISIBLE
            } else {
                 val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.INVISIBLE
                imgCheck = "Y"
            }
        }

            // 클릭 시 , 이벤트 리스너 -> 해당 화면으로 이동
        loginBtn.setOnClickListener{
            val intent = Intent(this@MainActivity, LoginFormActivity::class.java)
            startActivity(intent)
        }


    }
}

