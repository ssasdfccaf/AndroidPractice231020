package com.example.myapplication_231020_test1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// 액티비티 . ( 시스템 클래스 = 컴포넌트 클래스 )
// 클래스 상속받는 여부에 따라 결정 (일반 클래스와의 차이 )
class MainActivity : AppCompatActivity() {
    // AppCompatActivity 부모 클래스 상속받음
    // onCreate 함수 사용 Bundle파일
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

