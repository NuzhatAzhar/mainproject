package com.example.administrator.project;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Collections;

public class para2 extends AppCompatActivity {
    ArrayList<String> imageUrls = new ArrayList<>();
    ImageView imageView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para2);
        ViewPager viewPager=findViewById(R.id.viewpager2);
        toolbar=findViewById(R.id.tab2);
        imageView=findViewById(R.id.imag2);
        add();
        AdapterPicasso adapter=new AdapterPicasso(this,imageUrls);
        viewPager.setAdapter(adapter);
        Collections.reverse(imageUrls);
        viewPager.setCurrentItem(imageUrls.size()-1);

    }

    private void add() {
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage1.jpg?alt=media&token=440b4007-0eec-42d5-a29e-7c0653d043ea");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage2.jpg?alt=media&token=83e1aa94-4b39-429a-836d-aaf07d518863");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage3.jpg?alt=media&token=39e78f3b-53b1-4779-afe7-c55ed6ff3017");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage4.jpg?alt=media&token=cfe8c5fa-bd86-4e00-882c-3659684ba5e0");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage5.jpg?alt=media&token=cc12ea4d-0ef5-4321-a265-fd23ea2a2f73");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage6.jpg?alt=media&token=9df9a3e9-ebc8-40f2-8a64-78312eb3f2bd");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage7.jpg?alt=media&token=88d82943-f5fc-483e-9568-638674915258");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage8.jpg?alt=media&token=d672ff27-5372-420f-a48e-a7330f0dbf3a");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage9.jpg?alt=media&token=9b7b0619-114b-4e23-99c9-631ebde3e1f8");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage10.jpg?alt=media&token=ed56d345-5980-4407-9aa2-b18f60863d04");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage11.jpg?alt=media&token=a5176657-ed92-401d-813c-9e211b4374b7");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage12.jpg?alt=media&token=5b58ac09-6a6a-46d4-bea9-26dad5187036");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage13.jpg?alt=media&token=8b2b6683-3394-44b3-9aba-8c5c55094acb");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage14.jpg?alt=media&token=5b4b769d-a738-4d9f-8c0c-1c992042b31a");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage15.jpg?alt=media&token=801515ae-867f-4f98-bf3e-b7d763c0cc3e");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage16.jpg?alt=media&token=75cae909-d274-45bf-9a1e-5d6e0771edb0");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage17.jpg?alt=media&token=ba5e5b27-2d7f-4229-9d97-d36791a80af4");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage18.jpg?alt=media&token=57dad0d0-5e5f-4a63-a11b-352bf2f08066");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage19.jpg?alt=media&token=e10f866c-66ed-49de-9efd-87954d5eacad");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage20.jpg?alt=media&token=414f80aa-854b-4144-bd3f-df9ad9a44a14");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage21.jpg?alt=media&token=8093e4e4-f8bf-4523-9a68-f5c5a7468ae7");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage22.jpg?alt=media&token=b7e20a97-45f5-4162-a310-f3cb9144008e");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage23.jpg?alt=media&token=632f3a2c-e477-4dda-afc2-092081077327");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage24.jpg?alt=media&token=3a48b391-b780-4c42-a913-40a22c530aca");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage25.jpg?alt=media&token=205d1721-b300-41a0-a169-f0ebd105d433");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage26.jpg?alt=media&token=5b3fbeec-2e37-4353-9ca6-a4963795646d");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage27.jpg?alt=media&token=9cdd4115-43e6-4e78-8d7a-078480a8c375");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage28.jpg?alt=media&token=fc8cbb1f-7cf7-4576-94ee-2fbf6f6711c8");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage29.jpg?alt=media&token=116cb358-ad76-4434-90ff-6ddcd3570711");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage30.jpg?alt=media&token=8855e31a-8c15-42f6-be91-60af1b8376cd");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage31.jpg?alt=media&token=0ffe71c4-767c-4752-a358-6a2a495f3e52");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage32.jpg?alt=media&token=ec341589-b53b-4b5a-88b8-fa868eddc2c6");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage33.jpg?alt=media&token=f39f95e1-f6a6-4530-a78e-82cbc01df683");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage34.jpg?alt=media&token=a697f0eb-f0b2-464c-8674-ae5a0efd64a3");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage35.jpg?alt=media&token=d2ca8746-09dd-4a18-a32f-73c8f3c002b8");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage36.jpg?alt=media&token=712b958b-19a7-4fed-adab-825bb0b49025");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage37.jpg?alt=media&token=d7570135-087e-4e47-8b40-c3c46348767b");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage38.jpg?alt=media&token=b966c5a5-e55b-4959-bfdb-a92a09b244cc");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage39.jpg?alt=media&token=eff8ff0f-b9fe-4f96-b150-893b31b85559");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage40.jpg?alt=media&token=7d594893-d42c-4a4a-92ec-4fec68c85efc");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage41.jpg?alt=media&token=b11ad702-5bdc-433c-8c8c-3003fbcd9650");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage42.jpg?alt=media&token=3ba4fdd8-a77a-4f78-a5a7-a88912530deb");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage43.jpg?alt=media&token=71a1733e-5185-4391-b8c0-a5331306d33f");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage44.jpg?alt=media&token=53b5cd9b-a678-49ce-aea0-dc5aa45c87c9");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage45.jpg?alt=media&token=50f4c11f-7a06-4b27-9f7a-b8f15cbd5953");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage46.jpg?alt=media&token=a66c48bd-c756-4984-a64f-1f07f5818cea");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage47.jpg?alt=media&token=e8f557b8-76d4-4e25-94c4-33bcbc3ce26e");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage48.jpg?alt=media&token=93aaaa89-6163-450a-8ae9-4000a4bc11a6");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage49.jpg?alt=media&token=46600f20-12e9-4f8c-aa95-0ec8954a1ef1");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage50.jpg?alt=media&token=80d9f7b1-9ef2-4880-ae6c-cb0f118d4f10");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage51.jpg?alt=media&token=6c7ca85d-7830-4d22-8773-fafe1592f98e");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage52.jpg?alt=media&token=a14f2e24-d545-4529-b4bc-ed1c94e903ef");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage53.jpg?alt=media&token=43b8ca76-ca63-4f7a-ba89-0bd7d7545099");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage54.jpg?alt=media&token=66d48e20-adac-493f-8441-86e5a82d0459");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage55.jpg?alt=media&token=14d03449-f03b-4b61-8b70-c7d5d5e967d1");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage55.jpg?alt=media&token=14d03449-f03b-4b61-8b70-c7d5d5e967d1");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage57.jpg?alt=media&token=cce5e48e-0a2c-426e-8283-cb9124d432d0");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage58.jpg?alt=media&token=8578a103-52fb-4abe-a232-dfd4446105f1");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage59.jpg?alt=media&token=baa695f1-a55b-4aef-b8e0-6f9c234ef5d7");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage60.jpg?alt=media&token=de5eec9b-afc7-45c2-9cb1-b0dd0580bc26");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage61.jpg?alt=media&token=f4465b37-b1e9-4a0e-805a-3e20e975972f");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage62.jpg?alt=media&token=27745c6d-d5ae-4ecc-8282-e8e18153144a");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage63.jpg?alt=media&token=7f7a9bf6-06cc-4dad-a4eb-d817c7e428fe");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage64.jpg?alt=media&token=e365c3d5-1624-41c4-8cce-9329bc06bfa4");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage65.jpg?alt=media&token=f7afc5e8-db05-400a-aa8c-c1044f7e61e2");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage66.jpg?alt=media&token=e824f3ac-1825-4056-8af2-127e5e41875f");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage67.jpg?alt=media&token=44768bc2-9670-4514-81b9-2cc879194ae8");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/test-69cd9.appspot.com/o/para2%2Fpage68.jpg?alt=media&token=a20651d2-7e2d-4a28-b6bb-93988ec92000");


    }

    public void zoomin(View view) {
        Animation animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
        view.startAnimation(animZoomIn);
    }




    public void zoomout(View view) {
        Animation animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomout);
        view.startAnimation(animZoomOut);

    }
}
