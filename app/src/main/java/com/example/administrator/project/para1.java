package com.example.administrator.project;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class para1 extends AppCompatActivity {
    ArrayList<String> imageUrls = new ArrayList<>();
    ImageView imageView;
    ViewPager viewPager;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para1);
        dialog = new ProgressDialog(para1.this);
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
        viewPager = findViewById(R.id.viewpager1);
        add();
        AdapterPicasso adapter=new AdapterPicasso(this,imageUrls);
        viewPager.setAdapter(adapter);
        Collections.reverse(imageUrls);
        viewPager.setCurrentItem(imageUrls.size()-1);

    }

    private void add() {
        //1
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage1.jpg?alt=media&token=3611ec10-c303-4bf6-a2e7-cddeca77eb11");
        //2
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage2.jpg?alt=media&token=c01ce2ff-82f1-410b-9914-3e22c69d9f77");
        //3
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage3.jpg?alt=media&token=cbb2c8d1-9117-413c-a74a-e9f4db4de12d");
        //4
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage4.jpg?alt=media&token=556c02f9-341a-4b2a-abf5-5fe28fa78000");
        //5
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage5.jpg?alt=media&token=5c4991f1-f349-45c9-98a8-50f6d85dbdcc");
        //6
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage6.jpg?alt=media&token=5961a404-811e-4421-a5ec-c1f91b6f3ab6");
        //7
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage7.jpg?alt=media&token=1983adcb-754e-43fc-b8fd-259a5d6b0734");
        //8
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage8.jpg?alt=media&token=527c24e0-c9b2-47a4-8500-0e40117654bd");
        //9
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage9.jpg?alt=media&token=1f149221-7b80-4819-89e7-3feca1575e4b");
        //10
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage10.jpg?alt=media&token=d2cb5ca6-fbc1-4102-be47-f561f77d7783");
        //11
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage11.jpg?alt=media&token=242871e3-04ab-4162-bbbe-90664c9b353e");
        //12
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage12.jpg?alt=media&token=3feb19b8-fb28-4b02-9626-56fd0a8a3ba1");
        //13
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage13.jpg?alt=media&token=15a04e77-f41f-4892-980d-5de2d7ad126f");
        //14
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage14.jpg?alt=media&token=ef263943-e41d-4669-aeb8-b31017a481ce");
        //15
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage15.jpg?alt=media&token=9577602e-c4db-4307-913e-35d36c9fcec9");
        //16
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage16.jpg?alt=media&token=c25494e2-022d-4fb8-ae10-10515be880b1");
        //17
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage17.jpg?alt=media&token=3b06b26c-35e4-4d6f-84c0-5ce12a041bd4");
        //18
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage18.jpg?alt=media&token=ea3f319b-81bd-4a91-9679-f15b035eb7a8");
        //19
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage19.jpg?alt=media&token=6c44ad0e-d5c9-4782-af91-195529e71fa2");
        //20
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage20.jpg?alt=media&token=6b3f194e-b79a-4341-85a8-89e8f71c6eca");
        //21
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage21.jpg?alt=media&token=305712d2-4f7c-4a5b-936f-aaac283d9b64");
        //22
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage22.jpg?alt=media&token=b5867c19-cfa1-4254-acc3-5471e3904c6a");
        //23
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage23.jpg?alt=media&token=ba4feb8f-55b3-48e1-87c8-5d61d91666ac");
        //24
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage24.jpg?alt=media&token=9e1b0d33-3dd8-4d80-959e-476e85982f75");
        //25
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage25.jpg?alt=media&token=65e98ffd-dc9d-44d6-9664-2040d75aaefb");
        //26
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage26.jpg?alt=media&token=636e270a-dc5b-4da5-968d-66f198f50b7c");
        //27
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage27.jpg?alt=media&token=f0c994f5-b95e-49e8-8bf7-149c238a7a73");
        //28
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage28.jpg?alt=media&token=387b67af-7143-4667-a8d7-9f239b0f1799");
        //29
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage29.jpg?alt=media&token=d519c6df-77da-4c96-8ccc-05afbafadc82");
        //30
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage30.jpg?alt=media&token=49e44192-a874-478c-b872-df7c234a4da9");
        //31
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage31.jpg?alt=media&token=217e6813-6a08-4977-b6b9-fe46f1fc5c69");
        //32
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage32.jpg?alt=media&token=125b4896-6fae-47eb-a3d0-f00414e950d4");
        //33
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage33.jpg?alt=media&token=f399d17b-f9dd-4b1d-bcbe-11dd1c64f63b");
        //34
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage34.jpg?alt=media&token=7b063934-9106-4fa4-ae85-36d57d462bca");
        //35
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage35.jpg?alt=media&token=a3626491-ac89-4b4e-9160-4789f663923a");
        //36
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage36.jpg?alt=media&token=88840760-9e33-4de2-aee3-930100ca8655");
        //37
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage37.jpg?alt=media&token=7dc93c0f-5031-46a4-8910-4b9dfd4e42cf");
        //38
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage38.jpg?alt=media&token=bda6b9b6-7db1-4e9b-ab0a-937f24f917bc");
        //39
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage39.jpg?alt=media&token=421c998c-f5d6-4715-a8db-4a66f9c56658");
        //40
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage40.jpg?alt=media&token=152adf51-058a-40d8-92cf-0e5fe7fe450d");
        //41
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage41.jpg?alt=media&token=0c19c9b7-f3b7-4a39-8c1e-774955b918e7");
        //42
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage42.jpg?alt=media&token=882e862d-78d9-4df8-9f62-bba831f50370");
        //43
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage43.jpg?alt=media&token=d038f92c-43fa-41b0-98e5-fb1069728b4a");
        //44
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage44.jpg?alt=media&token=176780ad-3a10-4cca-b923-0a60757a5205");
        //45
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage45.jpg?alt=media&token=c122878c-400f-4654-9651-6c4839fcc158");
        //46
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage46.jpg?alt=media&token=0c38dc10-8d46-48eb-9a2b-26e8143d59bf");
        //47
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage47.jpg?alt=media&token=da1c2267-0e45-4209-9f02-ef7e20ed37fd");
        //48
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage48.jpg?alt=media&token=1ff1f1e6-d9aa-4e4d-be31-18f293dd8dff");
        //49
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage49.jpg?alt=media&token=466e3864-445b-4929-baa5-7736245c0dac");
        //50
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage50.jpg?alt=media&token=46689984-ede1-463c-9a9f-3784c8aee435");
        //51
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage51.jpg?alt=media&token=2b02d749-04ac-4678-bc72-eed445a9c0fb");
        //52
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage52.jpg?alt=media&token=b9095477-92ec-48ff-86ce-f2f206ad135f");
        //53
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage53.jpg?alt=media&token=d640320b-ad69-4f65-a6ce-c573cf41683f");
        //54
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage54.jpg?alt=media&token=15699836-d3be-431d-aae9-9dccf3134318");
        //55
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage55.jpg?alt=media&token=1b9c4309-c015-4861-82a6-591116f2240b");
        //56
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage56.jpg?alt=media&token=44b82895-3e1a-4e01-aecd-779818b1b3ed");
        //57
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage57.jpg?alt=media&token=9cc66674-7662-4461-b42b-8b2e6d9ef0bd");
        //58
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage58.jpg?alt=media&token=e8cd4f54-faa0-46fa-a4e4-906e781c8315");
        //59
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage59.jpg?alt=media&token=fdcba414-01de-4c47-9b50-2c9d99fab30b");
        //60
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage60.jpg?alt=media&token=6ac9ffe8-ddaa-4715-8cf6-8097430dfa49");
        //61
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage61.jpg?alt=media&token=7f3a4dd6-63ee-4582-91ab-25735cbecdd8");
        //62
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage62.jpg?alt=media&token=8e9d0bc5-242a-4ba8-9008-70c169a59fc6");
        //63
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage63.jpg?alt=media&token=0d47e65f-d44c-44fe-ac9b-26f5a44af8ca");
        //64
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage64.jpg?alt=media&token=8d9f1802-0477-4ce6-82c4-1be2e20caf8f");
        //65
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage65.jpg?alt=media&token=8739d302-154d-4f96-a669-53f919b6223d");
        //66
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage66.jpg?alt=media&token=11d3e2ed-c510-449c-8329-e41b26c6f30b");
        //67
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage67.jpg?alt=media&token=febee932-a083-46b5-8ab9-20b118ab6a31");
        //68
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage68.jpg?alt=media&token=fc0b0565-a176-4ffa-9381-ee68ddd38964");
        //69
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/Para1%2Fpage69(EFER).jpg?alt=media&token=b365c91b-fe60-4bcb-b6d9-518b740f2734 ");


    }
}
