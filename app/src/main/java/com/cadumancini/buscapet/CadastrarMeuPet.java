package com.cadumancini.buscapet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class CadastrarMeuPet extends AppCompatActivity {
    Button btnTakePicture;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_meu_pet);

        // Mapping views:
        btnTakePicture = (Button) findViewById(R.id.btnTakePicture);
        imgView = (ImageView) findViewById(R.id.imageView);

        // Behaviors:
        btnTakePicture.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(CadastrarMeuPet.this);
                //alertDialog.setTitle("Foto");
                alertDialog.setMessage("Como deseja carregar a imagem?");
                alertDialog.setPositiveButton("Galeria", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent = new Intent(Intent.ACTION_PICK,
                                android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                        final int ACTIVITY_SELECT_IMAGE_GALLERY = 1234;
                        startActivityForResult(intent, ACTIVITY_SELECT_IMAGE_GALLERY);
                    }
                });
                //define um botão como negativo.
                alertDialog.setNegativeButton("Tirar uma foto", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        final int ACTIVITY_SELECT_IMAGE_CAMERA = 1235;
                        startActivityForResult(intent, ACTIVITY_SELECT_IMAGE_CAMERA);
                    }
                });
                //cria o AlertDialog
                alertDialog.create();
                //Exibe
                alertDialog.show();
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case 1234:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    Bitmap yourSelectedImage = null;
                    try {
                        yourSelectedImage = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedImage);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if(yourSelectedImage != null)
                        imgView.setImageBitmap(yourSelectedImage);
                }
                break;
            case 1235:
                if(resultCode == RESULT_OK){
                    Bitmap photo = (Bitmap) data.getExtras().get("data");
                    imgView.setImageBitmap(photo);
                }
        }

    };

}


