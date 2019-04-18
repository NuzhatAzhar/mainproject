package com.example.administrator.project;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class para4 extends AppCompatActivity {
    private ArrayList imageUrls = new  ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para4);
        ViewPager viewPager=findViewById(R.id.viewpager4);
        add();
        AdapterPicasso adapterPicasso=new AdapterPicasso(this,imageUrls);
        viewPager.setAdapter(adapterPicasso);
        Collections.reverse(imageUrls);
        viewPager.setCurrentItem(imageUrls.size()-1);

    }

    private void add() {
                 //1
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage1.jpg?alt=media&token=13ac0c4d-f8f9-4308-8646-36fd71181abe");
                //2
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage2.jpg?alt=media&token=58148432-8f53-4e77-9ca0-f1db25cdf54b");
                //3
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage3.jpg?alt=media&token=cdfbd381-000c-4282-aca3-806816debe8c");
                //4
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage4.jpg?alt=media&token=ac5547b7-4fc3-423a-b415-b0e1c72e89a7");
                //5
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage5.jpg?alt=media&token=6838bef8-6d13-4929-81f6-27343d8c83a7");
                //6
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage6.jpg?alt=media&token=23cf2333-2607-468e-b839-9a88ad229ff7");
                //7
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage7.jpg?alt=media&token=88c13c0f-2ee5-41a0-8b35-94a8967275aa");
                //8
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage8.jpg?alt=media&token=5ca0baae-70e9-4a72-af6d-afe2f500c188");
                //9
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage9.jpg?alt=media&token=5cf35f9b-817e-4927-8ecd-2015184d54c0");
                //10
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage10.jpg?alt=media&token=41f6dd16-7903-4311-ade7-d0c1a3a4c8e2");
                //11
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage11.jpg?alt=media&token=7c8a043c-a028-4c7f-9ba9-d15967b399ac");
                //12
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage12.jpg?alt=media&token=e6b65419-089b-48f9-a737-74c4450649e9");
                //13
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage13.jpg?alt=media&token=b924c228-1572-4dc1-8507-668c1760b57f");
                //14
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage14.jpg?alt=media&token=612160e0-2810-4c46-82f6-08b839f4a04c");
                //15
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage15.jpg?alt=media&token=12f8e5a2-ac32-42a6-9dff-dbe563b4e789");
                //16
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage16.jpg?alt=media&token=36a186d9-4c9e-4b78-8baa-ddbeed0a53bd");
                //17
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage17.jpg?alt=media&token=26380220-9cc8-4670-93b9-ef6bf71bf564");
                //18
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage18.jpg?alt=media&token=5a0e1abe-4e42-4868-a135-615a6c85ad8c");
                //19
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage19.jpg?alt=media&token=a532c75d-d586-4a17-a632-9cac0ab6aa57");
                //20
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage20.jpg?alt=media&token=cb9c7fd4-93e9-4f58-805d-cd6876f5f601");
                //21
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage21.jpg?alt=media&token=1021aff0-aa79-4fa9-a76d-b408fbc9dcf1");
                //22
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage22.jpg?alt=media&token=492c9f10-908e-407a-af67-fb53df65843c");
                //23
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage23.jpg?alt=media&token=1bc19bf6-b99e-4ce4-a1c3-bd48ba8174e6");
                //24
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage24.jpg?alt=media&token=c2ddb794-1be2-4bc6-a9e7-d921aafbc8ee");
                //25
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage25.jpg?alt=media&token=6fc70014-afed-42d8-a0de-2ca08121d875");
                //26
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage26.jpg?alt=media&token=3cc577e4-5bdb-492f-97c9-0001040c9b43");
                //27
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage27.jpg?alt=media&token=cd32b5d7-0c57-4380-8aa3-2e853aaba835");
                //28
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage28.jpg?alt=media&token=93ea43c1-ed67-4f33-a83f-1702386ca192");
                //29
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage29.jpg?alt=media&token=97a489f6-016b-462b-bfb7-760717c06ba8");
                //30
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage30.jpg?alt=media&token=e340123a-cd2c-4fc6-9a00-c281ea969894");
                //31
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage31.jpg?alt=media&token=439c8a91-1639-4aa0-b2c6-0cb509122c8d");
                //32
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage32.jpg?alt=media&token=f631c6c5-1f51-466b-8149-d23b462d9fb9");
                //33
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage33.jpg?alt=media&token=904666d5-7335-416b-a4fa-3a8130484294");
                //34
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage34.jpg?alt=media&token=18d423a3-da44-40df-8830-3d05700e5c89");
                //35
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage35.jpg?alt=media&token=3be0daba-d51d-4a3c-97f5-3639438a6667");
                //36
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage36.jpg?alt=media&token=18e4114e-b826-428b-a6f8-57451181030d");
                //37
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage37.jpg?alt=media&token=784ea3fc-275f-439e-abd2-f41f650e6352");
                //38
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage38.jpg?alt=media&token=2348e294-e27e-430e-a2f5-f440373896ec");
                //39
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage39.jpg?alt=media&token=9e972185-a576-48cf-92b9-457c128b1bfe");
                //40
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage40.jpg?alt=media&token=58f57792-09b8-4d2f-84d7-a6479109756c");
                //41
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage41.jpg?alt=media&token=3aaec575-ae52-44d3-a641-bd142c1b51e9");
                //42
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage42.jpg?alt=media&token=b3dafb88-e39c-4e5d-b095-9993e4958c80");
                //43
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage43.jpg?alt=media&token=750da8ce-2132-4d04-80d0-53457e508a15");
                //44
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage44.jpg?alt=media&token=b8de594b-32ca-42d1-8a4f-b45cce03eede");
                //45
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage45.jpg?alt=media&token=3a280822-2514-4712-9ac1-8bfa4c8a3782");
                //46
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage46.jpg?alt=media&token=d231f9c8-627f-4c8a-a1b6-a58b54159fca");
                //47
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage47.jpg?alt=media&token=884ccaaf-84b3-475f-90ba-ff02f6239f73");
                //48
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage48.jpg?alt=media&token=be7bdf6b-3717-4007-b3a0-60e23f1128af");
                //49
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage49.jpg?alt=media&token=f89b51ba-80b5-4bba-ab8d-b5edf58370a1");
                //50
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage50.jpg?alt=media&token=04021880-98d5-45f3-9a43-e621e9f12448");
                //51
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage51.jpg?alt=media&token=ef68b362-7479-49ae-8b6a-3d19eaeba966");
                //52
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage52.jpg?alt=media&token=60e9fa01-1cc8-41f5-a94f-5e6572d16d81");
                //53
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage53.jpg?alt=media&token=11e243a9-f5d3-46c3-aebb-601ab97466f8");
                //54
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage54.jpg?alt=media&token=b9984de1-d1bb-4e4a-8b81-2d9889c6f366");
                //55
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage55.jpg?alt=media&token=384be1cf-b4ee-4500-8b79-833cee42c258");
                //56
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage56.jpg?alt=media&token=8d382d50-2597-4b27-b58e-df2ae1e50fad");
                //57
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage57.jpg?alt=media&token=cdb00f71-b133-4115-abe4-a199c2e9c18e");
                //58
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage58.jpg?alt=media&token=b3872529-0795-476f-b960-c4e21801ec66");
                //59
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage59.jpg?alt=media&token=e82b3b8d-2b80-4e4f-b051-e1e71f92b3ed");
                //60
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage60.jpg?alt=media&token=5ad0edc0-b5b9-4dff-bc3c-061e79476796");
                //61
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage61.jpg?alt=media&token=669fb49c-54db-4941-af32-459c2bfbd21a");
                //62
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage62.jpg?alt=media&token=750bb171-058c-4f6b-9090-5198b4c932a0");
                //63
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage63.jpg?alt=media&token=83c92ce1-ac0d-4048-9aba-375fe1a66926");
                //64
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage64.jpg?alt=media&token=ea395965-3de7-496c-bce4-2f706e690a87");
                //65
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage65.jpg?alt=media&token=e800af66-3783-498b-938d-b471c2fd1051");
                //66
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para4%2Fpage66.jpg?alt=media&token=4325740d-b297-428a-b3a4-767a0f0f74fc");
    }

}
