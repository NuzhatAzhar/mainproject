package com.example.administrator.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class para2 extends AppCompatActivity {
    private String[] imageUrls= new String[]{
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage1.jpg?alt=media&token=440b4007-0eec-42d5-a29e-7c0653d043ea",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage2.jpg?alt=media&token=83e1aa94-4b39-429a-836d-aaf07d518863",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage3.jpg?alt=media&token=39e78f3b-53b1-4779-afe7-c55ed6ff3017",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage4.jpg?alt=media&token=cfe8c5fa-bd86-4e00-882c-3659684ba5e0",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage3.jpg?alt=media&token=39e78f3b-53b1-4779-afe7-c55ed6ff3017",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage3.jpg?alt=media&token=39e78f3b-53b1-4779-afe7-c55ed6ff3017",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage7.jpg?alt=media&token=88d82943-f5fc-483e-9568-638674915258",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage8.jpg?alt=media&token=d672ff27-5372-420f-a48e-a7330f0dbf3a",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage8.jpg?alt=media&token=d672ff27-5372-420f-a48e-a7330f0dbf3a",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage8.jpg?alt=media&token=d672ff27-5372-420f-a48e-a7330f0dbf3a",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage11.jpg?alt=media&token=9c2bbda2-60f0-4217-85e4-035b6e662397",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage12.jpg?alt=media&token=5b58ac09-6a6a-46d4-bea9-26dad5187036",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage13.jpg?alt=media&token=8b2b6683-3394-44b3-9aba-8c5c55094acb",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage14.jpg?alt=media&token=5b4b769d-a738-4d9f-8c0c-1c992042b31a",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage15.jpg?alt=media&token=801515ae-867f-4f98-bf3e-b7d763c0cc3e",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage16.jpg?alt=media&token=75cae909-d274-45bf-9a1e-5d6e0771edb0",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage17.jpg?alt=media&token=ba5e5b27-2d7f-4229-9d97-d36791a80af4",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage18.jpg?alt=media&token=57dad0d0-5e5f-4a63-a11b-352bf2f08066",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage19.jpg?alt=media&token=e10f866c-66ed-49de-9efd-87954d5eacad",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage20.jpg?alt=media&token=414f80aa-854b-4144-bd3f-df9ad9a44a14",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage21.jpg?alt=media&token=8093e4e4-f8bf-4523-9a68-f5c5a7468ae7",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage22.jpg?alt=media&token=b7e20a97-45f5-4162-a310-f3cb9144008e",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage23.jpg?alt=media&token=632f3a2c-e477-4dda-afc2-092081077327",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage24.jpg?alt=media&token=3a48b391-b780-4c42-a913-40a22c530aca",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage25.jpg?alt=media&token=205d1721-b300-41a0-a169-f0ebd105d433",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage26.jpg?alt=media&token=5b3fbeec-2e37-4353-9ca6-a4963795646d",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage27.jpg?alt=media&token=9cdd4115-43e6-4e78-8d7a-078480a8c375",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage28.jpg?alt=media&token=fc8cbb1f-7cf7-4576-94ee-2fbf6f6711c8",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage29.jpg?alt=media&token=116cb358-ad76-4434-90ff-6ddcd3570711",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage30.jpg?alt=media&token=8855e31a-8c15-42f6-be91-60af1b8376cd",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage31.jpg?alt=media&token=0ffe71c4-767c-4752-a358-6a2a495f3e52",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage32.jpg?alt=media&token=ec341589-b53b-4b5a-88b8-fa868eddc2c6",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage32.jpg?alt=media&token=ec341589-b53b-4b5a-88b8-fa868eddc2c6",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage34.jpg?alt=media&token=a697f0eb-f0b2-464c-8674-ae5a0efd64a3",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage35.jpg?alt=media&token=d2ca8746-09dd-4a18-a32f-73c8f3c002b8",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage35.jpg?alt=media&token=d2ca8746-09dd-4a18-a32f-73c8f3c002b8",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage37.jpg?alt=media&token=d7570135-087e-4e47-8b40-c3c46348767b",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage38.jpg?alt=media&token=b966c5a5-e55b-4959-bfdb-a92a09b244cc",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage40.jpg?alt=media&token=7d594893-d42c-4a4a-92ec-4fec68c85efc",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage41.jpg?alt=media&token=b11ad702-5bdc-433c-8c8c-3003fbcd9650",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage42.jpg?alt=media&token=3ba4fdd8-a77a-4f78-a5a7-a88912530deb",
            "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage43.jpg?alt=media&token=71a1733e-5185-4391-b8c0-a5331306d33f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",






    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para2);
    }
}
