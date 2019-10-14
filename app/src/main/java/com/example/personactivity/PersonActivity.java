package com.example.personactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {

    private TextView nameTextView=null;
    private Button moreButton=null;
    private ImageView personImageView=null;
    private PersonData data= new PersonData();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        nameTextView=findViewById(R.id.textView1);
        moreButton=findViewById(R.id.button);
        personImageView=findViewById(R.id.imageView);
        //populate textView and image view with data
        nameTextView.setText(data.getData().getName());
        //remove the extension from the name

        String imageName=data.getData().getImage();
        imageName=imageName.substring(0, imageName.indexOf("."));
        int imageId = this.getResources().getIdentifier(imageName,"drawable", this.getPackageName());
        personImageView.setImageResource(imageId);
        //deal with button
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //make an intent adn bundle

                Intent intent= new Intent(PersonActivity.this,DetailsActivity.class);
                Bundle bundle = new Bundle();

                //add data to bundle
                bundle.putSerializable("data",data.getData());
                intent.putExtras(bundle);
                //start activity
                startActivity(intent);
            }
        });
    }
}
