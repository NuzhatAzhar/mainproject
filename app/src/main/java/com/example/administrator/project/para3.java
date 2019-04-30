package com.example.administrator.project;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import java.util.ArrayList;
import java.util.Collections;

public class para3 extends AppCompatActivity {
    private ArrayList imageUrls = new  ArrayList<>();
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para3);
        dialog = new ProgressDialog(para3.this);
        dialog.setTitle("Uploading");
        dialog.setMessage("Please Wait...");
        dialog.show();
        Handler handler=new Handler();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
            }
        };
        handler.postDelayed(runnable,3000);
        ViewPager viewPager=findViewById(R.id.viewpager3);
        add();
        AdapterPicasso adapterPicasso=new AdapterPicasso(this,imageUrls);
        viewPager.setAdapter(adapterPicasso);
        Collections.reverse(imageUrls);
        viewPager.setCurrentItem(imageUrls.size()-1);



    }

    private void add() {
        //1
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage1.jpg?alt=media&token=c483e9bc-d6b7-446c-a4ee-feab0b383dea");
        //2
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage2.jpg?alt=media&token=0c278f1c-d6fa-4d61-aa5b-dbf6f9e2a017");
        //3
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage3.jpg?alt=media&token=47f25cc2-2ebe-4f7e-b74b-29460d1bdee5");
        //4
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage4.jpg?alt=media&token=486f1426-0e93-4c40-9d40-e484bfb9a057");
        //5
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage5.jpg?alt=media&token=32aed51c-a9dc-42bd-afd8-36121172a386");
        //6
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage6.jpg?alt=media&token=99fa5524-9fd2-4db4-bff7-9c84d1499219");
        //7
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage7.jpg?alt=media&token=1ce6735c-6d86-4768-8d98-7e3df38045b0");
        //8
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage8.jpg?alt=media&token=9531ce2c-6d5c-4da8-a893-8682a310150f");
        //9
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage9.jpg?alt=media&token=e15e4b9c-0d0e-4864-9d87-a90afb20e9c4");
        //10
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage10.jpg?alt=media&token=eb2aec90-020c-4304-877a-9e8c58b49738");
        //11
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage11.jpg?alt=media&token=2441e532-61e3-4a32-98f7-4f4d9bdd2c2b");
        //12
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage12.jpg?alt=media&token=89c4d4a5-8476-41e9-929c-67e99bb37179");
        //13
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage13.jpg?alt=media&token=5310d3c7-bbd3-477b-a760-b97328953c57");
        //14
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage14.jpg?alt=media&token=2174ee9d-7b64-49b5-8f11-5f3c20b397cb");
        //15
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage15.jpg?alt=media&token=f41c0747-9828-4d16-994f-df4d1606a787");
        //16
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage16.jpg?alt=media&token=5a03a92f-b771-46cb-8e6a-f62f3d24cc83");
        //17
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage17.jpg?alt=media&token=7d966309-2d8c-4339-bd45-15a581929a1d");
        //18
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage18.jpg?alt=media&token=27cc7a61-a1fa-4925-92fe-760d45ce709a");
        //19
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage19.jpg?alt=media&token=48ec7863-071f-4484-9283-363dafb7b69c");
        //20
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage20.jpg?alt=media&token=c02a7a6d-55da-4b59-8045-526b713fe883");
        //21
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage21.jpg?alt=media&token=1e3aa3e0-81b4-4854-b978-9ab38726e0ac");
        //22
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage22.jpg?alt=media&token=f8660783-8d31-4299-bbfc-f18ccf67e62b");
        //23
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage23.jpg?alt=media&token=c66e6802-bdc8-4b76-8dcd-67d5598d47c9");
        //24
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage24.jpg?alt=media&token=b3eaf157-ae11-43d8-ac92-7cae89dd8617");
        //25
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage25.jpg?alt=media&token=f4a1508f-f437-44e8-bbb2-40467422cdc7");
        //26
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage26.jpg?alt=media&token=dc2f320e-bae7-47e7-b0b5-514b46c5943e");
        //27
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage27.jpg?alt=media&token=2062dcae-20ea-48d6-b092-45f4fd390df3");
        //28
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage28.jpg?alt=media&token=e008c19f-fa06-48d7-a30a-d54f7a270f1a");
        //29
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage29.jpg?alt=media&token=6121f46e-f255-4c0f-966a-aefa93443883");
        //30
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage30.jpg?alt=media&token=4efc0ef2-5189-41aa-9a77-f92c846cdad0");
        //31
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage31.jpg?alt=media&token=c5304c9d-db2f-480c-ae26-ab6752b00076");
        //31
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage32.jpg?alt=media&token=476e8bb9-96b3-4572-a869-d32d0ec241df");
        //32
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage33.jpg?alt=media&token=692d414b-58f7-4b2a-ada5-fa2525a41cd2");
        //33
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage34.jpg?alt=media&token=8c9074ed-1383-442d-98f4-eff0b2df6163");
        //34
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage35.jpg?alt=media&token=1bea2afb-e60a-4535-a7a5-bbd31ea37077");
        //35
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage35.jpg?alt=media&token=1bea2afb-e60a-4535-a7a5-bbd31ea37077");
        //36
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage37.jpg?alt=media&token=fa86cb86-4863-4dec-9392-4bee27509e94");
        //37
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage38.jpg?alt=media&token=6dcc85d3-4e95-4ced-a8cf-7dd9673fa5c7");
        //38
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage39.jpg?alt=media&token=4e3d5c2e-43e5-48ae-a2ea-da0bc293912e");
        //39
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage40.jpg?alt=media&token=7d4ea2ff-ba94-4559-a6b1-bf4534656dc3");
        //40
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage41.jpg?alt=media&token=58db7ce9-c2b2-44ae-95ef-ec3fffb97913");
        //41
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage42.jpg?alt=media&token=429481aa-cd3d-401e-bdb1-8e237b72a8ac");
        //42
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage43.jpg?alt=media&token=42c84bcb-d397-4fa1-b596-b0f796ed472e");
        //43
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage44.jpg?alt=media&token=09b21431-0b64-4b85-8bc6-b24867186e72");
        //44
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage45.jpg?alt=media&token=02ea86d5-b616-48c9-9fbb-6a240948bfb8");
        //45
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage47.jpg?alt=media&token=b0eaef23-9d51-4e88-84dc-3dc4fed6bad6");
        //46
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage46.jpg?alt=media&token=22324582-1c4b-43a0-bb1a-a6b3ac211443");
        //47
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage48.jpg?alt=media&token=384e5432-5720-47e0-8971-2388925fd7c7");
        //48
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage49.jpg?alt=media&token=33e688b6-95b9-40c7-a29e-9684886f28f9");
        //49
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage50.jpg?alt=media&token=3b241abb-251a-42d9-8150-7cd601f19692");
        //50
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage51.jpg?alt=media&token=024e640a-c931-4d03-9d78-103ba37bf041");
        //51
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage52.jpg?alt=media&token=3a58ddca-cdb6-4b41-a2ab-0e079b6600e3");
        //52
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage53.jpg?alt=media&token=cec28d1d-5881-4a60-b116-129e8f316643");
        //53
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage54.jpg?alt=media&token=63e3595c-4517-4364-b23d-4f5e754ff488");
        //54
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage55.jpg?alt=media&token=4e67d079-15f3-438f-8531-67d1350d8f4d");
        //55
        imageUrls.add( "https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage56.jpg?alt=media&token=cf9e1b3d-cd9b-4412-90cb-d2c3da653d39");
        //56
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage57.jpg?alt=media&token=d71dba39-5257-4506-a3b7-facd136e0774");
        //57
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage58.jpg?alt=media&token=8665352a-50f2-4856-bbe8-2c96ea06def2");
        //58
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage59.jpg?alt=media&token=4b3301e8-5c26-485e-82bb-8b453588fdf7");
        //59
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage60.jpg?alt=media&token=6aedc6a9-86b6-4454-9553-ad7e1fcb9ce3");
        //60
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage61.jpg?alt=media&token=76f2811c-88b3-4c05-877f-3e8dfd677a23");
        //61
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage62.jpg?alt=media&token=01c984c6-e630-4013-841c-56c04299edda");
        //62
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage63.jpg?alt=media&token=07220470-cdfe-48ae-b1a4-550866b2065e");
        //63
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage64.jpg?alt=media&token=c52238fe-5631-4c4e-8356-2c9b780e4798");
        //64
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage65.jpg?alt=media&token=8c7def6c-ebe6-4a36-a457-8e71991e01ac");
        //65
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage66.jpg?alt=media&token=11f975b1-f310-4fea-9f5d-2a4d34af95e3");
        //66
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para3%2Fpage67.jpg?alt=media&token=43760f8d-1de8-4680-b8b9-fd4ea431033b");


    }
}
