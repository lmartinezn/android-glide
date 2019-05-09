package cat.tecnocampus.mobileapps.practica1.glideexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=findViewById(R.id.image_test);

        String url= "https://images-3.wuaki.tv/system/shots/761/original/buscando-a-nemo-1473415958.jpeg";

        //String url= nemo2 "https://cityplayteam.es/sitges/wp-content/uploads/2018/07/n3pzA8cV6iTMTmq5Ep7o0djOf57.jpg";

        //loadImageView();
        //loadRemoteImageWithGlide();
        loadLocalImageWithGlide();
    }

    private void loadImageView(){ //es la que pesa mes
        image.setImageResource(R.drawable.nemo);
    }
    private void loadRemoteImageWithGlide(){ //la diferencia es de 65megas
        String url= "https://images-3.wuaki.tv/system/shots/761/original/buscando-a-nemo-1473415958.jpeg";
        Glide.with(this)
                .load(url)
                .apply(new RequestOptions())
                .placeholder(R.mipmap.ic_launcher)
                .into(image);
    }

    private void loadLocalImageWithGlide(){
        Glide.with(this)
                .load(R.drawable.nemo2)
                .into(image);
    }
}
