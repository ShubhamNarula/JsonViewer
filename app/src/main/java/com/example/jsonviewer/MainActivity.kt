package com.example.jsonviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickEvents()
    }
    

    private fun clickEvents() {

        btnPreview.setOnClickListener {
//            if(edtJsonText.text.toString().isBlank()){
//                Toast.makeText(this, "Please enter your text..!", Toast.LENGTH_SHORT).show()
//                return@setOnClickListener
//            }

            showResult(
                """{
    "error": false,
    "message": "Success",
    "data": {
        "rows": [
            {
                "nfts": [],
                "id": "7e08b3f7-c2ff-4d82-80a4-cbfe9d064e90",
                "box_type": "Common",
                "pricing": 34,
                "title": "ydjtxgft",
                "closed_box_image": "https://stage-nft-collection.s3.ap-south-1.amazonaws.com/mysteryBox/c3cd37cf-4c49-4290-aa09-02bae81bebed.png",
                "quantity": 34,
                "open_box_image": "https://stage-nft-collection.s3.ap-south-1.amazonaws.com/mysteryBox/14a780d6-dd21-477a-84e2-b8bb08ee54ed.png",
                "common_nfts": 34,
                "rare_nfts": 34,
                "legendary_nfts": 34,
                "expiryOn": "Wed Mar 23 2022 07:50:35 GMT+0000 (Coordinated Universal Time)",
                "description": "stdfx"
            },
            {
                "nfts": [],
                "id": "463c488a-7d9d-4c36-a349-ae40b519e69f",
                "box_type": "Common",
                "pricing": 12,
                "title": "wqZZfewfewArfeefw3edS",
                "closed_box_image": "https://stage-nft-collection.s3.ap-south-1.amazonaws.com/mysteryBox/ce70d77e-3be3-4310-be82-c282c9b12f40.png",
                "quantity": 1,
                "open_box_image": "https://stage-nft-collection.s3.ap-south-1.amazonaws.com/mysteryBox/6f2ebb65-7f0f-496b-be1e-12c53a58c81b.png",
                "common_nfts": 5,
                "rare_nfts": 0,
                "legendary_nfts": 0,
                "expiryOn": "Invalid Date",
                "description": "wsw2xzw2sa"
            }
        ],
        "count": 2
    }
}"""
            )
        }
    }

   private fun showResult(json: String) {
        try {
            jsonViewer.setJson(JSONObject(json))
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }
}