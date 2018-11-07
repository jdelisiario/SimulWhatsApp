package mayron.projeto12;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by mayro on 08/11/2017.
 */

public class CameraFragment extends Fragment{

    private final int REQUEST_CODE = 100;
    private ImageView image;
    private String filename = "teste.jpg";

    Uri selectedImage;
    private Uri imageUri;

    public CameraFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_camera, container, false);

//        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
//        //Pega a raiz do disco interno do dispositivo
//        File photo = new File(Environment.getExternalStorageDirectory(), filename);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photo));
//        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
//        imageUri = Uri.fromFile(photo);
//        startActivityForResult(intent, REQUEST_CODE);

        return root;
    }

}
